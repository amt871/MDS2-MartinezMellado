package interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.BDPrincipal;
import basededatos.Notificacion;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaVer_siguiendo;

public class Ver_siguiendo extends VistaVer_siguiendo{
	
	private basededatos.Usuario_Registrado user;
	private basededatos.BDPrincipal datos;
	private Scroller scroller;
	private VerticalLayout vl;
	private Mi_cabecera mi_cabecera;
	
	public Ver_siguiendo(Mi_cabecera cabecera, Configurar configurar) {
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

		Usuario_Registrado[] listaSeguidos = this.user.seguido.toArray();
		
		if(listaSeguidos.length == 0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("No sigues a nadie"));
		}else {

//			//vl.setAlignItems(Alignment.CENTER);
//			//vl.setJustifyContentMode(JustifyContentMode.CENTER);
//			vl.getStyle().set("position", "relative");
//			//vl.getStyle().set("top", "5%");
//			vl.setHeight("100%");
//			vl.setWidth("100%");

			ArrayList<Siguiendo_item> array = new ArrayList<Siguiendo_item>();

			for(int i = 0; i<listaSeguidos.length; i++) {

				//System.out.println(this.getCabecera()==null);
				//System.out.println(listaSeguidos[i].getUsuario());

				Usuario_Registrado usr = this.datos.cargarDatosUsuario(listaSeguidos[i].getUsuario());
				array.add(new Siguiendo_item(usr, this.user, this.datos, this.mi_cabecera, this.mi_cabecera.getVl()));
				array.get(i).getStyle().set("position", "relative");
				array.get(i).getStyle().set("height", "30%");
				array.get(i).getStyle().set("width", "100%");
				array.get(i).getFotoUsr().setSrc(usr.getFoto());;


				vl.add(array.get(i));
			}
		}
	}

}
