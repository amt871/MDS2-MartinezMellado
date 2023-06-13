package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

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
	@Id("buttonUsuario")
	private Button buttonUsuario;
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

	public Button getButtonUsuario() {
		return buttonUsuario;
	}

	public void setButtonUsuario(Button buttonUsuario) {
		this.buttonUsuario = buttonUsuario;
	}


}
