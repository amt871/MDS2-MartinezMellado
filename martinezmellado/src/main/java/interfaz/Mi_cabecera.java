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
	
	
}