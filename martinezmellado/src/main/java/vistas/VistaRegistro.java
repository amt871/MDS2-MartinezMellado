package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.checkbox.Checkbox;

/**
 * A Designer generated component for the vista-registro template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registro")
@JsModule("./src/vista-registro.ts")
public class VistaRegistro extends LitTemplate {

    @Id("bAtras")
	private Button bAtras;
	@Id("idNombre")
	private TextField idNombre;
	@Id("idApellidos")
	private TextField idApellidos;
	@Id("idUsuario")
	private TextField idUsuario;
	@Id("idContrasenna")
	private TextField idContrasenna;
	@Id("idCorreo")
	private TextField idCorreo;
	@Id("idFechaNacimiento")
	private TextField idFechaNacimiento;
	@Id("idDescripcion")
	private TextField idDescripcion;
	@Id("idImagen")
	private Upload idImagen;
	@Id("usrComBool")
	private Checkbox usrComBool;
	@Id("bRegistrar")
	private Button bRegistrar;

	/**
     * Creates a new VistaRegistro.
     */
    public VistaRegistro() {
        // You can initialise any data required for the connected UI components here.
    	this.getElement().setAttribute("style", "height: 100%; width: 100%");
    }

	public Button getbAtras() {
		return bAtras;
	}

	public void setbAtras(Button bAtras) {
		this.bAtras = bAtras;
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

	public TextField getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(TextField idUsuario) {
		this.idUsuario = idUsuario;
	}

	public TextField getIdContrasenna() {
		return idContrasenna;
	}

	public void setIdContrasenna(TextField idContrasenna) {
		this.idContrasenna = idContrasenna;
	}

	public TextField getIdCorreo() {
		return idCorreo;
	}

	public void setIdCorreo(TextField idCorreo) {
		this.idCorreo = idCorreo;
	}

	public TextField getIdFechaNacimiento() {
		return idFechaNacimiento;
	}

	public void setIdFechaNacimiento(TextField idFechaNacimiento) {
		this.idFechaNacimiento = idFechaNacimiento;
	}

	public TextField getIdDescripcion() {
		return idDescripcion;
	}

	public void setIdDescripcion(TextField idDescripcion) {
		this.idDescripcion = idDescripcion;
	}

	public Upload getIdImagen() {
		return idImagen;
	}

	public void setIdImagen(Upload idImagen) {
		this.idImagen = idImagen;
	}

	public Checkbox getUsrComBool() {
		return usrComBool;
	}

	public void setUsrComBool(Checkbox usrComBool) {
		this.usrComBool = usrComBool;
	}

	public Button getbRegistrar() {
		return bRegistrar;
	}

	public void setbRegistrar(Button bRegistrar) {
		this.bRegistrar = bRegistrar;
	}
    

}
