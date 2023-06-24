package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import org.orm.PersistentException;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.BoxSizing;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.Publicacion;
import basededatos.PublicacionDAO;
import basededatos.Usuario_Registrado;
import vistas.VistaVer_perfil__usuario_registrado_;

//import basededatos.iVer_perfil__usuario_registrado_;

public class Ver_perfil__usuario_registrado_ extends VistaVer_perfil__usuario_registrado_ {
//	private Button _denunciar_perfil;
//	private Button _dejar_de_seguir;
//	private Button _seguir_solicitar_seguir;
//	private Label _nSeguidoresL;
//	private Label _nombreUsuarioL;
//	private Label _nMeGustasL;
//	public iVer_perfil__usuario_registrado_ _iVer_perfil__usuario_registrado_;

	/*
	 * public void denunciar_perfil() { throw new UnsupportedOperationException(); }
	 * 
	 * public void dejar_de_seguir() { throw new UnsupportedOperationException(); }
	 * 
	 * public void seguir_solicitar_seguir() { throw new
	 * UnsupportedOperationException(); }
	 */

	// private basededatos.Usuario_Registrado usuario;

	private Scroller scroller;
	private VerticalLayout vl;
	private Usuario_Registrado usuario;
	private Mi_cabecera cabecera;
	private Usuario_Registrado miUsuario_Registrado;

	public Ver_perfil__usuario_registrado_(Mi_cabecera cabecera, Usuario_Registrado usuario) {

		this.getDivCabecera().add(cabecera);
		this.cabecera = cabecera;
		this.getLabelSeguidores().setText("Seguidores: " + usuario.seguidor.size());

		int megustas = 0;
		for (Publicacion publi : usuario.realiza.toArray())
			megustas += publi.le_gusta.size();

		this.getLabelMegustas().setText(megustas + " me gustas");
		this.getImage().setSrc(usuario.getFoto());
		this.getLabelUsuario().setText(usuario.getUsuario());
		this.usuario = this.cabecera.getDatos().cargarDatosUsuario(usuario.getUsuario());
		this.miUsuario_Registrado = this.cabecera.getDatos().cargarDatosUsuario(this.cabecera.getUser().getUsuario());

		this.getbDenuncia().addClickListener(event -> {
			bDenuncia();
		});
		boolean flag = true;
		for (Usuario_Registrado seguidor : usuario.seguidor.toArray()) {
			if (seguidor.getUsuario().equals(miUsuario_Registrado.getUsuario())) {
				flag = false;
			}
		}
		// System.out.println(flag);
		if (flag) {
			this.getSeguirButton().setText("Seguir");
		} else {
			this.getSeguirButton().setText("Dejar de seguir");
		}

		if (!usuario.getComercial().equalsIgnoreCase("comercial")) {

			this.getSeguirButton().addClickListener(event -> {
				SeguirButton();
			});

		} else {
			this.getSeguirButton().setVisible(false);
			this.getDivVideos().setHeight("65%");
		}

		this.getLayoutSeguidores().addClickListener(e -> {
			LayoutSeguidores();
		});

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

			if (videos != null) {
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

					array.get(index).add(new Mi_video_item(videos[i], this.cabecera)/* , "100%", "25%") */);
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

	public void bDenuncia() {
		this.usuario = this.cabecera.getDatos().cargarDatosUsuario(usuario.getUsuario());
		this.miUsuario_Registrado = this.cabecera.getDatos().cargarDatosUsuario(this.cabecera.getUser().getUsuario());
		boolean flag = true;
		for (Usuario_Registrado denunciate : this.usuario.denunciante.toArray()) {
			;
			if (denunciate.getUsuario().equals(miUsuario_Registrado.getUsuario())) {
				flag = false;
			}
		}
		if (flag) {
			this.cabecera.getDatos().denunciarUsuario(miUsuario_Registrado, usuario);
		} else {
			Notification.show("Ya has denunciado este usuario");
		}
	}

	public void SeguirButton() {

		if (this.cabecera.getDatos().segimiento(this.usuario, this.cabecera.getUser()))
			if (this.getSeguirButton().getText().equals("Seguir")) {
				this.getSeguirButton().setText("Dejar de seguir");
				this.cabecera.getDatos().annadirNotificacion("seguir", this.usuario, this.cabecera.getUser(), null);
				int aux = Integer.valueOf(this.getLabelSeguidores().getText().replace("Seguidores: ", "")) + 1;
				this.getLabelSeguidores().setText(String.valueOf("Seguidores: " + aux));
			} else {
				this.getSeguirButton().setText("Seguir");
				int aux = Integer.valueOf(this.getLabelSeguidores().getText().replace("Seguidores: ", "")) - 1;
				this.getLabelSeguidores().setText(String.valueOf("Seguidores: " + aux));
				if (this.usuario.getPrivado() == true) {
					this.cabecera
							.setPerfilPrivado(new Ver_perfil_privado__usuario_registrado_(this.cabecera, this.usuario));
					this.cabecera.getVl().removeAll();
					this.cabecera.getVl().add(this.cabecera.getPerfilPrivado());
				}
			}

		// Notification.show("Siguiendo");
	}

	public void LayoutSeguidores() {
		this.cabecera.setSeguidoresOtroUsuario(new Ver_seguidores_otro_usuario(this.cabecera, this.usuario));
		this.cabecera.getVl().removeAll();
		this.cabecera.getVl().add(this.cabecera.getSeguidoresOtroUsuario());

	}

}