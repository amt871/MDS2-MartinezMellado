package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;

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
	@Id("idCorreo")
	private TextField idCorreo;
	@Id("inicio")
	private Button inicio;

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

	public TextField getIdCorreo() {
		return idCorreo;
	}

	public void setIdCorreo(TextField idCorreo) {
		this.idCorreo = idCorreo;
	}

	public Button getInicio() {
		return inicio;
	}

	public void setInicio(Button inicio) {
		this.inicio = inicio;
	}
    
    

}
