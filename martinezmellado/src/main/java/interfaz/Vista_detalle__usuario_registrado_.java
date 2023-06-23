package interfaz;

import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

import basededatos.BDPrincipal;
import basededatos.Comentario;
import basededatos.Hashtag;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaVista_detalle__usuario_registrado_;

public class Vista_detalle__usuario_registrado_ extends VistaVista_detalle__usuario_registrado_ {
//	private Button _volver__usuario_registrado_;
//	private ImageButton _imagenPropietarioVideoIB;
//	private Label _nombrePropietarioVideoL;
//	private Label _fechaPublicacionL;
//	private Label _ubicacionL;
//	private Button _anadirComentarioB;
//	public Video_otro_usuario_item _video_otro_usuario;
//	public Video_hashtag__usuario_registrado__item _video_hashtag__usuario_registrado_;
//	public Comentario__usuario_registrado_ _comentario__usuario_registrado_;
//	public Escribir_comentario _escribir_comentario;

//	public Vista_detalle__usuario_registrado_(Mi_cabecera cabeceraUserReg) {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void comentario__usuario_registrado_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void escribir_comentario() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volver__usuario_registrado_() {
//		throw new UnsupportedOperationException();
//	}

	private Scroller scroller;
	private VerticalLayout vl;
	private BDPrincipal datos;
	private Publicacion publicacion;
	private Mi_cabecera cabeceraUserReg;
	private Cabecera_comercial cabeceraCom;
	private Usuario_Registrado miUsuario;
	private Usuario_Registrado usuario;

	private final String codigoHashtag = "AS0]kMrHs++T|ig]rkXU";
	private final String codigoMention = "=5iY~HYqmGV6qHoDHxY0";

	public Vista_detalle__usuario_registrado_(Mi_cabecera cabeceraUserReg, Usuario_Registrado usuario,
			Publicacion publicacion) {
		// TODO Auto-generated constructor stub
		this.usuario = usuario;
		this.miUsuario = null;
		this.cabeceraUserReg = cabeceraUserReg;
		this.datos = cabeceraUserReg.getDatos();
		this.publicacion = publicacion;
		this.miUsuario = this.cabeceraUserReg.getDatos()
				.cargarDatosUsuario(this.cabeceraUserReg.getUser().getUsuario());
		this.setCabecera(cabeceraUserReg);
		this.getImgUser().setSrc(this.publicacion.getRealizada().getFoto());
		// this.getLabelDescripcion().setText(this.publicacion.getDescripcion());//////////////////////////////////////////
		setDescripcion();
		///////////////////////////////////////////////////////
		this.getLabelUsuario().setText(this.publicacion.getRealizada().getUsuario());
		this.getLabelFecha().setText(this.publicacion.getFecha().toString());
		this.getLabelUbi().setText(this.publicacion.getUbicacion());
		this.getLayoutVideo().add(new Video(this.publicacion.getVideo().replace("src/main/webapp/", ""), "90%", "90%"));
		this.getImgUser().addClickListener(event -> {
			verPerfilPropietario();
		});

		if (this.miUsuario.getID() == this.publicacion.getRealizada().getID())
			this.getVaadinButton().setEnabled(false);
		else
			this.getVaadinButton().addClickListener(e -> {

				Publicacion publicacionAux = this.datos.cargarVideoPoID(this.publicacion.getID());
				boolean flag = false;
				for (Usuario_Registrado usuarios : publicacionAux.le_gusta.toArray()) {
					if (usuarios.getUsuario().equals(miUsuario.getUsuario())) {
						flag = true;
					}
				}
				if (flag) {
					Notification.show("Ya le has dado me gusta a esta publicación");
				} else {
					this.usuario = this.datos.cargarDatosUsuario(usuario.getUsuario());
					this.publicacion = this.datos.cargarVideoPoID(this.publicacion.getID());
					this.datos.annadirMeGusta(publicacionAux.getID(), this.miUsuario.getID());
					this.datos.annadirNotificacion("me_gusta", this.usuario, miUsuario, publicacionAux);
					this.getLabelMeGustas()
							.setText(String.valueOf(Integer.parseInt(this.getLabelMeGustas().getText()) + 1));
				}

			});

		this.getLabelMeGustas().setText(String.valueOf(publicacion.le_gusta.size()));

		this.getbAddComentario().addClickListener(event -> {
			if (this.datos.cargarComentario(this.getCabecera().getUser(), this.publicacion) != null) {
				Notification.show("Ya has comentado esta publicacion ateriormente");
			} else {
				if (addComentario()) {
					this.datos.annadirNotificacion("comentario", this.usuario, cabeceraUserReg.getUser(),
							this.publicacion);
					this.vl.removeAll();
					this.publicacion = this.datos.cargarVideoPoID(this.publicacion.getID());
					addItems();
				}
				this.getFieldComentario().clear();
			}

		});

		this.getbVerMeGustas().addClickListener(e -> {

			this.cabeceraUserReg
					.setVerMeGustas(new Ver_me_gustas__otro_usuario_(this.cabeceraUserReg, this.publicacion));
			this.cabeceraUserReg.getVl().removeAll();
			this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getVerMeGustas());

		});

