package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera_comercial;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-perfil_comercial template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil_comercial")
@JsModule("./src/vista-perfil_comercial.ts")
public class VistaPerfil_comercial extends LitTemplate {

	private Cabecera_comercial cabecera;
    @Id("bConfigurar")
	private Button bConfigurar;
	@Id("divCabecera")
	private Div divCabecera;
	@Id("scroller")
	private Scroller scroller;
	@Id("labelUsuario")
	private Label labelUsuario;
	@Id("labelMeGustas")
	private Label labelMeGustas;
	@Id("labelSeguidores")
	private Label labelSeguidores;
	@Id("imagen")
	private Image imagen;

	/**
     * Creates a new VistaPerfil_comercial.
     */
    public VistaPerfil_comercial() {
        // You can initialise any data required for the connected UI components here.
    }

	public Cabecera_comercial getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera_comercial cabecera) {
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);
	}

	public Button getbConfigurar() {
		return bConfigurar;
	}

	public void setbConfigurar(Button bConfigurar) {
		this.bConfigurar = bConfigurar;
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public Label getLabelMeGustas() {
		return labelMeGustas;
	}

	public void setLabelMeGustas(Label labelMeGustas) {
		this.labelMeGustas = labelMeGustas;
	}

	public Label getLabelSeguidores() {
		return labelSeguidores;
	}

	public void setLabelSeguidores(Label labelSeguidores) {
		this.labelSeguidores = labelSeguidores;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}
    
    

}
