package interfaz;


import com.vaadin.flow.component.notification.Notification;

import basededatos.Comentario;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaVer_seguidores_otro_usuario_item;

public class Ver_seguidores_otro_usuario_item extends VistaVer_seguidores_otro_usuario_item {
	
	private Mi_cabecera cabeceraUserReg;
	private Usuario_Registrado miUsuario;
	private Usuario_Registrado usuario;
	private Cabecera_usuario_no_registrado cabeceraNoReg;

	public Ver_seguidores_otro_usuario_item(Usuario_Registrado usuario_Registrado, Mi_cabecera cabecera) {
		// TODO Auto-generated constructor stub
		
		this.cabeceraUserReg = cabecera;
		this.miUsuario = this.cabeceraUserReg.getDatos().cargarDatosUsuario(this.cabeceraUserReg.getUser().getUsuario());
		this.usuario = this.cabeceraUserReg.getDatos().cargarDatosUsuario(usuario_Registrado.getUsuario());
		//this.comentario = this.cabeceraUserReg.getDatos().cargarComentario(this.usuario, this.cabeceraUserReg.getDatos().cargarVideoPoID(Integer.valueOf(comentario.getPublicacion())));
		// TODO Auto-generated constructor stub
		
		this.getImage().addClickListener(event -> {
			verPerfilPropietario();
		});
		
		this.getImage().setSrc(this.usuario.getFoto());
		this.getLabelUsuario().setText(this.usuario.getUsuario());
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
		//this.getStyle().set("position", "relative");
		
	}
	
	public Ver_seguidores_otro_usuario_item(Usuario_Registrado usuario_Registrado, Cabecera_usuario_no_registrado cabecera) {
		// TODO Auto-generated constructor stub
		
		this.cabeceraNoReg = cabecera;
		//this.miUsuario = this.cabeceraUserReg.getDatos().cargarDatosUsuario(this.cabeceraUserReg.getUser().getUsuario());
		this.usuario = this.cabeceraNoReg.getDatos().cargarDatosUsuario(usuario_Registrado.getUsuario());
		//this.comentario = this.cabeceraUserReg.getDatos().cargarComentario(this.usuario, this.cabeceraUserReg.getDatos().cargarVideoPoID(Integer.valueOf(comentario.getPublicacion())));
		// TODO Auto-generated constructor stub
		
		this.getImage().addClickListener(event -> {
			verPerfilPropietarioNoReg();
		});
		
		this.getImage().setSrc(this.usuario.getFoto());
		this.getLabelUsuario().setText(this.usuario.getUsuario());
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
		//this.getStyle().set("position", "relative");
		
	}
	
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
