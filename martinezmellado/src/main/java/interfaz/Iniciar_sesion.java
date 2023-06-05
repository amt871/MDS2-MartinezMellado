package interfaz;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import vistas.VistaIniciar_sesion;

public class Iniciar_sesion extends VistaIniciar_sesion{
	
	private BDPrincipal datos = new BDPrincipal();
	
//	private event _entrar;
//	private Label _usuarioL;
//	private TextField _usuarioTF;
//	private Label _contrasenaL;
//	private TextField _contrasenaTF;
//	private Button _entrarB;
//	private Button _recuperarContrase�aB;
//	private Label _nombreAppL;
//	private Label _esloganL;
//	private ImageIcon _logoII;
//	public Pantalla_inicio _pantalla_inicio;
//	public Cabecera_usuario_no_registrado _cabecera_usuario_no_registrado;
//	public Recuperar_Contrasenna _recuperar_Contrasenna;
//
//	public void recuperar_contrasenna() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void entrar() {
//		throw new UnsupportedOperationException();
//	}
	
	public boolean inicioSesionCibernauta() {

		if (getInUser().getValue().equals("user") && getInPass().getValue().equals("pass")) {
			//cambiarPantalla(pantalla);
			Notification.show("Acceso concedido");
			getInUser().setValue("");
			getInPass().setValue("");
			return true;
		} else {
			
			//Notification.show("Credenciales incorrectas");
			return false;
			
		}

	}
	
	public boolean inicioSesionComercial() {
		
		if (getInUser().getValue().equals("comercial") && getInPass().getValue().equals("pass")) {
			//cambiarPantalla(pantalla);
			Notification.show("Acceso concedido");
			getInUser().setValue("");
			getInPass().setValue("");
			return true;
		} else {
			
			//Notification.show("Credenciales incorrectas");
			return false;
			
		}
		
	}
	
	public basededatos.Usuario_Registrado iniciarSesionBueno() {
		
		
		if(!datos.comprobarCredenciales(this.getInUser().getValue(), this.getInPass().getValue())) {
			Notification.show("Credenciales incorrectas");
			this.getInPass().clear();
			return null;
		}
		
		return datos.datosUsuario(this.getInUser().getValue());
		
	}
	
	public void clear() {
		
		this.getInUser().clear();
		this.getInPass().clear();
		
	}
	
}