package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * A Designer generated component for the vista-video_otro_usuario__administrador__item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-video_otro_usuario__administrador__item")
@JsModule("./src/vista-video_otro_usuario__administrador__item.ts")
public class VistaVideo_otro_usuario__administrador__item extends LitTemplate {

	@Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("labelFecha")
	private Label labelFecha;
	@Id("labelUsuario")
	private Label labelUsuario;
	@Id("labelUbi")
	private Label labelUbi;
	@Id("labelMeGustas")
	private Label labelMeGustas;
	@Id("labelComentarios")
	private Label labelComentarios;
	@Id("bEliminar")
	private Button bEliminar;
	@Id("image")
	private Image image;
	@Id("layoutVideo")
	private VerticalLayout layoutVideo;
	@Id("bComentarios")
	private Button bComentarios;

	/**
     * Creates a new VistaVideo_otro_usuario__administrador__item.
     */
    public VistaVideo_otro_usuario__administrador__item() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    }

	public Label getLabelDescripcion() {
		return labelDescripcion;
	}

	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}

	public Label getLabelFecha() {
		return labelFecha;
	}

	public void setLabelFecha(Label labelFecha) {
		this.labelFecha = labelFecha;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public Label getLabelUbi() {
		return labelUbi;
	}

	public void setLabelUbi(Label labelUbi) {
		this.labelUbi = labelUbi;
	}

	public Label getLabelMeGustas() {
		return labelMeGustas;
	}

	public void setLabelMeGustas(Label labelMeGustas) {
		this.labelMeGustas = labelMeGustas;
	}

	public Label getLabelComentarios() {
		return labelComentarios;
	}

	public void setLabelComentarios(Label labelComentarios) {
		this.labelComentarios = labelComentarios;
	}

	public Button getbEliminar() {
		return bEliminar;
	}

	public void setbEliminar(Button bEliminar) {
		this.bEliminar = bEliminar;
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

	public void setVerticalLayout(VerticalLayout layoutVideo) {
		this.layoutVideo = layoutVideo;
	}

	public Button getbComentarios() {
		return bComentarios;
	}

	public void setbComentarios(Button bComentarios) {
		this.bComentarios = bComentarios;
	}

	public void setLayoutVideo(VerticalLayout layoutVideo) {
		this.layoutVideo = layoutVideo;
	}
    
    

}
