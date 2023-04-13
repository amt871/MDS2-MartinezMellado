package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.charts.model.Navigator;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;

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
	
	
	public void iniciarSesion() {
		
		if(this.getInUser().getValue().equals("admin")&&this.getInPass().getValue().equals("prueba")) {
			this.getLabelUsuario().setText("Has iniciado sesion wachinche");
			
		}
		
	}

	public Iniciar_sesion__administrador_() {

		this.getbIniciarSesion().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				iniciarSesion();
			}});
		
		this.getInPass().addKeyPressListener(Key.ENTER, e -> {
	        iniciarSesion();
	    });

	}

}