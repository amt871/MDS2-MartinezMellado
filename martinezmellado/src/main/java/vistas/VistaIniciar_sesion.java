package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-iniciar_sesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciar_sesion")
@JsModule("./src/vista-iniciar_sesion.ts")
public class VistaIniciar_sesion extends LitTemplate {


	
	
	@Id("inUser")
	private TextField inUser;
	@Id("bIniciarSesion")
	private Button bIniciarSesion;
	@Id("bRecuperarContrasenna")
	private Button bRecuperarContrasenna;
	@Id("inPass")
	private PasswordField inPass;
	@Id("inicio")
	private Button inicio;

	/**
     * Creates a new VistaIniciar_sesion.
     */
    public VistaIniciar_sesion() {
        // You can initialise any data required for the connected UI components here.
    }

	public TextField getInUser() {
		return inUser;
	}

	public void setInUser(TextField inUser) {
		this.inUser = inUser;
	}

	public PasswordField getInPass() {
		return inPass;
	}

	public void setInPass(PasswordField inPass) {
		this.inPass = inPass;
	}

	public Button getbIniciarSesion() {
		return bIniciarSesion;
	}

	public void setbIniciarSesion(Button bIniciarSesion) {
		this.bIniciarSesion = bIniciarSesion;
	}

	public Button getbRecuperarContrasenna() {
		return bRecuperarContrasenna;
	}

	public void setbRecuperarContrasenna(Button bRecuperarContrasenna) {
		this.bRecuperarContrasenna = bRecuperarContrasenna;
	}

	public Button getInicio() {
		return inicio;
	}

	public void setInicio(Button inicio) {
		this.inicio = inicio;
	}
	
    

}
