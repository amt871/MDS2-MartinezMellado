package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera_usuario_no_registrado;
import interfaz.Mi_cabecera;

import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the vista-ver_seguidores_otro_usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_seguidores_otro_usuario")
@JsModule("./src/vista-ver_seguidores_otro_usuario.ts")
public class VistaVer_seguidores_otro_usuario extends LitTemplate {

	private Mi_cabecera cabeceraReg;
	private Cabecera_usuario_no_registrado cabeceraNoReg;
    @Id("image")
	private Image image;
	@Id("scroller")
	private Scroller scroller;
	@Id("divCabecera")
	private Div divCabecera;

	/**
     * Creates a new VistaVer_seguidores_otro_usuario.
     */
    public VistaVer_seguidores_otro_usuario() {
        // You can initialise any data required for the connected UI components here.
    }

	public Mi_cabecera getCabeceraReg() {
		return cabeceraReg;
	}

	public void setCabeceraReg(Mi_cabecera cabeceraReg) {
		this.cabeceraReg = cabeceraReg;
		this.getDivCabecera().add(cabeceraReg);
	}

	public Cabecera_usuario_no_registrado getCabeceraNoReg() {
		return cabeceraNoReg;
	}

	public void setCabeceraNoReg(Cabecera_usuario_no_registrado cabeceraNoReg) {
		this.cabeceraNoReg = cabeceraNoReg;
		this.getDivCabecera().add(cabeceraNoReg);
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}
    
    

}
