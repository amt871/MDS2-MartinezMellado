package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.BDPrincipal;
import vistas.VistaVer_mis_seguidores;

public class Ver_mis_seguidores extends VistaVer_mis_seguidores {
	
	private basededatos.Usuario_Registrado usuario;
	private basededatos.BDPrincipal datos;
	Scroller scroller;
	
	public Ver_mis_seguidores(Mi_cabecera cabecera, Configurar configurar) {
		// TODO Auto-generated constructor stub
//	}
//
//	public void setUsuario(basededatos.Usuario_Registrado usuario) {
		
		this.usuario = cabecera.getUser();
		this.datos = cabecera.getDatos();
		
		this.setCabecera(cabecera);
		this.setConfig(configurar);
		
		cargarSeguidores();
		
	}
	
	public void cargarSeguidores() {
		
		scroller = this.getIdScroller();
		
		//scroller.getStyle().set("position", "relative");
		
		VerticalLayout vl = new VerticalLayout();
		
		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.setContent(vl);

		//vl.getStyle().set("width", "100%");
		//vl.getStyle().set("height", "100%");
		
		//vl.getStyle().set("background-color", "black");
		//vl.getStyle().set("position", "relative");
		
		if(this.usuario.seguidor.size() == 0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Este usuario no tiene seguidores"));
		}else {
			
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			//vl.setHeight("100%");
			//vl.setWidth("100%");
		
			
		
		}
		
	}

}
