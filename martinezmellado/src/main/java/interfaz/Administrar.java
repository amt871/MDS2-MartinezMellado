package interfaz;


import java.util.ArrayList;
import java.util.List;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Comentario;
import basededatos.Denuncia_Archivada;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaAdministrar;

import java.util.ArrayList;
import java.util.List;


public class Administrar extends VistaAdministrar {

	// private Cabecera__administrador_ cabecera;
	// public Denuncias _denuncias;
//	public void denuncias() {
//		throw new UnsupportedOperationException();
//	}
	private Scroller scroller;
	private VerticalLayout vl;
	private BDPrincipal datos;
	private Cabecera__administrador_ cabecera;
	public Administrar(Cabecera__administrador_ cabecera__administrador_) {

		this.setCabecera(cabecera__administrador_);
		this.cabecera = cabecera__administrador_;
		this.datos = this.cabecera.getDatos();

		this.getbTodas().addClickListener(Event -> {
			addItem("todo");;
		});

		this.getbVistas().addClickListener(Event -> {
			addItem("");
		});

		this.getbPendientes().setVisible(false);

		this.getbAplicadas().addClickListener(Event -> {
			listarDenunciasArchivadas();
		});

		scroller = this.getScroller();
		vl = new VerticalLayout();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.setContent(vl);

		addItem("todo");
	}

	public void addItem(String filtro) {
		

		if (filtro == "todo") {
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
				vl.add(new Label("No tienes denuncias que revisar"));
			} else {

				vl.getStyle().set("position", "relative");
				vl.setHeight("100%");
				vl.setWidth("100%");

				ArrayList<Denuncias_item> array = new ArrayList<Denuncias_item>();

				int cont = 0;

				for (int i = 0; i < tamT;) {

					if (tipo == 0 && contCom < ComDenu.size()) {

						array.add(new Denuncias_item(cabecera, this.cabecera.getVl(), ComDenu.get(contCom)));
						vl.add(array.get(cont));
						cont++;
						contCom++;
						tipo++;
						i++;
						continue;
					} 
					if (tipo == 1 && contPub < PubDenu.size()) {

						array.add(new Denuncias_item(cabecera, this.cabecera.getVl(), PubDenu.get(contPub)));
						vl.add(array.get(cont));
						cont++;
						contPub++;
						tipo++;
						i++;
						continue;
					} 
					if (tipo == 2 && contUsr < UsrDenu.size()) {

						array.add(new Denuncias_item(cabecera, this.cabecera.getVl(), UsrDenu.get(contUsr)));
						vl.add(array.get(cont));
						cont++;
						contUsr++;
						tipo = 0;
						i++;
						continue;
					}

						tipo++;
						if (tipo == 3) {
							tipo = 0;
						}
				}
			}
			
		}else {
			vl.removeAll();
			
			int tamT = this.cabecera.getComDenuVist().size() + this.cabecera.getPubDenuVist().size() + this.cabecera.getUsrDenuVist().size();

			
			int contCom = 0;
			int contPub = 0;
			int contUsr = 0;
			
			if (tamT == 0) {
				vl.setAlignItems(Alignment.CENTER);
				vl.setJustifyContentMode(JustifyContentMode.CENTER);
				vl.add(new Label("No has postpuesto ninguana denuncia"));
			} else {

				vl.getStyle().set("position", "relative");
				vl.setHeight("100%");
				vl.setWidth("100%");

				ArrayList<Denuncias_item> array = new ArrayList<Denuncias_item>();

				int cont = 0;
				
				int tipo = 0;

				for (int i = 0; i < tamT;) {

					if (tipo == 0 && contCom < this.cabecera.getComDenuVist().size()) {

						array.add(new Denuncias_item(cabecera, this.cabecera.getVl(), this.cabecera.getComDenuVist().get(contCom)));
						vl.add(array.get(cont));
						cont++;
						contCom++;
						tipo++;
						i++;
						continue;
					} 
					if (tipo == 1 && contPub < this.cabecera.getPubDenuVist().size()) {

						array.add(new Denuncias_item(cabecera, this.cabecera.getVl(), this.cabecera.getPubDenuVist().get(contPub)));
						vl.add(array.get(cont));
						cont++;
						contPub++;
						tipo++;
						i++;
						continue;
					} 
					if (tipo == 2 && contUsr < this.cabecera.getUsrDenuVist().size()) {

						array.add(new Denuncias_item(cabecera, this.cabecera.getVl(), this.cabecera.getUsrDenuVist().get(contUsr)));
						vl.add(array.get(cont));
						cont++;
						contUsr++;
						tipo = 0;
						i++;
						continue;
					}

					tipo++;
					if (tipo == 3) {
						tipo = 0;
					}
				}
			}
		}
	}
	
	public void listarDenunciasArchivadas() {
		System.out.println("hola yo lo intento");
		
		vl.removeAll();
		
		List denunciasArchivadasAux = this.datos.listarDenunciasArchivadas();
		ArrayList<Denuncia_Archivada> denunciasArchivadas = new ArrayList<Denuncia_Archivada>();
		for (Object denuncia_Archivada : denunciasArchivadasAux.toArray()) {
			denunciasArchivadas.add((Denuncia_Archivada) denuncia_Archivada);
		}
		
		
		if (denunciasArchivadas.size() == 0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("No has postpuesto ninugana denuncia"));
		} else {

			vl.getStyle().set("position", "relative");
			vl.setHeight("100%");
			vl.setWidth("100%");

			ArrayList<Denuncias_item> array = new ArrayList<Denuncias_item>();


			for (int i = 0; i < denunciasArchivadas.size(); i++) {
				array.add(new Denuncias_item(denunciasArchivadas.get(i)));
				vl.add(array.get(i));
				
			}
		}
		
	}
}