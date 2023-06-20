package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-denuncias_item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-denuncias_item")
@JsModule("./src/vista-denuncias_item.ts")
public class VistaDenuncias_item extends LitTemplate {

    @Id("imagen")
	private Image imagen;
	@Id("texto")
	private Label texto;
	@Id("bAceptar")
	private Button bAceptar;
	@Id("bRechazar")
	private Button bRechazar;
	@Id("bPosponer")
	private Button bPosponer;
	@Id("textoDescripcion")
	private Label textoDescripcion;

	/**
     * Creates a new VistaDenuncias_item.
     */
    public VistaDenuncias_item() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    }

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	public Label getTexto() {
		return texto;
	}

	public void setTexto(Label texto) {
		this.texto = texto;
	}

	public Button getbAceptar() {
		return bAceptar;
	}

	public void setbAceptar(Button bAceptar) {
		this.bAceptar = bAceptar;
	}

	public Button getbRechazar() {
		return bRechazar;
	}

	public void setbRechazar(Button bRechazar) {
		this.bRechazar = bRechazar;
	}

	public Button getbPosponer() {
		return bPosponer;
	}

	public void setbPosponer(Button bPosponer) {
		this.bPosponer = bPosponer;
	}

	public Label getTextoDescripcion() {
		return textoDescripcion;
	}

	public void setTextoDescripcion(Label textoDescripcion) {
		this.textoDescripcion = textoDescripcion;
	}

}
