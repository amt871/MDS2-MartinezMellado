package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera_comercial;

import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-configurar_perfil_comercial template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-configurar_perfil_comercial")
@JsModule("./src/vista-configurar_perfil_comercial.ts")
public class VistaConfigurar_perfil_comercial extends LitTemplate {

	private Cabecera_comercial cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("bCambiar")
	private Button bCambiar;
	@Id("bCambioContra")
	private Button bCambioContra;
	@Id("bGuardar")
	private Button bGuardar;

	/**
     * Creates a new VistaConfigurar_perfil_comercial.
     */
    public VistaConfigurar_perfil_comercial() {
        // You can initialise any data required for the connected UI components here.
    }

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Button getbCambiar() {
		return bCambiar;
	}

	public void setbCambiar(Button bCambiar) {
		this.bCambiar = bCambiar;
	}

	public Button getbCambioContra() {
		return bCambioContra;
	}

	public void setbCambioContra(Button bCambioContra) {
		this.bCambioContra = bCambioContra;
	}

	public Button getbGuardar() {
		return bGuardar;
	}

	public void setbGuardar(Button bGuardar) {
		this.bGuardar = bGuardar;
	}

	public Cabecera_comercial getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera_comercial cabecera) {
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);
	}

    
    
}
