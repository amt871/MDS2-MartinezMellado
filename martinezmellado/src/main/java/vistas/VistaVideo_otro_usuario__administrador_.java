package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaCabecera__administrador_;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

import interfaz.Cabecera__administrador_;

import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-video_otro_usuario__administrador_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-video_otro_usuario__administrador_")
@JsModule("./src/vista-video_otro_usuario__administrador_.ts")
public class VistaVideo_otro_usuario__administrador_ extends LitTemplate {

	private VistaCabecera__administrador_ cabecera;

	@Id("divCabecera")
	private Div divCabecera;
	@Id("divScroller")
	private Div divScroller;

	/**
     * Creates a new VistaVideo_otro_usuario__administrador_.
     */
    public VistaVideo_otro_usuario__administrador_() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    	
    }

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Div getDivScroller() {
		return divScroller;
	}

	public void setDivScroller(Div divScroller) {
		this.divScroller = divScroller;
	}

	public VistaCabecera__administrador_ getCabecera() {
		return cabecera;
	}

	public void setCabecera(VistaCabecera__administrador_ cabecera) {
		this.cabecera = cabecera;
		this.divCabecera.add(this.cabecera);
	}

    
    
}
