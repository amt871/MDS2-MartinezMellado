package basededatos;

//import interfaz.Ver_perfil_publico__usuario_registrado_;
//import interfaz.Ver_perfil__usuario_registrado_;
//import interfaz.Ver_perfil_privado__usuario_registrado_;
//import interfaz.Ver_perfil_privado__usuario_no_registrado_;
//import interfaz.Ver_perfil__usuario_no_registrado_;
//import interfaz.Ver_perfil_publico__usuario_no_registrado_;
//import interfaz.Ver_perfil_privado__administrador_;
//import interfaz.Ver_perfil__administrador_;
//import interfaz.Ver_perfil_publico__administrador_;
//import interfaz.Usuario_Registrado;
//import interfaz.Comercial;
//import interfaz.Cibernauta;
//import interfaz.Usuario_no_registrado;
//import interfaz.inicio_sesion__adminstrador_;
import interfaz.*;

import java.util.List;

import interfaz.Administrador;
import orm.Publicacion;
import orm.Usuario_Registrado;

public class Sistema implements iVer_perfil_publico__usuario_registrado_, iVer_perfil__usuario_registrado_, iVer_perfil_privado__usuario_registrado_, iVer_perfil_privado__usuario_no_registrado_, iVer_perfil__usuario_no_registrado_, iVer_perfil_publico__usuario_no_registrado_, iVer_perfil_privado__administrador_, iVer_perfil__administrador_, iVer_perfil_publico__administrador_, iUsuario_Registrado, iComercial, iCibernauta, iUsuario_no_registrado, iInicio_sesion_administrador, iAdministrador {
	public Usuarios_Registrados _usuarios_Registrados;
	public Administradores _administradores;
	public Comentarios _comentarios;
	public Denuncias_Archivadas _denuncias_Archivadas;
	public Hashtags _hashtags;
	public Notificaciones _notificaciones;
	public Publicaciones _publicaciones;
	@Override
	public orm.Administrador iniciarSesionAdministrador(String aUser, String aPass) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String listarVideosBusquedaAdministrador() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List buscarUsuarios(String aBusqueda) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List listarDenunciasAdministrador() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void archivarDenuncia(String aElemento, String aTipo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Usuario_Registrado datosUsuarioPerfil() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void modificarEstadoUsuario(String aNombreUsuario) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List listarVideoBusqueda() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List buscarUsuario(String aBusqueda) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List buscarHashTag(String aBusqueda) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean comprobarCredenciales(String aUser, String aPass) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Usuario_Registrado iniciarSesion(String aUser, String aPass) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void cambiarContrasenna(Object aNuevaContrasenna, String aNombreUsuario) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void registrarse(String aNombre, String aApellidos, String aNomUsuario, String aContrasenna, String aCorreo,
			String aFechaNacimiento, String aDescripcion, String aFoto, String aTipo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Usuario_Registrado cargarDatosUsuario(String aNombreUsuario) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void guardarNuevaContrasenna(String aNuevaContrasena, String aUsuario) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void nuevaPublicacion(String aDescripcion, String aUbicacion, String aVideo, String aFecha, String aTipo,
			String aPropietario) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List buscarUsurios(String aBusqueda) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List cargarVideos() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List listarVideosBusqueda() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List buscarHahsTag(String aBusqueda) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List videosHashTag(String aHashTag) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean comprobarPrivacidad(String aUsuario) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Usuario_Registrado datosUsuario(String aNombreUsuario) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void guardarDatos(String aFoto, String aUsuario, String aNombre, String aFechaDeNaciemiento,
			String aCorreoElectronico, String aDescripcion) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List listarNitificaciones(String aUsuario) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void cambiarNotificacion(String aNotificacion) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Publicacion cargarVideo(String aVideo) {
		// TODO Auto-generated method stub
		return null;
	}

	
}