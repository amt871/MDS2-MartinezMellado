package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-confirmar_codigo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-confirmar_codigo")
@JsModule("./src/vista-confirmar_codigo.ts")
public class VistaConfirmar_codigo extends LitTemplate {

    @Id("bEnviar")
	private Button bEnviar;

	/**
     * Creates a new VistaConfirmar_codigo.
     */
    public VistaConfirmar_codigo() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getbEnviar() {
		return bEnviar;
	}

	public void setbEnviar(Button bEnviar) {
		this.bEnviar = bEnviar;
	}

    
    
}
