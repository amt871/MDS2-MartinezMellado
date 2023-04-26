package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Mi_cabecera;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-mi_perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mi_perfil")
@JsModule("./src/vista-mi_perfil.ts")
public class VistaMi_perfil extends LitTemplate {

	private Mi_cabecera cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("bConfigurar")
	private Button bConfigurar;

	/**
     * Creates a new VistaMi_perfil.
     */
    public VistaMi_perfil() {
        // You can initialise any data required for the connected UI components here.
    }

	public Mi_cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);;
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Button getbConfigurar() {
		return bConfigurar;
	}

	public void setbConfigurar(Button bConfigurar) {
		this.bConfigurar = bConfigurar;
	}

    
    
}
