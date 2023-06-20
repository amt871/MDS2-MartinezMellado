package interfaz;

import java.util.ArrayList;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.BoxSizing;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaBuscar__no_registrado_;

public class Buscar__no_registrado_ extends VistaBuscar__no_registrado_ {

//	private TextField _buscadorTF;
//	private Button _buscarUsuarioB;
//	private Button _buscarHashTagB;
//	private Label _videosUsuariosL;
//	private Label _videosRelacionadosHashtagL;
//	public Cabecera_usuario_no_registrado _cabecera_usuario_no_registrado;
//	public Buscar_usuario__no_registrado_ _buscar_usuario__no_registrado_;
//	public Buscar_hashtag__no_registrado_ _buscar_hashtag__no_registrado_;
//	public Videos_hashtag__no_registrado__item _unnamed_Videos_hashtag__no_registrado__item_;
//	public Usuario__no_registrado_ _unnamed_Usuario__no_registrado__;
//
//	public void buscar_usuario__no_registrado_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void buscar_hashtag__no_registrado_() {
//		throw new UnsupportedOperationException();
//	}
	private Cabecera_usuario_no_registrado cabecera;
	
	private VerticalLayout vlUsuarios;
	private VerticalLayout vlVideos;
	private ArrayList<HorizontalLayout> array;
	private Usuario_Registrado[] usuarios;
	private Publicacion[] publicaciones;
	
	public Buscar__no_registrado_(Cabecera_usuario_no_registrado cabecera_usuario_no_registrado) {
		// TODO Auto-generated constructor stub
		this.cabecera = cabecera_usuario_no_registrado;
		this.setCabecera(cabecera_usuario_no_registrado);
		
		this.vlUsuarios = new VerticalLayout();
		this.vlVideos = new VerticalLayout();

		this.array = new ArrayList<HorizontalLayout>();
		// ArrayList<VerticalLayout> verticales = new ArrayList<VerticalLayout>();

		this.usuarios = this.cabecera.getDatos().listarTodosUsuarios();

		this.getDivUsuarios().add(vlUsuarios);
		vlUsuarios.setHeight("100%");
		vlUsuarios.setWidth("100%");

		int cont = 0;
		for (int i = 0; i < usuarios.length && cont < 8; i++) {
			
			/*if (usuarios[i].getComercial().equalsIgnoreCase("comercial"));
				continue;*/
				
			if (cont % 4 == 0) {
				//System.out.println("despues");
				array.add(new HorizontalLayout());
				array.get(array.size() - 1).setHeight("100%");
				array.get(array.size() - 1).setWidth("100%");
				array.get(array.size() - 1).getStyle().set("position", "relative");
				array.get(array.size() - 1).setAlignItems(Alignment.CENTER);
				array.get(array.size() - 1).setJustifyContentMode(JustifyContentMode.CENTER);
				array.get(array.size() - 1).setBoxSizing(BoxSizing.BORDER_BOX);
				vlUsuarios.add(array.get(array.size() - 1));
			}
			array.get(array.size() - 1).add(new Usuarionombreitem(usuarios[i], this.getCabecera(), this));
			cont++;
			// System.out.println("annadido item")
		}

		if (vlUsuarios.getComponentCount() == 0) {
			vlUsuarios.setAlignItems(Alignment.CENTER);
			vlUsuarios.setJustifyContentMode(JustifyContentMode.CENTER);
			vlUsuarios.add(new Label("Usted sigue a todos los usuarios"));
		}

		// this.getDivItem1().add(new
		// Video("Usuarios\\Juanra1997\\videos\\2023-06-05T23-00-09.914853900.mp4"));

		this.publicaciones = cabecera.getDatos().listarTodasPublicaciones();
		

		//this.getDivVideos().add(vlVideos);
		vlVideos.setHeight("100%");
		vlVideos.setWidth("100%");

		cont = 0;

		// System.out.println(this.publicaciones == null);

		for (int i = 0; i < publicaciones.length && cont < 8; i++) {

			
			if (publicaciones[i].getRealizada().getPrivado())
				continue;
			if (cont % 4 == 0) {
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
			// System.out.println(vlVideos.getComponentCount());}
		}

		if (vlVideos.getComponentCount() == 0) {
			vlVideos.setAlignItems(Alignment.CENTER);
			vlVideos.setJustifyContentMode(JustifyContentMode.CENTER);
			vlVideos.add(new Label("Ningun usuario publico a subido un video recientemente"));
		}


		this.getDivVideos().add(vlVideos);
		vlVideos.setHeight("100%");
		vlVideos.setWidth("100%");
		/*
		this.getbBuscarUsuario().addClickListener(event -> {
			
			if(this.getInTextField().isEmpty()) {
				Notification.show("Ningun usuario introducido");
				return;
			}
			
			this.getCabecera().getVl().removeAll();
			this.getCabecera().setBusquedaUsuarios(new Buscar_usuario__usuario_registrado_(this.getCabecera(),this.getInTextField().getValue()));
			this.getCabecera().getVl().add(this.getCabecera().getBusquedaUsuarios());
			
		});
		
		this.getbBUscarHastag().addClickListener(event -> {
			
			if(this.getInTextField().isEmpty()) {
				Notification.show("Ningun hashtag introducido");
				return;
			}
			
			this.getCabecera().getVl().removeAll();
			this.getCabecera().setBusquedaHashtag(new Buscar_hashtag__usuario_registrado_(this.getCabecera(),this.getInTextField().getValue()));
			this.getCabecera().getVl().add(this.getCabecera().getBusquedaHashtag());
			
		});*/
		
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