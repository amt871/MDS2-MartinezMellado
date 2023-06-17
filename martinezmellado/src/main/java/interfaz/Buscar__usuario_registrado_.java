package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
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
	private VerticalLayout vlUsuarios;
	private VerticalLayout vlVideos;
	private ArrayList<HorizontalLayout> array;
	private Usuario_Registrado[] usuarios;
	private Publicacion[] publicaciones;

	public Buscar__usuario_registrado_(MainView vl, Mi_cabecera mi_cabecera) {
		// TODO Auto-generated constructor stub
		// }

		// public void setUsuario(Usuario_Registrado user) {//Inicializar

		this.datos = mi_cabecera.getDatos();
		this.usuario = this.datos.cargarDatosUsuario(mi_cabecera.getUser().getUsuario());
		this.setCabecera(mi_cabecera);
		this.vl = vl;

		this.vlUsuarios = new VerticalLayout();
		this.vlVideos = new VerticalLayout();

		this.array = new ArrayList<HorizontalLayout>();
		// ArrayList<VerticalLayout> verticales = new ArrayList<VerticalLayout>();

		this.usuarios = datos.listarUltimosUsuarios(this.usuario.getID());

		this.getDivUsuarios().add(vlUsuarios);
		vlUsuarios.setHeight("100%");
		vlUsuarios.setWidth("100%");

		int cont = 0;
		for (int i = 0; i < usuarios.length && cont < 8; i++) {
			boolean salir = false;
			for (Usuario_Registrado seguido : this.usuario.seguido.toArray()) {
				if (seguido.getUsuario().equals(usuarios[i].getUsuario())) {
					salir = true;
				}
			}
			if (salir)
				continue;
			if (/* i==0 || */cont % 4 == 0) {
				//System.out.println("despues");
				array.add(new HorizontalLayout());
				array.get(array.size() - 1).setHeight("100%");
				array.get(array.size() - 1).setWidth("100%");
				array.get(array.size() - 1).getStyle().set("position", "relative");
				array.get(array.size() - 1).setAlignItems(Alignment.CENTER);
				array.get(array.size() - 1).setJustifyContentMode(JustifyContentMode.CENTER);
				vlUsuarios.add(array.get(array.size() - 1));
			}
			array.get(array.size() - 1).add(new Usuarionombreitem(usuarios[i], this.getCabecera(), this.usuario, this));
			cont++;
			// System.out.println("annadido item");

		}

		if (vlUsuarios.getComponentCount() == 0) {
			vlUsuarios.setAlignItems(Alignment.CENTER);
			vlUsuarios.setJustifyContentMode(JustifyContentMode.CENTER);
			vlUsuarios.add(new Label("Usted sigue a todos los usuarios"));
		}

		// this.getDivItem1().add(new
		// Video("Usuarios\\Juanra1997\\videos\\2023-06-05T23-00-09.914853900.mp4"));

		this.publicaciones = this.datos.listarUltimasPublicacions(this.usuario.getID());

		this.getDivVideos().add(vlVideos);
		vlVideos.setHeight("100%");
		vlVideos.setWidth("100%");

		cont = 0;

		// System.out.println(this.publicaciones == null);

		for (int i = 0; i < publicaciones.length && cont < 8; i++) {

			boolean seguido = false;
			for (Usuario_Registrado usrSeguido : this.usuario.seguido.toArray()) {
				if (publicaciones[i].getRealizada().getUsuario().equals(usrSeguido.getUsuario())){
					seguido = true;
				}
			}
			if (seguido || publicaciones[i].getRealizada().getPrivado())
				continue;
			if (/* i==0 || */cont % 4 == 0) {
				array.add(new HorizontalLayout());
				array.get(array.size() - 1).setHeight("100%");
				array.get(array.size() - 1).setWidth("100%");
				array.get(array.size() - 1).getStyle().set("position", "relative");
				array.get(array.size() - 1).setAlignItems(Alignment.CENTER);
				array.get(array.size() - 1).setJustifyContentMode(JustifyContentMode.CENTER);
				vlVideos.add(array.get(array.size() - 1));
			}
			if (array.size() == 0)
				break;
			array.get(array.size() - 1).add(new Videousuarioitem(publicaciones[i].getRealizada(),
					new Video(publicaciones[i].getVideo().replace("src/main/webapp/", "")), this.getCabecera(), this));
			cont++;
			// System.out.println("annadido item");
			// System.out.println(vlVideos.getComponentCount());
		}

		if (vlVideos.getComponentCount() == 0) {
			vlVideos.setAlignItems(Alignment.CENTER);
			vlVideos.setJustifyContentMode(JustifyContentMode.CENTER);
			vlVideos.add(new Label("Ningun usuario publico a subido un video recientemente"));
		}

		/*
		 * AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
		 * 
		 * 
		 * if (array.size() == 0) break;
		 * 
		 * if(cont == 0) { this.getDivVideo1().add(new
		 * Videousuarioitem(publicaciones[i].getRealizada(), new
		 * Video(publicaciones[i].getVideo().replace("src/main/webapp/", "")))); }
		 * 
		 * if(cont == 1) { this.getDivVideo2().add(new
		 * Videousuarioitem(publicaciones[i].getRealizada(), new
		 * Video(publicaciones[i].getVideo().replace("src/main/webapp/", "")))); }
		 * 
		 * if(cont == 2) { this.getDivVideo3().add(new
		 * Videousuarioitem(publicaciones[i].getRealizada(), new
		 * Video(publicaciones[i].getVideo().replace("src/main/webapp/", "")))); }
		 * 
		 * if(cont == 3) { this.getDivVideo4().add(new
		 * Videousuarioitem(publicaciones[i].getRealizada(), new
		 * Video(publicaciones[i].getVideo().replace("src/main/webapp/", "")))); }
		 * 
		 * if(cont == 4) { this.getDivVideo5().add(new
		 * Videousuarioitem(publicaciones[i].getRealizada(), new
		 * Video(publicaciones[i].getVideo().replace("src/main/webapp/", "")))); }
		 * 
		 * if(cont == 5) { this.getDivVideo6().add(new
		 * Videousuarioitem(publicaciones[i].getRealizada(), new
		 * Video(publicaciones[i].getVideo().replace("src/main/webapp/", "")))); }
		 * 
		 * if(cont == 6) { this.getDivVideo7().add(new
		 * Videousuarioitem(publicaciones[i].getRealizada(), new
		 * Video(publicaciones[i].getVideo().replace("src/main/webapp/", "")))); }
		 * 
		 * if(cont == 7) { this.getDivVideo8().add(new
		 * Videousuarioitem(publicaciones[i].getRealizada(), new
		 * Video(publicaciones[i].getVideo().replace("src/main/webapp/", "")))); }
		 * 
		 * cont++; //System.out.println("annadido item");
		 * 
		 * }
		 * 
		 */

		/*
		 * ArrayList<Publicacion> videos = new ArrayList<Publicacion>();
		 * ArrayList<Usuario_Registrado> seguidos = new ArrayList<Usuario_Registrado>();
		 * 
		 * List<Usuario_Registrado> aux =
		 * this.datos.listarSeguidos(this.usuario.getUsuario());
		 * 
		 * if (aux != null) { for (Usuario_Registrado object : aux) {
		 * seguidos.add(object); } for (Usuario_Registrado usuario_Registrado :
		 * seguidos) {
		 * videos.addAll(Arrays.asList(this.datos.listarVideosUsuario(usuario_Registrado
		 * .getID()))); }
		 * 
		 * }
		 */

		this.getDivVideos().add(vlVideos);
		vlVideos.setHeight("100%");
		vlVideos.setWidth("100%");
		
		this.getbUsuario().addClickListener(event -> {
			
			if(this.getInTextField().isEmpty()) {
				Notification.show("Ningun usuario introducido");
				return;
			}
			
			this.getCabecera().getVl().removeAll();
			this.getCabecera().setBusquedaUsuarios(new Buscar_usuario__usuario_registrado_(this.getCabecera(),this.getInTextField().getValue()));
			this.getCabecera().getVl().add(this.getCabecera().getBusquedaUsuarios());
			
		});
		
		this.getbHashtag().addClickListener(event -> {
			
			if(this.getInTextField().isEmpty()) {
				Notification.show("Ningun hashtag introducido");
				return;
			}
			
			this.getCabecera().getVl().removeAll();
			this.getCabecera().setBusquedaHashtag(new Buscar_hashtag__usuario_registrado_(this.getCabecera(),this.getInTextField().getValue()));
			this.getCabecera().getVl().add(this.getCabecera().getBusquedaHashtag());
			
		});
		
	}

	public void clear() {

		this.vlUsuarios = null;
		this.vlVideos = null;
		if (array != null)
			this.array.clear();
		this.array = null;
		this.usuarios = null;
		this.publicaciones = null;

	}

}