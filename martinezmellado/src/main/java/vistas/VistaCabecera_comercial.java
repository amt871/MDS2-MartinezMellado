package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-cabecera_comercial template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera_comercial")
@JsModule("./src/vista-cabecera_comercial.ts")
public class VistaCabecera_comercial extends LitTemplate {

    @Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaCabecera_comercial.
     */
    public VistaCabecera_comercial() {
        // You can initialise any data required for the connected UI components here.
    }

}
