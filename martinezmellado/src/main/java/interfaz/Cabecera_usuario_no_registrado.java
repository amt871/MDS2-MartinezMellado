package interfaz;

import basededatos.BDPrincipal;
import proyectoMDS.MainView;
import vistas.VistaCabecera_usuario_no_registrado;

public class Cabecera_usuario_no_registrado extends VistaCabecera_usuario_no_registrado {

//	private Button _busquedaB;
//	private Button _iniciarSesionB;
//	private Button _inicioB;
//	private Button _registrarseB;
//	public Usuario_no_registrado _usuario_no_registrado;
//	public Inicio_no_registrado _inicio_no_registrado;
//	public Buscar__no_registrado_ _buscar__no_registrado_;
//	public Registro _registro;
//	public Iniciar_sesion _iniciar_sesion;
//
//	public void inicio_no_registrado() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void buscar__no_registrado_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void registro() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void iniciar_sesion() {
//		throw new UnsupportedOperationException();
//	}
	
	private MainView vl;
	private BDPrincipal datos;
	private Pantalla_inicio pantInicio;
	private Inicio_no_registrado inicio;
	private Buscar__no_registrado_ buscar;
	private Ver_perfil_privado__usuario_no_registrado_ perfilPrivado;
	private Ver_perfil__usuario_no_registrado_ perfilPublico;
	private Vista_detalle__no_registrado_ detalle;
	private Buscar_hashtag__no_registrado_ busquedaHashtag;
	private Buscar_usuario__no_registrado_ busquedaUsuarios;
	private Videos_hashtag__no_registrado_ hashtags;
	
	public Cabecera_usuario_no_registrado(MainView vlMain, BDPrincipal datos, Pantalla_inicio pantalla_inicio) {
		// TODO Auto-generated constructor stub
		
		this.vl = vlMain;
		this.datos = datos;
		this.pantInicio = pantalla_inicio;
		
		this.getbIniciarSesion().addClickListener(event ->{
			
			this.pantInicio.inicioSesion();
			
		});
		
		this.getbRegistrarse().addClickListener(event ->{
			
			this.pantInicio.registrarse();
			
		});
		
		this.getbInicio().addClickListener(event -> {
			
			this.vl.removeAll();
			this.vl.add(this.inicio = new Inicio_no_registrado(this));
			
		});
		
		this.getbBusqueda().addClickListener(event ->{
			
			this.vl.removeAll();
			this.vl.add(this.buscar = new Buscar__no_registrado_(this));
			
		});
	}

	public MainView getVl() {
		return vl;
	}

	public void setVl(MainView vl) {
		this.vl = vl;
	}

	public BDPrincipal getDatos() {
		return datos;
	}

	public void setDatos(BDPrincipal datos) {
		this.datos = datos;
	}

	public Pantalla_inicio getPantInicio() {
		return pantInicio;
	}

	public void setPantInicio(Pantalla_inicio pantInicio) {
		this.pantInicio = pantInicio;
	}

	public Inicio_no_registrado getInicio() {
		return inicio;
	}

	public void setInicio(Inicio_no_registrado inicio) {
		this.inicio = inicio;
	}

	public Buscar__no_registrado_ getBuscar() {
		return buscar;
	}

	public void setBuscar(Buscar__no_registrado_ buscar) {
		this.buscar = buscar;
	}

	public Ver_perfil_privado__usuario_no_registrado_ getPerfilPrivado() {
		return perfilPrivado;
	}

	public void setPerfilPrivado(Ver_perfil_privado__usuario_no_registrado_ perfilPrivado) {
		this.perfilPrivado = perfilPrivado;
	}

	public Ver_perfil__usuario_no_registrado_ getPerfilPublico() {
		return perfilPublico;
	}

	public void setPerfilPublico(Ver_perfil__usuario_no_registrado_ perfilPublico) {
		this.perfilPublico = perfilPublico;
	}

	public Vista_detalle__no_registrado_ getDetalle() {
		return detalle;
	}

	public void setDetalle(Vista_detalle__no_registrado_ detalle) {
		this.detalle = detalle;
	}

	public Buscar_hashtag__no_registrado_ getBusquedaHashtag() {
		return busquedaHashtag;
	}

	public void setBusquedaHashtag(Buscar_hashtag__no_registrado_ busquedaHashtag) {
		this.busquedaHashtag = busquedaHashtag;
	}

	public Buscar_usuario__no_registrado_ getBusquedaUsuarios() {
		return busquedaUsuarios;
	}

	public void setBusquedaUsuarios(Buscar_usuario__no_registrado_ busquedaUsuarios) {
		this.busquedaUsuarios = busquedaUsuarios;
	}

	public Videos_hashtag__no_registrado_ getHashtags() {
		return hashtags;
	}

	public void setHashtags(Videos_hashtag__no_registrado_ hashtags) {
		this.hashtags = hashtags;
	}
	
	
	
}