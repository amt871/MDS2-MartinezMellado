package interfaz;

import java.util.ArrayList;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
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
	
	public void setUsuario(Usuario_Registrado user) {//Inicializar
		
		this.usuario = user;
		
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
			if(i==0 || i%4==0) {
				array.add(new HorizontalLayout());
				array.get(i).setHeight("100%");
				array.get(i).setWidth("100%");
				array.get(i).setAlignItems(Alignment.CENTER);
				array.get(i).setJustifyContentMode(JustifyContentMode.CENTER);
			}
			
			array.get(i).add(new Usuarionombreitem(usuarios[i].getFoto(), usuarios[i].getUsuario()));

			
		}
		
		
		
		
		this.getDivVideos().add(vlVideos);
		vlVideos.setHeight("100%");
		vlVideos.setWidth("100%");
		
	}
}