package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

/**
 * A Designer generated component for the vista-registro template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registro")
@JsModule("./src/vista-registro.ts")
public class VistaRegistro extends LitTemplate {

    /**
     * Creates a new VistaRegistro.
     */
    public VistaRegistro() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    }

}
