package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Mi_cabecera;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-vista_detalle__usuario_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vista_detalle__usuario_registrado_")
@JsModule("./src/vista-vista_detalle__usuario_registrado_.ts")
public class VistaVista_detalle__usuario_registrado_ extends LitTemplate {

	private Mi_cabecera cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("divVideo")
	private Div divVideo;
	@Id("imgUser")
	private Image imgUser;
	@Id("labelUsuario")
	private Label labelUsuario;
	@Id("labelFecha")
	private Label labelFecha;
	@Id("labelUbi")
	private Label labelUbi;
	@Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("divComentarios")
	private Div divComentarios;

	/**
     * Creates a new VistaVista_detalle__usuario_registrado_.
     */
    public VistaVista_detalle__usuario_registrado_() {
        // You can initialise any data required for the connected UI components here.
    }

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Div getDivVideo() {
		return divVideo;
	}

	public void setDivVideo(Div divVideo) {
		this.divVideo = divVideo;
	}

	public Image getImgUser() {
		return imgUser;
	}

	public void setImgUser(Image imgUser) {
		this.imgUser = imgUser;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public Label getLabelFecha() {
		return labelFecha;
	}

	public void setLabelFecha(Label labelFecha) {
		this.labelFecha = labelFecha;
	}

	public Label getLabelUbi() {
		return labelUbi;
	}

	public void setLabelUbi(Label labelUbi) {
		this.labelUbi = labelUbi;
	}

	public Label getLabelDescripcion() {
		return labelDescripcion;
	}

	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}

	public Div getDivComentarios() {
		return divComentarios;
	}

	public void setDivComentarios(Div divComentarios) {
		this.divComentarios = divComentarios;
	}

	public Mi_cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		this.cabecera = cabecera;
		this.getDivCabecera().add(cabecera);
	}


    
}
