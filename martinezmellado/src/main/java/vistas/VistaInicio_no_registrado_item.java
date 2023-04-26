package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera_usuario_no_registrado;

/**
 * A Designer generated component for the vista-inicio_no_registrado_item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-inicio_no_registrado_item")
@JsModule("./src/vista-inicio_no_registrado_item.ts")
public class VistaInicio_no_registrado_item extends LitTemplate {
	
	
	private Cabecera_usuario_no_registrado cabecera;
    @Id("divCabecera")
	private Div divCabecera;

	/**
     * Creates a new VistaInicio_no_registrado_item.
     */
    public VistaInicio_no_registrado_item() {
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
		this.getDivCabecera().add(cabecera);
	}

	
    
}
