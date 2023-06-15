package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-mis_seguidores_item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mis_seguidores_item")
@JsModule("./src/vista-mis_seguidores_item.ts")
public class VistaMis_seguidores_item extends LitTemplate {

    @Id("fotoUsr")
	private Image fotoUsr;
	@Id("nUsuario")
	private Label nUsuario;
	@Id("nSeguidoresUsr")
	private Label nSeguidoresUsr;
	@Id("bSeguir")
	private Button bSeguir;
	@Id("bEliminar")
	private Button bEliminar;

	/**
     * Creates a new VistaMis_seguidores_item.
     */
    public VistaMis_seguidores_item() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "height: 100%; width: 100%");
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

	public Label getnSeguidoresUsr() {
		return nSeguidoresUsr;
	}

	public void setnSeguidoresUsr(Label nSeguidoresUsr) {
		this.nSeguidoresUsr = nSeguidoresUsr;
	}

	public Button getbSeguir() {
		return bSeguir;
	}

	public void setbSeguir(Button bSeguir) {
		this.bSeguir = bSeguir;
	}

	public Button getbEliminar() {
		return bEliminar;
	}

	public void setbEliminar(Button bEliminar) {
		this.bEliminar = bEliminar;
	}

}
