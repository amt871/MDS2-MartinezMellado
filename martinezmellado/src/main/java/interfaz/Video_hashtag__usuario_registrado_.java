package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.BoxSizing;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.Hashtag;
import basededatos.Publicacion;
import vistas.VistaVideo_hashtag__usuario_registrado_;

public class Video_hashtag__usuario_registrado_ extends VistaVideo_hashtag__usuario_registrado_{

	private Mi_cabecera cabecera;
	private Hashtag hashtag;
	private Scroller scroller;
	private VerticalLayout vl;
	
	public Video_hashtag__usuario_registrado_(Hashtag hashtag, Mi_cabecera cabecera) {
		// TODO Auto-generated constructor stub
		this.cabecera = cabecera;
		this.hashtag = hashtag;
		this.scroller = this.getScroller();
		this.vl = new VerticalLayout();
		this.setCabecera(cabecera);
		this.getLabelHashtag().setText(hashtag.getHashtag());
		
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
//		if(this.usuario.realiza.size()==0) {
//			vl.setAlignItems(Alignment.CENTER);
//			vl.setJustifyContentMode(JustifyContentMode.CENTER);
//			vl.add(new Label("Este usuario no ha subido videos aun"));
//		}else {
			
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			//vl.setHeight("100%");
			vl.setWidth("100%");
			
			//vl.add(new Video("Usuarios/Juanra1997/videos/2023-06-05T23-00-09.914853900.mp4"));
			
			//vl.add(new Mi_video_item("Usuarios/Juanra1997/videos/2023-06-05T23-00-09.914853900.mp4", "Ninna gritona", "100%", "25%"));
			
			
			
			//videos
			
				int contador = 0;
				int index = 0;
				ArrayList<HorizontalLayout> array = new ArrayList<HorizontalLayout>();
				//ArrayList<VistaMi_video> array = new ArrayList<VistaMi_video>();
				
				Publicacion[] aux = this.hashtag.esta.toArray();
				
				Arrays.sort(aux, new Comparator<Publicacion>() {
				    public int compare(Publicacion p1, Publicacion p2) {
				        return Integer.compare(p2.getID(), p1.getID());
				    }
				});
				
				for(int i = 0; i< aux.length ; i++) {
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
					
					String titulo = aux[i].getDescripcion().length() > 15 ? aux[i].getDescripcion().substring(0,11)+"..." : aux[i].getDescripcion();
					
					array.get(index).add(new Mi_video_item(aux[i], this.cabecera)/*, "100%", "25%")*/);
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