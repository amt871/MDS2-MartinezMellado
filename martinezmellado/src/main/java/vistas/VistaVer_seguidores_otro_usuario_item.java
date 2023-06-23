package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-ver_seguidores_otro_usuario_item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_seguidores_otro_usuario_item")
@JsModule("./src/vista-ver_seguidores_otro_usuario_item.ts")
public class VistaVer_seguidores_otro_usuario_item extends LitTemplate {

    @Id("image")
	private Image image;
	@Id("labelUsuario")
	private Label labelUsuario;

	/**
     * Creates a new VistaVer_seguidores_otro_usuario_item.
     */
    public VistaVer_seguidores_otro_usuario_item() {
        // You can initialise any data required for the connected UI components here.
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
    
    

}
