package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-comentario__administrador__item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-comentario__administrador__item")
@JsModule("./src/vista-comentario__administrador__item.ts")
public class VistaComentario__administrador__item extends LitTemplate {

    @Id("image")
	private Image image;
	@Id("labelcomentario")
	private Label labelcomentario;
	@Id("bEliminar")
	private Button bEliminar;

	/**
     * Creates a new VistaComentario__administrador__item.
     */
    public VistaComentario__administrador__item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Label getLabelcomentario() {
		return labelcomentario;
	}

	public void setLabelcomentario(Label labelcomentario) {
		this.labelcomentario = labelcomentario;
	}

	public Button getbEliminar() {
		return bEliminar;
	}

	public void setbEliminar(Button bEliminar) {
		this.bEliminar = bEliminar;
	}


    

}
