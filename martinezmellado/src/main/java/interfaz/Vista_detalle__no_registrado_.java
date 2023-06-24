package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

import basededatos.Comentario;
import basededatos.Hashtag;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaVista_detalle__no_registrado_;

public class Vista_detalle__no_registrado_ extends VistaVista_detalle__no_registrado_ {
//	private Button _volver;
//	private ImageButton _imagenPropietarioIB;
//	private Label _nombrePropietarioL;
//	private Label _fechaPublicacionL;
//	private Label _ubicacionL;
//	private Label _comentariosL;
//	private Label _meGustasL;
//	private ImageIcon _imagenMeGustasII;
//	public Inicio_no_registrado_item _inicio_no_registrado;
//	public Videos_hashtag__no_registrado__item _videos_hashtag__no_registrado_;
//	public Ver_Perfil__no_registrado_ _ver_perfil__no_registrado_;
//	public Comentario__no_registrado_ _comentario__no_registrado_;
//	public void ver_perfil__no_registrado_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volver() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void comentario__no_registrado_() {
//		throw new UnsupportedOperationException();
//	}

	private VerticalLayout vl;
	private Scroller scroller;
	private Publicacion publicacion;
	private Cabecera_usuario_no_registrado cabecera;
	private Usuario_Registrado propietario;

	public Vista_detalle__no_registrado_(Cabecera_usuario_no_registrado cabeceraNoReg, Publicacion publi) {
		// TODO Auto-generated constructor stub

		this.propietario = publi.getRealizada();
		this.cabecera = cabeceraNoReg;
		this.publicacion = publi;
		this.setCabecera(cabeceraNoReg);
		this.getLabelFecha().setText(publi.getFecha().toString());
		this.getLabelUbicacion().setText(publi.getUbicacion());
		this.getLabelUsuario().setText(publi.getRealizada().getUsuario());
		this.getImage().setSrc(publi.getRealizada().getFoto());
		this.getVlVideo().add(new Video(publi.getVideo().replace("src/main/webapp/", ""), "90%", "90%"));
		setDescripcion();
		/*
		 * int megustas = 0; for(Publicacion publicacion :
		 * publi.getRealizada().realiza.toArray()) megustas +=
		 * publicacion.le_gusta.size();
		 */
		this.getLabelMeGustas().setText(publi.le_gusta.size() + " me gustas");

		this.getImage().addClickListener(event -> {

			verPerfilOtroUsuarioNoReg();

		});

		this.getbVerMeGustas().addClickListener(e -> {
			bVerMeGustas();
		});

		this.publicacion = publi;
		this.vl = new VerticalLayout();

		scroller = this.getScroller();

		scroller.setScrollDirection(ScrollDirection.VERTICAL);
		scroller.setContent(vl);
		vl.setHeight("100%");
		vl.setWidth("100%");
		vl.setAlignItems(Alignment.CENTER);
		// vl.setJustifyContentMode(JustifyContentMode.CENTER);

		if (publi.tiene.toArray().length == 0) {
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Esta publicacion no tiene comentarios"));
		} else
			addItems();
	}

	private void addItems() {

		Comentario[] comentarios = this.publicacion.tiene.toArray();

		for (int i = 0; i < comentarios.length; i++)
			vl.add(new Comentario_item(comentarios[i], this.cabecera));

	}

	private void verPerfilOtroUsuarioNoReg() {

		if (this.propietario.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");

			this.cabecera
					.setPerfilPrivado(new Ver_perfil_privado__usuario_no_registrado_(this.cabecera, this.propietario));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getPerfilPrivado());
			// this.inicio.cambiarPantalla(cabecera);

		} else {

			this.cabecera.setPerfilPublico(new Ver_perfil__usuario_no_registrado_(this.cabecera, this.propietario));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getPerfilPublico());

		}
	}

	private void otroUsuarioNoReg(Usuario_Registrado userAVisitar) {

		if (userAVisitar.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");

			this.cabecera.setPerfilPrivado(new Ver_perfil_privado__usuario_no_registrado_(this.cabecera, userAVisitar));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getPerfilPrivado());
			// this.inicio.cambiarPantalla(cabecera);

		} else {

			this.cabecera.setPerfilPublico(new Ver_perfil__usuario_no_registrado_(this.cabecera, userAVisitar));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getPerfilPublico());

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
				Hashtag has = this.cabecera.getDatos().ObtenerHahsTag(item);
				if (has != null) {
					horizontalLayout.getStyle().set("color", "blue");
					horizontalLayout.addClickListener(e -> {
						// System.out.println(((Label)e.getSource().getComponentAt(0)).getText());
						// Hashtag has = this.cabeceraUserReg.getDatos().h

						this.cabecera.setHashtags(new Videos_hashtag__no_registrado_(has, this.cabecera));
						this.cabecera.getVl().removeAll();
						this.cabecera.getVl().add(this.cabecera.getHashtags());

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
				Usuario_Registrado userAVisitar = this.cabecera.getDatos().cargarDatosUsuario(item.replace("@", ""));
				if (userAVisitar != null) {
					horizontalLayout.getStyle().set("color", "blue");
					horizontalLayout.addClickListener(e -> {
						// System.out.println(((Label)e.getSource().getComponentAt(0)).getText());
						otroUsuarioNoReg(userAVisitar);
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

	public void bVerMeGustas() {
		this.cabecera.setVerMeGustas(new Ver_me_gustas__no_registrado_(this.cabecera, this.publicacion));
		this.cabecera.getVl().removeAll();
		this.cabecera.getVl().add(this.cabecera.getVerMeGustas());

	}
}