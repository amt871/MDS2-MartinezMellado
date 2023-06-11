package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.BDPrincipal;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaBuscar__usuario_registrado_;

public class Buscar__usuario_registrado_ extends VistaBuscar__usuario_registrado_ {
//	private TextField _buscadorTF;
//	private Button _buscarUsuarioB;
//	private Button _buscarHashTagB;
//	public Mi_cabecera _mi_cabecera;
//	public Buscar_usuario__usuario_registrado_ _buscar_usuario__usuario_registrado_;
//	public Buscar_hashtag__usuario_registrado_ _buscar_hashtag__usuario_registrado_;
//	public Usuario__usuario_registrado_ _unnamed_Usuario__usuario_registrado__;
//	public Usuario__usuario_registrado_ _unnamed_Usuario__usuario_registrado__2;
//
//	public void buscar_usuario__usuario_registrado_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void buscar_hashtag__usuario_registrado_() {
//		throw new UnsupportedOperationException();
//	}
	
	private Usuario_Registrado usuario;
	private BDPrincipal datos;
	private MainView vl;
	
	public Buscar__usuario_registrado_(MainView vl, Mi_cabecera mi_cabecera) {
		// TODO Auto-generated constructor stub
	//}

	//public void setUsuario(Usuario_Registrado user) {//Inicializar
		
		this.usuario = mi_cabecera.getUser();
		this.datos = mi_cabecera.getDatos();
		this.setCabecera(mi_cabecera);
		this.vl = vl;
		
		VerticalLayout vlUsuarios = new VerticalLayout();
		VerticalLayout vlVideos = new VerticalLayout();
		
		ArrayList<HorizontalLayout> array = new ArrayList<HorizontalLayout>();
		//ArrayList<VerticalLayout> verticales = new ArrayList<VerticalLayout>();
		
		Usuario_Registrado[] usuarios = datos.listarUltimosUsuarios(this.usuario.getID());
		
		this.getDivUsuarios().add(vlUsuarios);
		vlUsuarios.setHeight("100%");
		vlUsuarios.setWidth("100%");
		
		for(int i = 0; i<usuarios.length; i++) {
			
			if(this.usuario.seguido.contains(usuarios[i]))
				continue;
			if(/*i==0 || */i%4==0) {
				array.add(new HorizontalLayout());
				array.get(array.size()-1).setHeight("100%");
				array.get(array.size()-1).setWidth("100%");
				array.get(array.size()-1).getStyle().set("position", "relative");
				array.get(array.size()-1).setAlignItems(Alignment.CENTER);
				array.get(array.size()-1).setJustifyContentMode(JustifyContentMode.CENTER);
				vlUsuarios.add(array.get(array.size()-1));
			}
			
			array.get(array.size()-1).add(new Usuarionombreitem(usuarios[i].getFoto(), usuarios[i].getUsuario()));
			//System.out.println("annadido item");
			
		}
		
		/*ArrayList<Publicacion> videos = new ArrayList<Publicacion>();
		ArrayList<Usuario_Registrado> seguidos = new ArrayList<Usuario_Registrado>();
		
		List<Usuario_Registrado> aux = this.datos.listarSeguidos(this.usuario.getUsuario());
		
		if (aux != null) {
			for (Usuario_Registrado object : aux) {
				seguidos.add(object);
			}
			for (Usuario_Registrado usuario_Registrado : seguidos) {
				videos.addAll(Arrays.asList(this.datos.listarVideosUsuario(usuario_Registrado.getID())));
			}
			
		}*/
		
		
		
		this.getDivVideos().add(vlVideos);
		vlVideos.setHeight("100%");
		vlVideos.setWidth("100%");
		
	}
}