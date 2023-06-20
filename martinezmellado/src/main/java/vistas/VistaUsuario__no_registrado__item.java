package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-usuario__no_registrado__item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuario__no_registrado__item")
@JsModule("./src/vista-usuario__no_registrado__item.ts")
public class VistaUsuario__no_registrado__item extends LitTemplate {

    @Id("Descripcion")
	private Label descripcion;
	@Id("Seguidores")
	private Label seguidores;
	@Id("NombreUsuario")
	private Label nombreUsuario;
	@Id("image")
	private Image image;

	/**
     * Creates a new VistaUsuario__no_registrado__item.
     */
    public VistaUsuario__no_registrado__item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Label getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(Label descripcion) {
		this.descripcion = descripcion;
	}

	public Label getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(Label seguidores) {
		this.seguidores = seguidores;
	}

	public Label getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(Label nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
    
    

}
