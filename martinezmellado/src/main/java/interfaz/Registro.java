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
import elemental.json.Json;
import proyectoMDS.MainView;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.upload.Receiver;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

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

/*	BDPrincipal datos;
	String pathImage;
	MemoryBuffer memoryBuffer;// = new MemoryBuffer();
	InputStream fileData;
//	Usuario_Registrado usuarioARegistrar;
	Object[] cosas;*/
	
	private MainView vl;
	//private Pantalla_inicio inicio;
	//private Confirmar_correo confCor;
	private BDPrincipal datos;
	//private String pathImage;
	private MemoryBuffer memoryBuffer;// = new MemoryBuffer();
	private InputStream fileData;

	public Registro(MainView vlMain, BDPrincipal datos/*, Pantalla_inicio inicio*/) {
		
		this.vl = vlMain;
		this.datos = datos;
		//this.inicio = inicio;

		this.getbAtras().addClickListener(event -> {
			
			pantallaAnterior();
			
		});
		
		this.getbRegistrar().addClickListener(event -> {
			
			registrarUsuario();
			
		});
		
		// usuarioARegistrar = new Usuario_Registrado();
		this.memoryBuffer = new MemoryBuffer();
		//cosas = new Object[3];
		this.getIdImagen().setReceiver(memoryBuffer);
		this.fileData = null;
		this.getIdImagen().addSucceededListener(event -> {

			if (event.getFileName().toLowerCase().endsWith("jpg"))
				fileData = memoryBuffer.getInputStream();
			else {
				Notification.show("Solo se admiten imagenes en jpg");
				this.getIdImagen().getElement().setPropertyJson("files", Json.createArray());
			}
			

		});

	}

	private void pantallaAnterior() {
		// TODO Auto-generated method stub
		this.vl.removeAll();
		this.vl.add(new Pantalla_inicio(this.vl, this.datos));
		
		try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*public Registro(MainView vlMain) {
		// TODO Auto-generated constructor stub
	}*/

	private void registrarUsuario() {

		// this.getbRegistrar().addClickListener(event -> {

		Usuario_Registrado usuarioARegistrar;

		if (this.getIdNombre().isEmpty()) {

			Notification.show("Introduce el Nombre");
			return;
		}

		if (this.getIdApellidos().isEmpty()) {

			Notification.show("Introduce el Apellido");
			return;
		}

		if (this.getIdUsuario().isEmpty()) {

			Notification.show("Introduce el Nombre de Usuario");
			return;
		}

		usuarioARegistrar = datos.datosUsuario(this.getIdUsuario().getValue());

		if (usuarioARegistrar != null) {
			Notification.show("Usuario ya registrado");
			return;
		}

		if (this.getIdContrasenna().isEmpty()) {

			Notification.show("Introduce la Contrasenna");
			return;
		}

		if (this.getIdCorreo().isEmpty()) {

			Notification.show("Introduce el Correo");
			return;
		}

		if (this.getIdFechaNacimiento().isEmpty()) {

			Notification.show("Introduce la Fecha de Nacimiento");
			return;
		}

		// System.out.println(this.getIdFechaNacimiento().getValue());

		usuarioARegistrar = new Usuario_Registrado();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date myDate = null;
		// Date sqlDate = null;
		try {
			myDate = formatter.parse(this.getIdFechaNacimiento().getValue());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			Notification.show("Fecha incorrecta");
			return;
		}

		usuarioARegistrar.setNombre(this.getIdNombre().getValue());
		usuarioARegistrar.setApellido(this.getIdApellidos().getValue());
		usuarioARegistrar.setUsuario(this.getIdUsuario().getValue());
		usuarioARegistrar.setContrasenna(this.getIdContrasenna().getValue());
		usuarioARegistrar.setCorreo(this.getIdCorreo().getValue());
		usuarioARegistrar.setFechaNacimiento(myDate);
		usuarioARegistrar.setDescripcion(this.getIdDescripcion().getValue());
		usuarioARegistrar.setComercial(this.getUsrComBool().getValue() ? "Comercial" : "Normal");
		
		this.getIdNombre().clear();
		this.getIdApellidos().clear();
		this.getIdUsuario().clear();
		this.getIdContrasenna().clear();
		this.getIdCorreo().clear();
		this.getIdFechaNacimiento().clear();
		this.getIdDescripcion().clear();
		this.getUsrComBool().clear();
		this.getIdImagen().getElement().setPropertyJson("files", Json.createArray());

//USUARIO A REGISTRAR, FILEDATA		

		/*if (fileData != null)
			cosas[2] = fileData;
		else
			cosas[2] = null;

		cosas[0] = true;*/

		this.vl.removeAll();
		this.vl.add(new Confirmar_correo(this.vl, usuarioARegistrar, this.fileData, this.datos));
		try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("No me da la gana cerrarme");
		}

	}

	/*
	 * public boolean registrarUsuario(){
	 * 
	 * //this.getbRegistrar().addClickListener(event -> {
	 * 
	 * if (this.getIdNombre().isEmpty()) {
	 * 
	 * Notification.show("Introduce el Nombre"); return false; }
	 * 
	 * if (this.getIdApellidos().isEmpty()) {
	 * 
	 * Notification.show("Introduce el Apellido"); return false; }
	 * 
	 * if (this.getIdUsuario().isEmpty()) {
	 * 
	 * Notification.show("Introduce el Nombre de Usuario"); return false; }
	 * 
	 * if (this.getIdContrasenna().isEmpty()) {
	 * 
	 * Notification.show("Introduce la Contrasenna"); return false; }
	 * 
	 * if (this.getIdCorreo().isEmpty()) {
	 * 
	 * Notification.show("Introduce el Correo"); return false; }
	 * 
	 * if (this.getIdFechaNacimiento().isEmpty()) {
	 * 
	 * Notification.show("Introduce la Fecha de Nacimiento"); return false; }
	 * 
	 * //System.out.println(this.getIdFechaNacimiento().getValue());
	 * 
	 * DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); Date myDate =
	 * null; //Date sqlDate = null; try { myDate =
	 * formatter.parse(this.getIdFechaNacimiento().getValue()); } catch
	 * (ParseException e) { // TODO Auto-generated catch block
	 * //e.printStackTrace(); Notification.show("Fecha incorrecta"); return false; }
	 * //if(myDate!=null) //sqlDate = new Date(myDate.getTime());
	 * 
	 * pathImage =
	 * "C:/UsuariosProyectoMDS2/"+this.getIdUsuario().getValue()+"/imagen.jpg";
	 * 
	 * if(!datos.registrarse(this.getIdNombre().getValue(),
	 * this.getIdApellidos().getValue(), this.getIdUsuario().getValue(),
	 * this.getIdContrasenna().getValue(), this.getIdCorreo().getValue(), myDate,
	 * this.getIdDescripcion().getValue(), pathImage,
	 * this.getUsrComBool().getValue() ? "Comercial" : "Normal")) {
	 * Notification.show("Registo no completado"); return false; }
	 * 
	 * if(fileData != null) try {
	 * 
	 * File image = new File(pathImage);
	 * 
	 * //if(!image.exists()) image.createNewFile();
	 * 
	 * OutputStream out = new FileOutputStream(pathImage);
	 * 
	 * //fileData.transferTo(out);
	 * 
	 * byte[] buf = new byte[1024]; int length; while ((length = fileData.read(buf))
	 * > 0) { out.write(buf, 0, length); } //byte[] dataBytes =
	 * fileData.readAllBytes();
	 * 
	 * fileData.close();
	 * 
	 * //out.wri out.flush(); out.close(); image = null;
	 * 
	 * } catch (IOException e) { // TODO Auto-generated catch block
	 * e.printStackTrace();
	 * Notification.show("Error interno (No se ha cargado la Imagen)"); }
	 * 
	 * Notification.show("Registro completado"); return true;
	 * 
	 * }
	 */

}// LAS IMAGENES SON LAS QUE HAY EN META-INF