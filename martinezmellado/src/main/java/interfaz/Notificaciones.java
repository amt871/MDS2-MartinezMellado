package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import antlr.debug.Event;
import basededatos.BDPrincipal;
import basededatos.Notificacion;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaNotificaciones;

public class Notificaciones extends VistaNotificaciones {
	// private event _comentarios;
	// private event _todas__notificaciones_;
	// private event _me_gustas;
	// private event _seguidores;
	// private event _menciones;
	// public Mi_cabecera _mi_cabecera;
	// public Vector<Notifiaciones_item> _item = new Vector<Notifiaciones_item>();
	//
	// public void comentarios() {
	// throw new UnsupportedOperationException();
	// }
	//
	// public void todas__notificaciones_() {
	// throw new UnsupportedOperationException();
	// }
	//
	// public void me_gustas() {
	// throw new UnsupportedOperationException();
	// }
	//
	// public void seguidores() {
	// throw new UnsupportedOperationException();
	// }
	//
	// public void menciones() {
	// throw new UnsupportedOperationException();
	// }

	private Scroller scroller;
	private VerticalLayout vl;
	private BDPrincipal datos;
	private MainView inicio;
	private Usuario_Registrado user;
	private Mi_cabecera mi_cabecera;


	public Notificaciones(MainView vl2, Mi_cabecera mi_cabecera) {
		// TODO Auto-generated constructor stub

		this.inicio = vl2;
		this.user = mi_cabecera.getUser();
		this.datos = mi_cabecera.getDatos();
		this.setCabecera(mi_cabecera);
		this.mi_cabecera = mi_cabecera;
		
		this.getIdComentarios().addClickListener(Event -> {
			addItem("comentario");
		});	
		
		this.getIdMeGusta().addClickListener(Event -> {
			addItem("me_gusta");
		});	
		
		this.getIdSeguidores().addClickListener(Event -> {
			addItem("seguir");
		});	
		
		this.getIdTodas().addClickListener(Event -> {
			addItem("todo");
		});	
		
		
		//this.getStyle().set("position", "absolute");

		scroller = this.getScroller();
		vl = new VerticalLayout();

		this.getIdMenciones().setVisible(false);

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);
		
		scroller.setContent(vl);
		
		addItem("todo");
	}

	public void addItem(String filtro) {

		List<Notificacion> listaNotificaciones = new ArrayList<Notificacion>();
		listaNotificaciones.addAll(this.datos.listarNitificaciones(this.user.getUsuario()));
		
		vl.removeAll();
		
		if(listaNotificaciones.size() == 0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("No tienes notificaciones"));
		}else {
			
			vl.getStyle().set("position", "relative");
			vl.setHeight("100%");
			vl.setWidth("100%");

			ArrayList<Notifiaciones_item> array = new ArrayList<Notifiaciones_item>();

			for(int i = 0; i<listaNotificaciones.size() && i<20; i++) {

				Usuario_Registrado usr = this.datos.cargarDatosUsuario(listaNotificaciones.get(i).getUsuarioOrigen());
				Publicacion publicacion =  this.datos.cargarVideoPoID(listaNotificaciones.get(i).getPublicacion());
				if (listaNotificaciones.get(i).getTipo().equals(filtro) || filtro == "todo") {
					array.add(new Notifiaciones_item(listaNotificaciones.get(i).getTipo(),
							usr,
							publicacion,
							listaNotificaciones.get(i).getComentario(),
							this.datos,
							listaNotificaciones.get(i).getID(),
							this.mi_cabecera,
							this.user,
							this.inicio));
					array.get(i).getIdImagenUsr().setSrc(usr.getFoto());
					vl.add(array.get(i));
				}
			}
		}
	}
	}