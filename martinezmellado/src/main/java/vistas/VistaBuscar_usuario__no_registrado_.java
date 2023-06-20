package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;

import interfaz.Cabecera_usuario_no_registrado;

import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-buscar_usuario__no_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar_usuario__no_registrado_")
@JsModule("./src/vista-buscar_usuario__no_registrado_.ts")
public class VistaBuscar_usuario__no_registrado_ extends LitTemplate {

	private Cabecera_usuario_no_registrado cabecera;
    @Id("bBuscarHashtag")
	private Button bBuscarHashtag;
	@Id("bBuscarUsuario")
	private Button bBuscarUsuario;
	@Id("tfIn")
	private TextField tfIn;
	@Id("scroller")
	private Scroller scroller;
	@Id("divCabecera")
	private Div divCabecera;

	/**
     * Creates a new VistaBuscar_usuario__no_registrado_.
     */
    public VistaBuscar_usuario__no_registrado_() {
        // You can initialise any data required for the connected UI components here.
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
