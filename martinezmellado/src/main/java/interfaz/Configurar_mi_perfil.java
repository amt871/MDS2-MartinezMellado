package interfaz;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaadin.flow.component.notification.Notification;

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
	
	Usuario_Registrado usuario;

	public Usuario_Registrado getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario_Registrado usuario) {
		this.usuario = usuario;
		String fecha = String.valueOf(this.usuario.getFechaNacimiento()).substring(8, 10)+"/"+
		String.valueOf(this.usuario.getFechaNacimiento()).substring(5,8)+"/"+
		String.valueOf(this.usuario.getFechaNacimiento()).substring(0,4);
		
		this.getIdImagen().setSrc(this.usuario.getFoto());
		this.getIdUsuario().setValue(this.usuario.getUsuario());
		this.getIdUsuario().setReadOnly(true);
		this.getIdNombre().setValue(this.usuario.getNombre());
		this.getIdApellidos().setValue(this.usuario.getApellido());
		this.getIdFechaDeNaciemiento().setValue(fecha);
		this.getIdCorreoElectronico().setValue(this.usuario.getCorreo());
		this.getIdDescripcion().setValue(this.usuario.getDescripcion());
		
		this.getIdNotis().setVisible(false);
	}
	
	
	
}