package interfaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.PublicacionDAO;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaVideo_otro_usuario;

public class Video_otro_usuario extends VistaVideo_otro_usuario{
//	public Ver_perfil_publico__usuario_registrado_ _ver_perfil_publico__usuario_registrado_;
//	public Usuario_Registrado _usuario_Registrado;
//	public Mi_cabecera _mi_cabecera;
//	public Vector<Video_otro_usuario_item> _item = new Vector<Video_otro_usuario_item>(
	
	private Scroller scroller;
	private VerticalLayout vl;
	private Usuario_Registrado usuario;
	private MainView inicio;
	
	public Video_otro_usuario(MainView inicio, Mi_cabecera cabeceraReg) {
		
		this.inicio = inicio;
		this.setCabecera(cabeceraReg);
		
	}
	
	/*public Video_otro_usuario() {
		
		scroller = this.getScroller();
		vl = new VerticalLayout();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		scroller.getStyle().set("width", "100%");
		scroller.getStyle().set("height", "100%");

		scroller.setContent(vl);

		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");
		
		addItem();

	}*/

	public void addItem() {
		
		//ArrayList<Video_otro_usuario_item> array = new ArrayList<Video_otro_usuario_item>();
		
		
		basededatos.Publicacion[] videos = null;
		
		try {
			videos = PublicacionDAO.listPublicacionByQuery("Usuario_RegistradoUsuarioID<>'" + this.usuario.getID() + "'", "Video desc");
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Notification.show("Fallo al cargar los videos");
		}
		
		if(videos.length == 0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("No hay videos aun"));
		}else {
			
			//vl.setAlignItems(Alignment.CENTER);
			//vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.getStyle().set("position", "relative");
			//vl.getStyle().set("top", "5%");
			vl.setHeight("100%");
			vl.setWidth("100%");
			
			ArrayList<Video_otro_usuario_item> array = new ArrayList<Video_otro_usuario_item>();
			
			for(int i = 0; i<videos.length && i<20; i++) {
				
				//System.out.println(this.getCabecera()==null);
				
				
				array.add(new Video_otro_usuario_item(this.usuario, videos[i].getVideo().replace("src/main/webapp/", ""), videos[i].getRealizada(), this.inicio, this.getCabecera()));
				//array.get(i).getLayoutVideo().add(new Video(videos[i].getVideo().replace("src/main/webapp/", "")));
				array.get(i).getStyle().set("position", "relative");
				array.get(i).getStyle().set("height", "100%");
				array.get(i).getStyle().set("width", "100%");
				array.get(i).getImageButton().setSrc(videos[i].getRealizada().getFoto());
				array.get(i).getLabelUsuario().setText(videos[i].getRealizada().getUsuario());
				array.get(i).getIdUbicación().setText(videos[i].getUbicacion());
				array.get(i).getIdFecha().setText(videos[i].getFecha().toString());
				array.get(i).getIdDescripcion().setText(videos[i].getDescripcion());
				array.get(i).getIdNumMg().setText(String.valueOf(videos[i].le_gusta.size()));
				array.get(i).getIdNumComentarios().setText(String.valueOf(videos[i].tiene.size()));
				
				vl.add(array.get(i));
			}
			
		}		
		
	}

	public Usuario_Registrado getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario_Registrado usuario) {
		this.usuario = usuario;


		scroller = this.getScroller();
		vl = new VerticalLayout();


		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		//scroller.getStyle().set("width", "100%");
		//scroller.getStyle().set("height", "95%");

		//scroller.getStyle().set("position", "relative");
		
		//scroller.getStyle().set("top", "5%");
		
		scroller.setContent(vl);

		//vl.getStyle().set("width", "100%");
		//vl.getStyle().set("height", "100%");
		
		//vl.getStyle().set("position", "relative");
		//vl.getStyle().set("top", "5%");
		
		addItem();
	}

	
}