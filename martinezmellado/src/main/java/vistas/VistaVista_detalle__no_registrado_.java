package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

import interfaz.Cabecera_usuario_no_registrado;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-vista_detalle__no_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vista_detalle__no_registrado_")
@JsModule("./src/vista-vista_detalle__no_registrado_.ts")
public class VistaVista_detalle__no_registrado_ extends LitTemplate {

	private Cabecera_usuario_no_registrado cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("vlVideo")
	private Element vlVideo;
	@Id("image")
	private Image image;
	@Id("labelUsuario")
	private Label labelUsuario;
	@Id("scroller")
	private Scroller scroller;
	@Id("labelUbicacion")
	private Label labelUbicacion;
	@Id("labelFecha")
	private Label labelFecha;
	/**
     * Creates a new VistaVista_detalle__no_registrado_.
     */
    public VistaVista_detalle__no_registrado_() {
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
	public Element getVlVideo() {
		return vlVideo;
	}
	public void setVlVideo(Element vlVideo) {
		this.vlVideo = vlVideo;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public Label getLabelUsuario() {
		return labelUsuario;
	}
	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}
	public Scroller getScroller() {
		return scroller;
	}
	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}
	public Label getLabelUbicacion() {
		return labelUbicacion;
	}
	public void setLabelUbicacion(Label labelUbicacion) {
		this.labelUbicacion = labelUbicacion;
	}
	public Label getLabelFecha() {
		return labelFecha;
	}
	public void setLabelFecha(Label labelFecha) {
		this.labelFecha = labelFecha;
	}
    
    

}
