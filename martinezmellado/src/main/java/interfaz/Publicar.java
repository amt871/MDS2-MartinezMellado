package interfaz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.Publicacion;
import basededatos.Publicaciones;
import basededatos.Usuario_Registrado;
import elemental.json.Json;
import vistas.VistaPublicar;

public class Publicar extends VistaPublicar {
//	private ImageIcon _logoII;
//	private ImageIcon _fotoPerfilII;
//	private Label _usuarioL;
//	private Label _descripcionL;
//	private TextArea _descripcionTA;
//	private Button _publicarB;
//	public Cabecera_usuario_registrado _cabecera_usuario_registrado;
//	public Seleccionar_video _seleccionar_video;
//
//	public void seleccionar_video() {
//		throw new UnsupportedOperationException();
//	}

	BDPrincipal datos;

	String pathImage;

	MemoryBuffer memoryBuffer;

	InputStream fileData;

	Object[] cosas;

	public Publicar() {
		datos = new BDPrincipal();
		// usuarioARegistrar = new Usuario_Registrado();
		memoryBuffer = new MemoryBuffer();
		cosas = new Object[3];
		this.getUploader().setReceiver(memoryBuffer);
		fileData = null;
		this.getUploader().addSucceededListener(event -> {

			if (event.getFileName().endsWith("mp4"))
				fileData = memoryBuffer.getInputStream();
			else
				Notification.show("Solo se admiten video en MP4");

		});
		this.getSubirVideo().addClickListener(event -> {
			bPublica();
        });
		
	}

	public boolean bPublica() {
		
		String nombVideo = LocalDateTime.now().toString().replace(":", "-");

		String directoryPath = "src/main/webappUsuarios/" + this.getUsr().getUsuario() + "/videos" ;
		
		String nvideo = "/" + nombVideo + ".mp4";
		

		Publicacion publicacion = new Publicacion();

		String descripcion = this.getDescrpcion().getValue();
		Date fecha = Date.valueOf(LocalDate.now());
		Usuario_Registrado autor = this.getUsr();
		String ubicacio = this.getUbicacion().getValue();
		String ruta = directoryPath + nvideo;
		String propietario = this.getUsr().getUsuario();

		datos.nuevaPublicacion(descripcion, ubicacio, ruta, null, this.getUsr().getComercial(), propietario);

		try {
			
			File directory = new File(directoryPath);
			if (!directory.exists()) {
				directory.mkdirs();
			}
			File file = new File(directoryPath);

			// if(!file.exists())
			file.createNewFile();
			file = null;

			OutputStream out = new FileOutputStream(directoryPath + nvideo);

			byte[] buf = new byte[1024];
			int length;
			while ((length = fileData.read(buf)) > 0) {
				out.write(buf, 0, length);
			}

			fileData.close();

			out.flush();
			out.close();
			this.getUploader().getElement().setPropertyJson("files", Json.createArray());
			this.getDescrpcion().setValue("");
			this.getUbicacion().setValue("");
			
			return true;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Notification.show("Error interno (No se ha cargado el archivo)");

			return false;
		}
	}
	
	public void cargarUsuario() {
		this.getIconoUsr().setProperty("src", this.getUsr().getFoto());
	}
}
