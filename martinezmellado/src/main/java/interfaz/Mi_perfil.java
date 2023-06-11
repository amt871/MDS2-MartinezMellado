package interfaz;

import java.io.File;
import java.util.ArrayList;

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
	//private MainView inicio;
	//private Configurar configurar;
	//private Configurar_mi_perfil configPerf;

	public Mi_perfil(MainView vl2, Mi_cabecera mi_cabecera) {
		// TODO Auto-generated constructor stub
	//}

	//public basededatos.Usuario_Registrado getUsuario() {
		//return usuario;
	//}

	//public void setUsuario(basededatos.Usuario_Registrado usuario) {

		//datos = new basededatos.BDPrincipal();
		this.datos = mi_cabecera.getDatos();
		this.usuario = mi_cabecera.getUser();
		this.setCabecera(mi_cabecera);
		//this.inicio = vl2;
		
		this.getbConfigurar().addClickListener(event -> {
			
			//this.configurar = new Configurar(mi_cabecera.getUser(), mi_cabecera.getDatos());
			//this.configPerf = new Configurar_mi_perfil(this.inicio, mi_cabecera, this.configurar = new Configurar(mi_cabecera.getUser(), mi_cabecera.getDatos()));
			//this.inicio
			this.getCabecera().getVl().removeAll();
			//this.getCabecera().getVl().add(this.getCabecera().setConfig(new Configurar(mi_cabecera.getUser(), mi_cabecera.getDatos()))
					
					
					//);
			this.getCabecera().setConfig(new Configurar(mi_cabecera.getUser(), mi_cabecera.getDatos()));
			this.getCabecera().setConfigPerf(new Configurar_mi_perfil(mi_cabecera, this.getCabecera().getConfig()));
			this.getCabecera().getVl().add(this.getCabecera().getConfigPerf());
			
		});
		
		//File image = new File("/icons/toktok2.svg");
		//System.out.println(image.exists());
		
		//this.setIdImagen(new Image("localhost:8080"+usuario.getFoto(), "Imagen no encontrada"));
		this.getIdImagen().setSrc(usuario.getFoto());
		this.getIdUsuario().setText(this.usuario.getUsuario());
		//this.getIdNumMgs().setText("20 Me gustas");
		this.getIdNumSeguidores().setText(this.usuario.seguido.size()+" seguidores");
		this.getIdNumMgs().setText(this.usuario.le_gusta_a.size()+" me gusta");
		
		//System.out.println(this.usuario.getFoto());
		
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
		if(this.usuario.realiza.size()==0) {
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
			
			basededatos.Publicacion[] videos = null;
			
			videos = datos.listarVideosUsuario(this.usuario.getID());
			
			if(videos != null) {
				int contador = 0;
				int index = 0;
				ArrayList<HorizontalLayout> array = new ArrayList<HorizontalLayout>();
				//ArrayList<VistaMi_video> array = new ArrayList<VistaMi_video>();
				for(int i = 0; i<videos.length; i++) {
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
					
					array.get(index).add(new Mi_video_item(videos[i].getVideo().replace("src/main/webapp/",""), titulo)/*, "100%", "25%")*/);
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
		
		
	
	
}