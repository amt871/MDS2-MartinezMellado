package basededatos;

import orm.Usuario_Registrado;

public interface iComercial {

	public Usuario_Registrado cargarDatosUsuario(String aNombreUsuario);

	public void guardarDatos(String aFoto, String aUsuario, String aNombre, String aFechaDeNacimiento, String aCorreoElectronico, String aDescripcion);

	public void guardarNuevaContrasenna(String aNuevaContrasena, String aUsuario);

	public void nuevaPublicacion(String aDescripcion, String aUbicacion, String aVideo, String aFecha, String aTipo, String aPropietario);
}