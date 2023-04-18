package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaCabecera__administrador_;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-video_otro_usuario__administrador_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-video_otro_usuario__administrador_")
@JsModule("./src/vista-video_otro_usuario__administrador_.ts")
public class VistaVideo_otro_usuario__administrador_ extends LitTemplate {


	@Id("VerticalContainer")
	private VerticalLayout verticalContainer;

	/**
     * Creates a new VistaVideo_otro_usuario__administrador_.
     */
    public VistaVideo_otro_usuario__administrador_() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "heigth: 100%; width: 100%");
    }

	public VerticalLayout getVerticalContainer() {
		return verticalContainer;
	}

	public void setVerticalContainer(VerticalLayout verticalContainer) {
		this.verticalContainer = verticalContainer;
	}
    

    
}
