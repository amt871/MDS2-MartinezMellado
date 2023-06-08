package basededatos;

import java.util.Date;
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

	public boolean guardarDatos(String aFoto, String aUsuario, String aNombre, Date aFechaDeNaciemiento, String aCorreoElectronico, String aDescripcion);

	public List listarNitificaciones(String aUsuario);

	public void cambiarNotificacion(int aNotificacion);

	public Publicacion cargarVideo(String aVideo);
	
	public List listarSeguidos(String aNombreUsuario);
	
	public List listarSeguidores(String aNombreUsuario);
	
	public void añadirPublicacionHashTag(  String hashtag, Publicacion publicacion );
	
	public void annadirComentario(String usuario, Publicacion publicacion, String comentario);
	
	public void denunciarComentario(Usuario_Registrado usuario, Comentario comentario);
	
	public void annadirNotificacion(String tipo, Usuario_Registrado receptor, Usuario_Registrado emisor, Publicacion publicacion);

	public void segimiento(Usuario_Registrado seguido , Usuario_Registrado seguidor);
	
	public void denunciarPublicación(Usuario_Registrado usuario, Publicacion publicacion);
	
	public void denunciarUsuario(Usuario_Registrado denunciante, Usuario_Registrado denunciado);
	
	public void annadirMeGusta(Publicacion publicacion, Usuario_Registrado usuario);
	
	public Publicacion cargarVideoPorRuta(String ruta);
	
}