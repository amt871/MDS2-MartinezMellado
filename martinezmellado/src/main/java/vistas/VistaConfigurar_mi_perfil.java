package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import interfaz.Configurar;
import interfaz.Mi_cabecera;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-configurar_mi_perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-configurar_mi_perfil")
@JsModule("./src/vista-configurar_mi_perfil.ts")
public class VistaConfigurar_mi_perfil extends LitTemplate {

	private Configurar config;
	private Mi_cabecera cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("divConfigurar")
	private Div divConfigurar;
	@Id("idImagen")
	private Image idImagen;
	@Id("idUsuario")
	private TextField idUsuario;
	@Id("idNombre")
	private TextField idNombre;
	@Id("idApellidos")
	private TextField idApellidos;
	@Id("idFechaDeNaciemiento")
	private TextField idFechaDeNaciemiento;
	@Id("idCorreoElectronico")
	private TextField idCorreoElectronico;
	@Id("idDescripcion")
	private TextField idDescripcion;
	@Id("idNotis")
	private Element idNotis;
	@Id("idBGuardar")
	private Button idBGuardar;
	@Id("bCambiarContrasenna")
	private Button bCambiarContrasenna;
	/**
     * Creates a new VistaConfigurar_mi_perfil.
     */
    public VistaConfigurar_mi_perfil() {
        // You can initialise any data required for the connected UI components here.
    }

	public Configurar getConfig() {
		return config;
	}

	public void setConfig(Configurar config) {
		this.config = config;
		getDivConfigurar().add(config);
	}

	public Mi_cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Div getDivConfigurar() {
		return divConfigurar;
	}

	public void setDivConfigurar(Div divConfigurar) {
		this.divConfigurar = divConfigurar;
	}

	public Image getIdImagen() {
		return idImagen;
	}

	public void setIdImagen(Image idImagen) {
		this.idImagen = idImagen;
	}

	public TextField getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(TextField idUsuario) {
		this.idUsuario = idUsuario;
	}

	public TextField getIdNombre() {
		return idNombre;
	}

	public void setIdNombre(TextField idNombre) {
		this.idNombre = idNombre;
	}

	public TextField getIdApellidos() {
		return idApellidos;
	}

	public void setIdApellidos(TextField idApellidos) {
		this.idApellidos = idApellidos;
	}

	public TextField getIdFechaDeNaciemiento() {
		return idFechaDeNaciemiento;
	}

	public void setIdFechaDeNaciemiento(TextField idFechaDeNaciemiento) {
		this.idFechaDeNaciemiento = idFechaDeNaciemiento;
	}

	public TextField getIdCorreoElectronico() {
		return idCorreoElectronico;
	}

	public void setIdCorreoElectronico(TextField idCorreoElectronico) {
		this.idCorreoElectronico = idCorreoElectronico;
	}

	public TextField getIdDescripcion() {
		return idDescripcion;
	}

	public void setIdDescripcion(TextField idDescripcion) {
		this.idDescripcion = idDescripcion;
	}

	public Element getIdNotis() {
		return idNotis;
	}

	public void setIdNotis(Element idNotis) {
		this.idNotis = idNotis;
	}

	public Button getIdBGuardar() {
		return idBGuardar;
	}

	public void setIdBGuardar(Button idBGuardar) {
		this.idBGuardar = idBGuardar;
	}

	public Button getbCambiarContrasenna() {
		return bCambiarContrasenna;
	}

	public void setbCambiarContrasenna(Button bCambiarContrasenna) {
		this.bCambiarContrasenna = bCambiarContrasenna;
	}
    
    

}
