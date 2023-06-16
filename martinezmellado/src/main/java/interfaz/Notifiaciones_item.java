package interfaz;

import basededatos.BDPrincipal;
import basededatos.Comentario;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaNotificaciones_item;

public class Notifiaciones_item extends VistaNotificaciones_item {
	private Usuario_Registrado usuario;
	private Usuario_Registrado miUsuario;
	private Mi_cabecera cabeceraUserReg;
	private MainView inicio;
	
	

	public Notifiaciones_item(String tipo, Usuario_Registrado emisor, Publicacion publicacion, boolean comentario, BDPrincipal datos, int id, Mi_cabecera mi_cabecera, Usuario_Registrado miUsuario,MainView inicio) {
		// TODO Auto-generated constructor stub
		this.usuario = emisor;
		this.miUsuario = miUsuario;
		this.cabeceraUserReg = mi_cabecera;
		this.inicio = inicio;
		
		
		
		this.getIdBotonVista().addClickListener(event -> {
			datos.cambiarNotificacion(id);
			this.setVisible(false);
        });
		
		this.getIdImagenUsr().addClickListener(event -> {
			verPerfilOtroUsuario();
        });
		
		this.getbAceptar().addClickListener(event -> {
			datos.segimiento(emisor, miUsuario);
			datos.cambiarNotificacion(id);
			this.setVisible(false);
        });
		
		this.getbRechazar().addClickListener(event -> {
			datos.cambiarNotificacion(id);
			this.setVisible(false);
        });
		
		switch (tipo) {
		case "comentario":
			Comentario aux = datos.cargarComentario(emisor, publicacion);
			this.getbAceptar().setVisible(false);
			this.getbRechazar().setVisible(false);
			this.getIdTextoNotificación().setText(aux.getComentario());;
			this.getIdNombreUsuario().setText(emisor.getUsuario());
			break;
		case "me_gusta":
			this.getbAceptar().setVisible(false);
			this.getbRechazar().setVisible(false);
			this.getIdTextoNotificación().setText("A " + emisor.getUsuario() + " le ha gustado tu video");
			this.getIdNombreUsuario().setText(emisor.getUsuario());
			break;
		case "seguir":
			if (miUsuario.getPrivado()) {
				this.getIdBotonVista().setVisible(false);
				this.getIdTextoNotificación().setText("El usuario " + emisor.getUsuario() + " ha solicitado seguirte");
			}else {
				this.getbAceptar().setVisible(false);
				this.getbRechazar().setVisible(false);
				this.getIdTextoNotificación().setText("El usuario " + emisor.getUsuario() + " ha empezado a seguirte");
			}
			this.getIdVideoRelacionado().setSrc(emisor.getFoto());
			this.getIdNombreUsuario().setText(emisor.getUsuario());
			this.getIdVideoRelacionado().setVisible(false);
			break;

		default:
			break;
		}
	}
	
	private void verPerfilOtroUsuario() {

		if (this.usuario.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			if (this.miUsuario.seguido.contains(this.usuario)) {
				this.cabeceraUserReg
						.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, this.usuario));
				this.inicio.removeAll();
				this.inicio.add(this.cabeceraUserReg.getPerfilPublico());
			} else {
				this.cabeceraUserReg.setPerfilPrivado(
						new Ver_perfil_privado__usuario_registrado_(this.cabeceraUserReg, this.usuario));
				this.inicio.removeAll();
				this.inicio.add(this.cabeceraUserReg.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			}
		} else {

			this.cabeceraUserReg
					.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, this.usuario));
			this.inicio.removeAll();
			this.inicio.add(this.cabeceraUserReg.getPerfilPublico());

		}
	}
}