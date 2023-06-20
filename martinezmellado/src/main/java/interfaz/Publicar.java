package interfaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.Publicacion;
import basededatos.Publicaciones;
import basededatos.Usuario_Registrado;
import ch.qos.logback.core.boolex.Matcher;
import elemental.json.Json;
import proyectoMDS.MainView;
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

	private MainView vl;
	
	private BDPrincipal datos;

	private String pathImage;

	private MemoryBuffer memoryBuffer;

	private InputStream fileData;
	
	private Usuario_Registrado user;
	
	private Image image;
	
	

	//Object[] cosas;

	public Publicar(MainView vl, Mi_cabecera mi_cabecera) {
		
		this.datos = mi_cabecera.getDatos();
		this.user = mi_cabecera.getUser();
		this.vl = vl;
		
		this.setCabecera(mi_cabecera);
		
		this.getImguser().setSrc(this.user.getFoto());
		
		// usuarioARegistrar = new Usuario_Registrado();
		memoryBuffer = new MemoryBuffer();
		//cosas = new Object[3];
		this.getUploader().setReceiver(memoryBuffer);
		fileData = null;
		this.getUploader().addSucceededListener(event -> {

			
			if (event.getFileName().endsWith("mp4")) {
				fileData = memoryBuffer.getInputStream();
				
				image = null;
				
				File file = new File("src/main/webapp/Usuarios/"+this.getCabecera().getUser().getUsuario()+"/tmp");
				File file2 = new File("src/main/webapp/Usuarios/"+this.getCabecera().getUser().getUsuario()+"/tmp/tmp.mp4");
				
				if(file2.exists())
					file2.delete();
				if(file.exists())
					file.delete();
				
				this.getLayoutVideo().removeAll();
				Image image = new Image();
				image.setSrc("icons/video.svg");
				this.getLayoutVideo().add(image);
				
				file.mkdir();
				try {
					file2.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				OutputStream out;
				try {
					out = new FileOutputStream(file2);
				

				byte[] buf = new byte[1024];
				int length;
				
				//Notification.show("Subiendo video...");
				
				while ((length = fileData.read(buf)) > 0) {
					out.write(buf, 0, length);
				}
				
				fileData.reset();
				
				out.close();
				
				this.getLayoutVideo().removeAll();
				this.getLayoutVideo().add(new Video("Usuarios/"+this.getCabecera().getUser().getUsuario()+"/tmp/tmp.mp4", "90%","90%"));
				
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				file = null;
				file2 = null;
				
			}else
				Notification.show("Solo se admiten video en MP4");

		});
		
		this.getUploader().addFileRejectedListener(event ->{
			
			File file = new File("src/main/webapp/Usuarios/"+this.getCabecera().getUser().getUsuario()+"/tmp");
			File file2 = new File("src/main/webapp/Usuarios/"+this.getCabecera().getUser().getUsuario()+"/tmp/tmp.mp4");
			
			if(file2.exists())
				file2.delete();
			if(file.exists())
				file.delete();
			this.getLayoutVideo().removeAll();
			Image image = new Image();
			image.setSrc("icons/video.svg");
			this.getLayoutVideo().add(image);
			
			
		});
		
		this.getSubirVideo().addClickListener(event -> {
			bPublica();
        });
		
	}
	
	public Publicar(Cabecera_comercial cabecera) {
		
		this.datos = cabecera.getDatos();
		this.user = cabecera.getUser();
		this.vl = cabecera.getVl();
		
		this.setCabecera(cabecera);
		
		this.getImguser().setSrc(this.user.getFoto());
		
		// usuarioARegistrar = new Usuario_Registrado();
		memoryBuffer = new MemoryBuffer();
		//cosas = new Object[3];
		this.getUploader().setReceiver(memoryBuffer);
		fileData = null;
		this.getUploader().addSucceededListener(event -> {

			
			if (event.getFileName().endsWith("mp4")) {
				fileData = memoryBuffer.getInputStream();
				
				File file = new File("src/main/webapp/Usuarios/"+this.getCabeceraCom().getUser().getUsuario()+"/tmp");
				File file2 = new File("src/main/webapp/Usuarios/"+this.getCabeceraCom().getUser().getUsuario()+"/tmp/tmp.mp4");
				
				if(file2.exists())
					file2.delete();
				if(file.exists())
					file.delete();
				
				this.getLayoutVideo().removeAll();
				Image image = new Image();
				image.setSrc("icons/video.svg");
				this.getLayoutVideo().add(image);
				
				file.mkdir();
				try {
					file2.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				OutputStream out;
				try {
					out = new FileOutputStream(file2);
				

				byte[] buf = new byte[1024];
				int length;
				
				//Notification.show("Subiendo video...");
				
				while ((length = fileData.read(buf)) > 0) {
					out.write(buf, 0, length);
				}
				
				fileData.reset();
				
				out.close();
				
				this.getLayoutVideo().removeAll();
				this.getLayoutVideo().add(new Video("Usuarios/"+this.getCabeceraCom().getUser().getUsuario()+"/tmp/tmp.mp4", "90%","90%"));
				
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				file = null;
				file2 = null;
				
			}else
				Notification.show("Solo se admiten video en MP4");

		});
		
		this.getUploader().addFileRejectedListener(event ->{
			
			File file = new File("src/main/webapp/Usuarios/"+this.getCabecera().getUser().getUsuario()+"/tmp");
			File file2 = new File("src/main/webapp/Usuarios/"+this.getCabecera().getUser().getUsuario()+"/tmp/tmp.mp4");
			
			if(file2.exists())
				file2.delete();
			if(file.exists())
				file.delete();
			this.getLayoutVideo().removeAll();
			Image image = new Image();
			image.setSrc("icons/video.svg");
			this.getLayoutVideo().add(image);
			
			
		});
		
		this.getSubirVideo().addClickListener(event -> {
			bPublica();
        });
		
	}

	public void bPublica() {
		
		if (this.getUbicacion().isEmpty() || this.getDescrpcion().isEmpty()) {
			Notification.show("Por favor rellene los campos");
			return;
		}
		
		String nombVideo = LocalDateTime.now().toString().replace(":", "-");

		String directoryPath = "src/main/webapp/Usuarios/" + this.user.getUsuario() + "/videos" ;
		
		String nvideo = "/" + nombVideo + ".mp4";
		

		Publicacion publicacion = new Publicacion();

		String descripcion = this.getDescrpcion().getValue();
		Date fecha = Date.valueOf(LocalDate.now());
		Usuario_Registrado autor = this.user;
		String ubicacio = this.getUbicacion().getValue();
		String ruta = directoryPath + nvideo;
		String propietario="";
		if(this.getCabecera()!=null)
			propietario = this.getCabecera().getUser().getUsuario();
		if(this.getCabeceraCom()!=null)
			propietario = this.getCabeceraCom().getUser().getUsuario();

		datos.nuevaPublicacion(descripcion, ubicacio, ruta, null, this.user.getComercial(), propietario);

		String texto = this.getDescrpcion().getValue();

		// Usamos un Set en lugar de una lista para evitar duplicados
		Set<String> hashtags = new HashSet<>();

		for (String palabra : texto.split("\\s+")) {
		    if (palabra.startsWith("#")) {
		        // Si la palabra contiene múltiples hashtags seguidos, se separan
		        Collections.addAll(hashtags, palabra.split("(?=#)"));
		    }
		}

		// Convertimos el Set a ArrayList
		ArrayList<String> hashtagsLista = new ArrayList<>(hashtags);

        // Imprimimos todos los hashtags que encontramos
        for (String hashtag : hashtagsLista) {
        	if (!hashtag.matches(".*[a-zA-Z0-9]+.*")) continue;
           this.datos.añadirPublicacionHashTag(hashtag, this.datos.cargarVideoPorRuta(ruta));
        }
		try {
			
			File directory = new File(directoryPath);
			if (!directory.exists()) {
				directory.mkdirs();
			}
			File file = new File(directoryPath+nvideo);

			// if(!file.exists())
			file.createNewFile();
			file = null;

			OutputStream out = new FileOutputStream(directoryPath + nvideo);

			byte[] buf = new byte[1024];
			int length;
			
			Notification.show("Subiendo video...");
			
			while ((length = fileData.read(buf)) > 0) {
				out.write(buf, 0, length);
			}

			fileData.close();

			out.flush();
			out.close();
			this.getUploader().getElement().setPropertyJson("files", Json.createArray());
			this.getDescrpcion().setValue("");
			this.getUbicacion().setValue("");
			
			Notification.show("Video subido");
			
			File file3=null;
			File file2=null;
			
			if(this.getCabecera()!=null) {
				file3 = new File("src/main/webapp/Usuarios/"+this.getCabecera().getUser().getUsuario()+"/tmp");
				file2 = new File("src/main/webapp/Usuarios/"+this.getCabecera().getUser().getUsuario()+"/tmp/tmp.mp4");
			}
			
			if(this.getCabeceraCom()!=null) {
				file3 = new File("src/main/webapp/Usuarios/"+this.getCabeceraCom().getUser().getUsuario()+"/tmp");
				file2 = new File("src/main/webapp/Usuarios/"+this.getCabeceraCom().getUser().getUsuario()+"/tmp/tmp.mp4");
			}
			
			if(file2.exists())
				file2.delete();
			if(file3.exists())
				file3.delete();
			file2 = null;
			file3 = null;
			
			this.vl.removeAll();
			if(this.getCabecera()!=null)
				this.vl.add(new Mi_perfil(this.vl, this.getCabecera()));
			if(this.getCabeceraCom()!=null)
				this.vl.add(new Perfil_comercial(this.getCabeceraCom()));
			
			try {
				this.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Notification.show("Error interno (No se ha cargado el archivo)");

			return;
		}
	}
	
	/*public void cargarUsuario() {
		this.getIconoUsr().setProperty("src", this.getUsr().getFoto());
	}*/
}
