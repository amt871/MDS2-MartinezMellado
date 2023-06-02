package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Mi_cabecera;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-mi_perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mi_perfil")
@JsModule("./src/vista-mi_perfil.ts")
public class VistaMi_perfil extends LitTemplate {

	private Mi_cabecera cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("bConfigurar")
	private Button bConfigurar;
	@Id("idImagen")
	private Image idImagen;
	@Id("idUsuario")
	private Label idUsuario;
	@Id("idNumSeguidores")
	private Label idNumSeguidores;
	@Id("idNumMgs")
	private Label idNumMgs;

	/**
     * Creates a new VistaMi_perfil.
     */
    public VistaMi_perfil() {
        // You can initialise any data required for the connected UI components here.
    }

	public Mi_cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);;
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Button getbConfigurar() {
		return bConfigurar;
	}

	public void setbConfigurar(Button bConfigurar) {
		this.bConfigurar = bConfigurar;
	}

	public Image getIdImagen() {
		return idImagen;
	}

	public void setIdImagen(Image idImagen) {
		this.idImagen = idImagen;
	}

	public Label getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Label idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Label getIdNumSeguidores() {
		return idNumSeguidores;
	}

	public void setIdNumSeguidores(Label idNumSeguidores) {
		this.idNumSeguidores = idNumSeguidores;
	}

	public Label getIdNumMgs() {
		return idNumMgs;
	}

	public void setIdNumMgs(Label idNumMgs) {
		this.idNumMgs = idNumMgs;
	}

	
    
    
}
