package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.template.Id;

import interfaz.Mi_cabecera;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-video_otro_usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-video_otro_usuario")
@JsModule("./src/vista-video_otro_usuario.ts")
public class VistaVideo_otro_usuario extends LitTemplate {

	private Mi_cabecera cabecera;
    @Id("Scroller")
	private Scroller scroller;
	@Id("divCabecera")
	private Div divCabecera;

	/**
     * Creates a new VistaVideo_otro_usuario.
     */
    public VistaVideo_otro_usuario() {
        // You can initialise any data required for the connected UI components here.
    }

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

	public Mi_cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		this.cabecera = cabecera;
		//System.out.println("cabecera: " + this.getCabecera()==null);
		getDivCabecera().add(cabecera);
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}
    
    

}
