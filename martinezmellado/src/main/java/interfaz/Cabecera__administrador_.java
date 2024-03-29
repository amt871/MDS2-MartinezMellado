package interfaz;

import java.util.ArrayList;

import basededatos.Administrador;
import basededatos.BDPrincipal;
import basededatos.Comentario;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaCabecera__administrador_;

public class Cabecera__administrador_ extends VistaCabecera__administrador_{
//	private ImageButton _cerrar_sesion__Administrador_;
//	private Button _inicioB;
//	private Button _busquedaB;
//	private Buttton _administrarB;
//	private Label _salirL;
//	public Administrador _administrador;
//	public Video_otro_usuario__administrador_ _video_otro_usuario__administrador_;
//	public Administrar _administrar;
//	public Busqueda__administrador_ _busqueda__administrador_;
//
//	public void video_otro_usuario__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void administrar() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void cerrar_sesion__Administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void busqueda__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//	
//	public Cabecera__administrador_() {
//		
//	}

	private MainView vl;
	private BDPrincipal datos;
	private Iniciar_sesion__administrador_ iniciarSesion;
	private Video_otro_usuario__administrador_ inicio;
	private Busqueda__administrador_ busqueda;
	private Administrar administrar;
	private Administrador administardor;
	private Ver_perfil__administrador_ perfil;
	private Vista_detalle__administrador_ detalle;
	private Busqueda_usuarios__administrador_ busquedaUsuarios;
	private Busqueda_hastag__administrador_ busquedaHashtag;
	private Publicaciones_asociadas_a_un_hastag hashtags;
	private ArrayList<Comentario> ComDenuVist = new ArrayList<Comentario>();
	private ArrayList<Publicacion> PubDenuVist = new ArrayList<Publicacion>();
	private ArrayList<Usuario_Registrado> UsrDenuVist = new ArrayList<Usuario_Registrado>();


	
	public Cabecera__administrador_(MainView vl, BDPrincipal datos,
			Iniciar_sesion__administrador_ iniciar_sesion__administrador_, Administrador administardor) {
		// TODO Auto-generated constructor stub
		this.vl = vl;
		this.datos = datos;
		this.iniciarSesion = iniciar_sesion__administrador_;
		this.administardor = administardor;
		
		this.getbInicio2().addClickListener(event ->{
			
			this.vl.removeAll();
			this.vl.add(this.inicio = new Video_otro_usuario__administrador_(this));
			
		});
		
		this.getbBusqueda2().addClickListener(event ->{
			
			this.vl.removeAll();
			this.vl.add(this.busqueda = new Busqueda__administrador_(this));
			
		});
		
		this.getbAdministrar2().addClickListener(event ->{
			
			this.vl.removeAll();
			this.vl.add(this.administrar = new Administrar(this));
			
		});
		
		this.getbSalir2().addClickListener(event ->{
			
			this.cerrarSesion();
			
		});
		
		this.getbInicio2().click();
	}
	
	public void cerrarSesion() {
		
		if(busqueda != null)
			busqueda.clear();
		
		this.inicio = null;
		this.busqueda = null;
//		this.administrar = null;
		
		this.vl.removeAll();
		this.vl.add(this.iniciarSesion);
		
		
		/*try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
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

	public Iniciar_sesion__administrador_ getIniciarSesion() {
		return iniciarSesion;
	}

	public void setIniciarSesion(Iniciar_sesion__administrador_ iniciarSesion) {
		this.iniciarSesion = iniciarSesion;
	}

	public Video_otro_usuario__administrador_ getInicio() {
		return inicio;
	}

	public void setInicio(Video_otro_usuario__administrador_ inicio) {
		this.inicio = inicio;
	}

	public Busqueda__administrador_ getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(Busqueda__administrador_ busqueda) {
		this.busqueda = busqueda;
	}

	public Administrar getAdministrar() {
		return administrar;
	}

	public void setAdministrar(Administrar administrar) {
		this.administrar = administrar;
	}

	public Administrador getAdministardor() {
		return administardor;
	}

	public void setAdministardor(Administrador administardor) {
		this.administardor = administardor;
	}

	public Ver_perfil__administrador_ getPerfil() {
		return perfil;
	}

	public void setPerfil(Ver_perfil__administrador_ perfil) {
		this.perfil = perfil;
	}

	public Vista_detalle__administrador_ getDetalle() {
		return detalle;
	}

	public void setDetalle(Vista_detalle__administrador_ detalle) {
		this.detalle = detalle;
	}

	public Busqueda_usuarios__administrador_ getBusquedaUsuarios() {
		return busquedaUsuarios;
	}

	public void setBusquedaUsuarios(Busqueda_usuarios__administrador_ busquedaUsuarios) {
		this.busquedaUsuarios = busquedaUsuarios;
	}

	public Busqueda_hastag__administrador_ getBusquedaHashtag() {
		return busquedaHashtag;
	}

	public void setBusquedaHashtag(Busqueda_hastag__administrador_ busquedaHashtag) {
		this.busquedaHashtag = busquedaHashtag;
	}

	public Publicaciones_asociadas_a_un_hastag getHashtags() {
		return hashtags;
	}

	public void setHashtags(Publicaciones_asociadas_a_un_hastag hashtags) {
		this.hashtags = hashtags;
	}

	public ArrayList<Comentario> getComDenuVist() {
		return ComDenuVist;
	}

	public void setComDenuVist(ArrayList<Comentario> comDenuVist) {
		ComDenuVist = comDenuVist;
	}

	public ArrayList<Publicacion> getPubDenuVist() {
		return PubDenuVist;
	}

	public void setPubDenuVist(ArrayList<Publicacion> pubDenuVist) {
		PubDenuVist = pubDenuVist;
	}

	public ArrayList<Usuario_Registrado> getUsrDenuVist() {
		return UsrDenuVist;
	}

	public void setUsrDenuVist(ArrayList<Usuario_Registrado> usrDenuVist) {
		UsrDenuVist = usrDenuVist;
	}
	
	
	
}