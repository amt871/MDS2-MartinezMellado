package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-registro template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registro")
@JsModule("./src/vista-registro.ts")
public class VistaRegistro extends LitTemplate {

    @Id("bAtras")
	private Button bAtras;

	/**
     * Creates a new VistaRegistro.
     */
    public VistaRegistro() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "height: 100%; width: 100%");
    }

	public Button getbAtras() {
		return bAtras;
	}

	public void setbAtras(Button bAtras) {
		this.bAtras = bAtras;
	}
    
    

}
