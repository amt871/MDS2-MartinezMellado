package interfaz;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaMi_cabecera;

public class Mi_cabecera extends VistaMi_cabecera {
	
	private MainView vl;
	private BDPrincipal datos;
	private Usuario_Registrado user;
	private Video_otro_usuario pantallaInicio;
	private Buscar__usuario_registrado_ busqueda;
	private Mi_perfil perfil;
	private Configurar config;
	private Configurar_mi_perfil configPerf;
	private Ver_mis_seguidores seguidores;// = new Ver_mis_seguidores();
	private Ver_siguiendo siguiendo;// = new Ver_siguiendo();
	private Notificaciones notis;
	private Publicar publicar;
	private Pantalla_inicio pInicio;

	public Mi_cabecera(MainView vl, BDPrincipal datos, Usuario_Registrado user, Pantalla_inicio pInicio/*, Iniciar_sesion iniciar_sesion*/) {
		// TODO Auto-generated constructor stub
		
		this.vl = vl;
		this.datos = datos;
		this.user = user;
		this.pInicio = pInicio;
		//iniciar_sesion = null;
		
		this.getbInicio().addClickListener(event -> {
			
			
			this.vl.removeAll();
			this.vl.add(pantallaInicio = new Video_otro_usuario(this.vl, this));
			
			
		});
		
		this.getbBusqueda().addClickListener(event ->{
			
			this.vl.removeAll();
			this.vl.add(busqueda = new Buscar__usuario_registrado_(this.vl, this));
			
		});
		
		this.getbPerfil().addClickListener(event -> {
			
			this.vl.removeAll();
			this.vl.add(perfil = new Mi_perfil(this.vl, this));
			
		});
		
		this.getbNotis().addClickListener(event -> {
			
			this.vl.removeAll();
			this.vl.add(notis = new Notificaciones(this.vl, this));
			
		});
		
		this.getbPublicar().addClickListener(event -> {
			
			this.vl.removeAll();
			this.vl.add(publicar = new Publicar(this.vl, this));
			
		});
		

		//this.vl.removeAll();
		//this.vl.add(pantallaInicio = new Video_otro_usuario(this.vl, this));
		
	}
	
	
	public void cerrarSesion() {
	
		this.user = null;
		this.pantallaInicio = null;
		this.busqueda = null;
		this.perfil = null;
		this.config = null;
		this.configPerf = null;
		this.seguidores = null;
		this.siguiendo = null;
		this.notis = null;
		this.publicar = null;
		
		this.vl.removeAll();
		this.vl.add(this.pInicio);
		
		this.pInicio.clear();
		
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

	public Usuario_Registrado getUser() {
		return user;
	}

	public void setUser(Usuario_Registrado user) {
		this.user = user;
	}

	public Video_otro_usuario getPantallaInicio() {
		return pantallaInicio;
	}

	public void setPantallaInicio(Video_otro_usuario pantallaInicio) {
		this.pantallaInicio = pantallaInicio;
	}

	public Buscar__usuario_registrado_ getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(Buscar__usuario_registrado_ busqueda) {
		this.busqueda = busqueda;
	}

	public Mi_perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Mi_perfil perfil) {
		this.perfil = perfil;
	}

	public Configurar getConfig() {
		return config;
	}

	public void setConfig(Configurar config) {
		this.config = config;
	}

	public Configurar_mi_perfil getConfigPerf() {
		return configPerf;
	}

	public void setConfigPerf(Configurar_mi_perfil configPerf) {
		this.configPerf = configPerf;
	}

	public Ver_mis_seguidores getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(Ver_mis_seguidores seguidores) {
		this.seguidores = seguidores;
	}

	public Ver_siguiendo getSiguiendo() {
		return siguiendo;
	}

	public void setSiguiendo(Ver_siguiendo siguiendo) {
		this.siguiendo = siguiendo;
	}
	
	
}