package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.template.Id;

import basededatos.Usuario_Registrado;
import interfaz.Mi_cabecera;

import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-notificaciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificaciones")
@JsModule("./src/vista-notificaciones.ts")
public class VistaNotificaciones extends LitTemplate {

	private Mi_cabecera cabecera;
    @Id("divCabecera")
	private Div divCabecera;
	@Id("scroller")
	private Scroller scroller;
	@Id("idTodas")
	private Button idTodas;
	@Id("idMenciones")
	private Button idMenciones;
	@Id("idSeguidores")
	private Button idSeguidores;
	@Id("idMeGusta")
	private Button idMeGusta;
	@Id("idComentarios")
	private Button idComentarios;

	private Usuario_Registrado usr;
	/**
     * Creates a new VistaNotificaciones.
     */
    public VistaNotificaciones() {
        // You can initialise any data required for the connected UI components here.
    }

	public Div getDivCabecera() {
		return divCabecera;
	}

	public void setDivCabecera(Div divCabecera) {
		this.divCabecera = divCabecera;
	}

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

	public Mi_cabecera getCabecera() {
		return cabecera;
	}

	public void setCabecera(Mi_cabecera cabecera) {
		this.cabecera = cabecera;
		getDivCabecera().add(cabecera);
	}

	public Button getIdTodas() {
		return idTodas;
	}

	public void setIdTodas(Button idTodas) {
		this.idTodas = idTodas;
	}

	public Button getIdMenciones() {
		return idMenciones;
	}

	public void setIdMenciones(Button idMenciones) {
		this.idMenciones = idMenciones;
	}

	public Button getIdSeguidores() {
		return idSeguidores;
	}

	public void setIdSeguidores(Button idSeguidores) {
		this.idSeguidores = idSeguidores;
	}

	public Button getIdMeGusta() {
		return idMeGusta;
	}

	public void setIdMeGusta(Button idMeGusta) {
		this.idMeGusta = idMeGusta;
	}

	public Button getIdComentarios() {
		return idComentarios;
	}

	public void setIdComentarios(Button idComentarios) {
		this.idComentarios = idComentarios;
	}

	public Usuario_Registrado getUsr() {
		return usr;
	}

	public void setUsr(Usuario_Registrado usr) {
		this.usr = usr;
	}

    
    
}
