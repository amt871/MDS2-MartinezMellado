package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera__administrador_;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-ver_perfil__administrador_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_perfil__administrador_")
@JsModule("./src/vista-ver_perfil__administrador_.ts")
public class VistaVer_perfil__administrador_ extends LitTemplate {

	private Cabecera__administrador_ cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("bBloquear")
	private Button bBloquear;
	@Id("labelSeguidores")
	private Label labelSeguidores;
	@Id("image")
	private Image image;
	@Id("labelMeGustas")
	private Label labelMeGustas;
	@Id("scroller")
	private Scroller scroller;
	@Id("labelPrivado")
	private Label labelPrivado;
	@Id("labelUsuario")
	private Label labelUsuario;

	/**
     * Creates a new VistaVer_perfil__administrador_.
     */
    public VistaVer_perfil__administrador_() {
        // You can initialise any data required for the connected UI components here.
    }

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Button getbBloquear() {
		return bBloquear;
	}

	public void setbBloquear(Button bBloquear) {
		this.bBloquear = bBloquear;
	}

	public Label getLabelSeguidores() {
		return labelSeguidores;
	}

	public void setLabelSeguidores(Label labelSeguidores) {
		this.labelSeguidores = labelSeguidores;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Label getLabelMeGustas() {
		return labelMeGustas;
	}

	public void setLabelMeGustas(Label labelMeGustas) {
		this.labelMeGustas = labelMeGustas;
	}

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

	public Label getLabelPrivado() {
		return labelPrivado;
	}

	public void setLabelPrivado(Label labelPrivado) {
		this.labelPrivado = labelPrivado;
	}

	public Cabecera__administrador_ getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera__administrador_ cabecera) {
		this.cabecera = cabecera;
		this.getDivCabecera().add(cabecera);
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}
    
    

}
