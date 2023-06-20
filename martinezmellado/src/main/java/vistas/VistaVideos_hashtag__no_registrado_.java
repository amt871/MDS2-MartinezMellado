package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera_usuario_no_registrado;

import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-videos_hashtag__no_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-videos_hashtag__no_registrado_")
@JsModule("./src/vista-videos_hashtag__no_registrado_.ts")
public class VistaVideos_hashtag__no_registrado_ extends LitTemplate {

	private Cabecera_usuario_no_registrado cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("scroller")
	private Scroller scroller;
	@Id("labelHashtag")
	private Label labelHashtag;

	/**
     * Creates a new VistaVideos_hashtag__no_registrado_.
     */
    public VistaVideos_hashtag__no_registrado_() {
        // You can initialise any data required for the connected UI components here.
    }

	public Cabecera_usuario_no_registrado getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera_usuario_no_registrado cabecera) {
		this.cabecera = cabecera;
		this.getDivCabecera().add(cabecera);
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

	public Label getLabelHashtag() {
		return labelHashtag;
	}

	public void setLabelHashtag(Label labelHashtag) {
		this.labelHashtag = labelHashtag;
	}
    
    

}
