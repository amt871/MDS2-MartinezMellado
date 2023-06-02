package basededatos;

import java.util.Date;
import java.util.List;

import org.orm.PersistentException;

import interfaz.Comercial;

public class BDPrincipal implements iComercial, iCibernauta, iUsuario_Registrado, iUsuario_no_registrado, iInicio_sesion_administrador, iAdministrador, iVer_perfil__usuario_no_registrado_, iVer_perfil_privado__usuario_no_registrado_, iVer_perfil_publico__usuario_no_registrado_, iVer_perfil__administrador_, iVer_perfil_publico__administrador_, iVer_perfil_privado__administrador_, iVer_perfil__usuario_registrado_, iVer_perfil_publico__usuario_registrado_, iVer_perfil_privado__usuario_registrado_ {

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

	public void guardarNuevaContrasenna(String aNuevaContrasena, String aUsuario) {
		try {
			this.usuariosRegistrados.guardarNuevaContrasenna(aNuevaContrasena, aUsuario);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void nuevaPublicacion(String aDescripcion, String aUbicacion, String aVideo, String aFecha, String aTipo, String aPropietario) {
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
			//e.printStackTrace();
			return false;
		}
	}

	public Usuario_Registrado iniciarSesion(String aUser, String aPass) {
		try {
			return this.usuariosRegistrados.iniciarSesion(aUser, aPass);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public void cambiarContrasenna(Object aNuevaContrasenna, String aNombreUsuario) {
		try {
			this.usuariosRegistrados.cambiarContrasenna(aNombreUsuario, aNombreUsuario);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public boolean registrarse(String aNombre, String aApellidos, String aNomUsuario, String aContrasenna, String aCorreo, Date aFechaNacimiento, String aDescripcion, String aFoto, String aTipo) {
		
		try {
			this.usuariosRegistrados.registrarse(aNombre, aApellidos, aNomUsuario, aContrasenna, aCorreo, aFechaNacimiento, aDescripcion, aFoto, aTipo);
		} catch (PersistentException e) {
			return false;
		}
		
		return true;
		
	}

	public List buscarUsurios(String aBusqueda) {
		try {
			return this.usuariosRegistrados.buscarUsuarios(aBusqueda);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List cargarVideos() {
		try {
			return this.publicaciones.cargarVideos();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List listarVideosBusqueda(String cadena) {
		try {
			return this.publicaciones.listarVideosBusqueda(cadena);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List buscarHahsTag(String aBusqueda) {
		try {
			return this.hashTag.buscarHahsTag(aBusqueda);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List videosHashTag(String aHashTag) {
		try {
			return this.publicaciones.videosHashTag(aHashTag);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public boolean comprobarPrivacidad(String aUsuario) {
		try {
			return this.usuariosRegistrados.datosUsuario(aUsuario).getPrivado();
		} catch (Exception e) {
			// TODO: handle exception
			return true;
		}
	}

	public Usuario_Registrado datosUsuario(String aNombreUsuario) {
		
		Usuario_Registrado u = null;
		
		try {
			u = this.usuariosRegistrados.datosUsuario(aNombreUsuario);
		} catch (PersistentException e) {
			//return u;
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

	public Publicacion cargarVideo(String aVideo) {
		try {
			return this.publicaciones.cargarVideo(aVideo);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List listarVideoBusqueda(String cadena) {
		try {
			return this.publicaciones.listarVideosBusqueda(cadena);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
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

	public List listarDenuncias() {
		try {
			List aux = null;
			aux.addAll(this.publicaciones.listarPublicacionesDenunciadas());
			aux.addAll(this.usuariosRegistrados.listarUsuariosDenunciados());
			aux.addAll(this.comentario.listarComentariosDenunciados());
			return aux;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public void archivarDenuncia(String aElemento, String aTipo) {
		try {
			this.denunciaArchivada.ArchivarDenuncia(aElemento, aTipo);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Usuario_Registrado datosUsuarioPerfil() { //no usar, usar cargar usuario
		try {
			return this.usuariosRegistrados.datosUsuario(null);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public void modificarEstadoUsuario(String aNombreUsuario) {
		try {
			this.usuariosRegistrados.modificarEstadoUsuario(aNombreUsuario);;
		} catch (Exception e) {
			// TODO: handle exception
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

	public String listarVideosBusquedaAdministrador() {
		// TODO Auto-generated method stub
		return null;
		//No usar, usar el otro
	}

	public List listarDenunciasAdministrador() {
		// TODO Auto-generated method stub
		return null;
		//No usar, usar el otr
	}
		

	@Override
	public void registrarse(String aNombre, String aApellidos, String aNomUsuario, String aContrasenna, String aCorreo,
			String aFechaNacimiento, String aDescripcion, String aFoto, String aTipo) {
		try {
			this.usuariosRegistrados.registrarse(aNombre, aApellidos, aNomUsuario, aContrasenna, aCorreo, null, aDescripcion, aFoto, aTipo);;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void guardarDatos(String aFoto, String aUsuario, String aNombre, java.sql.Date aFechaDeNaciemiento,
			String aCorreoElectronico, String aDescripcion) {
		try {
			this.usuariosRegistrados.guardarDatos(aFoto, aUsuario, aNombre, aFechaDeNaciemiento, aCorreoElectronico, aDescripcion);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public List listarSeguidos(String aNombreUsuario) {
		// TODO Auto-generated method stub
		try {
			return this.usuariosRegistrados.listarSeguidos(aNombreUsuario);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List listarSeguidores(String aNombreUsuario) {
		// TODO Auto-generated method stub
		try {
			return this.usuariosRegistrados.listarSeguidores(aNombreUsuario);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}