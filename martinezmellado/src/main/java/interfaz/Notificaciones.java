package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.BDPrincipal;
import basededatos.Notificacion;
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

	public Notificaciones() {

		scroller = this.getScroller();
		vl = new VerticalLayout();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.getStyle().set("width", "100%");
		scroller.getStyle().set("height", "100%");

		scroller.setContent(vl);

		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");

		// addItem();

	}

	public Notificaciones(MainView vl2, Mi_cabecera mi_cabecera) {
		// TODO Auto-generated constructor stub

		this.inicio = vl2;
		this.user = mi_cabecera.getUser();
		this.datos = mi_cabecera.getDatos();
		this.setCabecera(mi_cabecera);
	}

	public void addItem(String tipo) {

		List<Notificacion> listaNotificaciones = this.datos.listarNitificaciones(this.getUsr().getUsuario());

		if (listaNotificaciones != null) {
			for (Notificacion notificacion : listaNotificaciones) {
				listaNotificaciones.add(notificacion);
			}
		}

		if(listaNotificaciones.size() == 0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Los usuarios que sigues aun no tiene publicaciones"));
		}else {

			//vl.setAlignItems(Alignment.CENTER);
			//vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.getStyle().set("position", "relative");
			//vl.getStyle().set("top", "5%");
			vl.setHeight("100%");
			vl.setWidth("100%");

			ArrayList<Notifiaciones_item> array = new ArrayList<Notifiaciones_item>();

			for(int i = 0; i<listaNotificaciones.size() && i<20; i++) {

				//System.out.println(this.getCabecera()==null);


				array.add(new Notifiaciones_item(listaNotificaciones.get(i).getTipo(),
						this.datos.cargarDatosUsuario(listaNotificaciones.get(i).getUsuarioOrigen()),
						this.datos.cargarVideoPoID(listaNotificaciones.get(i).getPublicacion()),
						listaNotificaciones.get(i).getComentario(), this.datos));
				//array.get(i).getLayoutVideo().add(new Video(videos[i].getVideo().replace("src/main/webapp/", "")));
				array.get(i).getStyle().set("position", "relative");
				array.get(i).getStyle().set("height", "100%");
				array.get(i).getStyle().set("width", "100%");
				array.get(i).getIdFotoUsuario()
//				array.get(i).getImageButton().setSrc(videos.get(i).getRealizada().getFoto());
//				array.get(i).getLabelUsuario().setText(videos.get(i).getRealizada().getUsuario());
//				array.get(i).getIdUbicación().setText(videos.get(i).getUbicacion());
//				array.get(i).getIdFecha().setText(videos.get(i).getFecha().toString());
//				array.get(i).getIdDescripcion().setText(videos.get(i).getDescripcion());
//				array.get(i).getIdNumMg().setText(String.valueOf(videos.get(i).le_gusta.size()));
//				array.get(i).getIdNumComentarios().setText(String.valueOf(videos.get(i).tiene.size()));

				vl.add(array.get(i));
			}
		}
	}
	}