package basededatos;

import java.util.Date;
import java.util.List;

import org.orm.PersistentException;

import interfaz.Comercial;

public class BDPrincipal
		implements iComercial, iCibernauta, iUsuario_Registrado, iUsuario_no_registrado, iInicio_sesion_administrador,
		iAdministrador, iVer_perfil__usuario_no_registrado_, iVer_perfil_privado__usuario_no_registrado_,
		iVer_perfil_publico__usuario_no_registrado_, iVer_perfil__administrador_, iVer_perfil_publico__administrador_,
		iVer_perfil_privado__administrador_, iVer_perfil__usuario_registrado_, iVer_perfil_publico__usuario_registrado_,
		iVer_perfil_privado__usuario_registrado_ {

	Usuarios_Registrados usuariosRegistrados = new Usuarios_Registrados();
	Administradores administrador = new Administradores();
	Comentarios comentario = new Comentarios();
	Denuncias_Archivadas denunciaArchivada = new Denuncias_Archivadas();
	Hashtags hashTag = new Hashtags();
	Notificaciones notrificaciones = new Notificaciones();
	Publicaciones publicaciones = new Publicaciones();

	public Usuario_Registrado cargarDatosUsuario(String aNombreUsuario) {
		try {
			return this.usuariosRegistrados.datosUsuario(aNombreUsuario);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public void nuevaPublicacion(String aDescripcion, String aUbicacion, String aVideo, String aFecha, String aTipo,
			String aPropietario) {
		try {
			this.publicaciones.nuevaPublicacion(aDescripcion, aUbicacion, aVideo, aFecha, aTipo, aPropietario);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public boolean comprobarCredenciales(String aUser, String aPass) {
		try {
			return this.usuariosRegistrados.comprobarCredenciales(aUser, aPass);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			return false;
		}
	}

	public boolean cambiarContrasenna(String aNuevaContrasenna, String aNombreUsuario) {
		try {
			return this.usuariosRegistrados.cambiarContrasenna(aNuevaContrasenna, aNombreUsuario);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public boolean registrarse(String aNombre, String aApellidos, String aNomUsuario, String aContrasenna,
			String aCorreo, Date aFechaNacimiento, String aDescripcion, String aFoto, String aTipo) {

		try {
			return this.usuariosRegistrados.registrarse(aNombre, aApellidos, aNomUsuario, aContrasenna, aCorreo,
					aFechaNacimiento, aDescripcion, aFoto, aTipo);
		} catch (PersistentException e) {
			return false;
		}

	}

	public Usuario_Registrado datosUsuario(String aNombreUsuario) {

		Usuario_Registrado u = null;

		try {
			u = this.usuariosRegistrados.datosUsuario(aNombreUsuario);
		} catch (PersistentException e) {
			// return u;
		}

		return u;
	}

	public List listarNitificaciones(String aUsuario) {
		try {
			return this.notrificaciones.listarNotificaciones(aUsuario);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public void cambiarNotificacion(int aNotificacion) {
		try {
			this.notrificaciones.cambiarNotificacion(aNotificacion);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public List buscarUsuario(String aBusqueda) {
		try {
			return this.usuariosRegistrados.buscarUsuarios(aBusqueda);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List buscarHashTag(String aBusqueda) {
		try {
			return this.hashTag.buscarHahsTag(aBusqueda);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List buscarUsuarios(String aBusqueda) {
		try {
			return this.usuariosRegistrados.buscarUsuarios(aBusqueda);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List listarPublicacionesDenunciadas() {
		try {
			return this.publicaciones.listarPublicacionesDenunciadas();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List listarUsuariosDenunciados() {
		try {
			return this.usuariosRegistrados.listarUsuariosDenunciados();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List listarComentariosDenunciados() {
		try {
			return this.comentario.listarComentariosDenunciados();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public void archivarDenuncia(String aElemento, String aTipo, Administrador encargado) {
		try {
			this.denunciaArchivada.ArchivarDenuncia(aElemento, aTipo, encargado);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public boolean modificarEstadoUsuario(String aNombreUsuario) {
		try {
			return this.usuariosRegistrados.modificarEstadoUsuario(aNombreUsuario);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public Administrador iniciarSesionAdministrador(String aUser, String aPass) {
		try {
			return this.administrador.iniciarSesion(aUser, aPass);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public boolean guardarDatos(String aFoto, String aUsuario, String aNombre, Date aFechaDeNaciemiento,
			String aCorreoElectronico, String aDescripcion) {
		try {
			// System.out.println("Estoy en BDPrincipal");
			this.usuariosRegistrados.guardarDatos(aFoto, aUsuario, aNombre, aFechaDeNaciemiento, aCorreoElectronico,
					aDescripcion);
			// System.out.println("BDPrincipal correcto");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			// System.out.println("BDPrincipal excepcion");
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void retirarDenunciaComentario(Comentario comentario) {
		// TODO Auto-generated method stub
		try {
			this.comentario.retirarDenunciaComentario(comentario);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void retirarDenunciaPublicacion(Publicacion publicacion) {
		// TODO Auto-generated method stub
		try {
			this.publicaciones.retirarDenunciaPublicacion(publicacion);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void retirarDenunciaUsuario(Usuario_Registrado denunciado) {
		// TODO Auto-generated method stub
		try {
			this.usuariosRegistrados.retirarDenunciaUsuario(denunciado);
			;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public boolean annadirComentario(String usuario, Publicacion publicacion, String comentario) {
		// TODO Auto-generated method stub
		try {
			return this.comentario.annadirComentario(usuario, publicacion, comentario);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public void denunciarComentario(Usuario_Registrado usuario, Comentario comentario) {
		// TODO Auto-generated method stub
		try {
			this.comentario.denunciarComentario(usuario, comentario);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void annadirPublicacionHashTag(String hashtag, Publicacion publicacion) {
		// TODO Auto-generated method stub
		try {
			this.hashTag.añadirPublicacionHashTag(hashtag, publicacion);
		} catch (Exception e) {
			// TODO: handle exception
	    }
	}

	@Override
	public void annadirNotificacion(String tipo, Usuario_Registrado receptor, Usuario_Registrado emisor,
			Publicacion publicacion) {
		// TODO Auto-generated method stub
		try {
			this.notrificaciones.annadirNotificacion(tipo, receptor, emisor, publicacion);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public boolean segimiento(Usuario_Registrado seguido, Usuario_Registrado seguidor) {
		// TODO Auto-generated method stub
		try {
			return this.usuariosRegistrados.segimiento(seguido, seguidor);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void denunciarPublicacion(Usuario_Registrado usuario, Publicacion publicacion) {
		// TODO Auto-generated method stub
		try {
			this.publicaciones.denunciarPublicacion(usuario, publicacion);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void denunciarUsuario(Usuario_Registrado denunciante, Usuario_Registrado denunciado) {
		// TODO Auto-generated method stub
		try {
			this.usuariosRegistrados.denunciarUsuario(denunciante, denunciado);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void annadirMeGusta(int publicacion, int usuario) {
		// TODO Auto-generated method stub
		try {
			this.publicaciones.annadirMeGusta(publicacion, usuario);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public Publicacion cargarVideoPorRuta(String ruta) {
		// TODO Auto-generated method stub
		try {
			return this.publicaciones.cargarVideoPorRuta(ruta);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

	@Override
	public Usuario_Registrado[] listarUltimosUsuarios(int id) {
		// TODO Auto-generated method stub
		try {
			return this.usuariosRegistrados.listarUltimosUsuarios(id);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public Publicacion[] listarUltimasPublicacions(int id) {
		// TODO Auto-generated method stub
		try {
			return this.publicaciones.listarUltimasPublicacions(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Publicacion cargarVideoPoID(int id) {
		// TODO Auto-generated method stub
		try {
			return this.publicaciones.cargarVideoPoID(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Comentario cargarComentario(Usuario_Registrado usuario, Publicacion publicacion) {
		// TODO Auto-generated method stub
		try {
			return this.comentario.cargarComentario(usuario, publicacion);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Usuario_Registrado cargarUsuarioCorreo(String correo) {
		// TODO Auto-generated method stub
		try {
			return this.usuariosRegistrados.cargarUsuarioCorreo(correo);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Publicacion[] listarTodasPublicaciones() {
		// TODO Auto-generated method stub
		try {
			return this.publicaciones.listarTodasPublicaciones();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Usuario_Registrado[] listarTodosUsuarios() {
		// TODO Auto-generated method stub
		try {
			return this.usuariosRegistrados.listarTodosUsuarios();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void eliminarComentario(Comentario comentario) {
		// TODO Auto-generated method stub
		try {
			this.comentario.eliminarComentario(comentario);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void eliminarPublicaion(Publicacion publicaion) {
		// TODO Auto-generated method stub
		try {
			this.publicaciones.eliminarPublicaion(publicaion);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void bloquearUsuario(Usuario_Registrado usuario, Administrador adminstrador) {
		// TODO Auto-generated method stub
		try {
			this.usuariosRegistrados.bloquearUsuario(usuario, adminstrador);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public Hashtag ObtenerHahsTag(String aBusqueda) {
		// TODO Auto-generated method stub
		try {
			return this.hashTag.ObtenerHahsTag(aBusqueda);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List listarDenunciasArchivadas() {
		// TODO Auto-generated method stub
		try {
			return this.denunciaArchivada.listarDenunciasArchivadas();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}