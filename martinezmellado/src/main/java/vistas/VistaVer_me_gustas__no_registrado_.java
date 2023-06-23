package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

import interfaz.Cabecera_usuario_no_registrado;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-ver_me_gustas__no_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_me_gustas__no_registrado_")
@JsModule("./src/vista-ver_me_gustas__no_registrado_.ts")
public class VistaVer_me_gustas__no_registrado_ extends LitTemplate {

	private Cabecera_usuario_no_registrado cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("layoutVideo")
	private VerticalLayout layoutVideo;
	@Id("bAnterior")
	private Button bAnterior;
	@Id("image")
	private Image image;
	@Id("scroller")
	private Scroller scroller;

	/**
     * Creates a new VistaVer_me_gustas__no_registrado_.
     */
    public VistaVer_me_gustas__no_registrado_() {
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

	public VerticalLayout getLayoutVideo() {
		return layoutVideo;
	}

	public void setLayoutVideo(VerticalLayout layoutVideo) {
		this.layoutVideo = layoutVideo;
	}

	public Button getbAnterior() {
		return bAnterior;
	}

	public void setbAnterior(Button bAnterior) {
		this.bAnterior = bAnterior;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

    
}
