package interfaz;

import basededatos.Usuario_Registrado;
import vistas.VistaUsuario__no_registrado__item;

public class Usuario__no_registrado__item extends VistaUsuario__no_registrado__item{
//	private ImageButton _fotoUsuarioIB;
//	private Label _nombreUsuarioL;
//	private Label _nSeguidoresL;
//	private Label _descripcionL;
//	private Label _ultimaPublicacionL;
//	private ImageButton _previsualizacionVideoIB;
//	public Usuario__no_registrado_ _usuario__no_registrado_;
//	public Ver_Perfil__no_registrado_ _ver_perfil__no_registrado_;

	private Cabecera_usuario_no_registrado cabeceraNoReg;
	private Usuario_Registrado usuario;
	
	public Usuario__no_registrado__item(Usuario_Registrado usu, Cabecera_usuario_no_registrado cabecera) {
		// TODO Auto-generated constructor stub
		this.cabeceraNoReg = cabecera;
		this.usuario = usu;
		this.getImage().setSrc(usu.getFoto());
		this.getDescripcion().setText(usu.getDescripcion());
		this.getSeguidores().setText("Seguidores: "+usu.seguidor.size());
		this.getNombreUsuario().setText(usu.getUsuario());
		
		this.getImage().addClickListener(e ->{
			
			verPerfilPropietarioNoReg();
			
		});
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

//	public void ver_perfil__no_registrado_() {
//		throw new UnsupportedOperationException();
//	}
}