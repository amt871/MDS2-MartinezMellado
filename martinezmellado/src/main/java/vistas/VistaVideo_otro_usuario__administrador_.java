package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaCabecera__administrador_;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-video_otro_usuario__administrador_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-video_otro_usuario__administrador_")
@JsModule("./src/vista-video_otro_usuario__administrador_.ts")
public class VistaVideo_otro_usuario__administrador_ extends LitTemplate {

	@Id("scroller")
	private Scroller scroller;
	@Id("cabecera")
	private VistaCabecera__administrador_ cabecera;

	/**
     * Creates a new VistaVideo_otro_usuario__administrador_.
     */
    public VistaVideo_otro_usuario__administrador_() {
        // You can initialise any data required for the connected UI components here.
    }

}
