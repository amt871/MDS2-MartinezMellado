package basededatos;

import java.util.Date;
import java.util.List;

import org.orm.PersistentException;

import orm.*;

public class BDPrincipal implements iComercial, iCibernauta, iUsuario_Registrado, iUsuario_no_registrado, iInicio_sesion_administrador, iAdministrador, iVer_perfil__usuario_no_registrado_, iVer_perfil_privado__usuario_no_registrado_, iVer_perfil_publico__usuario_no_registrado_, iVer_perfil__administrador_, iVer_perfil_publico__administrador_, iVer_perfil_privado__administrador_, iVer_perfil__usuario_registrado_, iVer_perfil_publico__usuario_registrado_, iVer_perfil_privado__usuario_registrado_ {

	Usuarios_Registrados usuariosRegistrados = new Usuarios_Registrados();
	
	public Usuario_Registrado cargarDatosUsuario(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void guardarDatos(String aFoto, String aUsuario, String aNombre, String aFechaDeNacimiento, String aCorreoElectronico, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public void guardarNuevaContrasenna(String aNuevaContrasena, String aUsuario) {
		throw new UnsupportedOperationException();
	}

	public void nuevaPublicacion(String aDescripcion, String aUbicacion, String aVideo, String aFecha, String aTipo, String aPropietario) {
		throw new UnsupportedOperationException();
	}

	public boolean comprobarCredenciales(String aUser, String aPass) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado iniciarSesion(String aUser, String aPass) {
		throw new UnsupportedOperationException();
	}

	public void cambiarContrasenna(Object aNuevaContrasenna, String aNombreUsuario) {
		throw new UnsupportedOperationException();
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
		throw new UnsupportedOperationException();
	}

	public List cargarVideos() {
		throw new UnsupportedOperationException();
	}

	public List listarVideosBusqueda(String cadena) {
		throw new UnsupportedOperationException();
	}

	public List buscarHahsTag(String aBusqueda) {
		throw new UnsupportedOperationException();
	}

	public List videosHashTag(String aHashTag) {
		throw new UnsupportedOperationException();
	}

	public boolean comprobarPrivacidad(String aUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado datosUsuario(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public List listarNitificaciones(String aUsuario) {
		throw new UnsupportedOperationException();
	}

	public void cambiarNotificacion(int aNotificacion) {
		throw new UnsupportedOperationException();
	}

	public Publicacion cargarVideo(String aVideo) {
		throw new UnsupportedOperationException();
	}

	public List listarVideoBusqueda(String cadena) {
		throw new UnsupportedOperationException();
	}

	public List buscarUsuario(String aBusqueda) {
		throw new UnsupportedOperationException();
	}

	public List buscarHashTag(String aBusqueda) {
		throw new UnsupportedOperationException();
	}

	public List buscarUsuarios(String aBusqueda) {
		throw new UnsupportedOperationException();
	}

	public List listarDenuncias() {
		throw new UnsupportedOperationException();
	}

	public void archivarDenuncia(String aElemento, String aTipo) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado datosUsuarioPerfil() {
		throw new UnsupportedOperationException();
	}

	public void modificarEstadoUsuario(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public Administrador iniciarSesionAdministrador(String aUser, String aPass) {
		// TODO Auto-generated method stub
		return null;
	}

	public String listarVideosBusquedaAdministrador() {
		// TODO Auto-generated method stub
		return null;
	}

	public List listarDenunciasAdministrador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardarDatos(String aFoto, String aUsuario, String aNombre, java.util.Date aFechaDeNaciemiento,
			String aCorreoElectronico, String aDescripcion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarse(String aNombre, String aApellidos, String aNomUsuario, String aContrasenna, String aCorreo,
			String aFechaNacimiento, String aDescripcion, String aFoto, String aTipo) {
		// TODO Auto-generated method stub
		
	}

}