package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-video_otro_usuario__no_registrado__item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-video_otro_usuario__no_registrado__item")
@JsModule("./src/vista-video_otro_usuario__no_registrado__item.ts")
public class VistaVideo_otro_usuario__no_registrado__item extends LitTemplate {

    @Id("layoutVideo")
	private VerticalLayout layoutVideo;
	@Id("image")
	private Image image;
	@Id("labelUsuario")
	private Label labelUsuario;
	@Id("labelUbi")
	private Label labelUbi;
	@Id("labelFecha")
	private Label labelFecha;
	@Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("labelMeGustas")
	private Label labelMeGustas;
	@Id("bComentarios")
	private Button bComentarios;
	@Id("labelComentarios")
	private Label labelComentarios;

	/**
     * Creates a new VistaVideo_otro_usuario__no_registrado__item.
     */
    public VistaVideo_otro_usuario__no_registrado__item() {
        // You can initialise any data required for the connected UI components here.
    }

	public VerticalLayout getLayoutVideo() {
		return layoutVideo;
	}

	public void setLayoutVideo(VerticalLayout layoutVideo) {
		this.layoutVideo = layoutVideo;
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

	public Label getLabelUbi() {
		return labelUbi;
	}

	public void setLabelUbi(Label labelUbi) {
		this.labelUbi = labelUbi;
	}

	public Label getLabelFecha() {
		return labelFecha;
	}

	public void setLabelFecha(Label labelFecha) {
		this.labelFecha = labelFecha;
	}

	public Label getLabelDescripcion() {
		return labelDescripcion;
	}

	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}

	public Label getLabelMeGustas() {
		return labelMeGustas;
	}

	public void setLabelMeGustas(Label labelMeGustas) {
		this.labelMeGustas = labelMeGustas;
	}

	public Button getbComentarios() {
		return bComentarios;
	}

	public void setbComentarios(Button bComentarios) {
		this.bComentarios = bComentarios;
	}

	public Label getLabelComentarios() {
		return labelComentarios;
	}

	public void setLabelComentarios(Label labelComentarios) {
		this.labelComentarios = labelComentarios;
	}
    
    

}
