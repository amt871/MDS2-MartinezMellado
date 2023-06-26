package interfaz;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;
import org.orm.PersistentException;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import elemental.json.Json;
import proyectoMDS.MainView;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.upload.Receiver;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import vistas.VistaRegistro;

public class Registro extends VistaRegistro {

	
	private MainView vl;
	//private Pantalla_inicio inicio;
	//private Confirmar_correo confCor;
	private BDPrincipal datos;
	//private String pathImage;
	private MemoryBuffer memoryBuffer;// = new MemoryBuffer();
	private InputStream fileData;
	private Pantalla_inicio pantalla_inicio;
	private Confirmar_correo confCorr;

	public Registro(MainView vlMain, BDPrincipal datos/*, Pantalla_inicio inicio*/, Pantalla_inicio pantalla_inicio, Confirmar_correo confCorr) {
		
		this.vl = vlMain;
		this.datos = datos;
		this.pantalla_inicio = pantalla_inicio;
		this.confCorr = confCorr;
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
		this.vl.add(this.pantalla_inicio);
		
		this.pantalla_inicio.clear();
		
		/*try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
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
		
		if(this.getIdContrasenna().getValue().length()!=12) {
			Notification.show("La contrasenna tiene que tener:\n1. 12 caracteres\n2. Al menos 2 minusculas\n3. Al menos 2 mayusculas");
			return;
		}
			
		int contMayus=0;
		int contMinus=0;
		
		for(int i = 0; i<this.getIdContrasenna().getValue().length(); i++) {
			if(Character.isUpperCase(this.getIdContrasenna().getValue().charAt(i)))
				contMayus++;
			if(Character.isLowerCase(this.getIdContrasenna().getValue().charAt(i)))
				contMinus++;
		}
		
		if(contMayus<2 || contMinus<2) {
			Notification.show("La contrasenna tiene que tener:\n1. 12 caracteres\n2. Al menos 2 minusculas\n3. Al menos 2 mayusculas");
			return;
		}
		//int contDigits=0;

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

		
		String codigo = String.valueOf((int)Math.floor((Math.random()*(9999-1000+1))+1000));
		
		System.out.println(codigo);
		System.out.println(usuarioARegistrar.getCorreo());
		
		
		this.vl.removeAll();
		this.vl.add(confCorr = new Confirmar_correo(this.vl, usuarioARegistrar, this.fileData, this.datos, this.pantalla_inicio));
		/*try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("No me da la gana cerrarme");
		}*/

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