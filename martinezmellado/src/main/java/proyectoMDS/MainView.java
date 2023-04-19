package proyectoMDS;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfaz.*;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and use @Route
 * annotation to announce it in a URL as a Spring managed bean. Use the @PWA
 * annotation make the application installable on phones, tablets and some
 * desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every browser
 * tab/window.
 */
@Route
@PWA(name = "Vaadin Application", shortName = "Vaadin App", description = "This is an example Vaadin application.", enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

	/**
	 * Construct a new Vaadin view.
	 * <p>
	 * Build the initial UI state for the user accessing the application.
	 *
	 * @param service The message service. Automatically injected Spring managed
	 *                bean.
	 */

	private Component pantallaActual;
	private Iniciar_sesion__administrador_ inicioAdministrador;

	public MainView() {
		
		this.setPadding(false);
		this.setMargin(false);
		this.setSpacing(false);
		
		/***********CREACION DE PANTALLAS************/
		
		Video_otro_usuario__administrador_ paginaPrincipalAdministrador = new Video_otro_usuario__administrador_();
		Cabecera__administrador_ cabeceraAdmin = new Cabecera__administrador_();
		Administrar administrar = new Administrar();
		Busqueda__administrador_ busquedaAdmin = new Busqueda__administrador_();
		
		/***********CABECERAS FUNCIONALES************/
		
		//Cabecera Administrador
		
		cabeceraAdmin.getbSalir2().addClickListener(event -> {
			cambiarPantalla(inicioAdministrador);
		});
		
		cabeceraAdmin.getbInicio2().addClickListener(event -> {
			cambiarPantalla(paginaPrincipalAdministrador);
			paginaPrincipalAdministrador.setCabecera(cabeceraAdmin);
		});
		
		cabeceraAdmin.getbAdministrar2().addClickListener(event -> {
			cambiarPantalla(administrar);
			administrar.setCabecera(cabeceraAdmin);
		});
		
		cabeceraAdmin.getbBusqueda2().addClickListener(event -> {
			cambiarPantalla(busquedaAdmin);
			busquedaAdmin.setCabecera(cabeceraAdmin);
		});
		
		/*********BOTONES CAMBIO DE PANTALLA*********/
		
		
		
		/**********SET CABECERA FUNCIONAL************/
		
		//paginaPrincipalAdministrador.setCabecera(cabeceraAdmin);
		//administrar.setCabecera(cabeceraAdmin);
		
		/**************PANTALLA INICIAL**************/
		
		inicioAdministrador = new Iniciar_sesion__administrador_();
		
		inicioAdministrador.getInUser().focus();
		
		//Listeners para el cambio de pantalla
		
		inicioAdministrador.getbIniciarSesion().addClickListener(event -> {
			inicioSesionAdministrador(paginaPrincipalAdministrador);
		});
		
		inicioAdministrador.getInPass().addKeyPressListener(Key.ENTER, e -> {
			inicioSesionAdministrador(paginaPrincipalAdministrador);
	    });
		
		//Puesta de pantalla en funcionamiento
		
		cambiarPantalla(inicioAdministrador);
		paginaPrincipalAdministrador.setCabecera(cabeceraAdmin);
		
		/********************************************/
		
		/********************TESTING**************************/
		//cambiarPantalla(paginaPrincipalAdministrador);

	}

	private void cambiarPantalla(Component pantalla) {

		if (getComponentCount() != 0)
			remove(pantallaActual);
		pantallaActual = pantalla;
		add(pantallaActual);

	}

	private void inicioSesionAdministrador(Component pantalla) {

		if (inicioAdministrador.getInUser().getValue().equals("admin") && inicioAdministrador.getInPass().getValue().equals("prueba")) {
			cambiarPantalla(pantalla);
			Notification.show("Acceso concedido");
			inicioAdministrador.getInUser().setValue("");
			inicioAdministrador.getInPass().setValue("");
		} else {
			
			Notification.show("Credenciales incorrectas");
			
		}

	}

}
