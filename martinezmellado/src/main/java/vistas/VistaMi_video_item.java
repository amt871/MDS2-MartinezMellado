package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;

import interfaz.Video;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-mi_video_item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mi_video_item")
@JsModule("./src/vista-mi_video_item.ts")
public class VistaMi_video_item extends LitTemplate {

	@Id("layoutVideo")
	private VerticalLayout layoutVideo;
	@Id("button")
	private Button button;
	@Id("labelDescripcion")
	private Label labelDescripcion;

	/**
     * Creates a new VistaMi_video_item.
     */
    public VistaMi_video_item() {
        // You can initialise any data required for the connected UI components here.
    }

	/*public Label getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(Label labelTitulo) {
		this.labelTitulo = labelTitulo;
	}*/

	public VerticalLayout getLayoutVideo() {
		return layoutVideo;
	}

	public void setLayoutVideo(VerticalLayout layoutVideo) {
		this.layoutVideo = layoutVideo;
	}

	public void setData(String src, String altura, String anchura) {
		this.layoutVideo.add(new Video(src, altura, anchura));
		//this.labelTitulo.setText(titulo);
	}

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public Label getLabelDescripcion() {
		return labelDescripcion;
	}

	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}
	
	
    
}
