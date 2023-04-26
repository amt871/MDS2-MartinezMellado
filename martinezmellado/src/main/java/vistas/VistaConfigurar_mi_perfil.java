package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Configurar;
import interfaz.Mi_cabecera;

/**
 * A Designer generated component for the vista-configurar_mi_perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-configurar_mi_perfil")
@JsModule("./src/vista-configurar_mi_perfil.ts")
public class VistaConfigurar_mi_perfil extends LitTemplate {

	private Configurar config;
	private Mi_cabecera cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("divConfigurar")
	private Div divConfigurar;

	/**
     * Creates a new VistaConfigurar_mi_perfil.
     */
    public VistaConfigurar_mi_perfil() {
        // You can initialise any data required for the connected UI components here.
    }

	public Configurar getConfig() {
		return config;
	}

	public void setConfig(Configurar config) {
		this.config = config;
		getDivConfigurar().add(config);
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

	public Div getDivConfigurar() {
		return divConfigurar;
	}

	public void setDivConfigurar(Div divConfigurar) {
		this.divConfigurar = divConfigurar;
	}
    
    

}
