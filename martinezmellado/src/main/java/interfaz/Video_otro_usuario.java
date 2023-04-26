package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVideo_otro_usuario;

public class Video_otro_usuario extends VistaVideo_otro_usuario{
//	public Ver_perfil_publico__usuario_registrado_ _ver_perfil_publico__usuario_registrado_;
//	public Usuario_Registrado _usuario_Registrado;
//	public Mi_cabecera _mi_cabecera;
//	public Vector<Video_otro_usuario_item> _item = new Vector<Video_otro_usuario_item>(
	
	private Scroller scroller;
	private VerticalLayout vl;
	
	public Video_otro_usuario() {
		
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
		
		vl.add(new Video_otro_usuario_item());
		vl.add(new Video_otro_usuario_item());
		
	}
	
}