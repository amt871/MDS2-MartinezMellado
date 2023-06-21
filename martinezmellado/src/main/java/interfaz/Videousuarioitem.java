package interfaz;

import basededatos.Usuario_Registrado;
import vistas.VistaVideousuarioitem;

public class Videousuarioitem extends VistaVideousuarioitem{
	
	private Video video;
	private Usuario_Registrado propietario;
	private Mi_cabecera cabecera;
	private Buscar__usuario_registrado_ buscar__usuario_registrado_;
	private Cabecera_usuario_no_registrado cabeceraNoReg;
	private Buscar__no_registrado_ buscar__no_registrado_;
	private Cabecera__administrador_ cabeceraAdmin;
	private Busqueda__administrador_ busqueda__administrador_;
	
	public Videousuarioitem(Usuario_Registrado propietario, Video video, Mi_cabecera mi_cabecera, Buscar__usuario_registrado_ buscar__usuario_registrado_) {
		
		this.getStyle().set("position", "relative");
		
		this.video = video;
		this.propietario = propietario;
		this.cabecera = mi_cabecera;
		this.buscar__usuario_registrado_ = buscar__usuario_registrado_;
		
		this.getDivVideo().add(this.video);
		this.getButtonUsuario().setText(this.propietario.getUsuario());
		
		//this.video.setHeight("25%");
		this.video.setWidth("25%");
		
		this.getButtonUsuario().addClickListener(event -> {
			
			this.verPerfilOtroUsuario();
			
		});
		
	}
	
	public Videousuarioitem(Usuario_Registrado realizada, Video video2, Cabecera_usuario_no_registrado cabecera2,
			Buscar__no_registrado_ buscar__no_registrado_) {
		// TODO Auto-generated constructor stub
		
		this.getStyle().set("position", "relative");
		
		this.video = video2;
		this.propietario = realizada;
		this.cabeceraNoReg = cabecera2;
		this.buscar__no_registrado_ = buscar__no_registrado_;
		
		this.getDivVideo().add(this.video);
		this.getButtonUsuario().setText(this.propietario.getUsuario());
		
		//this.video.setHeight("25%");
		this.video.setWidth("25%");
		
		this.getButtonUsuario().addClickListener(event -> {
			
			this.verPerfilOtroUsuarioNoReg();
			
		});
	}

	public Videousuarioitem(Usuario_Registrado realizada, Video video2, Cabecera__administrador_ cabecera2,
			Busqueda__administrador_ busqueda__administrador_) {
		// TODO Auto-generated constructor stub
		this.getStyle().set("position", "relative");
		
		this.video = video2;
		this.propietario = realizada;
		this.cabeceraAdmin = cabecera2;
		this.busqueda__administrador_ = busqueda__administrador_;
		
		this.getDivVideo().add(this.video);
		this.getButtonUsuario().setText(this.propietario.getUsuario());
		
		//this.video.setHeight("25%");
		this.video.setWidth("25%");
		
		this.getButtonUsuario().addClickListener(event -> {
			
			this.verPerfilOtroUsuarioAdmin();
			
		});
	}

	private void verPerfilOtroUsuario() {

		if (this.propietario.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			if (this.cabecera.getUser().seguido.contains(this.propietario)) {
				this.cabecera
						.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabecera, this.propietario));
				this.cabecera.getVl().removeAll();
				this.cabecera.getVl().add(this.cabecera.getPerfilPublico());
			} else {
				this.cabecera.setPerfilPrivado(
						new Ver_perfil_privado__usuario_registrado_(this.cabecera, this.propietario));
				this.cabecera.getVl().removeAll();
				this.cabecera.getVl().add(this.cabecera.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			}
		} else {

			this.cabecera
					.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabecera, this.propietario));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getPerfilPublico());

		}

		this.buscar__usuario_registrado_.clear();

	}
	
	private void verPerfilOtroUsuarioNoReg() {

		if (this.propietario.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			
				this.cabeceraNoReg.setPerfilPrivado(
						new Ver_perfil_privado__usuario_no_registrado_(this.cabeceraNoReg, this.propietario));
				this.cabeceraNoReg.getVl().removeAll();
				this.cabeceraNoReg.getVl().add(this.cabeceraNoReg.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			
		} else {

			this.cabeceraNoReg
					.setPerfilPublico(new Ver_perfil__usuario_no_registrado_(this.cabeceraNoReg, this.propietario));
			this.cabeceraNoReg.getVl().removeAll();
			this.cabeceraNoReg.getVl().add(this.cabeceraNoReg.getPerfilPublico());

		}

		this.buscar__no_registrado_.clear();

	}
	
	private void verPerfilOtroUsuarioAdmin() {


		// System.out.println(miUsuario.getUsuario());

		// Notification.show("Aun no implementado");
		
			this.cabeceraAdmin.setPerfil(
					new Ver_perfil__administrador_(this.cabeceraAdmin, this.propietario));
			this.cabeceraAdmin.getVl().removeAll();
			this.cabeceraAdmin.getVl().add(this.cabeceraAdmin.getPerfil());
			// this.inicio.cambiarPantalla(cabecera);
			
		this.busqueda__administrador_.clear();
		

}

}
