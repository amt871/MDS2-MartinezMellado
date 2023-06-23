package interfaz;

import java.io.File;
import java.io.IOException;

import org.apache.tomcat.util.http.fileupload.FileUtils;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaCabecera_comercial;

public class Cabecera_comercial extends VistaCabecera_comercial {
	
	private MainView vl;
	private BDPrincipal datos;
	private Usuario_Registrado user;
	private Pantalla_inicio pantInicio;
	private Perfil_comercial perfil;
	private Publicar publicar;
	private Configurar_perfil_comercial configPerfil;
	private Cambiar_contrasenna cambiarContra;
	private Vista_detalle__usuario_registrado_ detalle;

	public Cabecera_comercial(MainView vl, BDPrincipal datos, Usuario_Registrado user, Pantalla_inicio pantInicio) {
		// TODO Auto-generated constructor stub
		
		this.vl = vl;
		this.datos = datos;
		this.user = user;
		this.pantInicio = pantInicio;
		
		
		File file = new File("src/main/webapp/Usuarios/"+this.user.getUsuario()+"/tmp");
		
		if(file.exists()) {
			try {
				FileUtils.cleanDirectory(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			file.delete();
		}
		
		file = null;
		
		this.getbPerfil().addClickListener(event ->{
			
			this.vl.removeAll();
			this.vl.add(perfil = new Perfil_comercial(this));
			
		});
		
		this.getbPublicar().addClickListener(event ->{
			
			this.vl.removeAll();
			this.vl.add(publicar = new Publicar(this));
			
		});
		
		this.getbSalir().addClickListener(event ->{
			
			this.cerrarSesion();
			
		});
		
		/*this.pantInicio.clear();
		this.vl.removeAll();
		this.vl.add(perfil = new Perfil_comercial(this));*/
	}
	
	public void cerrarSesion() {
		
		this.perfil = null;
		this.user = null;
		this.configPerfil = null;
		this.cambiarContra = null;
		
		/*if(configPerf != null)
			configPerf.clear();
		
		if(busqueda != null)
			busqueda.clear();
		
		if(busquedaUsuarios != null)
			busquedaUsuarios.clear();
		
		this.pantallaInicio.clear();
		
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
		this.perfilPublico = null;
		this.perfilPrivado = null;
		this.cambiarContra = null;
		this.detalle = null;
		this.busquedaUsuarios = null;
		this.hashtags = null;*/
		
		this.vl.removeAll();
		this.vl.add(this.pantInicio);
		
		this.pantInicio.clear();
		
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

	public Pantalla_inicio getPantInicio() {
		return pantInicio;
	}

	public void setPantInicio(Pantalla_inicio pantInicio) {
		this.pantInicio = pantInicio;
	}

	public Perfil_comercial getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil_comercial perfil) {
		this.perfil = perfil;
	}

	public Publicar getPublicar() {
		return publicar;
	}

	public void setPublicar(Publicar publicar) {
		this.publicar = publicar;
	}

	public Configurar_perfil_comercial getConfigPerfil() {
		return configPerfil;
	}

	public void setConfigPerfil(Configurar_perfil_comercial configPerfil) {
		this.configPerfil = configPerfil;
	}

	public Cambiar_contrasenna getCambiarContra() {
		return cambiarContra;
	}

	public void setCambiarContra(Cambiar_contrasenna cambiarContra) {
		this.cambiarContra = cambiarContra;
	}

	public Vista_detalle__usuario_registrado_ getDetalle() {
		return detalle;
	}

	public void setDetalle(Vista_detalle__usuario_registrado_ detalle) {
		this.detalle = detalle;
	}
	
	

}