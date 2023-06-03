package interfaz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.time.LocalDate;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.Publicacion;
import basededatos.Publicaciones;
import basededatos.Usuario_Registrado;
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
		int nPubl = 0;
		if (!(this.getUsr().publica == null)) {
			nPubl = this.getUsr().publica.size();
		}
		String nombVideo = String.valueOf(nPubl + 1);

		String directoryPath = "Usuarios/" + this.getUsr().getUsuario() + "/videos/" + nombVideo + ".mp4";

		Publicacion publicacion = new Publicacion();

		publicacion.setDescripcion(this.getDescripcion().getValue());
		publicacion.setFecha(Date.valueOf(LocalDate.now()));
		publicacion.setRealizada(this.getUsr());
		publicacion.setORM_Realizada(this.getUsr());
		publicacion.setUbicacion(this.getDescripcion().getValue());
		publicacion.setVideo(pathImage);

		datos.nuevaPublicacion(publicacion.getDescripcion(), publicacion.getUbicacion(), publicacion.getVideo(), null,
				publicacion.getPublicidad(), publicacion.getRealizada().getUsuario());

		try {
			
			File directory = new File(directoryPath);
			if (!directory.exists()) {
				directory.mkdirs();
			}
			File file = new File(directoryPath);

			// if(!file.exists())
			file.createNewFile();
			file = null;

			OutputStream out = new FileOutputStream(directoryPath);

			byte[] buf = new byte[1024];
			int length;
			while ((length = fileData.read(buf)) > 0) {
				out.write(buf, 0, length);
			}

			fileData.close();

			out.flush();
			out.close();
			
			return true;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Notification.show("Error interno (No se ha cargado el archivo)");

			return false;
		}
	}
}