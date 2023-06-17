package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-hashtag__usuario_registrado__item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-hashtag__usuario_registrado__item")
@JsModule("./src/vista-hashtag__usuario_registrado__item.ts")
public class VistaHashtag__usuario_registrado__item extends LitTemplate {

    @Id("bHashtag")
	private Button bHashtag;
	@Id("labelVideos")
	private Label labelVideos;

	/**
     * Creates a new VistaHashtag__usuario_registrado__item.
     */
    public VistaHashtag__usuario_registrado__item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getbHashtag() {
		return bHashtag;
	}

	public void setbHashtag(Button bHashtag) {
		this.bHashtag = bHashtag;
	}

	public Label getLabelVideos() {
		return labelVideos;
	}

	public void setLabelVideos(Label labelVideos) {
		this.labelVideos = labelVideos;
	}

    
    
}
