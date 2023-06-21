package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

import interfaz.Cabecera__administrador_;

import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-busqueda_usuarios__administrador_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-busqueda_usuarios__administrador_")
@JsModule("./src/vista-busqueda_usuarios__administrador_.ts")
public class VistaBusqueda_usuarios__administrador_ extends LitTemplate {

	private Cabecera__administrador_ cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("bBuscarHashtag")
	private Button bBuscarHashtag;
	@Id("bBuscarUsuario")
	private Button bBuscarUsuario;
	@Id("tfIn")
	private TextField tfIn;
	@Id("scroller")
	private Scroller scroller;

	/**
     * Creates a new VistaBusqueda_usuarios__administrador_.
     */
    public VistaBusqueda_usuarios__administrador_() {
        // You can initialise any data required for the connected UI components here.
    }

	public Cabecera__administrador_ getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera__administrador_ cabecera) {
		this.cabecera = cabecera;
		this.getDivCabecera().add(cabecera);
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Button getbBuscarHashtag() {
		return bBuscarHashtag;
	}

	public void setbBuscarHashtag(Button bBuscarHashtag) {
		this.bBuscarHashtag = bBuscarHashtag;
	}

	public Button getbBuscarUsuario() {
		return bBuscarUsuario;
	}

	public void setbBuscarUsuario(Button bBuscarUsuario) {
		this.bBuscarUsuario = bBuscarUsuario;
	}

	public TextField getTfIn() {
		return tfIn;
	}

	public void setTfIn(TextField tfIn) {
		this.tfIn = tfIn;
	}

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}
    
    

}
