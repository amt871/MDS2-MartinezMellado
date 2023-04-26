package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-administrar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrar")
@JsModule("./src/vista-administrar.ts")
public class VistaAdministrar extends LitTemplate {
	
	private VistaCabecera__administrador_ cabecera;

    @Id("bTodas")
	private Button bTodas;
	@Id("bAplicadas")
	private Button bAplicadas;
	@Id("bVistas")
	private Button bVistas;
	@Id("bPendientes")
	private Button bPendientes;
	@Id("divCabecera")
	private Div divCabecera;
	@Id("divScrollerDenuncias")
	private Div divScrollerDenuncias;

	/**
     * Creates a new VistaAdministrar.
     */
    public VistaAdministrar() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    }

	public Button getbTodas() {
		return bTodas;
	}

	public void setbTodas(Button bTodas) {
		this.bTodas = bTodas;
	}

	public Button getbAplicadas() {
		return bAplicadas;
	}

	public void setbAplicadas(Button bAplicadas) {
		this.bAplicadas = bAplicadas;
	}

	public Button getbVistas() {
		return bVistas;
	}

	public void setbVistas(Button bVistas) {
		this.bVistas = bVistas;
	}

	public Button getbPendientes() {
		return bPendientes;
	}

	public void setbPendientes(Button bPendientes) {
		this.bPendientes = bPendientes;
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public VistaCabecera__administrador_ getCabecera() {
		return cabecera;
	}

	public void setCabecera(VistaCabecera__administrador_ cabecera) {
		this.cabecera = cabecera;
		this.divCabecera.add(cabecera);
	}

	public Div getDivScrollerDenuncias() {
		return divScrollerDenuncias;
	}

	public void setDivScrollerDenuncias(Div divScrollerDenuncias) {
		this.divScrollerDenuncias = divScrollerDenuncias;
	}
	
	
    
}
