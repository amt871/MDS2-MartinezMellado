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
	
	private Scroller scroller;
	private VerticalLayout content;
	
	//private ArrayList<Video_otro_usuario__administrador__item> array;

	public Video_otro_usuario__administrador_(Cabecera__administrador_ cabecera__administrador_) {
		
		this.setCabecera(cabecera__administrador_);
		
		
	}



}