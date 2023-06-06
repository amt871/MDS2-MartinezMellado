package vistas;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.PasswordField;

import interfaz.Cabecera_comercial;
import interfaz.Mi_cabecera;

import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cambiar_contrasenna template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-cambiar_contrasenna")
@JsModule("./src/vista-cambiar_contrasenna.ts")
public class VistaCambiar_contrasenna extends LitTemplate {

	private Component cabecera;

	@Id("inPass")
	private PasswordField inPass;
	@Id("inPassRepeat")
	private PasswordField inPassRepeat;
	@Id("divCabecera")
	private Div divCabecera;

	@Id("bGuardar")
	private Button bGuardar;

	@Id("bCancelar")
	private Button bCancelar;

	/**
	 * Creates a new VistaCambiar_contrasenna.
	 */
	public VistaCambiar_contrasenna() {
		// You can initialise any data required for the connected UI components here.
	}

	public PasswordField getInPass() {
		return inPass;
	}

	public void setInPass(PasswordField inPass) {
		this.inPass = inPass;
	}

	public PasswordField getInPassRepeat() {
		return inPassRepeat;
	}

	public void setInPassRepeat(PasswordField inPassRepeat) {
		this.inPassRepeat = inPassRepeat;
	}

	public void setCabecera(Mi_cabecera cabecera) {

		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);
	}

	public void setCabecera(Cabecera_comercial cabeceraCom) {

		this.cabecera = cabeceraCom;
		getDivCabecera().add(cabeceraCom);
	}

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Button getbGuardar() {
		return bGuardar;
	}

	public void setbGuardar(Button bGuardar) {
		this.bGuardar = bGuardar;
	}

	public Component getCabecera() {
		return cabecera;
	}

	public void setCabecera(Component cabecera) {
		this.cabecera = cabecera;
	}

	public Button getbCancelar() {
		return bCancelar;
	}

	public void setbCancelar(Button bCancelar) {
		this.bCancelar = bCancelar;
	}

	
	
}
