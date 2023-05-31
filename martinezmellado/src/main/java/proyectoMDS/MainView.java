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
		Cabecera_comercial cabeceraComercial = new Cabecera_comercial();
		
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
		
		//No registrado
		
		Inicio_no_registrado inicioNoRegistrado = new Inicio_no_registrado();
		Buscar__no_registrado_ busquedaNoReg = new Buscar__no_registrado_();
		
		//Registrado
		
		Video_otro_usuario inicioRegistrado = new Video_otro_usuario();
		Notificaciones notis = new Notificaciones();
		Buscar__usuario_registrado_ busquedaRegistrado = new Buscar__usuario_registrado_();
		Mi_perfil miPerfil = new Mi_perfil();
		
		//Registrado -> Configurar
		
		Configurar configurar = new Configurar();
		Configurar_mi_perfil configPerf = new Configurar_mi_perfil();
		Ver_mis_seguidores seguidores = new Ver_mis_seguidores();
		Ver_siguiendo siguiendo = new Ver_siguiendo();
		
		//Registrado y Comercial
		
		Publicar publicar = new Publicar();
		
		//Comercial
		
		Perfil_comercial perfilComercial = new Perfil_comercial();
		Configurar_perfil_comercial configPerfilComercial = new Configurar_perfil_comercial();
		
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
			iniciarSesionCibernauta.getInUser().focus();
			
		});
		
		cabeceraNoReg.getbRegistrarse().addClickListener(event -> {
			
			cambiarPantalla(registroCibernauta);
			
		});
		
		//Cabecera Registrado
		
		cabeceraReg.getbInicio().addClickListener(event -> {
			
			cambiarPantalla(inicioRegistrado);
			inicioRegistrado.setCabecera(cabeceraReg);
			
		});
		
		cabeceraReg.getbNotis().addClickListener(event -> {
			
			cambiarPantalla(notis);
			notis.setCabecera(cabeceraReg);
			
		});
		
		cabeceraReg.getbBusqueda().addClickListener(event -> {
			
			cambiarPantalla(busquedaRegistrado);
			busquedaRegistrado.setCabecera(cabeceraReg);
			
		});
		
		cabeceraReg.getbPublicar().addClickListener(event -> {
			
			cambiarPantalla(publicar);
			publicar.setCabecera(cabeceraReg);
			
			
		});
		
		cabeceraReg.getbPerfil().addClickListener(event -> {
			
			cambiarPantalla(miPerfil);
			miPerfil.setCabecera(cabeceraReg);
			
		});
		
		//Cabecera comercial
		
		cabeceraComercial.getbSalir().addClickListener(event -> {
			
			cambiarPantalla(iniciarSesionCibernauta);
			iniciarSesionCibernauta.getInUser().focus();
			
		});
		
		cabeceraComercial.getbPerfil().addClickListener(event -> {
			
			cambiarPantalla(perfilComercial);
			perfilComercial.setCabecera(cabeceraComercial);
			
		});
		
		cabeceraComercial.getbPublicar().addClickListener(event -> {
			
			cambiarPantalla(publicar);
			publicar.setCabecera(cabeceraComercial);
			
			
		});
		
		/************PANTALLA CONFIGURAR*************/
		
		configurar.getbCerrarSesion().addClickListener(event -> {
			
			cambiarPantalla(pantallaInicioCibernauta);
			
		});
		
		configurar.getbModificarDatos().addClickListener(event -> {
			
			cambiarPantalla(configPerf);
			configPerf.setCabecera(cabeceraReg);
			configPerf.setConfig(configurar);
			
		});
		
		configurar.getbCambioPrivacidad().addClickListener(event -> {
			
			
			
		});

		configurar.getbSeguidores().addClickListener(event -> {
	
			cambiarPantalla(seguidores);
			seguidores.setCabecera(cabeceraReg);
			seguidores.setConfig(configurar);
	
		});
		
		configurar.getbSiguiendo().addClickListener(event -> {
			
			cambiarPantalla(siguiendo);
			siguiendo.setCabecera(cabeceraReg);
			siguiendo.setConfig(configurar);
			
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
			iniciarSesionCibernauta.getInUser().focus();
			
		});
		
		pantallaInicioCibernauta.getbAcceder().addClickListener(event -> {
			
			cambiarPantalla(inicioNoRegistrado);
			inicioNoRegistrado.setCabecera(cabeceraNoReg);
			
		});
		
		iniciarSesionCibernauta.getbIniciarSesion().addClickListener(event ->{
			
			if(iniciarSesionCibernauta.inicioSesionCibernauta()) {
				cambiarPantalla(inicioRegistrado);
				inicioRegistrado.setCabecera(cabeceraReg);
			} else if(iniciarSesionCibernauta.inicioSesionComercial()) {
				cambiarPantalla(perfilComercial);
				perfilComercial.setCabecera(cabeceraComercial);
			} else
				Notification.show("Credenciales incorrectas");
			
		});
		
		iniciarSesionCibernauta.getInPass().addKeyPressListener(Key.ENTER, e -> {
			
			if(iniciarSesionCibernauta.inicioSesionCibernauta()) {
				cambiarPantalla(inicioRegistrado);
				inicioRegistrado.setCabecera(cabeceraReg);
			} else if(iniciarSesionCibernauta.inicioSesionComercial()) {
				cambiarPantalla(perfilComercial);
				perfilComercial.setCabecera(cabeceraComercial);
			} else
				Notification.show("Credenciales incorrectas");
			
		});
		
		iniciarSesionCibernauta.getbRecuperarContrasenna().addClickListener(event -> {
			
			cambiarPantalla(recContra);
			
		});
		
		recContra.getbEnviar().addClickListener(event -> {
			
			cambiarPantalla(confCod);
			
		});
		
		//Usuario Registrado
		
		miPerfil.getbConfigurar().addClickListener(event -> {
			
			cambiarPantalla(configPerf);
			configPerf.setCabecera(cabeceraReg);
			configPerf.setConfig(configurar);
			
		});
		
		registroCibernauta.getbAtras().addClickListener(event -> {
			
			cambiarPantalla(pantallaInicioCibernauta);
			
		});
		
		//Comercial
		
		perfilComercial.getbConfigurar().addClickListener(event -> {
			
			cambiarPantalla(configPerfilComercial);
			configPerfilComercial.setCabecera(cabeceraComercial);
			
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
