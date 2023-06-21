package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

import interfaz.Cabecera__administrador_;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-publicaciones_asociadas_a_un_hastag template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-publicaciones_asociadas_a_un_hastag")
@JsModule("./src/vista-publicaciones_asociadas_a_un_hastag.ts")
public class VistaPublicaciones_asociadas_a_un_hastag extends LitTemplate {

	private Cabecera__administrador_ cabecera;
	@Id("divCabecera")
	private Div divCabecera;
	@Id("labelHashtag")
	private Label labelHashtag;
	@Id("scroller")
	private Scroller scroller;
	
    /**
     * Creates a new VistaPublicaciones_asociadas_a_un_hastag.
     */
    public VistaPublicaciones_asociadas_a_un_hastag() {
        // You can initialise any data required for the connected UI components here.
    }

	public Cabecera__administrador_ getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera__administrador_ cabecera) {
		this.cabecera = cabecera;
		this.getDivCabecera().add(cabecera);
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Label getLabelHashtag() {
		return labelHashtag;
	}

	public void setLabelHashtag(Label labelHashtag) {
		this.labelHashtag = labelHashtag;
	}

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}
    
    

}
