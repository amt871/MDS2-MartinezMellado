package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-recuperar_contrasenna template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-recuperar_contrasenna")
@JsModule("./src/vista-recuperar_contrasenna.ts")
public class VistaRecuperar_contrasenna extends LitTemplate {

    @Id("bEnviar")
	private Button bEnviar;

	/**
     * Creates a new VistaRecuperar_contrasenna.
     */
    public VistaRecuperar_contrasenna() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getbEnviar() {
		return bEnviar;
	}

	public void setbEnviar(Button bEnviar) {
		this.bEnviar = bEnviar;
	}
    
    

}
