package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.BoxSizing;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Publicacion;

import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import vistas.VistaPerfil_comercial;

public class Perfil_comercial extends VistaPerfil_comercial {

	private Cabecera_comercial cabecera;
	private Scroller scroller;
	private VerticalLayout vl;
	
	public Perfil_comercial(Cabecera_comercial cabecera_comercial) {
		// TODO Auto-generated constructor stub
		
		this.cabecera = cabecera_comercial;
		
		this.cabecera.setUser(this.cabecera.getDatos().cargarDatosUsuario(this.cabecera.getUser().getUsuario()));
		

		this.setCabecera(cabecera_comercial);
		this.scroller = this.getScroller();
		
		this.getLabelSeguidores().setText("Seguidores: "+cabecera.getUser().seguidor.size());
		
		int megustas = 0;
		for(Publicacion publi : cabecera.getUser().realiza.toArray())
			megustas += publi.le_gusta.size();
		
		this.getLabelMeGustas().setText(megustas+" me gustas");
		this.getLabelUsuario().setText(cabecera.getUser().getUsuario());
		this.getImagen().setSrc(cabecera.getUser().getFoto());
		
		this.getbConfigurar().addClickListener(event ->{
			
			bConfigurar();
			
		});
		
		listarVideos();
		
	}
	
	public void listarVideos() {
		
		scroller = this.getScroller();
		vl = new VerticalLayout();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		//scroller.getStyle().set("width", "100%");
		//scroller.getStyle().set("height", "65%");

		scroller.setContent(vl);

		//vl.getStyle().set("width", "100%");
		//vl.getStyle().set("height", "100%");
		
		//vl.getStyle().set("background-color", "black");
		
		addItem();
		

	}
	
	public void addItem() {
		
		//System.out.println(this.usuario.realiza.size());
		if(this.cabecera.getUser().realiza.size()==0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Este usuario no ha subido videos aun"));
		}else {
			
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			//vl.setHeight("100%");
			vl.setWidth("100%");
			
			//vl.add(new Video("Usuarios/Juanra1997/videos/2023-06-05T23-00-09.914853900.mp4"));
			
			//vl.add(new Mi_video_item("Usuarios/Juanra1997/videos/2023-06-05T23-00-09.914853900.mp4", "Ninna gritona", "100%", "25%"));
			
			Publicacion[] videos = null;
			
			videos = this.cabecera.getUser().realiza.toArray();
			
			Arrays.sort(videos, new Comparator<Publicacion>() {
			    public int compare(Publicacion p1, Publicacion p2) {
			        return Integer.compare(p1.getID(), p2.getID());
			    }
			});
			
			//videos
			
			if(videos != null) {
				int contador = 0;
				int index = 0;
				ArrayList<HorizontalLayout> array = new ArrayList<HorizontalLayout>();
				//ArrayList<VistaMi_video> array = new ArrayList<VistaMi_video>();
				for(int i = videos.length-1; i>-1; i--) {
					//System.out.println(videos[i].getVideo());
					if(contador == 0) {
						//System.out.println(contador);
						array.add(new HorizontalLayout());
						//System.out.println("Add horizontal");
						array.get(index).setJustifyContentMode(JustifyContentMode.CENTER);
						array.get(index).setAlignItems(Alignment.CENTER);
						array.get(index).getStyle().set("height", "100%");
						array.get(index).getStyle().set("width", "100%");
						array.get(index).getStyle().set("position", "relative");
						//array.get(index).getStyle().set("overflow", "auto");
						array.get(index).setBoxSizing(BoxSizing.BORDER_BOX);
//						array.get(index).setPadding(true);
//						array.get(index).setMargin(false);
//						array.get(index).setSpacing(false);
						
						//array.get(index).getStyle().set("background-color", "black");
						
						vl.add(array.get(index));
					}
					
					String titulo = videos[i].getDescripcion().length() > 15 ? videos[i].getDescripcion().substring(0,11)+"..." : videos[i].getDescripcion();
					
					array.get(index).add(new Mi_video_item(videos[i], this.getCabecera())/*, "100%", "25%")*/);
					//array.get(index).add(new)
					contador++;
					if(contador==4) {
						index ++;
						contador = 0;
						//vl.add(array.get(0));
						//break;
					}
					
				}
				
			}
			
		}
		
	}
	
	public void bConfigurar() {
		this.cabecera.getVl().removeAll();
		this.cabecera.setConfigPerfil(new Configurar_perfil_comercial(this.cabecera));
		this.cabecera.getVl().add(this.cabecera.getConfigPerfil());
	}
	
}