package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-comentario_item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-comentario_item")
@JsModule("./src/vista-comentario_item.ts")
public class VistaComentario_item extends LitTemplate {

    @Id("imgUser")
	private Image imgUser;
	@Id("labelComentario")
	private Label labelComentario;
	@Id("bDenunciar")
	private Button bDenunciar;

	/**
     * Creates a new VistaComentario_item.
     */
    public VistaComentario_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Image getImgUser() {
		return imgUser;
	}

	public void setImgUser(Image imgUser) {
		this.imgUser = imgUser;
	}

	public Label getLabelComentario() {
		return labelComentario;
	}

	public void setLabelComentario(Label labelComentario) {
		this.labelComentario = labelComentario;
	}

	public Button getbDenunciar() {
		return bDenunciar;
	}

	public void setbDenunciar(Button bDenunciar) {
		this.bDenunciar = bDenunciar;
	}
    
    

}
