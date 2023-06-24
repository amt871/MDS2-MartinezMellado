package interfaz;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.BoxSizing;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Publicacion;
import basededatos.PublicacionDAO;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import vistas.VistaMi_perfil;
import vistas.VistaMi_video;

public class Mi_perfil extends VistaMi_perfil {
//	private Label _nSeguidoresL;
//	private Label _nMeGustasL;
//	private ImagenIcon _imagenPerfilII;
//	private Label _nombreUsuarioL;
//	private Label _configurarL;
//	public Mi_cabecera _mi_cabecera;
//	public Configurar_mi_perfil _configurar_mi_perfil;
//	public Mi_video _mi_video;
//
//	public void configurar_mi_perfil() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void mi_video() {
//		throw new UnsupportedOperationException();
//	}
	
	private Usuario_Registrado usuario;
	private BDPrincipal datos;
	private Scroller scroller;
	private VerticalLayout vl;
	
	public Mi_perfil(MainView vl2, Mi_cabecera mi_cabecera) {

		this.datos = mi_cabecera.getDatos();
		mi_cabecera.setUser(this.datos.cargarDatosUsuario(mi_cabecera.getUser().getUsuario()));
		this.usuario = mi_cabecera.getUser();
		this.setCabecera(mi_cabecera);
		
		this.getbConfigurar().addClickListener(event -> {
			
			bConfigurar(mi_cabecera);
			
		});
		
		this.getIdImagen().setSrc(usuario.getFoto());
		this.getIdUsuario().setText(this.usuario.getUsuario());
		this.getIdNumSeguidores().setText(this.usuario.seguido.size()+" seguidores");
		
		int megustas = 0;
		for(Publicacion publi : this.usuario.realiza.toArray())
			megustas += publi.le_gusta.size();
		
		this.getIdNumMgs().setText(megustas+" me gusta");
			
		listarVideos();
	}
	
	private void listarVideos() {
		
		scroller = this.getScroller();
		vl = new VerticalLayout();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);



		scroller.setContent(vl);
		
		addItem();
		

	}
	
	private void addItem() {
		

		if(this.usuario.realiza.size()==0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Este usuario no ha subido videos aun"));
		}else {
			
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.setWidth("100%");
			
	
			
			Publicacion[] videos = null;
			
			videos = this.usuario.realiza.toArray();
			
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
				for(int i = videos.length-1; i>-1; i--) {
					if(contador == 0) {
						array.add(new HorizontalLayout());
						array.get(index).setJustifyContentMode(JustifyContentMode.CENTER);
						array.get(index).setAlignItems(Alignment.CENTER);
						array.get(index).getStyle().set("height", "100%");
						array.get(index).getStyle().set("width", "100%");
						array.get(index).getStyle().set("position", "relative");

						array.get(index).setBoxSizing(BoxSizing.BORDER_BOX);
						
						vl.add(array.get(index));
					}
					
					String titulo = videos[i].getDescripcion().length() > 15 ? videos[i].getDescripcion().substring(0,11)+"..." : videos[i].getDescripcion();
					
					array.get(index).add(new Mi_video_item(videos[i], this.getCabecera()));
					contador++;
					if(contador==4) {
						index ++;
						contador = 0;
					}
					
				}
				
			}
			
		}
		
	}
	
	private void bConfigurar(Mi_cabecera mi_cabecera) {
		
		this.getCabecera().getVl().removeAll();
		this.getCabecera().setConfig(new Configurar(mi_cabecera.getUser(), mi_cabecera.getDatos(), mi_cabecera));
		this.getCabecera().setConfigPerf(new Configurar_mi_perfil(mi_cabecera, this.getCabecera().getConfig()));
		this.getCabecera().getVl().add(this.getCabecera().getConfigPerf());
	}
		
		
	
	
}