		this.vl = new VerticalLayout();

		scroller = this.getScroller();

		scroller.setScrollDirection(ScrollDirection.VERTICAL);
		scroller.setContent(vl);
		vl.setHeight("100%");
		vl.setWidth("100%");
		vl.setAlignItems(Alignment.CENTER);
		// vl.setJustifyContentMode(JustifyContentMode.CENTER);

		if (this.publicacion.tiene.toArray().length == 0) {
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Esta publicacion no tiene comentarios"));
		} else
			addItems();

		// this.getLabelDescripcion()
	}

	public Vista_detalle__usuario_registrado_(Cabecera_comercial cabeceraCom, Usuario_Registrado user,
			Publicacion publi) {
		// TODO Auto-generated constructor stub
		this.miUsuario = null;
		this.cabeceraCom = cabeceraCom;
		this.datos = cabeceraCom.getDatos();
		this.publicacion = publi;
		this.miUsuario = this.cabeceraCom.getDatos().cargarDatosUsuario(this.cabeceraCom.getUser().getUsuario());
		this.setCabeceraCom(cabeceraCom);
		this.getImgUser().setSrc(publicacion.getRealizada().getFoto());
		this.getLabelDescripcion().setText(publicacion.getDescripcion());
		this.getLabelUsuario().setText(publicacion.getRealizada().getUsuario());
		this.getLabelFecha().setText(publicacion.getFecha().toString());
		this.getLabelUbi().setText(publicacion.getUbicacion());
		this.getLayoutVideo().add(new Video(publicacion.getVideo().replace("src/main/webapp/", ""), "90%", "90%"));
		this.getImgUser().addClickListener(event -> {
			cabeceraCom.getbPerfil().click();

		});
		this.getVaadinButton().setEnabled(false);
		this.getLabelMeGustas().setText(String.valueOf(publi.le_gusta.size()));

		/*
		 * this.getbAddComentario().addClickListener(event -> { boolean flag = false;
		 * for (Comentario comen : this.publicacion.tiene.toArray()) { if
		 * (comen.getAutor().equals(user.getUsuario())) { flag = true; } } if
		 * (this.datos.cargarComentario(this.getCabecera().getUser(), publicacion) !=
		 * null) { Notification.show("Ya has comentado esta publicacion ateriormente");
		 * }else { if(addComentario()) { this.datos.annadirNotificacion("comentario",
		 * user, cabeceraCom.getUser(), publicacion); this.vl.removeAll(); addItems(); }
		 * this.getFieldComentario().clear(); }
		 * 
		 * });
		 */

		this.getbAddComentario().setVisible(false);
		this.getFieldComentario().setVisible(false);

		this.vl = new VerticalLayout();

		scroller = this.getScroller();

		scroller.setScrollDirection(ScrollDirection.VERTICAL);
		scroller.setContent(vl);
		vl.setHeight("100%");
		vl.setWidth("100%");
		vl.setAlignItems(Alignment.CENTER);
		// vl.setJustifyContentMode(JustifyContentMode.CENTER);

		if (this.publicacion.tiene.toArray().length == 0) {
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Esta publicacion no tiene comentarios"));
		} else
			addItems();
	}

	private void addItems() {

		Comentario[] comentarios = this.publicacion.tiene.toArray();

		for (int i = 0; i < comentarios.length; i++)
			if (this.cabeceraUserReg != null)
				vl.add(new Comentario_item(comentarios[i], this.cabeceraUserReg));
			else
				vl.add(new Comentario_item(comentarios[i], this.cabeceraCom));

	}

	private boolean addComentario() {

		if (this.getFieldComentario().isEmpty())
			return false;

		return this.datos.annadirComentario(this.getCabecera().getUser().getUsuario(), this.publicacion,
				this.getFieldComentario().getValue());

		// return true;

	}

	private void verPerfilPropietario() {

		if (this.miUsuario.getID() == this.usuario.getID()) {
			this.cabeceraUserReg.setPerfil(new Mi_perfil(this.cabeceraUserReg.getVl(), this.cabeceraUserReg));
			this.cabeceraUserReg.getVl().removeAll();
			this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getPerfil());
			return;
		}

		if (this.usuario.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			if (this.miUsuario.seguido.contains(this.usuario)) {
				this.cabeceraUserReg
						.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, this.usuario));
				this.cabeceraUserReg.getVl().removeAll();
				this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getPerfilPublico());
			} else {
				this.cabeceraUserReg.setPerfilPrivado(
						new Ver_perfil_privado__usuario_registrado_(this.cabeceraUserReg, this.usuario));
				this.cabeceraUserReg.getVl().removeAll();
				this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			}
		} else {

			this.cabeceraUserReg
					.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, this.usuario));
			this.cabeceraUserReg.getVl().removeAll();
			this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getPerfilPublico());

		}
	}

	private void otroUsuario(Usuario_Registrado userAVisitar) {

		// System.out.println("Hola " + user);

		// Usuario_Registrado userAVisitar = this.datos.cargarDatosUsuario(user);

		if (userAVisitar == null)
			return;

		if (this.miUsuario.getID() == userAVisitar.getID()) {
			this.cabeceraUserReg.setPerfil(new Mi_perfil(this.cabeceraUserReg.getVl(), this.cabeceraUserReg));
			this.cabeceraUserReg.getVl().removeAll();
			this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getPerfil());
			return;
		}

		if (userAVisitar.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			if (this.miUsuario.seguido.contains(userAVisitar)) {
				this.cabeceraUserReg
						.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, userAVisitar));
				this.cabeceraUserReg.getVl().removeAll();
				this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getPerfilPublico());
			} else {
				this.cabeceraUserReg.setPerfilPrivado(
						new Ver_perfil_privado__usuario_registrado_(this.cabeceraUserReg, userAVisitar));
				this.cabeceraUserReg.getVl().removeAll();
				this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			}
		} else {

			this.cabeceraUserReg
					.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, userAVisitar));
			this.cabeceraUserReg.getVl().removeAll();
			this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getPerfilPublico());

		}
	}

	private void setDescripcion() {

		this.getLabelDescripcion().setVisible(false);

		// this.getLayoutDescripcion().spa

		String[] items = this.publicacion.getDescripcion().split(" ");
		// String descpricion = "";
		// int contHashtag = 0;
		// int contMention = 0;

		String cadena = "";

		for (String item : items) {
			if (item.startsWith("#")) {
				HorizontalLayout horizontalLayout = new HorizontalLayout();
				horizontalLayout.add(new Label(item));
				Hashtag has = this.datos.ObtenerHahsTag(item);
				if (has != null) {
					horizontalLayout.getStyle().set("color", "blue");
					horizontalLayout.addClickListener(e -> {
						// System.out.println(((Label)e.getSource().getComponentAt(0)).getText());
						// Hashtag has = this.cabeceraUserReg.getDatos().h

						this.cabeceraUserReg
								.setHashtags(new Video_hashtag__usuario_registrado_(has, this.cabeceraUserReg));
						this.cabeceraUserReg.getVl().removeAll();
						this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getHashtags());

					});
				}
				if (!cadena.equals(""))
					this.getLayoutDescripcion().add(new Label(cadena));
				cadena = "";
				this.getLayoutDescripcion().add(horizontalLayout);
				// this.getLayoutDescripcion().add(" ");
				continue;
			}

			if (item.startsWith("@")) {
				HorizontalLayout horizontalLayout = new HorizontalLayout();
				horizontalLayout.add(new Label(item));
				Usuario_Registrado userAVisitar = this.datos.cargarDatosUsuario(item.replace("@", ""));
				if (userAVisitar != null) {
					horizontalLayout.getStyle().set("color", "blue");
					horizontalLayout.addClickListener(e -> {
						// System.out.println(((Label)e.getSource().getComponentAt(0)).getText());
						otroUsuario(userAVisitar);
					});
				}
				if (!cadena.equals(""))
					this.getLayoutDescripcion().add(new Label(cadena));
				cadena = "";
				this.getLayoutDescripcion().add(horizontalLayout);
				// this.getLayoutDescripcion().add(" ");
				continue;
			}

			cadena += item + " ";

		}

		this.getLayoutDescripcion().add(new Label(cadena));

	}
}