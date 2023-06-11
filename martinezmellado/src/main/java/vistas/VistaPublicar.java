package vistas;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera_comercial;
import interfaz.Mi_cabecera;
import com.vaadin.flow.dom.Element;

import basededatos.Usuario_Registrado;

import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-publicar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-publicar")
@JsModule("./src/vista-publicar.ts")
public class VistaPublicar extends LitTemplate {

	private Component cabecera;
	//private Cabecera_comercial cabeceraCom;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("uploader")
	private Upload uploader;
	@Id("ubicacion")
	private TextField ubicacion;
	@Id("descrpcion")
	private TextArea descrpcion;
	@Id("subirVideo")
	private Button subirVideo;
	@Id("prevVideo")
	private Image prevVideo;
	
	private Usuario_Registrado usr;
	@Id("imguser")
	private Image imguser;

	/**
     * Creates a new VistaPublicar.
     */
    public VistaPublicar() {
        // You can initialise any data required for the connected UI components here.
    }

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Mi_cabecera getCabecera() {
		return (Mi_cabecera) cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);
	}

	public Cabecera_comercial getCabeceraCom() {
		return (Cabecera_comercial) cabecera;
	}

	public void setCabecera(Cabecera_comercial cabeceraCom) {
		
		this.cabecera = cabeceraCom;
		getDivCabecera().add(cabeceraCom);
	}

	public Image getImguser() {
		return imguser;
	}

	public void setImguser(Image imguser) {
		this.imguser = imguser;
	}

	public Upload getUploader() {
		return uploader;
	}

	public void setUploader(Upload uploader) {
		this.uploader = uploader;
	}

	public Button getSubirVideo() {
		return subirVideo;
	}

	public void setSubirVideo(Button subirVideo) {
		this.subirVideo = subirVideo;
	}

	public Image getPrevVideo() {
		return prevVideo;
	}

	public void setPrevVideo(Image prevVideo) {
		this.prevVideo = prevVideo;
	}
    
	public void setUsr(Usuario_Registrado usr) {
		this.usr = usr;
	}
	
	public Usuario_Registrado getUsr() {
		return this.usr;
	}

	public TextField getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(TextField ubicacion) {
		this.ubicacion = ubicacion;
	}

	public TextArea getDescrpcion() {
		return descrpcion;
	}

	public void setDescrpcion(TextArea descrpcion) {
		this.descrpcion = descrpcion;
	}
    

}
