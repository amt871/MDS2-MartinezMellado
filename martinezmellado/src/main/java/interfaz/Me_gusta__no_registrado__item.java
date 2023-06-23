package interfaz;

import basededatos.Usuario_Registrado;
import vistas.VistaMe_gusta__no_registrado__item;

public class Me_gusta__no_registrado__item extends VistaMe_gusta__no_registrado__item{
	//	private ImageButton _imagenAutorIB;
//	private Label _nombreAutorL;
//	public Me_gusta__no_registrado_ _me_gusta__no_registrado_;
	
	private Cabecera_usuario_no_registrado cabecera;
	private Usuario_Registrado propietario;
	
	public Me_gusta__no_registrado__item(Cabecera_usuario_no_registrado cabecera, Usuario_Registrado usuario_Registrado) {
		// TODO Auto-generated constructor stub
		this.propietario = usuario_Registrado;
		this.cabecera = cabecera;
		this.getLabelUsuario().setText(usuario_Registrado.getUsuario());
		this.getImg().setSrc(usuario_Registrado.getFoto());
		this.getImg().addClickListener(e->{
			
			verPerfilPropietarioNoReg();
			
		});
		
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
	}
	
	private void verPerfilPropietarioNoReg() {

		if (this.propietario.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			
				this.cabecera.setPerfilPrivado(
						new Ver_perfil_privado__usuario_no_registrado_(this.cabecera, this.propietario));
				this.cabecera.getVl().removeAll();
				this.cabecera.getVl().add(this.cabecera.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			
		} else {

			this.cabecera
					.setPerfilPublico(new Ver_perfil__usuario_no_registrado_(this.cabecera, this.propietario));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getPerfilPublico());

		}

	}
}