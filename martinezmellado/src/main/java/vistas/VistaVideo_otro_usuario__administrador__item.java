package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-video_otro_usuario__administrador__item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-video_otro_usuario__administrador__item")
@JsModule("./src/vista-video_otro_usuario__administrador__item.ts")
public class VistaVideo_otro_usuario__administrador__item extends LitTemplate {

    @Id("bDenunciar")
	private Button bDenunciar;
	@Id("labelNumMg")
	private Label labelNumMg;
	@Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("labelFecha")
	private Label labelFecha;
	@Id("labelUsuario")
	private Label labelUsuario;
	@Id("labelUbi")
	private Label labelUbi;
	@Id("imgUsuario")
	private Image imgUsuario;
	@Id("video")
	private Image video;

	/**
     * Creates a new VistaVideo_otro_usuario__administrador__item.
     */
    public VistaVideo_otro_usuario__administrador__item() {
        // You can initialise any data required for the connected UI components here.
    }

}
