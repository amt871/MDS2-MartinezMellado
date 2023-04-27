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

    @Id("bPublicar")
	private Button bPublicar;
	@Id("bSalir")
	private Button bSalir;
	@Id("bPerfil")
	private Button bPerfil;

	/**
     * Creates a new VistaCabecera_comercial.
     */
    public VistaCabecera_comercial() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getbPublicar() {
		return bPublicar;
	}

	public void setbPublicar(Button bPublicar) {
		this.bPublicar = bPublicar;
	}

	public Button getbSalir() {
		return bSalir;
	}

	public void setbSalir(Button bSalir) {
		this.bSalir = bSalir;
	}

	public Button getbPerfil() {
		return bPerfil;
	}

	public void setbPerfil(Button bPerfil) {
		this.bPerfil = bPerfil;
	}
    
    

}
