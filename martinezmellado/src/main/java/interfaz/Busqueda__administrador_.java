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
import vistas.VistaBusqueda__administrador_;

public class Busqueda__administrador_ extends VistaBusqueda__administrador_{

//	private TextField _buscadoTF;
//	private Button _buscarUsuarioB;
//	private Button _buscarHastagB;
//	private Label _videosMasRelevantesL;
//	private Label _videosRelacionadosHastagL;
//	public Cabecera__administrador_ _cabecera__administrador_;
//	public Busqueda_usuarios__administrador_ _busqueda_usuarios__administrador_;
//	public Busqueda_hastag__administrador_ _busqueda_hastag__administrador_;
//	public Vista_detalle__administrador_ _vista_detalle__administrador_;
//	public Resultado_busqueda_usuarios _videos_relacionados_con_usuarios;
//	public Resultado_busqueda_usuarios _videos_relacionados_con_hastag;
//
//	public void busqueda_usuarios__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void busqueda_hastag__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void vista_detalle__administrador_() {
//		throw new UnsupportedOperationException();
//	}
	
	private VerticalLayout vlUsuarios;
	private VerticalLayout vlVideos;
	private ArrayList<HorizontalLayout> array;
	private Usuario_Registrado[] usuarios;
	private Publicacion[] publicaciones;
	private Cabecera__administrador_ cabecera;
	
	public Busqueda__administrador_(Cabecera__administrador_ cabecera__administrador_) {
		// TODO Auto-generated constructor stub
		this.setCabecera(cabecera__administrador_);
		this.cabecera = cabecera__administrador_;
		
		this.vlUsuarios = new VerticalLayout();
		this.vlVideos = new VerticalLayout();

		this.array = new ArrayList<HorizontalLayout>();
		// ArrayList<VerticalLayout> verticales = new ArrayList<VerticalLayout>();

		this.usuarios = this.cabecera.getDatos().listarTodosUsuarios();

		this.getDivUsuarios().add(vlUsuarios);
		vlUsuarios.setHeight("100%");
		vlUsuarios.setWidth("100%");
		
		int cont = 0;
		for (int i = usuarios.length-1; i >= 0 && cont < 8; i--) {
			
			if (usuarios[i].getComercial().equalsIgnoreCase("comercial"))
				continue;
				
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

		for (int i = publicaciones.length-1; i >= 0 && cont < 8; i--) {

			//System.out.println(i);
			/*if (publicaciones[i].getRealizada().getPrivado() || publicaciones[i].getRealizada().getComercial().equalsIgnoreCase("comercial"))
				continue;*/
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
		
		this.getbBuscarUsuario().addClickListener(event -> {
			
			if(this.getTfIn().isEmpty()) {
				Notification.show("Ningun usuario introducido");
				return;
			}
			
			this.getCabecera().getVl().removeAll();
			this.getCabecera().setBusquedaUsuarios(new Busqueda_usuarios__administrador_(this.getCabecera(),this.getTfIn().getValue()));
			this.getCabecera().getVl().add(this.getCabecera().getBusquedaUsuarios());
			
		});
		
		this.getbBuscarHashtag().addClickListener(event -> {
			
			if(this.getTfIn().isEmpty()) {
				Notification.show("Ningun hashtag introducido");
				return;
			}
			
			this.getCabecera().getVl().removeAll();
			this.getCabecera().setBusquedaHashtag(new Busqueda_hastag__administrador_(this.getCabecera(),this.getTfIn().getValue()));
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