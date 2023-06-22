package interfaz;

import basededatos.Usuario_Registrado;
import vistas.VistaMe_gusta__otro_usuario__item;

public class Me_gusta__otro_usuario__item extends VistaMe_gusta__otro_usuario__item {
//	private ImageButton _imagenUsuarioIB;
//	private Label _nombreUsuarioL;
	//public Me_gusta__otro_usuario_ _me_gusta__otro_usuario_;
	//public Perfil_otro_usuario _perfil_otro_usuario;
	
	private Mi_cabecera cabecera;
	private Usuario_Registrado propietario;

	public Me_gusta__otro_usuario__item(Mi_cabecera mi_cabecera, Usuario_Registrado usuario_Registrado) {
		// TODO Auto-generated constructor stub
		
		this.propietario = usuario_Registrado;
		this.cabecera = mi_cabecera;
		this.getLabelUsuario().setText(usuario_Registrado.getUsuario());
		this.getImg().setSrc(usuario_Registrado.getFoto());
		this.getImg().addClickListener(e->{
			
			verPerfilOtroUsuario();
			
		});
		
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
	}
	
	private void verPerfilOtroUsuario() {
		
		if(this.propietario.getID() == this.cabecera.getUser().getID()) {
			
			this.cabecera.getbPerfil().click();
			
			
		}else {

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
		}

		//this.buscar__usuario_registrado_.clear();

	}

	/*public void perfil_otro_usuario() {
		throw new UnsupportedOperationException();
	}*/
}