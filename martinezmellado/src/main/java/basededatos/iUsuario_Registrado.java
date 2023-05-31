package basededatos;

import java.util.List;

import orm.*;

public interface iUsuario_Registrado {

	public List buscarUsurios(String aBusqueda);

	public List cargarVideos();

	public List listarVideosBusqueda();

	public List buscarHahsTag(String aBusqueda);

	public List videosHashTag(String aHashTag);

	public boolean comprobarPrivacidad(String aUsuario);

	public Usuario_Registrado datosUsuario(String aNombreUsuario);

	public void guardarDatos(String aFoto, String aUsuario, String aNombre, String aFechaDeNaciemiento, String aCorreoElectronico, String aDescripcion);

	public List listarNitificaciones(String aUsuario);

	public void cambiarNotificacion(String aNotificacion);

	public Publicacion cargarVideo(String aVideo);
}