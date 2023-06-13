package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-videousuarioitem template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-videousuarioitem")
@JsModule("./src/vista-videousuarioitem.ts")
public class VistaVideousuarioitem extends LitTemplate {

    @Id("divVideo")
	private HorizontalLayout divVideo;
	@Id("labelUsuario")
	private Label labelUsuario;

	/**
     * Creates a new VistaVideousuarioitem.
     */
    public VistaVideousuarioitem() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getDivVideo() {
		return divVideo;
	}

	public void setDivVideo(HorizontalLayout divVideo) {
		this.divVideo = divVideo;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

    
    
}
