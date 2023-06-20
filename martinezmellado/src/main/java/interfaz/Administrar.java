package interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.BDPrincipal;
import basededatos.Comentario;
import basededatos.Notificacion;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaAdministrar;

public class Administrar extends VistaAdministrar {

	// private Cabecera__administrador_ cabecera;
	// public Denuncias _denuncias;
//	public void denuncias() {
//		throw new UnsupportedOperationException();
//	}
	private Scroller scroller;
	private VerticalLayout vl;
	private BDPrincipal datos;
	private Cabecera__administrador_ cabecera;
	private ArrayList<Comentario> ComDenuVist = new ArrayList<Comentario>();
	private ArrayList<Publicacion> PubDenuVist = new ArrayList<Publicacion>();
	private ArrayList<Usuario_Registrado> UsrDenuVist = new ArrayList<Usuario_Registrado>();

	public Administrar(Cabecera__administrador_ cabecera__administrador_) {

		this.cabecera = cabecera__administrador_;
		this.datos = this.cabecera.getDatos();

		this.getbTodas().addClickListener(Event -> {
//			addItem("comentario");
		});

		this.getbVistas().addClickListener(Event -> {
//			addItem("me_gusta");
		});

		this.getbPendientes().addClickListener(Event -> {
//			addItem("seguir");
		});

		this.getbAplicadas().addClickListener(Event -> {
//			addItem("todo");
		});


		scroller = this.getScroller();
		vl = new VerticalLayout();


		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.setContent(vl);

		addItem("todo");
	}

	public void addItem(String filtro) {

		List ComDenuAux = this.datos.listarComentariosDenunciados();
		List PubDenuAux = this.datos.listarPublicacionesDenunciadas();
		List UsrDenuAux = this.datos.listarUsuariosDenunciados();
		ArrayList<Comentario> ComDenu = new ArrayList<Comentario>();
		ArrayList<Publicacion> PubDenu = new ArrayList<Publicacion>();
		ArrayList<Usuario_Registrado> UsrDenu = new ArrayList<Usuario_Registrado>();
		ArrayList<Comentario> ComDenuVist = new ArrayList<Comentario>();
		ArrayList<Publicacion> PubDenuVist = new ArrayList<Publicacion>();
		ArrayList<Usuario_Registrado> UsrDenuVist = new ArrayList<Usuario_Registrado>();
		
		for (Object Comentario : ComDenuAux) {
			ComDenu.add((Comentario) Comentario);
		}
		
		for (Object Publicacion : ComDenuAux) {
			PubDenu.add((Publicacion) Publicacion);
		}
		
		for (Object Usuario_Registrado : ComDenuAux) {
			UsrDenu.add((Usuario_Registrado) Usuario_Registrado);
		}
		
		int tamT = ComDenu.size() + PubDenu.size() + UsrDenu.size();
		int contCom = 0;
		int contPub = 0;
		int contUsr = 0;
		
		vl.removeAll();

		if (tamT == 0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("No tienes notificaciones"));
		} else {

			vl.getStyle().set("position", "relative");
			vl.setHeight("100%");
			vl.setWidth("100%");

			ArrayList<Notifiaciones_item> array = new ArrayList<Notifiaciones_item>();

			int cont = 0;

			for (int i = 0; i < listaNotificaciones.size(); i++) {

				Usuario_Registrado usr = this.datos.cargarDatosUsuario(listaNotificaciones.get(i).getUsuarioOrigen());
				Publicacion publicacion = this.datos.cargarVideoPoID(listaNotificaciones.get(i).getPublicacion());
				if (listaNotificaciones.get(i).getTipo().equals(filtro) || filtro == "todo") {
					array.add(new Notifiaciones_item(listaNotificaciones.get(i).getTipo(), usr, publicacion,
							listaNotificaciones.get(i).getComentario(), this.datos, listaNotificaciones.get(i).getID(),
							this.mi_cabecera, this.user, this.inicio));
					array.get(cont).getIdImagenUsr().setSrc(usr.getFoto());
					vl.add(array.get(cont));
					cont++;
				}
			}
		}
	}
}