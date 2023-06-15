package interfaz;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaIniciar_sesion;

public class Iniciar_sesion extends VistaIniciar_sesion{
	
	private BDPrincipal datos;// = new BDPrincipal();
	private MainView vl;
	private Usuario_Registrado user;
	private Mi_cabecera cabeceraReg;
	private Cabecera_comercial cabeceraComercial;
	private Pantalla_inicio pantInicio;
	
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
	
	public Iniciar_sesion(MainView vl, BDPrincipal datos, Pantalla_inicio pantalla_inicio, Mi_cabecera cabeceraReg2) {
		// TODO Auto-generated constructor stub
		
		this.vl = vl;
		this.datos = datos;
		this.pantInicio = pantalla_inicio;
		this.cabeceraReg = cabeceraReg2;
		
		this.getInPass().addKeyPressListener(Key.ENTER, e -> {
		
			this.getbIniciarSesion().click();
			
		});
		
		this.getInUser().addKeyPressListener(Key.ENTER, e -> {
			
			this.getbIniciarSesion().click();
			
		});
		
		this.getbIniciarSesion().addClickListener(event -> {
			
			user = this.iniciarSesionBueno();
			
			if(user == null)
				return;
			
			if(user.getComercial().equals("Normal")) {
				//this.cabeceraReg = new Mi_cabecera(this.vl, this.datos, this.user);
				
				
				
				this.vl.removeAll();
				this.cabeceraReg = new Mi_cabecera(this.vl, this.datos, this.user, this.pantInicio);
				this.cabeceraReg.setPantallaInicio(new Video_otro_usuario(this.vl, this.cabeceraReg));
				this.vl.add(this.cabeceraReg.getPantallaInicio());
			}
			
		});
		
	}

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
	
	public Usuario_Registrado iniciarSesionBueno() {
		
		if(this.getInUser().isEmpty()) {
			Notification.show("Introduce el usuario");
			return null;
		}
		
		if(this.getInPass().isEmpty()) {
			Notification.show("Introduce la contrasenna");
			return null;
		}
		
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