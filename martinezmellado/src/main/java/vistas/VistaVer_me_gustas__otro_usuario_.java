package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

import interfaz.Mi_cabecera;

import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-ver_me_gustas__otro_usuario_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_me_gustas__otro_usuario_")
@JsModule("./src/vista-ver_me_gustas__otro_usuario_.ts")
public class VistaVer_me_gustas__otro_usuario_ extends LitTemplate {

	private Mi_cabecera cabecera;
    @Id("image")
	private Image image;
	@Id("layoutVideo")
	private VerticalLayout layoutVideo;
	@Id("scroller")
	private Scroller scroller;
	@Id("bAnterior")
	private Button bAnterior;
	@Id("divCabecera")
	private Div divCabecera;

	/**
     * Creates a new VistaVer_me_gustas__otro_usuario_.
     */
    public VistaVer_me_gustas__otro_usuario_() {
        // You can initialise any data required for the connected UI components here.
    }

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public VerticalLayout getLayoutVideo() {
		return layoutVideo;
	}

	public void setLayoutVideo(VerticalLayout layoutVideo) {
		this.layoutVideo = layoutVideo;
	}

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

	public Button getbAnterior() {
		return bAnterior;
	}

	public void setbAnterior(Button bAnterior) {
		this.bAnterior = bAnterior;
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Mi_cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		this.cabecera = cabecera;
		this.getDivCabecera().add(cabecera);
	}
    
    

}
