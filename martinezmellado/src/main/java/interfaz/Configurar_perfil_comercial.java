package interfaz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import elemental.json.Json;
import vistas.VistaConfigurar_perfil_comercial;

public class Configurar_perfil_comercial extends VistaConfigurar_perfil_comercial {

	private Cabecera_comercial cabecera;
	private Usuario_Registrado usuario;
	private String fecha;
	private BDPrincipal datos;
	private MemoryBuffer memoryBuffer;
	private InputStream fileData;

	public Configurar_perfil_comercial(Cabecera_comercial cabecera) {
		// TODO Auto-generated constructor stub

		this.cabecera = cabecera;
		this.setCabecera(cabecera);
		this.datos = cabecera.getDatos();
		this.usuario = this.datos.cargarDatosUsuario(cabecera.getUser().getUsuario());

		this.getImagen().setSrc(this.usuario.getFoto());
		this.getTfCorreo().setValue(usuario.getCorreo());
		this.getTfDescripcion().setValue(
				usuario.getDescripcion().isEmpty() ? "Usuario sin descripcion" : cabecera.getUser().getDescripcion());
		this.getTfNombre().setValue(usuario.getNombre());
		this.getTfUsuario().setValue(usuario.getUsuario());

		if (this.getTfFechaNac().isEmpty()) {
			String[] items = String.valueOf(this.usuario.getFechaNacimiento()).split("-");
			fecha = "";
			// System.out.println("Hola: " + this.usuario.getFechaNacimiento());
			items[2] = items[2].split(" ")[0];
			if (items[2].length() < 2)
				fecha += "0" + items[2] + "/";
			else
				fecha += items[2] + "/";

			if (items[1].length() < 2)
				fecha += "0" + items[1] + "/";
			else
				fecha += items[1] + "/";

			fecha += items[0];
		}

		this.getTfFechaNac().setValue(fecha);

		memoryBuffer = new MemoryBuffer();
		this.getUploader().setReceiver(memoryBuffer);

		this.getUploader().addSucceededListener(event -> {

			if (event.getFileName().endsWith("jpg"))
				fileData = memoryBuffer.getInputStream();
			else
				Notification.show("Solo se admiten imagenes jpg");
			this.getElement().setPropertyJson("files", Json.createArray());

		});

		this.getbCambiar().addClickListener(event -> {
			bCambiar();
		});

		this.getbGuardar().addClickListener(event -> {
			bGuardar();
		});

		this.getbCambioContra().addClickListener(event -> {

			this.cabecera.setCambiarContra(new Cambiar_contrasenna(this.usuario, this.cabecera));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getCambiarContra());

		});

	}

	public boolean cambiarDatos() {

		if (!this.getTfNombre().getValue().equals(this.usuario.getNombre())
				|| !this.getTfFechaNac().getValue().equals(this.fecha)
				|| !this.getTfCorreo().getValue().equals(this.usuario.getCorreo())
				|| !this.getTfDescripcion().getValue().equals(this.usuario.getDescripcion())) {

			this.usuario.setNombre(this.getTfNombre().getValue());
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date myDate = null;
			try {
				// System.out.println(this.getIdFechaDeNaciemiento().getValue());
				myDate = formatter.parse(this.getTfFechaNac().getValue());
				// System.out.println("Fecha formateada correctamente");
				// System.out.println(myDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				Notification.show("Fecha incorrecta");

				return false;
			}

			String[] items = this.getTfFechaNac().getValue().split("/");
			fecha = "";

			if (items[0].length() >= 3) {
				Notification.show("Fecha incorrecta");
				return false;
			}

			if (items[1].length() >= 3) {
				Notification.show("Fecha incorrecta");
				return false;
			}

			if (items[2].length() != 4) {
				Notification.show("Fecha incorrecta");
				return false;
			}

			if (items[0].length() < 2)
				fecha += "0" + items[0] + "/";
			else
				fecha += items[0] + "/";

			if (items[1].length() < 2)
				fecha += "0" + items[1] + "/";
			else
				fecha += items[1] + "/";

			fecha += items[2];

			this.usuario.setFechaNacimiento(myDate);
			this.usuario.setDescripcion(this.getTfDescripcion().getValue());

			// System.out.println("Se le introduce el usuario: "+this.usuario.getUsuario());

			if (datos.guardarDatos(this.usuario.getFoto(), this.usuario.getUsuario(), this.usuario.getNombre(),
					this.usuario.getFechaNacimiento(), this.usuario.getCorreo(), this.usuario.getDescripcion())) {
				Notification.show("Datos guardados correctamente");
				this.getCabecera().setUser(this.datos.cargarDatosUsuario(cabecera.getUser().getUsuario()));
				return true;// No realiza cambios en la base de datos
			}

			/*
			 * String aFoto, String aUsuario, String aNombre, java.sql.Date
			 * aFechaDeNaciemiento, String aCorreoElectronico, String aDescripcion
			 */

			return false;

		} else {
			Notification.show("Nada que cambiar");
			return false;
		}

	}

	public boolean cambiarFoto() {
		if (fileData != null) {

			String nombImage = LocalDateTime.now().toString().replace(":", "-");

			try {

				if (!this.usuario.getFoto().equals("icons/user.svg")) {

					File fotoAEliminar = new File("src/main/webapp/" + this.usuario.getFoto());
					fotoAEliminar.delete();
					fotoAEliminar = null;

				}

				File file = new File(
						"src/main/webapp/Usuarios/" + this.usuario.getUsuario() + "/" + nombImage + ".jpg");
				if (!file.exists()) {
					file.createNewFile();
				}

				OutputStream out = new FileOutputStream(file.getPath());

				file = null;

				byte[] buf = new byte[1024];
				int length;

				Notification.show("Subiendo Imagen...");

				while ((length = fileData.read(buf)) > 0) {
					out.write(buf, 0, length);
				}

				fileData.close();

				out.flush();
				out.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				Notification.show("Error interno al cargar la imagen");
				e.printStackTrace();
				return false;
			}

			this.getUploader().getElement().setPropertyJson("files", Json.createArray());

			// if (this.usuario.getFoto().equals("icons/user.svg")){// Cambiar el valor en
			// la base de datos

			// System.out.println("Lo intenta");
			this.usuario.setFoto("Usuarios/" + this.usuario.getUsuario() + "/" + nombImage + ".jpg");
			// System.out.println(this.usuario.getFoto());

			if (!datos.guardarDatos(this.usuario.getFoto(), this.usuario.getUsuario(), this.usuario.getNombre(),
					this.usuario.getFechaNacimiento(), this.usuario.getCorreo(), this.usuario.getDescripcion())) {
				Notification.show("Error al guardar la imagen");
				return false;
			}

			// }
			Notification.show("Datos guardados correctamente");
			this.getCabecera().setUser(null);
			this.getCabecera().setUser(this.datos.cargarDatosUsuario(this.usuario.getUsuario()));
			return true;

		}

		return false;

	}

	private void bCambiar() {
		if (this.cambiarFoto()) {
			this.getCabecera().getbPerfil().click();

		}
	}

	private void bGuardar() {
		if (cambiarDatos())
			this.getCabecera().getbPerfil().click();
	}

}
