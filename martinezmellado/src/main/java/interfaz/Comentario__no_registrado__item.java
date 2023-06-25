package interfaz;

import basededatos.Comentario;
import basededatos.Usuario_Registrado;
import vistas.VistaComentario__no_registrado__item;

public class Comentario__no_registrado__item extends VistaComentario__no_registrado__item {
//	private ImageButton _imagenAutorIB;
//	private Label _comentariosL;
//	private Label _nMeGustasL;
//	public Comentario__no_registrado_ _comentario__no_registrado_;
//	public Ver_Perfil__no_registrado_ _ver_perfil__no_registrado_;
//
//	public void ver_perfil__no_registrado_() {
//		throw new UnsupportedOperationException();
//	}

	private Cabecera_usuario_no_registrado cabeceraNoReg;
	private Comentario comentario;
	private Usuario_Registrado usuario;

	public Comentario__no_registrado__item(Comentario comentario2, Cabecera_usuario_no_registrado cabecera) {
		// TODO Auto-generated constructor stub

		// this.cabeceraCom = cabeceraCom;
		// this.miUsuario =
		// this.cabeceraCom.getDatos().cargarDatosUsuario(this.cabeceraCom.getUser().getUsuario());
		this.cabeceraNoReg = cabecera;
		this.getImgUser().addClickListener(event -> {
			verPerfilPropietarioNoReg();
		});

		this.usuario = cabecera.getDatos().cargarDatosUsuario(comentario2.getAutor());

		this.comentario = cabecera.getDatos().cargarComentario(this.usuario,
				cabecera.getDatos().cargarVideoPoID(Integer.valueOf(comentario2.getPublicacion())));
		// TODO Auto-generated constructor stub

		this.getImgUser().setSrc(comentario2.getEs_publicado().getFoto());
		this.getLabelComentario().setText(comentario2.getComentario());
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
		// this.getStyle().set("position", "relative");

		this.getbDenunciar().setVisible(false);
	}

	private void verPerfilPropietarioNoReg() {

		if (this.usuario.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");

			this.cabeceraNoReg
					.setPerfilPrivado(new Ver_perfil_privado__usuario_no_registrado_(this.cabeceraNoReg, this.usuario));
			this.cabeceraNoReg.getVl().removeAll();
			this.cabeceraNoReg.getVl().add(this.cabeceraNoReg.getPerfilPrivado());
			// this.inicio.cambiarPantalla(cabecera);

		} else {

			this.cabeceraNoReg
					.setPerfilPublico(new Ver_perfil__usuario_no_registrado_(this.cabeceraNoReg, this.usuario));
			this.cabeceraNoReg.getVl().removeAll();
			this.cabeceraNoReg.getVl().add(this.cabeceraNoReg.getPerfilPublico());

		}

	}

}