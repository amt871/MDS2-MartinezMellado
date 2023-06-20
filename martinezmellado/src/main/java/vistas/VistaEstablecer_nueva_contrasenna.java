package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-establecer_nueva_contrasenna template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-establecer_nueva_contrasenna")
@JsModule("./src/vista-establecer_nueva_contrasenna.ts")
public class VistaEstablecer_nueva_contrasenna extends LitTemplate {

    @Id("idBoton")
	private Button idBoton;
	@Id("idPass1")
	private PasswordField idPass1;
	@Id("idPass2")
	private PasswordField idPass2;
	@Id("inicio")
	private Button inicio;

	/**
     * Creates a new VistaEstablecer_nueva_contrasenna.
     */
    public VistaEstablecer_nueva_contrasenna() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getIdBoton() {
		return idBoton;
	}

	public void setIdBoton(Button idBoton) {
		this.idBoton = idBoton;
	}

	public void setIdPass1(PasswordField idPass1) {
		this.idPass1 = idPass1;
	}

	public void setIdPass2(PasswordField idPass2) {
		this.idPass2 = idPass2;
	}

	public PasswordField getIdPass1() {
		return idPass1;
	}

	public PasswordField getIdPass2() {
		return idPass2;
	}

	public Button getInicio() {
		return inicio;
	}

	public void setInicio(Button inicio) {
		this.inicio = inicio;
	}
	
	

}
