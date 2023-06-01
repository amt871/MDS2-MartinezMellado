package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-confirmar_correo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-confirmar_correo")
@JsModule("./src/vista-confirmar_correo.ts")
public class VistaConfirmar_correo extends LitTemplate {

    @Id("bEnviar")
	private Button bEnviar;
	@Id("bTextField")
	private TextField bTextField;

	/**
     * Creates a new VistaConfirmar_correo.
     */
    public VistaConfirmar_correo() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getbEnviar() {
		return bEnviar;
	}

	public void setbEnviar(Button bEnviar) {
		this.bEnviar = bEnviar;
	}

	public TextField getbTextField() {
		return bTextField;
	}

	public void setbTextField(TextField bTextField) {
		this.bTextField = bTextField;
	}
    
    

}
