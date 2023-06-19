package interfaz;

import com.vaadin.flow.component.notification.Notification;

import antlr.debug.Event;
import basededatos.Comentario;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaComentario_item;

public class Comentario_item extends VistaComentario_item {

	private Usuario_Registrado miUsuario;
	private Usuario_Registrado usuario;
	private Mi_cabecera cabeceraUserReg;
	private Comentario comentario;
	public Comentario_item(Comentario comentario, Mi_cabecera cabecera) {
		
		this.cabeceraUserReg = cabecera;
		this.miUsuario = this.cabeceraUserReg.getDatos().cargarDatosUsuario(this.cabeceraUserReg.getUser().getUsuario());
		this.usuario = this.cabeceraUserReg.getDatos().cargarDatosUsuario(comentario.getAutor());
		this.comentario = this.cabeceraUserReg.getDatos().cargarComentario(this.usuario, this.cabeceraUserReg.getDatos().cargarVideoPoID(Integer.valueOf(comentario.getPublicacion())));
		// TODO Auto-generated constructor stub
		
		this.getImgUser().addClickListener(event -> {
			verPerfilPropietario();
		});
		
		this.getImgUser().setSrc("Usuarios/"+comentario.getAutor()+"/imagen.jpg");
		this.getLabelComentario().setText(comentario.getComentario());
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
		//this.getStyle().set("position", "relative");
		
		this.getbDenunciar().addClickListener(event -> {
			Usuario_Registrado miUsr = cabecera.getDatos().cargarDatosUsuario(cabecera.getUser().getUsuario());
			Usuario_Registrado usr = cabecera.getDatos().cargarDatosUsuario(comentario.getAutor());
			Publicacion publi = cabecera.getDatos().cargarVideoPoID(Integer.valueOf(comentario.getPublicacion()));
			Comentario aux = cabecera.getDatos().cargarComentario(usr, publi);
			
			boolean flag = true;
			for (Usuario_Registrado denunciante : aux.es_denunciada.toArray()){
				if (denunciante.getUsuario().equals(miUsr.getUsuario())) {
					flag = false;
				}
			}
			
			
			if (flag) {
				cabecera.getDatos().denunciarComentario(miUsr, comentario);
			}else{
				Notification.show("Ya has denunciado este comentario");
			}
		});
	}
	private void verPerfilPropietario() {
		if (this.usuario.getUsuario().equals(this.miUsuario.getUsuario())) {
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

}