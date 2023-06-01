package interfaz;

import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.orm.PersistentException;

import basededatos.*;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.upload.Receiver;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import orm.Usuario_Registrado;
import orm.Usuario_RegistradoDAO;
import vistas.VistaRegistro;

public class Registro extends VistaRegistro {
//	private TextField_ _nombreTF;
//	private Label_ _nombreB;
//	private TextField_ _apellidosTF;
//	private Label_ _apellidosL;
//	private TextField_ _usuarioTF;
//	private Label _usuarioL;
//	private TextField _contrasenaTF;
//	private Label _contrasenaL;
//	private TextFiled _correoTF;
//	private TextField _fechaDeNacimientoTF;
//	private Label _fechaDeNacimientoL;
//	private TextField _descripcionTF;
//	private Label _descripcionL;
//	private Button _selecccionarB;
//	private Label _fotoL;
//	private CheckBox _usuarioComercial;
//	private Button _registrarseB;
//	private Label _esloganL;
//	private Label _nombreAppL;
//	private ImageIcon _logoII;
//	public Pantalla_inicio _pantalla_inicio;
//	public Cabecera_usuario_no_registrado _cabecera_usuario_no_registrado;
//	public Confirmar_correo _confirmar_correo;
//
//	public void confirmar_correo() {
//		throw new UnsupportedOperationException();
//	}
	
	BDPrincipal datos;
	String pathImage;
	MemoryBuffer memoryBuffer = new MemoryBuffer();
	InputStream fileData;
	
	

	public Registro() {
		
		datos = new BDPrincipal();
		memoryBuffer = new MemoryBuffer();
		this.getIdImagen().setReceiver(memoryBuffer);
		fileData = null;
		this.getIdImagen().addSucceededListener(event -> {
			
			if(event.getFileName().endsWith("jpg"))
				fileData = memoryBuffer.getInputStream();
			else
				Notification.show("Solo se admiten imagenes en jpg");
		    //String fileName = event.getFileName();
		    //long contentLength = event.getContentLength();
		    //String mimeType = event.getMIMEType();
			
		    //Notification.show(fileName);
		    //Notification.show(mimeType);
		    //Notification.show(fileData.toString());
			
		});
		
		/*this.getIdImagen().setReceiver(new Receiver() {
		    @Override
		    public OutputStream receiveUpload(String filename, String mimeType) {
		        // Esta será tu ruta de archivo local.
		        // Modifícala según donde quieras guardar el archivo.
		        //String filePath = "local/path/to/your/file/" + filename;

		        FileOutputStream fos; // Stream para escribir el archivo
		        try {
		            fos = new FileOutputStream(pathImage);
		        } catch (final java.io.FileNotFoundException e) {
		        	Notification.show("Error de imagen");
		            return null;
		        }
		        return fos; // Devuelve el FileOutputStream
		    }
		}); // Obtén tu objeto Upload*/
		
		
		/*this.getbRegistrar().addClickListener(event -> {
			
			if(registrarUsuario())
				Notification.show("RegistroCompleto");
			
		});*/
		
	}
	
	public boolean registrarUsuario(){

		//this.getbRegistrar().addClickListener(event -> {

			if (this.getIdNombre().isEmpty()) {

				Notification.show("Introduce el Nombre");
				return false;
			}

			if (this.getIdApellidos().isEmpty()) {

				Notification.show("Introduce el Apellido");
				return false;
			}

			if (this.getIdUsuario().isEmpty()) {

				Notification.show("Introduce el Nombre de Usuario");
				return false;
			}

			if (this.getIdContrasenna().isEmpty()) {

				Notification.show("Introduce la Contrasenna");
				return false;
			}

			if (this.getIdCorreo().isEmpty()) {

				Notification.show("Introduce el Correo");
				return false;
			}

			if (this.getIdFechaNacimiento().isEmpty()) {

				Notification.show("Introduce la Fecha de Nacimiento");
				return false;
			}

			//System.out.println(this.getIdFechaNacimiento().getValue());
			
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date myDate = null;
			//Date sqlDate = null;
			try {
				myDate = formatter.parse(this.getIdFechaNacimiento().getValue());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				Notification.show("Fecha incorrecta");
				return false;
			}
			//if(myDate!=null)
				//sqlDate = new Date(myDate.getTime());
			
			pathImage = "C:/UsuariosProyectoMDS2/"+this.getIdUsuario().getValue()+"/imagen.jpg";
			
			if(!datos.registrarse(this.getIdNombre().getValue(), this.getIdApellidos().getValue(), this.getIdUsuario().getValue(), this.getIdContrasenna().getValue(),
					this.getIdCorreo().getValue(), myDate, this.getIdDescripcion().getValue(),
					pathImage, this.getUsrComBool().getValue() ? "Comercial" : "Normal"))
				//Notification.show("Registro completo");
			/*else*/ {
				Notification.show("Registo no completado");
				return false;
			}
			
			/*this.getIdImagen().setReceiver(new Receiver() {
			    @Override
			    public OutputStream receiveUpload(String filename, String mimeType) {
			        // Esta será tu ruta de archivo local.
			        // Modifícala según donde quieras guardar el archivo.
			        //String filePath = "local/path/to/your/file/" + filename;

			        FileOutputStream fos; // Stream para escribir el archivo
			        try {
			            fos = new FileOutputStream(pathImage);
			        } catch (final java.io.FileNotFoundException e) {
			        	Notification.show("Error de imagen");
			            return null;
			        }
			        return fos; // Devuelve el FileOutputStream
			    }
			}); // Obtén tu objeto Upload
			
			return true;*/
		//});
			
			if(fileData != null)
			try {
				
				File image = new File(pathImage);
				
				//if(!image.exists())
					image.createNewFile();
					
				OutputStream out = new FileOutputStream(pathImage);
				
				//fileData.transferTo(out);
				
				byte[] buf = new byte[1024];
			    int length;
			    while ((length = fileData.read(buf)) > 0) {
			        out.write(buf, 0, length);
			    }
				//byte[] dataBytes = fileData.readAllBytes();
				
				fileData.close();
				
				//out.wri
				out.flush();
				out.close();
				image = null;
				
			/*} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Notification.show("Error interno (Archivo no encontrado)");
				
			*/} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Notification.show("Error interno (No se ha cargado la Imagen)");
			}
			
			Notification.show("Registro completado");
			return true;

	}

}//LAS IMAGENES SON LAS QUE HAY EN META-INF