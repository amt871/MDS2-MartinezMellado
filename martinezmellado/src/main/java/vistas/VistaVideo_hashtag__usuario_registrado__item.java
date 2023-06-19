package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-video_hashtag__usuario_registrado__item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-video_hashtag__usuario_registrado__item")
@JsModule("./src/vista-video_hashtag__usuario_registrado__item.ts")
public class VistaVideo_hashtag__usuario_registrado__item extends LitTemplate {

    @Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("layoutVideo")
	private HorizontalLayout layoutVideo;

	/**
     * Creates a new VistaVideo_hashtag__usuario_registrado__item.
     */
    public VistaVideo_hashtag__usuario_registrado__item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Label getLabelDescripcion() {
		return labelDescripcion;
	}

	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}

	public HorizontalLayout getLayoutVideo() {
		return layoutVideo;
	}

	public void setLayoutVideo(HorizontalLayout layoutVideo) {
		this.layoutVideo = layoutVideo;
	}
    
    

}
