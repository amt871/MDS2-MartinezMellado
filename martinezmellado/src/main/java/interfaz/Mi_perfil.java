package interfaz;

import java.io.File;
import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.PublicacionDAO;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import vistas.VistaMi_perfil;

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
	
	private basededatos.Usuario_Registrado usuario;
	private basededatos.BDPrincipal datos;
	private Scroller scroller;
	private VerticalLayout vl;

	public basededatos.Usuario_Registrado getUsuario() {
		return usuario;
	}

	public void setUsuario(basededatos.Usuario_Registrado usuario) {

		datos = new basededatos.BDPrincipal();
		this.usuario = usuario;
		//File image = new File("/icons/toktok2.svg");
		//System.out.println(image.exists());
		
		//this.setIdImagen(new Image("localhost:8080"+usuario.getFoto(), "Imagen no encontrada"));
		this.getIdImagen().setSrc(usuario.getFoto());
		this.getIdUsuario().setText(this.usuario.getUsuario());
		this.getIdNumSeguidores().setText(String.valueOf(usuario.getID())+" seguidores");
		//this.getIdNumMgs().setText("20 Me gustas");
		this.getIdNumSeguidores().setText(this.usuario.seguido.size()+" seguidores");
		this.getIdNumMgs().setText(this.usuario.le_gusta_a.size()+" me gusta");
		
		//System.out.println(this.usuario.getFoto());
	}
	
	public void listarVideos() {
		
		scroller = this.getScroller();
		vl = new VerticalLayout();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.getStyle().set("width", "100%");
		scroller.getStyle().set("height", "100%");

		scroller.setContent(vl);

		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");
		
		addItem();
		

	}
	
	public void addItem() {
		
		//System.out.println(this.usuario.realiza.size());
		if(this.usuario.realiza.size()==0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Este usuario no ha subido videos aun"));
		}else {
			
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.setHeight("50%");
			vl.setWidth("100%");
			
			//vl.add(new Video("Usuarios/Juanra1997/videos/2023-06-05T23-00-09.914853900.mp4"));
			
			//vl.add(new Mi_video_item("Usuarios/Juanra1997/videos/2023-06-05T23-00-09.914853900.mp4", "Ninna gritona", "100%", "25%"));
			
			basededatos.Publicacion[] videos = null;
			
			try {
				videos = PublicacionDAO.listPublicacionByQuery("Usuario_RegistradoUsuarioID='" + this.usuario.getID() + "'", null);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Notification.show("Fallo al cargar los videos");
			}
			
			if(videos != null) {
				int contador = 0;
				int index = 0;
				ArrayList<HorizontalLayout> array = new ArrayList<HorizontalLayout>();
				for(int i = 0; i<videos.length; i++) {
					//System.out.println(videos[i].getVideo());
					if(contador == 0) {
						System.out.println(contador);
						array.add(new HorizontalLayout());
						array.get(index).setJustifyContentMode(JustifyContentMode.CENTER);
						array.get(index).setAlignItems(Alignment.CENTER);
						array.get(index).getStyle().set("height", "100%");
						array.get(index).getStyle().set("width", "100%");
						array.get(index).setPadding(false);
						array.get(index).setMargin(false);
						array.get(index).setSpacing(false);
						
						array.get(index).getStyle().set("background-color", "black");
						
						vl.add(array.get(index));
					}
					
					String titulo = videos[i].getDescripcion().length() > 15 ? videos[i].getDescripcion().substring(0,11)+"..." : videos[i].getDescripcion();
					
					array.get(index).add(new Mi_video_item(videos[i].getVideo().replace("src/main/webapp/",""), titulo, "100%", "100%"));
					contador++;
					if(contador==4) {
						index ++;
						contador = 0;
						break;
					}
				}
				
			}
			
		}
		
	}
		
		
	
	
}