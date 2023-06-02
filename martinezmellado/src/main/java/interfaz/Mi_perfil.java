package interfaz;

import java.io.File;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;

import vistas.VistaMi_perfil;

public class Mi_perfil extends VistaMi_perfil {
//	private Label _nSeguidoresL;
//	private Label _nMeGustasL;
//	private ImagenIcon _imagenPerfilII;
//	private Label _nombreUsuarioL;
//	private Label _configurarL;
//	public Mi_cabecera _mi_cabecera;
//	public Configurar_mi_perfil _configurar_mi_perfil;
//	public Mi_video _mi_video;
//
//	public void configurar_mi_perfil() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void mi_video() {
//		throw new UnsupportedOperationException();
//	}
	
	basededatos.Usuario_Registrado usuario;

	public basededatos.Usuario_Registrado getUsuario() {
		return usuario;
	}

	public void setUsuario(basededatos.Usuario_Registrado usuario) {

		
		this.usuario = usuario;
		//File image = new File("/icons/toktok2.svg");
		//System.out.println(image.exists());
		
		//this.setIdImagen(new Image("localhost:8080"+usuario.getFoto(), "Imagen no encontrada"));
		this.getIdImagen().setSrc(usuario.getFoto());
		this.getIdUsuario().setText(this.usuario.getUsuario());
		this.getIdNumSeguidores().setText(String.valueOf(usuario.getID())+" seguidores");
		this.getIdNumMgs().setText("20 Me gustas");
		//System.out.println(this.usuario.getFoto());
	}
	
	
	
}