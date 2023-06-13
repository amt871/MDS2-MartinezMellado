package interfaz;

import basededatos.BDPrincipal;
import basededatos.Comentario;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaNotificaciones_item;

public class Notifiaciones_item extends VistaNotificaciones_item {
//	private Button _vista;
//	private Label _nombreUsuarioL;
//	private ImageButton _fotoUsuarioIB;
//	private Label _textoNotificacionL;
//	public Notificaciones _notifiaciones;
//
//	public void vista() {
//		throw new UnsupportedOperationException();
//	}
	
	

	public Notifiaciones_item(String tipo, Usuario_Registrado emisor, Publicacion publicacion, boolean comentario, BDPrincipal datos) {
		// TODO Auto-generated constructor stub
		switch (tipo) {
		case "comentario":
			this.getbAceptar().setVisible(false);
			this.getbRechazar().setVisible(false);
			this.getIdTextoNotificación().setText(datos.cargarComentario(emisor, publicacion).getComentario());;
			break;
		case "me_gusta":
			this.getbAceptar().setVisible(false);
			this.getbRechazar().setVisible(false);
			this.getIdTextoNotificación().setText("A " + emisor.getUsuario() + " le ha gustado tu video");
			break;
		case "seguir":
			this.getIdBotonVista().setVisible(false);
			this.getIdTextoNotificación().setText("El usuario " + emisor.getUsuario() + "ha solicitado seguirte");
			this.getIdVideoRelacionado().setSrc(emisor.getFoto());
			this.getIdNombreUsuario().setText(emisor.getUsuario());
			break;

		default:
			break;
		}
	}
}