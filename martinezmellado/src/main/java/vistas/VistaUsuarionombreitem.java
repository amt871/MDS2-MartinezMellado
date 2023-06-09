package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-usuarionombreitem template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuarionombreitem")
@JsModule("./src/vista-usuarionombreitem.ts")
public class VistaUsuarionombreitem extends LitTemplate {

    @Id("imagen")
	private Image imagen;
	@Id("labelUsuario")
	private Label labelUsuario;

	/**
     * Creates a new VistaUsuarionombreitem.
     */
    public VistaUsuarionombreitem() {
        // You can initialise any data required for the connected UI components here.
    }

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}
    
    

}
