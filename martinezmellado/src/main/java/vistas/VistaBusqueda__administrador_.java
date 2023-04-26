package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera__administrador_;

/**
 * A Designer generated component for the vista-busqueda__administrador_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-busqueda__administrador_")
@JsModule("./src/vista-busqueda__administrador_.ts")
public class VistaBusqueda__administrador_ extends LitTemplate {

	private Cabecera__administrador_ cabecera;
    @Id("divCabecera")
	private Div divCabecera;

	/**
     * Creates a new VistaBusqueda__administrador_.
     */
    public VistaBusqueda__administrador_() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    }

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Cabecera__administrador_ getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera__administrador_ cabecera) {
		this.cabecera = cabecera;
		this.divCabecera.add(this.cabecera);
	}
    
    

}
