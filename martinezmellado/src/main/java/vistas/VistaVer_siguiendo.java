package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Configurar;
import interfaz.Mi_cabecera;

/**
 * A Designer generated component for the vista-ver_siguiendo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_siguiendo")
@JsModule("./src/vista-ver_siguiendo.ts")
public class VistaVer_siguiendo extends LitTemplate {

	private Configurar config;
	private Mi_cabecera cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("divConfig")
	private Div divConfig;

	/**
     * Creates a new VistaVer_siguiendo.
     */
    public VistaVer_siguiendo() {
        // You can initialise any data required for the connected UI components here.
    }

	public Configurar getConfig() {
		return config;
	}

	public void setConfig(Configurar config) {
		this.config = config;
		getDivConfig().add(config);;
	}

	public Mi_cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Div getDivConfig() {
		return divConfig;
	}

	public void setDivConfig(Div divConfig) {
		this.divConfig = divConfig;
	}

    
}
