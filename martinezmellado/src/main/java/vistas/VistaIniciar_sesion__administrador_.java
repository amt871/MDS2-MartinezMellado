package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.PasswordField;

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
	private PasswordField inPass;
	@Id("inUser")
	private TextField inUser;
	@Id("LabelUsuario")
	private Label labelUsuario;
	/**
     * Creates a new VistaIniciar_sesion__administrador_.
     */
    public VistaIniciar_sesion__administrador_() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    }

	public Button getbIniciarSesion() {
		return bIniciarSesion;
	}

	public void setbIniciarSesion(Button bIniciarSesion) {
		this.bIniciarSesion = bIniciarSesion;
	}

	public PasswordField getInPass() {
		return inPass;
	}

	public void setInPass(PasswordField inPass) {
		this.inPass = inPass;
	}

	public TextField getInUser() {
		return inUser;
	}

	public void setInUser(TextField inUser) {
		this.inUser = inUser;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public HorizontalLayout getPrincipalLayout() {
		return principalLayout;
	}

	public void setPrincipalLayout(HorizontalLayout principalLayout) {
		this.principalLayout = principalLayout;
	}

}
