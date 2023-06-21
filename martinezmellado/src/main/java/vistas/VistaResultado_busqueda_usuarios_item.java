package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-resultado_busqueda_usuarios_item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-resultado_busqueda_usuarios_item")
@JsModule("./src/vista-resultado_busqueda_usuarios_item.ts")
public class VistaResultado_busqueda_usuarios_item extends LitTemplate {

    @Id("descripcion")
	private Label descripcion;
	@Id("seguidores")
	private Label seguidores;
	@Id("nombreUsuario")
	private Label nombreUsuario;
	@Id("image")
	private Image image;

	/**
     * Creates a new VistaResultado_busqueda_usuarios_item.
     */
    public VistaResultado_busqueda_usuarios_item() {
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
