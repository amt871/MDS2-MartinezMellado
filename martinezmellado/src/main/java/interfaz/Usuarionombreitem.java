package interfaz;

import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaUsuarionombreitem;

public class Usuarionombreitem extends VistaUsuarionombreitem {
	
	private Usuario_Registrado usuario;
	private Usuario_Registrado miUsuario;
	private Mi_cabecera cabeceraUserReg;
	private MainView inicio;
	private Buscar__usuario_registrado_ buscar__usuario_registrado_;

	public Usuarionombreitem(Usuario_Registrado usuario, Mi_cabecera mi_cabecera, Usuario_Registrado miUsuario, Buscar__usuario_registrado_ buscar__usuario_registrado_) {

		this.usuario = usuario;
		this.miUsuario = miUsuario;
		this.cabeceraUserReg = mi_cabecera;
		this.inicio = mi_cabecera.getVl();
		this.buscar__usuario_registrado_ = buscar__usuario_registrado_;
		this.getImageButton().setSrc(usuario.getFoto());
		this.getLabelUsuario().setText(usuario.getUsuario());
		this.getImagen().addClickListener(event -> {

			this.verPerfilOtroUsuario();
			
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

}
