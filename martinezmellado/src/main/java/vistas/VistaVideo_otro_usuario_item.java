package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-video_otro_usuario_item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-video_otro_usuario_item")
@JsModule("./src/vista-video_otro_usuario_item.ts")
public class VistaVideo_otro_usuario_item extends LitTemplate {

    @Id("layoutVideo")
	private VerticalLayout layoutVideo;
	@Id("usuarioButton")
	private Button usuarioButton;
	@Id("imageButton")
	private Image imageButton;
	@Id("idUbicación")
	private Label idUbicación;
	@Id("IdFecha")
	private Label idFecha;
	@Id("idDescripcion")
	private Label idDescripcion;
	@Id("idNumComentarios")
	private Label idNumComentarios;
	@Id("idNumMg")
	private Label idNumMg;
	@Id("denunciarButton")
	private Button denunciarButton;
	@Id("labelUsuario")
	private Label labelUsuario;
	@Id("idBComentarios")
	private Button idBComentarios;
	@Id("idBMeGusta")
	private Button idBMeGusta;
	@Id("DivNumMegustas")
	private Div divNumMegustas;

	/**
     * Creates a new VistaVideo_otro_usuario_item.
     */
    public VistaVideo_otro_usuario_item() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    }

	public VerticalLayout getLayoutVideo() {
		return layoutVideo;
	}

	public void setLayoutVideo(VerticalLayout layoutVideo) {
		this.layoutVideo = layoutVideo;
	}

	public Button getUsuarioButton() {
		return usuarioButton;
	}

	public void setUsuarioButton(Button usuarioButton) {
		this.usuarioButton = usuarioButton;
	}

	public Image getImageButton() {
		return imageButton;
	}

	public void setImageButton(Image imageButton) {
		this.imageButton = imageButton;
	}

	public Label getIdUbicación() {
		return idUbicación;
	}

	public void setIdUbicación(Label idUbicación) {
		this.idUbicación = idUbicación;
	}

	public Label getIdFecha() {
		return idFecha;
	}

	public void setIdFecha(Label idFecha) {
		this.idFecha = idFecha;
	}

	public Label getIdDescripcion() {
		return idDescripcion;
	}

	public void setIdDescripcion(Label idDescripcion) {
		this.idDescripcion = idDescripcion;
	}

	public Label getIdNumComentarios() {
		return idNumComentarios;
	}

	public void setIdNumComentarios(Label idNumComentarios) {
		this.idNumComentarios = idNumComentarios;
	}

	public Label getIdNumMg() {
		return idNumMg;
	}

	public void setIdNumMg(Label idNumMg) {
		this.idNumMg = idNumMg;
	}

	public Button getDenunciarButton() {
		return denunciarButton;
	}

	public void setDenunciarButton(Button denunciarButton) {
		this.denunciarButton = denunciarButton;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public Button getIdBComentarios() {
		return idBComentarios;
	}

	public void setIdBComentarios(Button idBComentarios) {
		this.idBComentarios = idBComentarios;
	}

	public Button getIdBMeGusta() {
		return idBMeGusta;
	}

	public void setIdBMeGusta(Button idBMeGusta) {
		this.idBMeGusta = idBMeGusta;
	}

	public Div getDivNumMegustas() {
		return divNumMegustas;
	}

	public void setDivNumMegustas(Div divNumMegustas) {
		this.divNumMegustas = divNumMegustas;
	}
    
    

}
