package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-me_gusta__otro_usuario__item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-me_gusta__otro_usuario__item")
@JsModule("./src/vista-me_gusta__otro_usuario__item.ts")
public class VistaMe_gusta__otro_usuario__item extends LitTemplate {

    @Id("img")
	private Image img;
	@Id("labelUsuario")
	private Label labelUsuario;

	/**
     * Creates a new VistaMe_gusta__otro_usuario__item.
     */
    public VistaMe_gusta__otro_usuario__item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}
    
    

}
