package interfaz;

import java.util.ArrayList;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import vistas.VistaVer_mis_seguidores;

public class Ver_mis_seguidores extends VistaVer_mis_seguidores {
	
	private basededatos.Usuario_Registrado user;
	private basededatos.BDPrincipal datos;
	private Scroller scroller;
	private VerticalLayout vl;
	private Mi_cabecera mi_cabecera;
	
	public Ver_mis_seguidores(Mi_cabecera cabecera, Configurar configurar) {
		// TODO Auto-generated constructor stub
//	}
//
//	public void setUsuario(basededatos.Usuario_Registrado usuario) {
		this.user = cabecera.getDatos().cargarDatosUsuario(cabecera.getUser().getUsuario());
		this.datos = cabecera.getDatos();
		this.scroller = this.getIdScroller();
		this.vl = new VerticalLayout();
		this.scroller.setContent(vl);
		this.mi_cabecera = cabecera;

		
		this.setCabecera(cabecera);
		this.setConfig(configurar);
		
		addItem();
		
	}
	
	public void addItem() {

		Usuario_Registrado[] listaSeguidos = this.user.seguidor.toArray();
		
		if(listaSeguidos.length == 0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Ningun usaurio te sigue"));
		}else {

//			//vl.setAlignItems(Alignment.CENTER);
//			//vl.setJustifyContentMode(JustifyContentMode.CENTER);
//			vl.getStyle().set("position", "relative");
//			//vl.getStyle().set("top", "5%");
//			vl.setHeight("100%");
//			vl.setWidth("100%");

			ArrayList<Mis_seguidores_item> array = new ArrayList<Mis_seguidores_item>();

			for(int i = 0; i<listaSeguidos.length; i++) {

				//System.out.println(this.getCabecera()==null);
				Usuario_Registrado usr = this.datos.cargarDatosUsuario(listaSeguidos[i].getUsuario());
				array.add(new Mis_seguidores_item(usr, this.user, this.datos, this.mi_cabecera, this.mi_cabecera.getVl()));
				array.get(i).getStyle().set("position", "relative");
				array.get(i).getStyle().set("height", "30%");
				array.get(i).getStyle().set("width", "100%");
				array.get(i).getFotoUsr().setSrc(usr.getFoto());;


				vl.add(array.get(i));
			}
		}
	}
	
	

}
