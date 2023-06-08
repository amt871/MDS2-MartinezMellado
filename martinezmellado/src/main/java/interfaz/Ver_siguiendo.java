package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import vistas.VistaVer_siguiendo;

public class Ver_siguiendo extends VistaVer_siguiendo{
	
	private basededatos.Usuario_Registrado usuario;
	private basededatos.BDPrincipal datos;
	private Scroller scroller;
	
	public void setUsuario(basededatos.Usuario_Registrado usuario) {
		
		this.usuario = usuario;
		this.datos = new basededatos.BDPrincipal();
		
		cargarSiguiendo();
		
	}
	
	public void cargarSiguiendo() {
		
		scroller = this.getIdScroller();
		
		//scroller.getStyle().set("position", "relative");
		
		VerticalLayout vl = new VerticalLayout();
		
		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.setContent(vl);

		//vl.getStyle().set("width", "100%");
		//vl.getStyle().set("height", "100%");
		
		//vl.getStyle().set("background-color", "black");
		//vl.getStyle().set("position", "relative");
		
		if(this.usuario.seguido.size() == 0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Este usuario no sigue a nadie"));
		}else {
			
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			//vl.setHeight("100%");
			//vl.setWidth("100%");
		
			
		
		}
		
	}

}
