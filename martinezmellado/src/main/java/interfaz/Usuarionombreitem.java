package interfaz;

import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaUsuarionombreitem;

public class Usuarionombreitem extends VistaUsuarionombreitem {

	private Usuario_Registrado usuario;
	private Usuario_Registrado miUsuario;
	private Mi_cabecera cabeceraUserReg;
	private Cabecera_usuario_no_registrado cabeceraNoReg;
	private Cabecera__administrador_ cabeceraAdmin;
	private MainView inicio;
	private Buscar__usuario_registrado_ buscar__usuario_registrado_;
	private Buscar__no_registrado_ buscar__no_registrado_;
	private Busqueda__administrador_ busqueda__administrador_;

	public Usuarionombreitem(Usuario_Registrado usuario, Mi_cabecera mi_cabecera, Usuario_Registrado miUsuario,
			Buscar__usuario_registrado_ buscar__usuario_registrado_) {

		this.usuario = usuario;
		this.miUsuario = miUsuario;
		this.cabeceraUserReg = mi_cabecera;
		this.inicio = mi_cabecera.getVl();
		this.buscar__usuario_registrado_ = buscar__usuario_registrado_;
		this.getImageButton().setSrc(usuario.getFoto());
		this.getLabelUsuario().setText(usuario.getUsuario());
		this.getStyle().set("width", "25%");
		//this.getStyle().set("height", "50%");
		//this.getImagen().setHeight("50%");
		//this.getImagen().setWidth("50%");
		this.getImagen().setMaxHeight("100%");
		this.getImagen().setMaxWidth("50%");
		this.getImagen().addClickListener(event -> {

			this.verPerfilOtroUsuario();

		});

	}

	public Usuarionombreitem(Usuario_Registrado usuario, Cabecera_usuario_no_registrado cabecera,
			Buscar__no_registrado_ buscar__no_registrado_) {
		// TODO Auto-generated constructor stub
		this.usuario = usuario;
		//this.miUsuario = miUsuario;
		this.cabeceraNoReg = cabecera;
		this.inicio = cabecera.getVl();
		this.buscar__no_registrado_ = buscar__no_registrado_;
		this.getImageButton().setSrc(usuario.getFoto());
		this.getLabelUsuario().setText(usuario.getUsuario());
		this.getStyle().set("width", "25%");
		//this.getStyle().set("height", "50%");
		//this.getImagen().setHeight("50%");
		//this.getImagen().setWidth("50%");
		this.getImagen().setMaxHeight("100%");
		this.getImagen().setMaxWidth("50%");
		this.getImagen().addClickListener(event -> {

			this.verPerfilOtroUsuarioNoReg();

		});
	}

	public Usuarionombreitem(Usuario_Registrado usuario_Registrado, Cabecera__administrador_ cabecera,
			Busqueda__administrador_ busqueda__administrador_) {
		// TODO Auto-generated constructor stub
		
		this.usuario = usuario_Registrado;
		//this.miUsuario = miUsuario;
		this.cabeceraAdmin = cabecera;
		this.inicio = cabecera.getVl();
		this.busqueda__administrador_ = busqueda__administrador_;
		this.getImageButton().setSrc(usuario.getFoto());
		this.getLabelUsuario().setText(usuario.getUsuario());
		this.getStyle().set("width", "25%");
		//this.getStyle().set("height", "50%");
		//this.getImagen().setHeight("50%");
		//this.getImagen().setWidth("50%");
		this.getImagen().setMaxHeight("100%");
		this.getImagen().setMaxWidth("50%");
		this.getImagen().addClickListener(event -> {

			this.verPerfilOtroUsuarioAdmin();

		});
		
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

		this.buscar__usuario_registrado_.clear();

	}
	
	private void verPerfilOtroUsuarioNoReg() {

		if (this.usuario.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			
				this.cabeceraNoReg.setPerfilPrivado(
						new Ver_perfil_privado__usuario_no_registrado_(this.cabeceraNoReg, this.usuario));
				this.inicio.removeAll();
				this.inicio.add(this.cabeceraNoReg.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			
		} else {

			this.cabeceraNoReg
					.setPerfilPublico(new Ver_perfil__usuario_no_registrado_(this.cabeceraNoReg, this.usuario));
			this.inicio.removeAll();
			this.inicio.add(this.cabeceraNoReg.getPerfilPublico());

		}

		this.buscar__no_registrado_.clear();

	}
	
	private void verPerfilOtroUsuarioAdmin() {


		// System.out.println(miUsuario.getUsuario());

		// Notification.show("Aun no implementado");
		
			this.cabeceraAdmin.setPerfil(
					new Ver_perfil__administrador_(this.cabeceraAdmin, this.usuario));
			this.cabeceraAdmin.getVl().removeAll();
			this.cabeceraAdmin.getVl().add(this.cabeceraAdmin.getPerfil());
			// this.inicio.cambiarPantalla(cabecera);
			
		this.busqueda__administrador_.clear();
		

}

}
