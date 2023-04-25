package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;

import interfaz.Cabecera_usuario_no_registrado;

import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-buscar__no_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar__no_registrado_")
@JsModule("./src/vista-buscar__no_registrado_.ts")
public class VistaBuscar__no_registrado_ extends LitTemplate {

	private Cabecera_usuario_no_registrado cabecera;
	@Id("divCabecera")
	private Div divCabecera;

	/**
     * Creates a new VistaBuscar__no_registrado_.
     */
    public VistaBuscar__no_registrado_() {
        // You can initialise any data required for the connected UI components here.
    }

    
    
	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Cabecera_usuario_no_registrado getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera_usuario_no_registrado cabecera) {
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);
	}

    
    
}
