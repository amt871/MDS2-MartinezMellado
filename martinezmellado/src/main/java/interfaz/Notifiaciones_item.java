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
	private Publicacion publicacion;
	

	public Notifiaciones_item(String tipo, Usuario_Registrado emisor, Publicacion publicacion, boolean comentario, BDPrincipal datos, int id, Mi_cabecera mi_cabecera, Usuario_Registrado miUsuario,MainView inicio) {
		// TODO Auto-generated constructor stub
		this.usuario = emisor;
		this.miUsuario = miUsuario;
		this.cabeceraUserReg = mi_cabecera;
		this.inicio = inicio;
		
		
		
		this.getIdBotonVista().addClickListener(event -> {
			BotonVista(datos, id);
        });
		
		this.getIdImagenUsr().addClickListener(event -> {
			verPerfilOtroUsuario();
        });
		
		this.getbAceptar().addClickListener(event -> {
			bAceptar(datos, id, emisor);
        });
		
		this.getbRechazar().addClickListener(event -> {
			bRechazar(id, datos);
        });
		
		this.getIdVideoRelacionado().addClickListener(event -> {
			verVideoRelacionado();
		});
		
		switch (tipo) {
		case "comentario":
			//System.out.println(emisor);
			//System.out.println(publicacion);
			Comentario aux = datos.cargarComentario(emisor, publicacion);
			if (aux == null) {
				break;
			}
			//System.out.println(aux);
			this.publicacion = this.cabeceraUserReg.getDatos().cargarVideoPoID(publicacion.getID());
			this.getbAceptar().setVisible(false);
			this.getbRechazar().setVisible(false);
			this.getIdTextoNotificacion().setText("Ha comentado: " + aux.getComentario());
			this.getIdNombreUsuario().setText(emisor.getUsuario());
			break;
		case "me_gusta":
			this.publicacion = this.cabeceraUserReg.getDatos().cargarVideoPoID(publicacion.getID());
			this.getbAceptar().setVisible(false);
			this.getbRechazar().setVisible(false);
			this.getIdTextoNotificacion().setText("A " + emisor.getUsuario() + " le ha gustado tu video");
			this.getIdNombreUsuario().setText(emisor.getUsuario());
			break;
		case "seguir":
			if (miUsuario.getPrivado()) {
				this.getIdBotonVista().setVisible(false);
				this.getIdTextoNotificacion().setText("El usuario " + emisor.getUsuario() + " ha solicitado seguirte");
			}else {
				this.getbAceptar().setVisible(false);
				this.getbRechazar().setVisible(false);
				this.getIdTextoNotificacion().setText("El usuario " + emisor.getUsuario() + " ha empezado a seguirte");
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

		if (this.usuario.getUsuario().equals(this.miUsuario.getUsuario())) {
			if(cabeceraUserReg != null) 
				this.cabeceraUserReg.setPerfil(new Mi_perfil(this.cabeceraUserReg.getVl(), cabeceraUserReg));
				this.cabeceraUserReg.getVl().removeAll();
				this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getPerfil());
	}else if (this.usuario.getPrivado()) {

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
	
	private void verVideoRelacionado() {
		this.cabeceraUserReg.setDetalle(new Vista_detalle__usuario_registrado_(cabeceraUserReg, this.miUsuario, this.publicacion));
		this.inicio.removeAll();
		this.inicio.add(this.cabeceraUserReg.getDetalle());
	}
	
	private void BotonVista(BDPrincipal datos, int id) {
		datos.cambiarNotificacion(id);
		this.setVisible(false);
	}
	
	private void bAceptar(BDPrincipal datos, int id, Usuario_Registrado emisor) {
		datos.segimiento(miUsuario, emisor);
		datos.cambiarNotificacion(id);
		this.setVisible(false);
	}
	
	private void bRechazar(int id, BDPrincipal datos) {
		datos.cambiarNotificacion(id);
		this.setVisible(false);
	}
}