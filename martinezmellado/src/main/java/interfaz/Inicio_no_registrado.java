package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.BDPrincipal;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaInicio_no_registrado;
import vistas.VistaInicio_no_registrado_item;

public class Inicio_no_registrado extends VistaInicio_no_registrado {

//	public Usuario_no_registrado _usuario_no_registrado;
//	public Cabecera_usuario_no_registrado _cabecera_usuario_no_registrado;
//	public Vector<Inicio_no_registrado_item> _item = new Vector<Inicio_no_registrado_item>();
	
	private MainView mv;
	private BDPrincipal datos;
	private Cabecera_usuario_no_registrado cabecera;
	private Scroller scroller;
	private VerticalLayout vl;
	private ArrayList<Video_otro_usuario__no_registrado__item> array;
	private Publicacion[] videos;
	
	private Usuario_Registrado[] aux;
	
	public Inicio_no_registrado(Cabecera_usuario_no_registrado cabeceraNoReg) {
		// TODO Auto-generated constructor stub
		this.cabecera = cabeceraNoReg;
		
		this.setCabecera(cabeceraNoReg);
		
		
		scroller = this.getScroller();
		vl = new VerticalLayout();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.setContent(vl);

		addItem();

	}

	/*
	 * public Video_otro_usuario() {
	 * 
	 * scroller = this.getScroller(); vl = new VerticalLayout();
	 * 
	 * scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);
	 * 
	 * scroller.getStyle().set("width", "100%"); scroller.getStyle().set("height",
	 * "100%");
	 * 
	 * scroller.setContent(vl);
	 * 
	 * vl.getStyle().set("width", "100%"); vl.getStyle().set("height", "100%");
	 * 
	 * addItem();
	 * 
	 * }
	 */

	public void addItem() {
		

		// ArrayList<Video_otro_usuario_item> array = new
		// ArrayList<Video_otro_usuario_item>();

		// this.datos = new BDPrincipal();
		this.videos = this.cabecera.getDatos().listarTodasPublicaciones();
		
		ArrayList<Publicacion> videosNormales = new ArrayList<Publicacion>();
		ArrayList<Publicacion> videosPublicidad = new ArrayList<Publicacion>();
				
		
		for(int i = 0; i<videos.length; i++) {
		
			if(videos[i].getRealizada().getComercial().equalsIgnoreCase("comercial"))
				videosPublicidad.add(videos[i]);
			else
				if(!videos[i].getRealizada().getPrivado())
					videosNormales.add(videos[i]);
		}
		
		Collections.reverse(videosNormales);
		Collections.shuffle(videosPublicidad);
		

		
		int contPubli = 0;
		if (videosNormales.size() == 0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Los usuarios que sigues aun no tiene publicaciones"));
		} else {

			// vl.setAlignItems(Alignment.CENTER);
			// vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.getStyle().set("position", "relative");
			// vl.getStyle().set("top", "5%");
			vl.setHeight("100%");
			vl.setWidth("100%");
			int indPubli = videosPublicidad.size() - 1 ;
			int indVideo = 0 ;
			this.array = new ArrayList<Video_otro_usuario__no_registrado__item>();
			int limite = videosNormales.size();
				
				for (int i = 0; i < limite ; i++) {
					
					if (contPubli == 3) {
						if (indPubli < 0) indPubli = videosPublicidad.size() - 1;
						
						this.array.add(new Video_otro_usuario__no_registrado__item(this.getCabecera(), videosPublicidad.get(indPubli)));
						this.array.get(i).getStyle().set("position", "relative");
						this.array.get(i).getStyle().set("height", "100%");
						this.array.get(i).getStyle().set("width", "100%");
						this.array.get(i).getImage().setSrc(videosPublicidad.get(indPubli).getRealizada().getFoto());
						this.array.get(i).getLabelUsuario().setText(videosPublicidad.get(indPubli).getRealizada().getUsuario());
						this.array.get(i).getLabelUbi().setText(videosPublicidad.get(indPubli).getUbicacion());
						this.array.get(i).getLabelFecha().setText(videosPublicidad.get(indPubli).getFecha().toString());
						this.array.get(i).getLabelDescripcion().setText("PUBLICIDAD -> \n" +videosPublicidad.get(indPubli).getDescripcion());
						this.array.get(i).getLabelMeGustas().setText(String.valueOf(videosPublicidad.get(indPubli).le_gusta.size()));
						this.array.get(i).getLabelComentarios().setText(String.valueOf(videosPublicidad.get(indPubli).tiene.size()));
						this.array.get(i).getLayoutVideo().add(new Video(videosPublicidad.get(indPubli).getVideo().replace("src/main/webapp/", ""),"100%","100%"));
						vl.add(array.get(i));
						
						indPubli--;
						limite++;
						contPubli = 0;
					}else {
						this.array.add(new Video_otro_usuario__no_registrado__item(this.getCabecera(), videosNormales.get(indVideo)));
						this.array.get(i).getStyle().set("position", "relative");
						this.array.get(i).getStyle().set("height", "100%");
						this.array.get(i).getStyle().set("width", "100%");
						this.array.get(i).getImage().setSrc(videosNormales.get(indVideo).getRealizada().getFoto());
						this.array.get(i).getLabelUsuario().setText(videosNormales.get(indVideo).getRealizada().getUsuario());
						this.array.get(i).getLabelUbi().setText(videosNormales.get(indVideo).getUbicacion());
						this.array.get(i).getLabelFecha().setText(videosNormales.get(indVideo).getFecha().toString());
						this.array.get(i).getLabelDescripcion().setText(videosNormales.get(indVideo).getDescripcion());
						this.array.get(i).getLabelMeGustas().setText(String.valueOf(videosNormales.get(indVideo).le_gusta.size()));
						this.array.get(i).getLabelComentarios().setText(String.valueOf(videosNormales.get(indVideo).tiene.size()));
						this.array.get(i).getLayoutVideo().add(new Video(videosNormales.get(indVideo).getVideo().replace("src/main/webapp/", ""),"100%","100%"));
						contPubli++;
						indVideo++;
						vl.add(array.get(i));	
					}
				}
		}

	}

}