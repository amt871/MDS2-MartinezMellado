package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera_comercial;
import interfaz.Mi_cabecera;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

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
	private Cabecera_comercial cabeceraCom;
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
	@Id("scroller")
	private Scroller scroller;
	@Id("bAddComentario")
	private Button bAddComentario;
	@Id("fieldComentario")
	private TextField fieldComentario;
	@Id("layoutVideo")
	private HorizontalLayout layoutVideo;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("labelMeGustas")
	private Label labelMeGustas;
	@Id("bVerMeGustas")
	private Button bVerMeGustas;

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

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

	public Button getbAddComentario() {
		return bAddComentario;
	}

	public void setbAddComentario(Button bAddComentario) {
		this.bAddComentario = bAddComentario;
	}

	public TextField getFieldComentario() {
		return fieldComentario;
	}

	public void setFieldComentario(TextField fieldComentario) {
		this.fieldComentario = fieldComentario;
	}

	public HorizontalLayout getLayoutVideo() {
		return layoutVideo;
	}

	public void setLayoutVideo(HorizontalLayout layoutVideo) {
		this.layoutVideo = layoutVideo;
	}

	public Cabecera_comercial getCabeceraCom() {
		return cabeceraCom;
	}

	public void setCabeceraCom(Cabecera_comercial cabeceraCom) {
		this.cabeceraCom = cabeceraCom;
		this.getDivCabecera().add(cabeceraCom);
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Label getLabelMeGustas() {
		return labelMeGustas;
	}

	public void setLabelMeGustas(Label labelMeGustas) {
		this.labelMeGustas = labelMeGustas;
	}

	public Button getbVerMeGustas() {
		return bVerMeGustas;
	}

	public void setbVerMeGustas(Button bVerMeGustas) {
		this.bVerMeGustas = bVerMeGustas;
	}

	
    
}
