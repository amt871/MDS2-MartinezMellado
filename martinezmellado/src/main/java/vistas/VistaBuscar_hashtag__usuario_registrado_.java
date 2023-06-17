package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;

import interfaz.Mi_cabecera;

import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-buscar_hashtag__usuario_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar_hashtag__usuario_registrado_")
@JsModule("./src/vista-buscar_hashtag__usuario_registrado_.ts")
public class VistaBuscar_hashtag__usuario_registrado_ extends LitTemplate {

	private Mi_cabecera cabecera;
	
    @Id("scroller")
	private Scroller scroller;
	@Id("divCabecera")
	private Div divCabecera;
	@Id("tfBusqueda")
	private TextField tfBusqueda;
	@Id("bBuscarUsuario")
	private Button bBuscarUsuario;
	@Id("bBuscarHashtag")
	private Button bBuscarHashtag;

	/**
     * Creates a new VistaBuscar_hashtag__usuario_registrado_.
     */
    public VistaBuscar_hashtag__usuario_registrado_() {
        // You can initialise any data required for the connected UI components here.
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

	public TextField getTfBusqueda() {
		return tfBusqueda;
	}

	public void setTfBusqueda(TextField tfBusqueda) {
		this.tfBusqueda = tfBusqueda;
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
    
    public void setCabecera(Mi_cabecera cabecera) {
    	this.cabecera = cabecera;
    	this.getDivCabecera().add(cabecera);
    }
    
    public Mi_cabecera getCabecera() {
    	return this.cabecera;
    }

}
