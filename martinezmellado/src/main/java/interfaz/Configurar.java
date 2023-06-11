package interfaz;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
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
	
	private Usuario_Registrado usuario;
	private BDPrincipal datos; //= new BDPrincipal();
	private Mi_cabecera cabecera;
	
	public Configurar(Usuario_Registrado usuario_Registrado, BDPrincipal bdPrincipal, Mi_cabecera cabecera) {
		
		this.usuario = usuario_Registrado;
		this.datos = bdPrincipal;
		this.cabecera = cabecera;
		
//	}
//
//	public Usuario_Registrado getUsuario() {
//		return usuario;
//	}
//
//	public void setUsuario(Usuario_Registrado usuario) {//Inicializar
//		this.usuario = usuario;
		this.getIdImagen().setSrc(this.usuario.getFoto());
		this.getIdLabelPrivacidad().setText(this.usuario.getPrivado() ? "Usuario privado" : "Usuario publico");
		this.getbCambioPrivacidad().addClickListener(event ->{
			
			this.cambiarPrivacidad();
			
		});
		
		this.getbModificarDatos().addClickListener(event -> {
			
			//this.getCabecera().setConfig(new Configurar(mi_cabecera.getUser(), mi_cabecera.getDatos()));
			this.getCabecera().setConfigPerf(new Configurar_mi_perfil(this.getCabecera(), this));
			this.getCabecera().getVl().add(this.getCabecera().getConfigPerf());
			
		});
		
		this.getbSiguiendo().addClickListener(event -> {
			
			
			this.getCabecera().setSiguiendo(new Ver_siguiendo(this.getCabecera(), this));
			this.getCabecera().getVl().add(this.getCabecera().getSiguiendo());
			
		});
		
		this.getbSiguiendo().addClickListener(event -> {
			
			
			this.getCabecera().setSeguidores(new Ver_mis_seguidores(this.getCabecera(), this));
			this.getCabecera().getVl().add(this.getCabecera().getSeguidores());
			
		});
	}
	
	public void cambiarPrivacidad() {
		
		//Cambiar privacidad
		//Si devuelve true se cambia el label sino nada
		if(datos.modificarEstadoUsuario(this.usuario.getUsuario())) {
			this.getIdLabelPrivacidad().setText(this.getIdLabelPrivacidad().getText().equals("Usuario publico") ? "Usuario privado" : "Usuario publico");
			Notification.show("Privacidad cambiada");
		}else
			Notification.show("No se ha podido cambiar la privacidad");
	}

	public Mi_cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		this.cabecera = cabecera;
	}
	
	
	
}