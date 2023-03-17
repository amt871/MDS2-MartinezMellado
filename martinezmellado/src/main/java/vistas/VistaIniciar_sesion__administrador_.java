package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-iniciar_sesion__administrador_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciar_sesion__administrador_")
@JsModule("./src/vista-iniciar_sesion__administrador_.ts")
public class VistaIniciar_sesion__administrador_ extends LitTemplate {

    @Id("bIniciarSesion")
	private Button bIniciarSesion;
	@Id("inPass")
	private TextField inPass;
	@Id("inUser")
	private TextField inUser;
	@Id("LabelUsuario")
	private Label labelUsuario;

	/**
     * Creates a new VistaIniciar_sesion__administrador_.
     */
    public VistaIniciar_sesion__administrador_() {
        // You can initialise any data required for the connected UI components here.
    	
    }

}
