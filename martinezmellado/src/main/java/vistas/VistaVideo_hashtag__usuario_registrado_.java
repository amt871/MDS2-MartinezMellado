package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;

import interfaz.Mi_cabecera;

import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-video_hashtag__usuario_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-video_hashtag__usuario_registrado_")
@JsModule("./src/vista-video_hashtag__usuario_registrado_.ts")
public class VistaVideo_hashtag__usuario_registrado_ extends LitTemplate {

	private Mi_cabecera cabecera;
    @Id("labelHashtag")
	private Label labelHashtag;
	@Id("scroller")
	private Scroller scroller;
	@Id("divCabecera")
	private Div divCabecera;

	/**
     * Creates a new VistaVideo_hashtag__usuario_registrado_.
     */
    public VistaVideo_hashtag__usuario_registrado_() {
        // You can initialise any data required for the connected UI components here.
    }

	public Mi_cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		this.cabecera = cabecera;
		this.getDivCabecera().add(cabecera);
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

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

    
    
}
