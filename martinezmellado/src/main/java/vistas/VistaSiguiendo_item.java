package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-siguiendo_item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-siguiendo_item")
@JsModule("./src/vista-siguiendo_item.ts")
public class VistaSiguiendo_item extends LitTemplate {

    @Id("fotoUsr")
	private Image fotoUsr;
	@Id("nUsuario")
	private Label nUsuario;
	@Id("nSeguidores")
	private Label nSeguidores;
	@Id("bDejarDeSeguir")
	private Button bDejarDeSeguir;

	/**
     * Creates a new VistaSiguiendo_item.
     */
    public VistaSiguiendo_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Image getFotoUsr() {
		return fotoUsr;
	}

	public void setFotoUsr(Image fotoUsr) {
		this.fotoUsr = fotoUsr;
	}

	public Label getnUsuario() {
		return nUsuario;
	}

	public void setnUsuario(Label nUsuario) {
		this.nUsuario = nUsuario;
	}

	public Label getnSeguidores() {
		return nSeguidores;
	}

	public void setnSeguidores(Label nSeguidores) {
		this.nSeguidores = nSeguidores;
	}

	public Button getbDejarDeSeguir() {
		return bDejarDeSeguir;
	}

	public void setbDejarDeSeguir(Button bDejarDeSeguir) {
		this.bDejarDeSeguir = bDejarDeSeguir;
	}

}
