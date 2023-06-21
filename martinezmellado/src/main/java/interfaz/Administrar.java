package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Comentario;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaAdministrar;

import java.util.ArrayList;
import java.util.List;

public class Administrar extends VistaAdministrar{

	private Scroller scroller;
	private VerticalLayout vl;
	private BDPrincipal datos;
	private Cabecera__administrador_ cabecera;
	private ArrayList<Comentario> ComDenuVist = new ArrayList<Comentario>();
	private ArrayList<Publicacion> PubDenuVist = new ArrayList<Publicacion>();
	private ArrayList<Usuario_Registrado> UsrDenuVist = new ArrayList<Usuario_Registrado>();

	public Administrar(Cabecera__administrador_ cabecera__administrador_) {

		this.setCabecera(cabecera__administrador_);
		this.cabecera = cabecera__administrador_;
		this.datos = this.cabecera.getDatos();

		this.getbTodas().addClickListener(Event -> {
//			addItem("comentario");
		});

		this.getbVistas().addClickListener(Event -> {
//			addItem("me_gusta");
		});

		this.getbPendientes().addClickListener(Event -> {
//			addItem("seguir");
		});

		this.getbAplicadas().addClickListener(Event -> {
//			addItem("todo");
		});

		scroller = this.getScroller();
		vl = new VerticalLayout();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.setContent(vl);

		addItem("todo");
	}

	public void addItem(String filtro) {

		List ComDenuAux = this.datos.listarComentariosDenunciados();
		List PubDenuAux = this.datos.listarPublicacionesDenunciadas();
		List UsrDenuAux = this.datos.listarUsuariosDenunciados();
		ArrayList<Comentario> ComDenu = new ArrayList<Comentario>();
		ArrayList<Publicacion> PubDenu = new ArrayList<Publicacion>();
		ArrayList<Usuario_Registrado> UsrDenu = new ArrayList<Usuario_Registrado>();

		for (Object Comentario : ComDenuAux) {
			ComDenu.add((Comentario) Comentario);
		}

		for (Object Publicacion : PubDenuAux) {
			PubDenu.add((Publicacion) Publicacion);
		}

		for (Object Usuario_Registrado : UsrDenuAux) {
			UsrDenu.add((Usuario_Registrado) Usuario_Registrado);
		}

		int tamT = ComDenu.size() + PubDenu.size() + UsrDenu.size();
		int contCom = 0;
		int contPub = 0;
		int contUsr = 0;

		vl.removeAll();

		int tipo = 0;

		if (tamT == 0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("No tienes notificaciones"));
		} else {

			vl.getStyle().set("position", "relative");
			vl.setHeight("100%");
			vl.setWidth("100%");

			ArrayList<Denuncias_item> array = new ArrayList<Denuncias_item>();

			int cont = 0;

			for (int i = 0; i < tamT; i++) {

				if (tipo == 0 && contCom < ComDenu.size()) {

					array.add(new Denuncias_item(cabecera, this.cabecera.getVl(), ComDenu.get(contCom),
							this.ComDenuVist));
					vl.add(array.get(cont));
					cont++;
					contCom++;
					tipo++;
					continue;
				} 
				if (tipo == 1 && contPub < PubDenu.size()) {

					array.add(new Denuncias_item(cabecera, this.cabecera.getVl(), PubDenu.get(contPub),
							this.PubDenuVist));
					vl.add(array.get(cont));
					cont++;
					contPub++;
					tipo++;
					continue;
				} 
				if (tipo == 2 && contUsr < UsrDenu.size()) {

					array.add(new Denuncias_item(cabecera, this.cabecera.getVl(), UsrDenu.get(contUsr),
							this.UsrDenuVist));
					vl.add(array.get(cont));
					cont++;
					contUsr++;
					tipo = 0;
					continue;
				}

					tipo = 0;
			}
		}
	}
}
