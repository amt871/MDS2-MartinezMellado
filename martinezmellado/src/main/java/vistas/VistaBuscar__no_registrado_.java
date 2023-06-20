package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;

import interfaz.Cabecera_usuario_no_registrado;

import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-buscar__no_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar__no_registrado_")
@JsModule("./src/vista-buscar__no_registrado_.ts")
public class VistaBuscar__no_registrado_ extends LitTemplate {

	private Cabecera_usuario_no_registrado cabecera;
	@Id("divCabecera")
	private Div divCabecera;
	@Id("divVideos")
	private Div divVideos;
	@Id("divUsuarios")
	private Div divUsuarios;
	@Id("bBuscarUsuario")
	private Button bBuscarUsuario;
	@Id("bBUscarHastag")
	private Button bBUscarHastag;
	@Id("inTextField")
	private TextField inTextField;

	/**
     * Creates a new VistaBuscar__no_registrado_.
     */
    public VistaBuscar__no_registrado_() {
        // You can initialise any data required for the connected UI components here.
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
		getDivCabecera().add(cabecera);
	}



	public Div getDivVideos() {
		return divVideos;
	}



	public void setDivVideos(Div divVideos) {
		this.divVideos = divVideos;
	}



	public Div getDivUsuarios() {
		return divUsuarios;
	}



	public void setDivUsuarios(Div divUsuarios) {
		this.divUsuarios = divUsuarios;
	}



	public Button getbBuscarUsuario() {
		return bBuscarUsuario;
	}



	public void setbBuscarUsuario(Button bBuscarUsuario) {
		this.bBuscarUsuario = bBuscarUsuario;
	}



	public Button getbBUscarHastag() {
		return bBUscarHastag;
	}



	public void setbBUscarHastag(Button bBUscarHastag) {
		this.bBUscarHastag = bBUscarHastag;
	}



	public TextField getInTextField() {
		return inTextField;
	}



	public void setInTextField(TextField inTextField) {
		this.inTextField = inTextField;
	}

    
    
}
