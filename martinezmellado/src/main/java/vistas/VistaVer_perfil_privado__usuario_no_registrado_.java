package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera_usuario_no_registrado;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-ver_perfil_privado__usuario_no_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_perfil_privado__usuario_no_registrado_")
@JsModule("./src/vista-ver_perfil_privado__usuario_no_registrado_.ts")
public class VistaVer_perfil_privado__usuario_no_registrado_ extends LitTemplate {

	private Cabecera_usuario_no_registrado cabecera;
    @Id("labelMeGustas")
	private Label labelMeGustas;
	@Id("labelUsuario")
	private Label labelUsuario;
	@Id("image")
	private Image image;
	@Id("labelSeguidores")
	private Label labelSeguidores;
	@Id("divCabecera")
	private Div divCabecera;

	/**
     * Creates a new VistaVer_perfil_privado__usuario_no_registrado_.
     */
    public VistaVer_perfil_privado__usuario_no_registrado_() {
        // You can initialise any data required for the connected UI components here.
    }

	public Label getLabelMeGustas() {
		return labelMeGustas;
	}

	public void setLabelMeGustas(Label labelMeGustas) {
		this.labelMeGustas = labelMeGustas;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Label getLabelSeguidores() {
		return labelSeguidores;
	}

	public void setLabelSeguidores(Label labelSeguidores) {
		this.labelSeguidores = labelSeguidores;
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Cabecera_usuario_no_registrado getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera_usuario_no_registrado cabecera) {
		this.cabecera = cabecera;
		this.getDivCabecera().add(cabecera);
	}
    
    

}
