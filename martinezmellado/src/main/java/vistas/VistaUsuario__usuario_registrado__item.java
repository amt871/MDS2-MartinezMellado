package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-usuario__usuario_registrado__item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuario__usuario_registrado__item")
@JsModule("./src/vista-usuario__usuario_registrado__item.ts")
public class VistaUsuario__usuario_registrado__item extends LitTemplate {

    @Id("imageUser")
	private Image imageUser;
	@Id("labelUsuario")
	private Label labelUsuario;
	@Id("labelSeguidores")
	private Label labelSeguidores;
	@Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("bUser")
	private Button bUser;

	/**
     * Creates a new VistaUsuario__usuario_registrado__item.
     */
    public VistaUsuario__usuario_registrado__item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Image getImageUser() {
		return imageUser;
	}

	public void setImageUser(Image imageUser) {
		this.imageUser = imageUser;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public Label getLabelSeguidores() {
		return labelSeguidores;
	}

	public void setLabelSeguidores(Label labelSeguidores) {
		this.labelSeguidores = labelSeguidores;
	}

	public Label getLabelDescripcion() {
		return labelDescripcion;
	}

	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}

	public Button getbUser() {
		return bUser;
	}

	public void setbUser(Button bUser) {
		this.bUser = bUser;
	}
    
    

}
