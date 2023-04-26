package interfaz;

import com.vaadin.flow.component.notification.Notification;

import vistas.VistaIniciar_sesion;

public class Iniciar_sesion extends VistaIniciar_sesion{
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
			
			Notification.show("Credenciales incorrectas");
			return false;
			
		}

	}
	
}