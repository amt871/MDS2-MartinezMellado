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
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

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
	//private Iniciar_sesion__administrador_ inicioAdministrador;

	public MainView() {
		
		this.setPadding(false);
		this.setMargin(false);
		this.setSpacing(false);
		
		/***********CREACION DE PANTALLAS************/
		
		//Cabeceras
		
		Cabecera__administrador_ cabeceraAdmin = new Cabecera__administrador_();
		Cabecera_usuario_no_registrado cabeceraNoReg = new Cabecera_usuario_no_registrado();
		Mi_cabecera cabeceraReg = new Mi_cabecera();
		
		//Administrador
		
		Iniciar_sesion__administrador_ inicioAdministrador = new Iniciar_sesion__administrador_();
		Video_otro_usuario__administrador_ paginaPrincipalAdministrador = new Video_otro_usuario__administrador_();
		Administrar administrar = new Administrar();
		Busqueda__administrador_ busquedaAdmin = new Busqueda__administrador_();
		
		//Cibernauta
		
		Pantalla_inicio pantallaInicioCibernauta = new Pantalla_inicio();
		Registro registroCibernauta = new Registro();
		Iniciar_sesion iniciarSesionCibernauta = new Iniciar_sesion();
		Recuperar_Contrasenna recContra = new Recuperar_Contrasenna();
		Confirmar_codigo confCod = new Confirmar_codigo();
		Inicio_no_registrado inicioNoRegistrado = new Inicio_no_registrado();
		Buscar__no_registrado_ busquedaNoReg = new Buscar__no_registrado_();
		Video_otro_usuario inicioRegistrado = new Video_otro_usuario();
		
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
		
		//Cabeceras cibernauta
		
		//Cabecera Usuario No Registrado
		
		cabeceraNoReg.getbInicio().addClickListener(event -> {
			cambiarPantalla(inicioNoRegistrado);
			inicioNoRegistrado.setCabecera(cabeceraNoReg);
		});
		
		cabeceraNoReg.getbBusqueda().addClickListener(event -> {
			cambiarPantalla(busquedaNoReg);
			busquedaNoReg.setCabecera(cabeceraNoReg);
		});
		
		cabeceraNoReg.getbIniciarSesion().addClickListener(event -> {
			
			cambiarPantalla(iniciarSesionCibernauta);
			
		});
		
		cabeceraNoReg.getbRegistrarse().addClickListener(event -> {
			
			cambiarPantalla(registroCibernauta);
			
		});
		
		//Cabecera Registrado
		
		cabeceraReg.getbInicio().addClickListener(event -> {
			
			cambiarPantalla(inicioRegistrado);
			
		});
		
		cabeceraReg.getbNotis().addClickListener(event -> {
			
			
			
		});
		
		cabeceraReg.getbBusqueda().addClickListener(event -> {
			
			
			
		});
		
		cabeceraReg.getbPublicar().addClickListener(event -> {
			
			
			
		});
		
		cabeceraReg.getbPerfil().addClickListener(event -> {
			
			
			
		});
		
		/*********BOTONES CAMBIO DE PANTALLA*********/
		
		
		//Administrador
		
		inicioAdministrador.getbIniciarSesion().addClickListener(event -> {
			//inicioSesionAdministrador(paginaPrincipalAdministrador);
			if(inicioAdministrador.inicioSesionAdministrador()) {
				cambiarPantalla(paginaPrincipalAdministrador);
				paginaPrincipalAdministrador.setCabecera(cabeceraAdmin);
			}
		});
				
		inicioAdministrador.getInPass().addKeyPressListener(Key.ENTER, e -> {
			//inicioSesionAdministrador(paginaPrincipalAdministrador);
			if(inicioAdministrador.inicioSesionAdministrador()) {
				cambiarPantalla(paginaPrincipalAdministrador);
				paginaPrincipalAdministrador.setCabecera(cabeceraAdmin);
			}
		});
		
		//Cibernauta
		
		pantallaInicioCibernauta.getbRegistrarse().addClickListener(event -> {
			
			cambiarPantalla(registroCibernauta);
			
		});
		
		pantallaInicioCibernauta.getbIniciarSesion().addClickListener(event -> {
			
			cambiarPantalla(iniciarSesionCibernauta);
			
		});
		
		pantallaInicioCibernauta.getbAcceder().addClickListener(event -> {
			
			cambiarPantalla(inicioNoRegistrado);
			inicioNoRegistrado.setCabecera(cabeceraNoReg);
			
		});
		
		iniciarSesionCibernauta.getbIniciarSesion().addClickListener(event ->{
			
			if(iniciarSesionCibernauta.inicioSesionCibernauta()) {
				cambiarPantalla(inicioRegistrado);
			}
			
		});
		
		iniciarSesionCibernauta.getInPass().addKeyPressListener(Key.ENTER, e -> {
			
			if(iniciarSesionCibernauta.inicioSesionCibernauta()) {
				cambiarPantalla(inicioRegistrado);
			}
			
		});
		
		iniciarSesionCibernauta.getbRecuperarContrasenna().addClickListener(event -> {
			
			cambiarPantalla(recContra);
			
		});
		
		recContra.getbEnviar().addClickListener(event -> {
			
			cambiarPantalla(confCod);
			
		});
		
		/**************PANTALLA INICIAL**************/
		
		//Administrador
		
		//inicioAdministrador = new Iniciar_sesion__administrador_();
		
		
		//Puesta de pantalla en funcionamiento////////////////////////////////////////
		
		//cambiarPantalla(inicioAdministrador);
		//inicioAdministrador.getInUser().focus();
		
		//Cibernauta
		
		cambiarPantalla(pantallaInicioCibernauta);
		
		/********************************************/
		

	}

	private void cambiarPantalla(Component pantalla) {

		if (getComponentCount() != 0)
			remove(pantallaActual);
		pantallaActual = pantalla;
		add(pantallaActual);

	}

//	private void inicioSesionAdministrador(Component pantalla) {
//
//		if (inicioAdministrador.getInUser().getValue().equals("admin") && inicioAdministrador.getInPass().getValue().equals("prueba")) {
//			cambiarPantalla(pantalla);
//			Notification.show("Acceso concedido");
//			inicioAdministrador.getInUser().setValue("");
//			inicioAdministrador.getInPass().setValue("");
//		} else {
//			
//			Notification.show("Credenciales incorrectas");
//			
//		}
//
//	}

}
