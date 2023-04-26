package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-configurar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-configurar")
@JsModule("./src/vista-configurar.ts")
public class VistaConfigurar extends LitTemplate {

    @Id("bSiguiendo")
	private Button bSiguiendo;
	@Id("bSeguidores")
	private Button bSeguidores;
	@Id("bCambioPrivacidad")
	private Button bCambioPrivacidad;
	@Id("bModificarDatos")
	private Button bModificarDatos;
	@Id("bCerrarSesion")
	private Button bCerrarSesion;

	/**
     * Creates a new VistaConfigurar.
     */
    public VistaConfigurar() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getbSiguiendo() {
		return bSiguiendo;
	}

	public void setbSiguiendo(Button bSiguiendo) {
		this.bSiguiendo = bSiguiendo;
	}

	public Button getbSeguidores() {
		return bSeguidores;
	}

	public void setbSeguidores(Button bSeguidores) {
		this.bSeguidores = bSeguidores;
	}

	public Button getbCambioPrivacidad() {
		return bCambioPrivacidad;
	}

	public void setbCambioPrivacidad(Button bCambioPrivacidad) {
		this.bCambioPrivacidad = bCambioPrivacidad;
	}

	public Button getbModificarDatos() {
		return bModificarDatos;
	}

	public void setbModificarDatos(Button bModificarDatos) {
		this.bModificarDatos = bModificarDatos;
	}

	public Button getbCerrarSesion() {
		return bCerrarSesion;
	}

	public void setbCerrarSesion(Button bCerrarSesion) {
		this.bCerrarSesion = bCerrarSesion;
	}

    
    
}
