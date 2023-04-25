package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-cabecera_usuario_no_registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera_usuario_no_registrado")
@JsModule("./src/vista-cabecera_usuario_no_registrado.ts")
public class VistaCabecera_usuario_no_registrado extends LitTemplate {

    @Id("bInicio")
	private Button bInicio;
	@Id("bBusqueda")
	private Button bBusqueda;
	@Id("bIniciarSesion")
	private Button bIniciarSesion;
	@Id("bRegistrarse")
	private Button bRegistrarse;

	/**
     * Creates a new VistaCabecera_usuario_no_registrado.
     */
    public VistaCabecera_usuario_no_registrado() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getbInicio() {
		return bInicio;
	}

	public void setbInicio(Button bInicio) {
		this.bInicio = bInicio;
	}

	public Button getbBusqueda() {
		return bBusqueda;
	}

	public void setbBusqueda(Button bBusqueda) {
		this.bBusqueda = bBusqueda;
	}

	public Button getbIniciarSesion() {
		return bIniciarSesion;
	}

	public void setbIniciarSesion(Button bIniciarSesion) {
		this.bIniciarSesion = bIniciarSesion;
	}

	public Button getbRegistrarse() {
		return bRegistrarse;
	}

	public void setbRegistrarse(Button bRegistrarse) {
		this.bRegistrarse = bRegistrarse;
	}
    
    

}
