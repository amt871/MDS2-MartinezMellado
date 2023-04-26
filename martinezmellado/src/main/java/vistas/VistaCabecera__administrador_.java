package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-cabecera__administrador_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera__administrador_")
@JsModule("./src/vista-cabecera__administrador_.ts")
public class VistaCabecera__administrador_ extends LitTemplate {


	@Id("bInicio2")
	private Button bInicio2;
	@Id("bBusqueda2")
	private Button bBusqueda2;
	@Id("bAdministrar2")
	private Button bAdministrar2;
	@Id("bSalir2")
	private Button bSalir2;

	/**
     * Creates a new VistaCabecera__administrador_.
     */
    public VistaCabecera__administrador_() {
        // You can initialise any data required for the connected UI components here.
    	//this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    	
    }

	public Button getbInicio2() {
		return bInicio2;
	}

	public void setbInicio2(Button bInicio2) {
		this.bInicio2 = bInicio2;
	}

	public Button getbBusqueda2() {
		return bBusqueda2;
	}

	public void setbBusqueda2(Button bBusqueda2) {
		this.bBusqueda2 = bBusqueda2;
	}

	public Button getbAdministrar2() {
		return bAdministrar2;
	}

	public void setbAdministrar2(Button bAdministrar2) {
		this.bAdministrar2 = bAdministrar2;
	}

	public Button getbSalir2() {
		return bSalir2;
	}

	public void setbSalir2(Button bSalir2) {
		this.bSalir2 = bSalir2;
	}

	

}
