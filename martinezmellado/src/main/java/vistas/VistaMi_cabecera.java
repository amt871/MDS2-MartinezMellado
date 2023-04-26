package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-mi_cabecera template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mi_cabecera")
@JsModule("./src/vista-mi_cabecera.ts")
public class VistaMi_cabecera extends LitTemplate {

    @Id("bInicio")
	private Button bInicio;
	@Id("bNotis")
	private Button bNotis;
	@Id("bBusqueda")
	private Button bBusqueda;
	@Id("bPublicar")
	private Button bPublicar;
	@Id("bPerfil")
	private Button bPerfil;

	/**
     * Creates a new VistaMi_cabecera.
     */
    public VistaMi_cabecera() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getbInicio() {
		return bInicio;
	}

	public void setbInicio(Button bInicio) {
		this.bInicio = bInicio;
	}

	public Button getbNotis() {
		return bNotis;
	}

	public void setbNotis(Button bNotis) {
		this.bNotis = bNotis;
	}

	public Button getbBusqueda() {
		return bBusqueda;
	}

	public void setbBusqueda(Button bBusqueda) {
		this.bBusqueda = bBusqueda;
	}

	public Button getbPublicar() {
		return bPublicar;
	}

	public void setbPublicar(Button bPublicar) {
		this.bPublicar = bPublicar;
	}

	public Button getbPerfil() {
		return bPerfil;
	}

	public void setbPerfil(Button bPerfil) {
		this.bPerfil = bPerfil;
	}

    
    
}
