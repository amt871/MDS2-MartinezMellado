package basededatos;

import java.sql.Date;
import java.util.List;

import org.orm.PersistentException;

public interface iUsuario_Registrado {

	public List buscarUsurios(String aBusqueda);

	public List cargarVideos();

	public List listarVideosBusqueda(String cadena);

	public List buscarHahsTag(String aBusqueda);

	public List videosHashTag(String aHashTag);

	public boolean comprobarPrivacidad(String aUsuario);

	public Usuario_Registrado datosUsuario(String aNombreUsuario);

	public void guardarDatos(String aFoto, String aUsuario, String aNombre, Date aFechaDeNaciemiento, String aCorreoElectronico, String aDescripcion);

	public List listarNitificaciones(String aUsuario);

	public void cambiarNotificacion(int aNotificacion);

	public Publicacion cargarVideo(String aVideo);
	
	public List listarSeguidos(String aNombreUsuario);
	
	public List listarSeguidores(String aNombreUsuario);
}