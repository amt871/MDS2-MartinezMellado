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

public class Video_otro_usuario__administrador_ extends VistaVideo_otro_usuario__administrador_{
//	public Administrador _administrador;
//	public Ver_perfil_publico__administrador_ _ver_perfil_publico__administrador_;
//	public Cabecera__administrador_ _cabecera__administrador_;
//	public Ver_perfil__administrador_ _unnamed_Ver_perfil__administrador__;
//	public Vector<Video_otro_usuario__administrador__item> _item = new Vector<Video_otro_usuario__administrador__item>();
	
	public Video_otro_usuario__administrador_() {
		
		//UI.getCurrent().getPage()
		//Div div = this.getDivContainer();
		VerticalLayout container = this.getVerticalContainer();
		
		container.getStyle().set("width", "100%");
		container.getStyle().set("height", "835px");
		
		Scroller scroller = new Scroller();
		
		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);
		
		//scroller.setWidth("100%");
		//scroller.setHeight("100%");
		scroller.getStyle().set("width", "100%");
		scroller.getStyle().set("height", "100%");
		
		VerticalLayout vl = new VerticalLayout();
		
		scroller.setContent(vl);
		
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");
		
		ArrayList<Video_otro_usuario__administrador__item> array = new ArrayList<Video_otro_usuario__administrador__item>();
		
		array.add(new Video_otro_usuario__administrador__item());
		array.add(new Video_otro_usuario__administrador__item());
		
		//array.get(0)
		
		for(int i=0; i<array.size(); i++)
			vl.add(array.get(i));
		
		//VerticalLayout vl = new VerticalLayout();
//		Section container = new Section();
//		//ArrayList<Video_otro_usuario__administrador__item> container = new ArrayList<Video_otro_usuario__administrador__item>();
//		container.add(new Video_otro_usuario__administrador__item());
//		container.add(new Video_otro_usuario__administrador__item());
//		container.add(new Video_otro_usuario__administrador__item());
//		container.add(new Video_otro_usuario__administrador__item());
//		container.add(new Video_otro_usuario__administrador__item());
//		
//		//this.getDivContainer().add(container);
//		
//		
//		//scroller.setSizeFull();
//		
//		scroller.setContent(container);
//		
//		//container.add(new Video_otro_usuario__administrador__item());
//		//container.add(new Video_otro_usuario__administrador__item());
//		//container.add(new Video_otro_usuario__administrador__item());
//		//container.add(new Video_otro_usuario__administrador__item());
//		//container.add(new Video_otro_usuario__administrador__item());
//		
//		
//		
//		//scroller.setContent(container);
//		
//		this.getDivContainer().add(container);
		
		container.add(scroller);

		
	}
}