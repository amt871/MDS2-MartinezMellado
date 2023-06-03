package interfaz;

import basededatos.Usuario_Registrado;
import vistas.VistaConfigurar;

public class Configurar extends VistaConfigurar {
//	private Label _fotoL;
//	private ImageIcon _fotoPerfilII;
//	private Button _cambiarB;
//	private event _cambiar_foto;
//	private Lalbel _usuarioL;
//	private TextField _usuarioTF;
//	private Label _nombreL;
//	private TextFiield _nombreTF;
//	private event _guardar_datos;
//	public Perfil_comercial _perfil_comercial;
//	public Cambiar_contrasenna _cambiar_contrasenna;
//
//	public void guardar_datos() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void cambiar_foto() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void cambiar_contrasenna() {
//		throw new UnsupportedOperationException();
//	}
	
	Usuario_Registrado usuario;

	public Usuario_Registrado getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario_Registrado usuario) {
		this.usuario = usuario;
		this.getIdImagen().setSrc(this.usuario.getFoto());
		this.getIdLabelPrivacidad().setText(this.usuario.getPrivado() ? "Usuario privado" : "Usuario publico");
	}
	
	
}