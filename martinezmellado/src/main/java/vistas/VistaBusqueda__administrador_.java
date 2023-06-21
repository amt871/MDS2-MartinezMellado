package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera__administrador_;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-busqueda__administrador_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-busqueda__administrador_")
@JsModule("./src/vista-busqueda__administrador_.ts")
public class VistaBusqueda__administrador_ extends LitTemplate {

	private Cabecera__administrador_ cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("divUsuarios")
	private Div divUsuarios;
	@Id("divVideos")
	private Div divVideos;
	@Id("tfIn")
	private TextField tfIn;
	@Id("bBuscarUsuario")
	private Button bBuscarUsuario;
	@Id("bBuscarHashtag")
	private Button bBuscarHashtag;

	/**
     * Creates a new VistaBusqueda__administrador_.
     */
    public VistaBusqueda__administrador_() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    }

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Cabecera__administrador_ getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera__administrador_ cabecera) {
		this.cabecera = cabecera;
		this.divCabecera.add(this.cabecera);
	}

	public Div getDivUsuarios() {
		return divUsuarios;
	}

	public void setDivUsuarios(Div divUsuarios) {
		this.divUsuarios = divUsuarios;
	}

	public Div getDivVideos() {
		return divVideos;
	}

	public void setDivVideos(Div divVideos) {
		this.divVideos = divVideos;
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
    
    

}
