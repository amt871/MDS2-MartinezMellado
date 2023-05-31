package basededatos;

import java.util.List;
import java.util.Vector;
import orm.Publicacion;

public class Publicaciones {
	public Sistema _sis_publi;
	public Vector<Publicacion> _publicacion = new Vector<Publicacion>();

	public List cargarVideos() {
		throw new UnsupportedOperationException();
	}

	public List listarVideosBusqueda() {
		throw new UnsupportedOperationException();
	}

	public List videosHashTag(String aHashtag) {
		throw new UnsupportedOperationException();
	}

	public void nuevaPublicacion(String aDescripcion, String aUbicacion, String aVideo, String aFecha, String aTipo, String aPropietario) {
		throw new UnsupportedOperationException();
	}

	public List listarPublicacionesDenunciadas() {
		throw new UnsupportedOperationException();
	}

	public Publicacion cargarVideo(String aVideo) {
		throw new UnsupportedOperationException();
	}
}