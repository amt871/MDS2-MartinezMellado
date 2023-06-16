package interfaz;

import basededatos.Usuario_Registrado;
import vistas.VistaUsuario__usuario_registrado__item;

public class Usuario__usuario_registrado__item extends VistaUsuario__usuario_registrado__item{
//	private ImageButton _imagenUsuarioIB;
//	private Label _nombreUsuarioL;
//	private Label _nSeguidoresL;
//	private Label _descripcionL;
//	private Label _ultimaPublicacionL;
//	private ImagenIcon _previewUltimaPublicacionII;
//	public Usuario__usuario_registrado_ _usuario__usuario_registrado_;
//	public Perfil_otro_usuario _perfil_otro_usuario;
//
//	public void perfil_otro_usuario() {
//		throw new UnsupportedOperationException();
//	}
	
	public Usuario__usuario_registrado__item(Usuario_Registrado usu) {
		
		this.getLabelDescripcion().setText(usu.getDescripcion());
		this.getLabelSeguidores().setText(String.valueOf(usu.seguidor.size()));
		this.getLabelUsuario().setText(usu.getUsuario());
		this.getImageUser().setSrc(usu.getFoto());
	}
}