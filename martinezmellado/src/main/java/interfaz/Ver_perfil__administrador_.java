package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.BoxSizing;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaVer_perfil__administrador_;

//import basededatos.iVer_perfil__administrador_;

public class Ver_perfil__administrador_ extends VistaVer_perfil__administrador_ {
//	private Button _eliminar_perfil__administrador_;
//	private Button _bloquear_cuenta;
//	private Label _nSeguidoresL;
//	private Label _nMeGustasL;
//	private ImagenIcon _fotoPerfilII;
//	private Label _privacidaCuentaL;
//	public Me_gusta__administrador__item _unnamed_Me_gusta__administrador__item_;
//	public Resultado_busqueda_usuarios_item _unnamed_Resultado_busqueda_usuarios_item_;
//	public Denuncias_item _unnamed_Denuncias_item_;
//	public Ver_me_gustas__administrador_ _unnamed_Ver_me_gustas__administrador__;
//	public Vista_detalle__administrador_ _unnamed_Vista_detalle__administrador__;
//	public Video_otro_usuario__administrador__item _unnamed_Video_otro_usuario__administrador__item_;
//	public Comentario__administrador__item _unnamed_Comentario__administrador__item_;
////	public iVer_perfil__administrador_ _iVer_perfil__administrador_;
//	public Vista_detalle__administrador_ _vista_detalle__administrador_;
//	public Video_otro_usuario__administrador_ _unnamed_Video_otro_usuario__administrador__;
//	
//	public void vista_detalle__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void eliminar_perfil__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void bloquear_cuenta() {
//		throw new UnsupportedOperationException();
//	}
	
	private Scroller scroller;
	private VerticalLayout vl;
	private Usuario_Registrado usuario;
	private Cabecera__administrador_ cabecera;

	public Ver_perfil__administrador_(Cabecera__administrador_ cabecera, Usuario_Registrado propietario) {
		// TODO Auto-generated constructor stub
		
		this.setCabecera(cabecera);
		this.cabecera = cabecera;
		this.getLabelSeguidores().setText("Seguidores: "+propietario.seguidor.size());
		this.getLabelMeGustas().setText("Me gustas dados: "+propietario.le_gusta.size());
		this.getImage().setSrc(propietario.getFoto());
		this.getLabelUsuario().setText(propietario.getUsuario());
		if(!propietario.getPrivado()) this.getLabelPrivado().setVisible(false);
		
		this.usuario = propietario;
		
		listarVideos();
	}
	
	public void listarVideos() {

		scroller = this.getScroller();
		vl = new VerticalLayout();

		scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

		// scroller.getStyle().set("width", "100%");
		// scroller.getStyle().set("height", "65%");

		scroller.setContent(vl);

		// vl.getStyle().set("width", "100%");
		// vl.getStyle().set("height", "100%");

		// vl.getStyle().set("background-color", "black");

		addItem();

	}

	public void addItem() {

		// System.out.println(this.usuario.realiza.size());
		if (this.usuario.realiza.size() == 0) {
			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Este usuario no ha subido videos aun"));
		} else {

			vl.setAlignItems(Alignment.CENTER);
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.getStyle().set("position", "relative");
			// vl.getStyle().set("top", "35%");
			// vl.setHeight("100%");
			// vl.setWidth("100%");

			// vl.add(new
			// Video("Usuarios/Juanra1997/videos/2023-06-05T23-00-09.914853900.mp4"));

			// vl.add(new
			// Mi_video_item("Usuarios/Juanra1997/videos/2023-06-05T23-00-09.914853900.mp4",
			// "Ninna gritona", "100%", "25%"));

			basededatos.Publicacion[] videos = null;
			
			videos = this.usuario.realiza.toArray();
			
			Arrays.sort(videos, new Comparator<Publicacion>() {
			    public int compare(Publicacion p1, Publicacion p2) {
			        return Integer.compare(p2.getID(), p1.getID());
			    }
			});
			
			if(videos != null) {
				int contador = 0;
				int index = 0;
				ArrayList<HorizontalLayout> array = new ArrayList<HorizontalLayout>();
				// ArrayList<VistaMi_video> array = new ArrayList<VistaMi_video>();
				for (int i = 0; i < videos.length; i++) {
					// System.out.println(videos[i].getVideo());
					if (contador == 0) {
						// System.out.println(contador);
						array.add(new HorizontalLayout());
						// System.out.println("Add horizontal");
						array.get(index).setJustifyContentMode(JustifyContentMode.CENTER);
						array.get(index).setAlignItems(Alignment.CENTER);
						array.get(index).getStyle().set("height", "100%");
						array.get(index).getStyle().set("width", "100%");
						array.get(index).getStyle().set("position", "relative");
						// array.get(index).getStyle().set("overflow", "auto");
						array.get(index).setBoxSizing(BoxSizing.BORDER_BOX);
//						array.get(index).setPadding(true);
//						array.get(index).setMargin(false);
//						array.get(index).setSpacing(false);

						// array.get(index).getStyle().set("background-color", "black");

						vl.add(array.get(index));
					}

					String titulo = videos[i].getDescripcion().length() > 15
							? videos[i].getDescripcion().substring(0, 11) + "..."
							: videos[i].getDescripcion();

					array.get(index).add(new Mi_video_item(videos[i], this.getCabecera())/* , "100%", "25%") */);
					// array.get(index).add(new)
					contador++;
					if (contador == 4) {
						index++;
						contador = 0;
						// vl.add(array.get(0));
						// break;
					}

				}

			}

		}
	}


}