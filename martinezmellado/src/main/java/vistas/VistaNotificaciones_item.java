package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-notificaciones_item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificaciones_item")
@JsModule("./src/vista-notificaciones_item.ts")
public class VistaNotificaciones_item extends LitTemplate {

    @Id("idFotoUsuario")
	private Element idFotoUsuario;
	@Id("idNombreUsuario")
	private Label idNombreUsuario;
	@Id("idTextoNotificación")
	private Label idTextoNotificación;
	@Id("idVideoRelacionado")
	private Image idVideoRelacionado;
	@Id("bAceptar")
	private Button bAceptar;
	@Id("idBotonVista")
	private Button idBotonVista;
	@Id("bRechazar")
	private Button bRechazar;

	/**
     * Creates a new VistaNotificaciones_item.
     */
    public VistaNotificaciones_item() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    }

	public Element getIdFotoUsuario() {
		return idFotoUsuario;
	}

	public void setIdFotoUsuario(Element idFotoUsuario) {
		this.idFotoUsuario = idFotoUsuario;
	}

	public Label getIdNombreUsuario() {
		return idNombreUsuario;
	}

	public void setIdNombreUsuario(Label idNombreUsuario) {
		this.idNombreUsuario = idNombreUsuario;
	}

	public Label getIdTextoNotificación() {
		return idTextoNotificación;
	}

	public void setIdTextoNotificación(Label idTextoNotificación) {
		this.idTextoNotificación = idTextoNotificación;
	}

	public Image getIdVideoRelacionado() {
		return idVideoRelacionado;
	}

	public void setIdVideoRelacionado(Image idVideoRelacionado) {
		this.idVideoRelacionado = idVideoRelacionado;
	}

	public Button getbAceptar() {
		return bAceptar;
	}

	public void setbAceptar(Button bAceptar) {
		this.bAceptar = bAceptar;
	}

	public Button getIdBotonVista() {
		return idBotonVista;
	}

	public void setIdBotonVista(Button idBotonVista) {
		this.idBotonVista = idBotonVista;
	}

	public Button getbRechazar() {
		return bRechazar;
	}

	public void setbRechazar(Button bRechazar) {
		this.bRechazar = bRechazar;
	}

}
