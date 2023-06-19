package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Cabecera_comercial;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-configurar_perfil_comercial template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-configurar_perfil_comercial")
@JsModule("./src/vista-configurar_perfil_comercial.ts")
public class VistaConfigurar_perfil_comercial extends LitTemplate {

	private Cabecera_comercial cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("bCambiar")
	private Button bCambiar;
	@Id("bCambioContra")
	private Button bCambioContra;
	@Id("bGuardar")
	private Button bGuardar;
	@Id("tfUsuario")
	private TextField tfUsuario;
	@Id("tfNombre")
	private TextField tfNombre;
	@Id("tfFechaNac")
	private TextField tfFechaNac;
	@Id("tfCorreo")
	private TextField tfCorreo;
	@Id("tfDescripcion")
	private TextField tfDescripcion;
	@Id("uploader")
	private Upload uploader;
	@Id("imagen")
	private Image imagen;

	/**
     * Creates a new VistaConfigurar_perfil_comercial.
     */
    public VistaConfigurar_perfil_comercial() {
        // You can initialise any data required for the connected UI components here.
    }

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Button getbCambiar() {
		return bCambiar;
	}

	public void setbCambiar(Button bCambiar) {
		this.bCambiar = bCambiar;
	}

	public Button getbCambioContra() {
		return bCambioContra;
	}

	public void setbCambioContra(Button bCambioContra) {
		this.bCambioContra = bCambioContra;
	}

	public Button getbGuardar() {
		return bGuardar;
	}

	public void setbGuardar(Button bGuardar) {
		this.bGuardar = bGuardar;
	}

	public Cabecera_comercial getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera_comercial cabecera) {
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);
	}

	public TextField getTfUsuario() {
		return tfUsuario;
	}

	public void setTfUsuario(TextField tfUsuario) {
		this.tfUsuario = tfUsuario;
	}

	public TextField getTfNombre() {
		return tfNombre;
	}

	public void setTfNombre(TextField tfNombre) {
		this.tfNombre = tfNombre;
	}

	public TextField getTfFechaNac() {
		return tfFechaNac;
	}

	public void setTfFechaNac(TextField tfFechaNac) {
		this.tfFechaNac = tfFechaNac;
	}

	public TextField getTfCorreo() {
		return tfCorreo;
	}

	public void setTfCorreo(TextField tfCorreo) {
		this.tfCorreo = tfCorreo;
	}

	public TextField getTfDescripcion() {
		return tfDescripcion;
	}

	public void setTfDescripcion(TextField tfDescripcion) {
		this.tfDescripcion = tfDescripcion;
	}

	public Upload getUploader() {
		return uploader;
	}

	public void setUploader(Upload uploader) {
		this.uploader = uploader;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

    
    
}
