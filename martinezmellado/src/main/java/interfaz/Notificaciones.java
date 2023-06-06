package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import vistas.VistaNotificaciones;

public class Notificaciones extends VistaNotificaciones {
//	private event _comentarios;
//	private event _todas__notificaciones_;
//	private event _me_gustas;
//	private event _seguidores;
//	private event _menciones;
//	public Mi_cabecera _mi_cabecera;
//	public Vector<Notifiaciones_item> _item = new Vector<Notifiaciones_item>();
//
//	public void comentarios() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void todas__notificaciones_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void me_gustas() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void seguidores() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void menciones() {
//		throw new UnsupportedOperationException();
//	}
	
	private Scroller scroller;
	private VerticalLayout vl;
	BDPrincipal datos;
	
	public Notificaciones() {
		
		scroller = this.getScroller();
		vl = new VerticalLayout();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.getStyle().set("width", "100%");
		scroller.getStyle().set("height", "100%");

		scroller.setContent(vl);

		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");
		
		addItem();

	}
	
	public void addItem() {
		
		List listaNotificaciones = this.datos.listarNitificaciones(this.getUsr().getUsuario());
		
		if (listaNotificaciones != null) {
			for (Object notificacion : listaNotificaciones) {
				
			}
		}
		
		
	}
	
}