package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.textfield.TextField;

import interfaz.Mi_cabecera;

import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-buscar_usuario__usuario_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar_usuario__usuario_registrado_")
@JsModule("./src/vista-buscar_usuario__usuario_registrado_.ts")
public class VistaBuscar_usuario__usuario_registrado_ extends LitTemplate {

	Mi_cabecera cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("scroller")
	private Scroller scroller;
	@Id("tfIn")
	private TextField tfIn;
	@Id("bBuscarUsuario")
	private Button bBuscarUsuario;
	@Id("bBuscarHashtag")
	private Button bBuscarHashtag;

	/**
     * Creates a new VistaBuscar_usuario__usuario_registrado_.
     */
    public VistaBuscar_usuario__usuario_registrado_() {
        // You can initialise any data required for the connected UI components here.
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

	public TextField getTfIn() {
		return tfIn;
	}

	public void setTfIn(TextField tfIn) {
		this.tfIn = tfIn;
	}

	public Button getbBuscarUsuario() {
		return bBuscarUsuario;
	}

	public void setbBuscarUsuario(Button bBuscarUsuario) {
		this.bBuscarUsuario = bBuscarUsuario;
	}

	public Button getbBuscarHashtag() {
		return bBuscarHashtag;
	}

	public void setbBuscarHashtag(Button bBuscarHashtag) {
		this.bBuscarHashtag = bBuscarHashtag;
	}

	public Mi_cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		this.cabecera = cabecera;
		this.getDivCabecera().add(this.cabecera);	
	}

    
    
}
