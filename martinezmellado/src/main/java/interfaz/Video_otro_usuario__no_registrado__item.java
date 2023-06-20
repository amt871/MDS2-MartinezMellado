package interfaz;

import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaVideo_otro_usuario__no_registrado__item;

public class Video_otro_usuario__no_registrado__item extends VistaVideo_otro_usuario__no_registrado__item{
	
//	private Label _breveDescripcionL;
//	private ImageButton _previsualizacionVideoIB;
//	public Video_otro_usuario__no_registrado_ _video_otro_usuario__no_registrado_;
	
	private Cabecera_usuario_no_registrado cabecera;
	private Usuario_Registrado propietario;
	private Publicacion publi;
	
	public Video_otro_usuario__no_registrado__item(Cabecera_usuario_no_registrado cabecera, Publicacion publi) {
		// TODO Auto-generated constructor stub
		
		this.cabecera = cabecera;
		this.publi = publi;
		this.propietario = publi.getRealizada();
		
		this.getImage().addClickListener(e ->{
			
			verPerfilOtroUsuarioNoReg();
			
		});		
		
		this.getbComentarios().addClickListener(e ->{
			
			this.cabecera.setDetalle(new Vista_detalle__no_registrado_(this.cabecera, this.publi));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getDetalle());
			
		});
	}
	
	private void verPerfilOtroUsuarioNoReg() {

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