package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-ver_perfil__usuario_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_perfil__usuario_registrado_")
@JsModule("./src/vista-ver_perfil__usuario_registrado_.ts")
public class VistaVer_perfil__usuario_registrado_ extends LitTemplate {

    @Id("divCabecera")
	private Div divCabecera;
	@Id("seguirButton")
	private Button seguirButton;
	@Id("labelMegustas")
	private Label labelMegustas;
	@Id("image")
	private Image image;
	@Id("labelSeguidores")
	private Label labelSeguidores;
	@Id("labelUsuario")
	private Label labelUsuario;
	@Id("divVideos")
	private Div divVideos;
	@Id("Scroller")
	private Scroller scroller;
	@Id("bDenuncia")
	private Button bDenuncia;
	@Id("layoutSeguidores")
	private HorizontalLayout layoutSeguidores;
	/**
     * Creates a new VistaVer_perfil__usuario_registrado_.
     */
    public VistaVer_perfil__usuario_registrado_() {
        // You can initialise any data required for the connected UI components here.
    }

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Button getSeguirButton() {
		return seguirButton;
	}

	public void setSeguirButton(Button seguirButton) {
		this.seguirButton = seguirButton;
	}

	public Label getLabelMegustas() {
		return labelMegustas;
	}

	public void setLabelMegustas(Label labelMegustas) {
		this.labelMegustas = labelMegustas;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Label getLabelSeguidores() {
		return labelSeguidores;
	}

	public void setLabelSeguidores(Label labelSeguidores) {
		this.labelSeguidores = labelSeguidores;
	}

	public Label getLabelUsuario() {
		return labelUsuario;
	}

	public void setLabelUsuario(Label labelUsuario) {
		this.labelUsuario = labelUsuario;
	}

	public Div getDivVideos() {
		return divVideos;
	}

	public void setDivVideos(Div divVideos) {
		this.divVideos = divVideos;
	}

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

	public Button getbDenuncia() {
		return bDenuncia;
	}

	public void setbDenuncia(Button bDenuncia) {
		this.bDenuncia = bDenuncia;
	}

	public HorizontalLayout getLayoutSeguidores() {
		return layoutSeguidores;
	}

	public void setLayoutSeguidores(HorizontalLayout layoutSeguidores) {
		this.layoutSeguidores = layoutSeguidores;
	}
    
	

}
