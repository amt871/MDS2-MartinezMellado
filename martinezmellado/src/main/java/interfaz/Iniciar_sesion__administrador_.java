package interfaz;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.charts.model.Navigator;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;

import basededatos.BDPrincipal;
import proyectoMDS.MainView;
import vistas.VistaIniciar_sesion__administrador_;
import vistas.VistaVideo_otro_usuario__administrador_;

public class Iniciar_sesion__administrador_ extends VistaIniciar_sesion__administrador_ {
//	private Button _entrar__administrador_;
//	private Label _nombreAppL;
//	private Label _esloganL;
//	private ImagenIcon _logoII;
//	private Label _usuarioL;
//	private TextField _usuarioTF;
//	private Label _contrasenaL;
//	private TextField _contrasenaTF;
//	public Inicio_sesion__adminstrador_ _unnamed_inicio_sesion__adminstrador__;

//	public void entrar__administrador_() {
//		throw new UnsupportedOperationException();
//	}

//	public Iniciar_sesion__administrador_(){
//		inicializar();
//	}

//	public void inicializar() {
//		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
//	}
	
	private MainView vl;
	private BDPrincipal datos;
	private Cabecera__administrador_ cabecera;
	
	public Iniciar_sesion__administrador_(MainView mainView) {
		// TODO Auto-generated constructor stub
		this.vl = mainView;
		this.datos = new BDPrincipal();
		
		this.getInUser().focus();
		
		this.getbIniciarSesion().addClickListener(event ->{
			
			if(this.getInUser().isEmpty()) {
				Notification.show("Introduce el usuario");
				return;
			}
			
			if(this.getInPass().isEmpty()) {
				Notification.show("Introduce la contraseña");
				return;
			}
			
			if(this.inicioSesionAdministrador()) {
				this.vl.removeAll();
				this.cabecera = new Cabecera__administrador_(this.vl, this.datos, this);
			}
			
		});
		
		this.getInUser().addKeyPressListener(Key.ENTER, event ->{
			
			this.getbIniciarSesion().click();
			
		});
		
		this.getInPass().addKeyPressListener(Key.ENTER, event ->{
			
			this.getbIniciarSesion().click();
			
		});
	}

	public boolean inicioSesionAdministrador() {

		if (getInUser().getValue().equals("admin") && getInPass().getValue().equals("prueba")) {
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