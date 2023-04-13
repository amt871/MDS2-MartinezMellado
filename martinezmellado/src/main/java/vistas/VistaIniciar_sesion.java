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

/**
 * A Designer generated component for the vista-iniciar_sesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciar_sesion")
@JsModule("./src/vista-iniciar_sesion.ts")
public class VistaIniciar_sesion extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("inUser")
	private TextField inUser;
	@Id("bIniciarSesion")
	private Button bIniciarSesion;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("inPass")
	private TextField inPass;
	@Id("LabelUsuario")
	private Label labelUsuario;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("img")
	private Image img;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("bRecuperarPass")
	private Button bRecuperarPass;
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
	public Button getbIniciarSesion() {
		return bIniciarSesion;
	}
	public void setbIniciarSesion(Button bIniciarSesion) {
		this.bIniciarSesion = bIniciarSesion;
	}
	public TextField getInPass() {
		return inPass;
	}
	public void setInPass(TextField inPass) {
		this.inPass = inPass;
	}
	public Button getbRecuperarPass() {
		return bRecuperarPass;
	}
	public void setbRecuperarPass(Button bRecuperarPass) {
		this.bRecuperarPass = bRecuperarPass;
	}

}
