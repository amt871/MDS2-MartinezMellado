package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Mi_cabecera;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-buscar__usuario_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar__usuario_registrado_")
@JsModule("./src/vista-buscar__usuario_registrado_.ts")
public class VistaBuscar__usuario_registrado_ extends LitTemplate {

	private Mi_cabecera cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("divUsuarios")
	private Div divUsuarios;
	@Id("bUsuario")
	private Button bUsuario;
	@Id("bHashtag")
	private Button bHashtag;
	@Id("divVideos")
	private Div divVideos;
	@Id("item1")
	private Button item1;
	@Id("divItem1")
	private Div divItem1;

	/**
     * Creates a new VistaBuscar__usuario_registrado_.
     */
    public VistaBuscar__usuario_registrado_() {
        // You can initialise any data required for the connected UI components here.
    }

	public Mi_cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Div getDivUsuarios() {
		return divUsuarios;
	}

	public void setDivUsuarios(Div divUsuarios) {
		this.divUsuarios = divUsuarios;
	}

	public Button getbUsuario() {
		return bUsuario;
	}

	public void setbUsuario(Button bUsuario) {
		this.bUsuario = bUsuario;
	}

	public Button getbHashtag() {
		return bHashtag;
	}

	public void setbHashtag(Button bHashtag) {
		this.bHashtag = bHashtag;
	}

	public Div getDivVideos() {
		return divVideos;
	}

	public void setDivVideos(Div divVideos) {
		this.divVideos = divVideos;
	}

	public Button getItem1() {
		return item1;
	}

	public void setItem1(Button item1) {
		this.item1 = item1;
	}

	public Div getDivItem1() {
		return divItem1;
	}

	public void setDivItem1(Div divItem1) {
		this.divItem1 = divItem1;
	}

    
}
