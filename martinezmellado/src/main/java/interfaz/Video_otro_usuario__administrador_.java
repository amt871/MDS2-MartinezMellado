package interfaz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;

import org.springframework.web.context.WebApplicationContext;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Section;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaVideo_otro_usuario__administrador_;

public class Video_otro_usuario__administrador_ extends VistaVideo_otro_usuario__administrador_ {
//	public Administrador _administrador;
//	public Ver_perfil_publico__administrador_ _ver_perfil_publico__administrador_;
//	public Cabecera__administrador_ _cabecera__administrador_;
//	public Ver_perfil__administrador_ _unnamed_Ver_perfil__administrador__;
//	public Vector<Video_otro_usuario__administrador__item> _item = new Vector<Video_otro_usuario__administrador__item>();

	//private Cabecera__administrador_ cabecera;
	//VerticalLayout layoutPrincipal;

	public Video_otro_usuario__administrador_() {
		
		//layoutPrincipal = this.getLayoutPrincipal();

		//cabecera = new Cabecera__administrador_();

//		VerticalLayout layoutPrincipal = this.getLayoutPrincipal();
//
//		cabecera.getStyle().set("width", "100%");
//		cabecera.getStyle().set("height", "0px");
//
//		layoutPrincipal.add(cabecera);

//		VerticalLayout container = new VerticalLayout();
//		
//		container.getStyle().set("width", "100%");
//		container.getStyle().set("height", "835px");
//		
//		Scroller scroller = new Scroller();
//		
//		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);
//		
//		scroller.getStyle().set("width", "100%");
//		scroller.getStyle().set("height", "100%");
//		
//		VerticalLayout vl = new VerticalLayout();
//		
//		scroller.setContent(vl);
//		
//		vl.getStyle().set("width", "100%");
//		vl.getStyle().set("height", "100%");
//		
//		ArrayList<Video_otro_usuario__administrador__item> array = new ArrayList<Video_otro_usuario__administrador__item>();
//		
//		array.add(new Video_otro_usuario__administrador__item());
//		array.add(new Video_otro_usuario__administrador__item());
//		
//		for(int i=0; i<array.size(); i++)
//			vl.add(array.get(i));
//		
//		
//		container.add(scroller);
//		
//		layoutPrincipal.add(container);
		
		Scroller scroller = new Scroller();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.getStyle().set("width", "100%");
		scroller.getStyle().set("height", "100%");

		VerticalLayout vl = new VerticalLayout();

		scroller.setContent(vl);

		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");

		ArrayList<Video_otro_usuario__administrador__item> array = new ArrayList<Video_otro_usuario__administrador__item>();

		array.add(new Video_otro_usuario__administrador__item());
		array.add(new Video_otro_usuario__administrador__item());

		for (int i = 0; i < array.size(); i++)
			vl.add(array.get(i));

		this.getDivScroller().add(scroller);

	}

	/*public Cabecera__administrador_ getCabecera() {
		return cabecera;
	}

	public void setCabecera(Cabecera__administrador_ cabecera) {
		this.cabecera = cabecera;

		cabecera.getStyle().set("width", "100%");
		cabecera.getStyle().set("height", "0px");

		layoutPrincipal.add(cabecera);
		
		addScroller();
	}

	public void addScroller() {

		VerticalLayout container = new VerticalLayout();

		container.getStyle().set("width", "100%");
		container.getStyle().set("height", "835px");

		Scroller scroller = new Scroller();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.getStyle().set("width", "100%");
		scroller.getStyle().set("height", "100%");

		VerticalLayout vl = new VerticalLayout();

		scroller.setContent(vl);

		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");

		ArrayList<Video_otro_usuario__administrador__item> array = new ArrayList<Video_otro_usuario__administrador__item>();

		array.add(new Video_otro_usuario__administrador__item());
		array.add(new Video_otro_usuario__administrador__item());

		for (int i = 0; i < array.size(); i++)
			vl.add(array.get(i));

		container.add(scroller);

		layoutPrincipal.add(container);

	}*/

}