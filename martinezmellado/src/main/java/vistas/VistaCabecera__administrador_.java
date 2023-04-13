package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-cabecera__administrador_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera__administrador_")
@JsModule("./src/vista-cabecera__administrador_.ts")
public class VistaCabecera__administrador_ extends LitTemplate {

	@Id("bSalir")
	private Button bSalir;
	@Id("bPerfil")
	private Button bPerfil;
	@Id("bAdministrar")
	private Button bAdministrar;
	@Id("bBusqueda")
	private Button bBusqueda;
	@Id("bInicio")
	private Button bInicio;

	/**
     * Creates a new VistaCabecera__administrador_.
     */
    public VistaCabecera__administrador_() {
        // You can initialise any data required for the connected UI components here.
    	
    }

	public Button getbSalir() {
		return bSalir;
	}

	public void setbSalir(Button bSalir) {
		this.bSalir = bSalir;
	}

	public Button getbPerfil() {
		return bPerfil;
	}

	public void setbPerfil(Button bPerfil) {
		this.bPerfil = bPerfil;
	}

	public Button getbAdministrar() {
		return bAdministrar;
	}

	public void setbAdministrar(Button bAdministrar) {
		this.bAdministrar = bAdministrar;
	}

	public Button getbBusqueda() {
		return bBusqueda;
	}

	public void setbBusqueda(Button bBusqueda) {
		this.bBusqueda = bBusqueda;
	}

	public Button getbInicio() {
		return bInicio;
	}

	public void setbInicio(Button bInicio) {
		this.bInicio = bInicio;
	}

}
