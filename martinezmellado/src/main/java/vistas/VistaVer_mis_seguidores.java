package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Configurar;
import interfaz.Mi_cabecera;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-ver_mis_seguidores template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_mis_seguidores")
@JsModule("./src/vista-ver_mis_seguidores.ts")
public class VistaVer_mis_seguidores extends LitTemplate {

	private Configurar config;
	private Mi_cabecera cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("divConfigurar")
	private Div divConfigurar;
	@Id("idScroller")
	private Scroller idScroller;

	/**
     * Creates a new VistaVer_mis_seguidores.
     */
    public VistaVer_mis_seguidores() {
        // You can initialise any data required for the connected UI components here.
    }

	public Configurar getConfig() {
		return config;
	}

	public void setConfig(Configurar config) {
		this.config = config;
		getDivConfig().add(config);
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
		return divConfigurar;
	}

	public void setDivConfig(Div divConfig) {
		this.divConfigurar = divConfigurar;
	}

	public Div getDivConfigurar() {
		return divConfigurar;
	}

	public void setDivConfigurar(Div divConfigurar) {
		this.divConfigurar = divConfigurar;
	}

	public Scroller getIdScroller() {
		return idScroller;
	}

	public void setIdScroller(Scroller idScroller) {
		this.idScroller = idScroller;
	}

    
    
}
