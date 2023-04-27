package vistas;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera_comercial;
import interfaz.Mi_cabecera;

/**
 * A Designer generated component for the vista-publicar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-publicar")
@JsModule("./src/vista-publicar.ts")
public class VistaPublicar extends LitTemplate {

	private Component cabecera;
	//private Cabecera_comercial cabeceraCom;
    @Id("divCabecera")
	private Div divCabecera;

	/**
     * Creates a new VistaPublicar.
     */
    public VistaPublicar() {
        // You can initialise any data required for the connected UI components here.
    }

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Mi_cabecera getCabecera() {
		return (Mi_cabecera) cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);
	}

	public Cabecera_comercial getCabeceraCom() {
		return (Cabecera_comercial) cabecera;
	}

	public void setCabecera(Cabecera_comercial cabeceraCom) {
		
		this.cabecera = cabeceraCom;
		getDivCabecera().add(cabeceraCom);
	}
    
    

}
