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

	public Mi_cabecera(MainView vl, BDPrincipal datos, Usuario_Registrado user) {
		// TODO Auto-generated constructor stub
		
		this.vl = vl;
		this.datos = datos;
		this.user = user;
		
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
			this.vl.add(new Notificaciones(this.vl, this));
			
		});
		
		this.getbPublicar().addClickListener(event -> {
			
			this.vl.removeAll();
			this.vl.add(new Publicar(this.vl, this));
			
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
	
	
}