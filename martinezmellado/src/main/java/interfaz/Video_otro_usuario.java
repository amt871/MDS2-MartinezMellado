package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.BDPrincipal;
import basededatos.Publicacion;
import basededatos.PublicacionDAO;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaVideo_otro_usuario;

public class Video_otro_usuario extends VistaVideo_otro_usuario {
//	public Ver_perfil_publico__usuario_registrado_ _ver_perfil_publico__usuario_registrado_;
//	public Usuario_Registrado _usuario_Registrado;
//	public Mi_cabecera _mi_cabecera;
//	public Vector<Video_otro_usuario_item> _item = new Vector<Video_otro_usuario_item>(

	private Scroller scroller;
	private VerticalLayout vl;
	private Usuario_Registrado usuario;
	private MainView inicio;
	private BDPrincipal datos;
	private ArrayList<Video_otro_usuario_item> array;
	private ArrayList<Publicacion> videos;
	private ArrayList<Usuario_Registrado> seguidos;
	private Usuario_Registrado[] aux;

	public Video_otro_usuario(MainView inicio, Mi_cabecera cabeceraReg) {
		
		clear();

		this.inicio = inicio;
		this.setCabecera(cabeceraReg);

		// this.getStyle().set("position", "absolute");

		this.usuario = this.getCabecera().getDatos().cargarDatosUsuario(getCabecera().getUser().getUsuario());
		this.datos = cabeceraReg.getDatos();

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
		this.videos = new ArrayList<Publicacion>();
		this.seguidos = new ArrayList<Usuario_Registrado>();
		
		ArrayList<Usuario_Registrado> comerciales = new ArrayList<Usuario_Registrado>();
		for (Object users :  this.datos.buscarUsuario("").toArray()) {
			Usuario_Registrado aux = (Usuario_Registrado) users;
			if (aux.getComercial().equals("Comercial")) {
				comerciales.add(aux);
			}
		}
		
		ArrayList<Publicacion> videosPublicidad = new ArrayList<Publicacion>();
				
		if (comerciales != null) {
			for (Usuario_Registrado comercial : comerciales) {
				for (Publicacion publicacion : comercial.realiza.toArray()) {
					videosPublicidad.add(publicacion);
				}
			}
		}
		Collections.shuffle(videosPublicidad);
		

		this.aux = this.usuario.seguidor.toArray();
		if (aux != null) {
			for (Usuario_Registrado object : this.usuario.seguido.toArray()) {
				seguidos.add(object);
			}
			for (Usuario_Registrado usuario_Registrado : seguidos) {
				videos.addAll(Arrays.asList(usuario_Registrado.realiza.toArray()));
			}
			
			videos.sort(new Comparator<Publicacion>() {
			    public int compare(Publicacion p1, Publicacion p2) {
			        return Integer.compare(p2.getID(), p1.getID());
			    }
			});
		}
		
		int contPubli = 0;
		if (videos.size() == 0) {
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
			this.array = new ArrayList<Video_otro_usuario_item>();
			int limite = videos.size();
				
				for (int i = 0; i < limite ; i++) {
					
					if (contPubli == 3) {
						if (indPubli < 0) indPubli = videosPublicidad.size() - 1;
						
						this.array.add(new Video_otro_usuario_item(this.usuario,
								videosPublicidad.get(indPubli), videosPublicidad.get(indPubli).getRealizada(),
								this.inicio, this.getCabecera(), this));
						this.array.get(i).getStyle().set("position", "relative");
						this.array.get(i).getStyle().set("height", "100%");
						this.array.get(i).getStyle().set("width", "100%");
						this.array.get(i).getImageButton().setSrc(videosPublicidad.get(indPubli).getRealizada().getFoto());
						this.array.get(i).getLabelUsuario().setText(videosPublicidad.get(indPubli).getRealizada().getUsuario());
						this.array.get(i).getIdUbicacion().setText(videosPublicidad.get(indPubli).getUbicacion());
						this.array.get(i).getIdFecha().setText(videosPublicidad.get(indPubli).getFecha().toString());
						this.array.get(i).getIdDescripcion().setText("PUBLICIDAD\n" +videosPublicidad.get(indPubli).getDescripcion());
						this.array.get(i).getIdNumMg().setText(String.valueOf(videosPublicidad.get(indPubli).le_gusta.size()));
						this.array.get(i).getIdNumComentarios().setText(String.valueOf(videosPublicidad.get(indPubli).tiene.size()));
						vl.add(array.get(i));
						
						indPubli--;
						limite++;
						contPubli = 0;
					}else {
						this.array.add(new Video_otro_usuario_item(this.usuario,
								videos.get(indVideo), videos.get(indVideo).getRealizada(),
								this.inicio, this.getCabecera(), this));
						this.array.get(i).getStyle().set("position", "relative");
						this.array.get(i).getStyle().set("height", "100%");
						this.array.get(i).getStyle().set("width", "100%");
						this.array.get(i).getImageButton().setSrc(videos.get(indVideo).getRealizada().getFoto());
						this.array.get(i).getLabelUsuario().setText(videos.get(indVideo).getRealizada().getUsuario());
						this.array.get(i).getIdUbicacion().setText(videos.get(indVideo).getUbicacion());
						this.array.get(i).getIdFecha().setText(videos.get(indVideo).getFecha().toString());
						this.array.get(i).getIdDescripcion().setText(videos.get(indVideo).getDescripcion());
						this.array.get(i).getIdNumMg().setText(String.valueOf(videos.get(indVideo).le_gusta.size()));
						this.array.get(i).getIdNumComentarios().setText(String.valueOf(videos.get(indVideo).tiene.size()));
						contPubli++;
						indVideo++;
						vl.add(array.get(i));	
					}
				}
		}

	}

	public Usuario_Registrado getUsuario() {
		return usuario;
	}

	public void clear() {
		if (array != null)
			this.array.clear();
		
		if (videos != null)
			this.videos.clear();
		
		if (seguidos != null)
			this.seguidos.clear();

		this.array = null;
		this.videos = null;
		this.seguidos = null;
		this.aux = null;
	}

	/*
	 * public void setUsuario(Usuario_Registrado usuario) { this.usuario = usuario;
	 * 
	 * 
	 * scroller = this.getScroller(); vl = new VerticalLayout();
	 * 
	 * 
	 * scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);
	 * 
	 * //scroller.getStyle().set("width", "100%");
	 * //scroller.getStyle().set("height", "95%");
	 * 
	 * //scroller.getStyle().set("position", "relative");
	 * 
	 * //scroller.getStyle().set("top", "5%");
	 * 
	 * scroller.setContent(vl);
	 * 
	 * //vl.getStyle().set("width", "100%"); //vl.getStyle().set("height", "100%");
	 * 
	 * //vl.getStyle().set("position", "relative"); //vl.getStyle().set("top",
	 * "5%");
	 * 
	 * addItem(); }
	 */

}