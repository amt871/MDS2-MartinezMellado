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
	private Cabecera_comercial cabeceraCom;
	private Comentario comentario;
	private Cabecera_usuario_no_registrado cabeceraNoReg;
	
	
	
	/*public Comentario_item(Comentario comentario2, Cabecera_comercial cabeceraCom) {
		// TODO Auto-generated constructor stub
		this.cabeceraCom = cabeceraCom;
		this.miUsuario = this.cabeceraCom.getDatos().cargarDatosUsuario(this.cabeceraCom.getUser().getUsuario());
		
		this.usuario = this.cabeceraCom.getDatos().cargarDatosUsuario(comentario2.getAutor());
		
		this.comentario = this.cabeceraCom.getDatos().cargarComentario(this.usuario, this.cabeceraCom.getDatos().cargarVideoPoID(Integer.valueOf(comentario2.getPublicacion())));
		// TODO Auto-generated constructor stub
		
		this.getImgUser().setSrc(comentario2.getEs_publicado().getFoto());
		this.getLabelComentario().setText(comentario2.getComentario());
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
		//this.getStyle().set("position", "relative");
		
		this.getbDenunciar().addClickListener(event -> {
			Usuario_Registrado miUsr = cabeceraCom.getDatos().cargarDatosUsuario(cabeceraCom.getUser().getUsuario());
			Usuario_Registrado usr = cabeceraCom.getDatos().cargarDatosUsuario(comentario2.getAutor());
			Publicacion publi = cabeceraCom.getDatos().cargarVideoPoID(Integer.valueOf(comentario2.getPublicacion()));
			Comentario aux = cabeceraCom.getDatos().cargarComentario(usr, publi);
			
			boolean flag = true;
			for (Usuario_Registrado denunciante : aux.es_denunciada.toArray()){
				if (denunciante.getUsuario().equals(miUsr.getUsuario())) {
					flag = false;
				}
			}
			
			
			if (flag) {
				cabeceraCom.getDatos().denunciarComentario(miUsr, comentario2);
			}else{
				Notification.show("Ya has denunciado este comentario");
			}
		});
	}*/
	
	/*public Comentario_item(Comentario comentario2, Cabecera_usuario_no_registrado cabecera) {
		// TODO Auto-generated constructor stub
		
		//this.cabeceraCom = cabeceraCom;
		//this.miUsuario = this.cabeceraCom.getDatos().cargarDatosUsuario(this.cabeceraCom.getUser().getUsuario());
		this.cabeceraNoReg = cabecera;
		this.getImgUser().addClickListener(event -> {
			verPerfilPropietarioNoReg();
		});
		
		this.usuario = cabecera.getDatos().cargarDatosUsuario(comentario2.getAutor());
		
		this.comentario = cabecera.getDatos().cargarComentario(this.usuario, cabecera.getDatos().cargarVideoPoID(Integer.valueOf(comentario2.getPublicacion())));
		// TODO Auto-generated constructor stub
		
		this.getImgUser().setSrc(comentario2.getEs_publicado().getFoto());
		this.getLabelComentario().setText(comentario2.getComentario());
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
		//this.getStyle().set("position", "relative");
		
		this.getbDenunciar().setVisible(false);
	}*/

	private void verPerfilPropietario() {
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
	
	private void verPerfilPropietarioNoReg() {

		if (this.usuario.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			
				this.cabeceraNoReg.setPerfilPrivado(
						new Ver_perfil_privado__usuario_no_registrado_(this.cabeceraNoReg, this.usuario));
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