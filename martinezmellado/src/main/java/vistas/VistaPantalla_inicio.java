package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-pantalla_inicio template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pantalla_inicio")
@JsModule("./src/vista-pantalla_inicio.ts")
public class VistaPantalla_inicio extends LitTemplate {

	@Id("bRegistrarse")
	private Button bRegistrarse;
	@Id("bIniciarSesion")
	private Button bIniciarSesion;
	@Id("bAcceder")
	private Button bAcceder;
	@Id("layoutPrincipal")
	private HorizontalLayout layoutPrincipal;
	/**
     * Creates a new VistaPantalla_inicio.
     */
	
    public VistaPantalla_inicio() {
        // You can initialise any data required for the connected UI components here.
    	//this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    	//layoutPrincipal.setSizeFull();
    	this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    }
    
	public Button getbRegistrarse() {
		return bRegistrarse;
	}
	public void setbRegistrarse(Button bRegistrarse) {
		this.bRegistrarse = bRegistrarse;
	}
	public Button getbIniciarSesion() {
		return bIniciarSesion;
	}
	public void setbIniciarSesion(Button bIniciarSesion) {
		this.bIniciarSesion = bIniciarSesion;
	}
	public Button getbAcceder() {
		return bAcceder;
	}
	public void setbAcceder(Button bAcceder) {
		this.bAcceder = bAcceder;
	}

	
	
}
