package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera_comercial;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-perfil_comercial template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil_comercial")
@JsModule("./src/vista-perfil_comercial.ts")
public class VistaPerfil_comercial extends LitTemplate {

	private Cabecera_comercial cabecera;
    @Id("bConfigurar")
	private Button bConfigurar;
	@Id("divCabecera")
	private Div divCabecera;

	/**
     * Creates a new VistaPerfil_comercial.
     */
    public VistaPerfil_comercial() {
        // You can initialise any data required for the connected UI components here.
    }

	public Cabecera_comercial getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera_comercial cabecera) {
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);
	}

	public Button getbConfigurar() {
		return bConfigurar;
	}

	public void setbConfigurar(Button bConfigurar) {
		this.bConfigurar = bConfigurar;
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}
    
    

}
