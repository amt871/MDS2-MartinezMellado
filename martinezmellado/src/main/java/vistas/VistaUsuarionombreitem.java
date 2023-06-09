package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-usuarionombreitem template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuarionombreitem")
@JsModule("./src/vista-usuarionombreitem.ts")
public class VistaUsuarionombreitem extends LitTemplate {

    @Id("labelUsuario")
	private Label labelUsuario;
	@Id("imagen")
	private Button imagen;
	@Id("imageButton")
	private Image imageButton;

	/**
     * Creates a new VistaUsuarionombreitem.
     */
    public VistaUsuarionombreitem() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getImagen() {
		return imagen;
	}

	public void setImagen(Button imagen) {
		this.imagen = imagen;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public Image getImageButton() {
		return imageButton;
	}

	public void setImageButton(Image imageButton) {
		this.imageButton = imageButton;
	}
    
    

}
