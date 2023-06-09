package interfaz;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import vistas.VistaBuscar__usuario_registrado_;

public class Buscar__usuario_registrado_ extends VistaBuscar__usuario_registrado_ {
//	private TextField _buscadorTF;
//	private Button _buscarUsuarioB;
//	private Button _buscarHashTagB;
//	public Mi_cabecera _mi_cabecera;
//	public Buscar_usuario__usuario_registrado_ _buscar_usuario__usuario_registrado_;
//	public Buscar_hashtag__usuario_registrado_ _buscar_hashtag__usuario_registrado_;
//	public Usuario__usuario_registrado_ _unnamed_Usuario__usuario_registrado__;
//	public Usuario__usuario_registrado_ _unnamed_Usuario__usuario_registrado__2;
//
//	public void buscar_usuario__usuario_registrado_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void buscar_hashtag__usuario_registrado_() {
//		throw new UnsupportedOperationException();
//	}
	
	private Usuario_Registrado usuario;
	private BDPrincipal datos;
	
	public void setUsuario(Usuario_Registrado user) {
		
		this.usuario = user;
		
		
	}
}