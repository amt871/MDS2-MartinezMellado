package interfaz;

import basededatos.Usuario_Registrado;
import vistas.VistaVideousuarioitem;

public class Videousuarioitem extends VistaVideousuarioitem{
	
	private Video video;
	private Usuario_Registrado propietario;
	private Mi_cabecera cabecera;
	private Buscar__usuario_registrado_ buscar__usuario_registrado_;
	
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

}
