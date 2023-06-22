package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera_usuario_no_registrado;

import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-me_gusta__no_registrado__item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-me_gusta__no_registrado__item")
@JsModule("./src/vista-me_gusta__no_registrado__item.ts")
public class VistaMe_gusta__no_registrado__item extends LitTemplate {

	private Cabecera_usuario_no_registrado cabecera;
    @Id("img")
	private Image img;
	@Id("labelUsuario")
	private Label labelUsuario;

	/**
     * Creates a new VistaMe_gusta__no_registrado__item.
     */
    public VistaMe_gusta__no_registrado__item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Cabecera_usuario_no_registrado getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera_usuario_no_registrado cabecera) {
		this.cabecera = cabecera;
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
