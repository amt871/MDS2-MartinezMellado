package interfaz;

import java.util.ArrayList;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrar;

public class Administrar extends VistaAdministrar {
	
	//private Cabecera__administrador_ cabecera;
	//public Denuncias _denuncias;
//	public void denuncias() {
//		throw new UnsupportedOperationException();
//	}
	
	public Administrar() {

		Scroller scroller = new Scroller();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.getStyle().set("width", "100%");
		scroller.getStyle().set("height", "100%");

		VerticalLayout vl = new VerticalLayout();

		scroller.setContent(vl);

		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");

		ArrayList<Denuncias_item> array = new ArrayList<Denuncias_item>();

		array.add(new Denuncias_item());
		array.add(new Denuncias_item());
		array.add(new Denuncias_item());
		array.add(new Denuncias_item());
		array.add(new Denuncias_item());
		array.add(new Denuncias_item());
		array.add(new Denuncias_item());
		array.add(new Denuncias_item());
		array.add(new Denuncias_item());
		array.add(new Denuncias_item());
		array.add(new Denuncias_item());
		array.add(new Denuncias_item());

		for (int i = 0; i < array.size(); i++)
			vl.add(array.get(i));

		this.getDivScrollerDenuncias().add(scroller);
		
	}

	
}