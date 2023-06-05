package interfaz;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import vistas.VistaConfigurar_mi_perfil;

public class Configurar_mi_perfil extends VistaConfigurar_mi_perfil {
//	private ImageIcon _fotoPerfilII;
//	private Label _nombreUsuarioL;
//	private Label _descrpcionL;
//	private Label _siguiendoL;
//	private Button _seguidoresB;
//	private Button _cambiar_privacidad_cuenta;
//	private Button _modificarDatosB;
//	private Button _cerrar_sesion;
//	public Mi_perfil _mi_perfil;
//	public Mis_seguidores _mis_seguidores;
//	public Siguiendo _siguiendo;
//	public Solicitudes _solicitudes;
//
//	public void mis_seguidores() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void siguiendo() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void cambiar_privacidad_cuenta() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void solicitudes() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void cerrar_sesion() {
//		throw new UnsupportedOperationException();
//	}

	private Usuario_Registrado usuario;
	private String fecha;
	private BDPrincipal datos;

	public Usuario_Registrado cambiarDatos() {

		if (!this.getIdNombre().getValue().equals(this.usuario.getNombre())
				|| !this.getIdApellidos().getValue().equals(this.usuario.getApellido())
				|| !this.getIdFechaDeNaciemiento().getValue().equals(this.fecha)
				|| !this.getIdCorreoElectronico().getValue().equals(this.usuario.getCorreo())
				|| !this.getIdDescripcion().getValue().equals(this.usuario.getDescripcion())) {

			this.usuario.setNombre(this.getIdNombre().getValue());
			this.usuario.setApellido(this.getIdApellidos().getValue());
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date myDate = null;
			try {
				System.out.println(this.getIdFechaDeNaciemiento().getValue());
				myDate = formatter.parse(this.getIdFechaDeNaciemiento().getValue());
				System.out.println("Fecha formateada correctamente");
				System.out.println(myDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				Notification.show("Fecha incorrecta");

				return null;
			}
			
			String[] items = this.getIdFechaDeNaciemiento().getValue().split("/");
			fecha = "";
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
			this.usuario.setDescripcion(this.getIdDescripcion().getValue());

			if(datos.guardarDatos(this.usuario.getFoto(), this.usuario.getUsuario(), this.usuario.getNombre(), this.usuario.getFechaNacimiento(), this.usuario.getCorreo(), this.usuario.getDescripcion()))
				return this.usuario;
			
			/*String aFoto, String aUsuario, String aNombre, java.sql.Date aFechaDeNaciemiento,
			String aCorreoElectronico, String aDescripcion*/
			
			return null;

		} else {
			Notification.show("Nada que cambiar");
			return null;
		}

	}

	public Usuario_Registrado getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario_Registrado usuario) {// Inicializar
		datos = new BDPrincipal();
		this.usuario = usuario;
		

		if (this.getIdFechaDeNaciemiento().isEmpty()) {
			String[] items = String.valueOf(this.usuario.getFechaNacimiento()).split("-");
			fecha = "";
			System.out.println("Hola: " + this.usuario.getFechaNacimiento());
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

		this.getIdImagen().setSrc(this.usuario.getFoto());
		this.getIdUsuario().setValue(this.usuario.getUsuario());
		this.getIdUsuario().setReadOnly(true);
		this.getIdNombre().setValue(this.usuario.getNombre());
		this.getIdApellidos().setValue(this.usuario.getApellido());
		this.getIdFechaDeNaciemiento().setValue(fecha);
		this.getIdCorreoElectronico().setValue(this.usuario.getCorreo());
		this.getIdCorreoElectronico().setReadOnly(true);
		this.getIdDescripcion().setValue(this.usuario.getDescripcion());

		this.getIdNotis().setVisible(false);

	}

}