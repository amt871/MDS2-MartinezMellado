package basededatos;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.PersistentTransaction;

public class Publicaciones {
	public Sistema _sis_publi;
	public Vector<Publicacion> _publicacion = new Vector<Publicacion>();

	public List<Publicacion> cargarVideos() throws PersistentException {
		 Publicacion[] u = null;
		    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		    try {
		        u = PublicacionDAO.listPublicacionByQuery(null, null);
		    }catch (Exception e) {
		        t.rollback();
		    }
		    List<Publicacion> aux = new ArrayList<Publicacion>();
		    if (u != null) {
		        for (Publicacion publicacion : u) {
		            aux.add(publicacion);
		        }
		    }
		    return aux;
	}

	public List<Publicacion> listarVideosBusqueda(String cadena) throws PersistentException {
		List<Publicacion> aux = new ArrayList<Publicacion>();
	    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
	    try {
	        String queryStr = "Descripcion like '%" + cadena + "%'";
	        Publicacion[] publicaciones = PublicacionDAO.listPublicacionByQuery(queryStr, null);
	        if (publicaciones != null) {
	            aux = Arrays.asList(publicaciones);
	        }
	    }catch (Exception e) {
	        t.rollback();
	    }
	    return aux;
	}

	public List videosHashTag(String aHashtag) throws PersistentException {
		List<Publicacion> aux = new ArrayList<Publicacion>();
	    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
	    try {
	        String queryStr = "Hashtag like '%" + aHashtag + "%'";
	        Publicacion[] publicaciones = PublicacionDAO.listPublicacionByQuery(queryStr, null);
	        if (publicaciones != null) {
	            aux = Arrays.asList(publicaciones);
	        }
	    }catch (Exception e) {
	        t.rollback();
	    }
	    return aux;
	}

	public void nuevaPublicacion(String aDescripcion, String aUbicacion, String aVideo, String aFecha, String aTipo, String aPropietario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
	    try {
	    	Usuario_Registrado usr = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario = '" + aPropietario + "'", null);
	        Publicacion aux = new Publicacion();
	        aux.setDescripcion(aDescripcion);
	        aux.setUbicacion(aUbicacion);
	        aux.setVideo(aVideo);
	        aux.setFecha(Date.valueOf(LocalDate.now()));
	        aux.setPublicidad(aTipo);
	        aux.setRealizada(usr);
	        aux.setORM_Realizada(usr);
	        PublicacionDAO.save(aux);
	        usr.realiza.add(aux);
	        Usuario_RegistradoDAO.save(usr);
	        t.commit();
	    }catch (Exception e) {
	        t.rollback();
	    }
	}

	public List listarPublicacionesDenunciadas() throws PersistentException {
		List<Publicacion> aux = new ArrayList<Publicacion>();
	    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
	    try {
	        Publicacion[] publicaciones = PublicacionDAO.listPublicacionByQuery(null, null);
	        if (publicaciones != null) {
	            aux = Arrays.asList(publicaciones);
	            for (Publicacion publicacion : aux) {
					if (publicacion.es_denunciada.size() <= 0) {
						aux.remove(publicacion);
					}
				}
	        }
	        
	    }catch (Exception e) {
	        t.rollback();
	    }
	    return aux;
	}

	public Publicacion cargarVideo(String aVideo) throws PersistentException {
		 Publicacion u = null;
		    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		    try {
		        u = PublicacionDAO.loadPublicacionByQuery("ID = '" + aVideo + "'", aVideo);
		    }catch (Exception e) {
		        t.rollback();
		    }
		    return u;
	}
	
	public Publicacion[] listarVideosUsuario(int id) throws PersistentException{
		
		return PublicacionDAO.listPublicacionByQuery("Usuario_RegistradoUsuarioID='"+id+"'", null);
		
	}
	
	/*public static Publicacion[] listPublicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return listPublicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}*/

	public void retirarDenunciaPublicacion(Publicacion publicacion, Usuario_Registrado usuario)
			throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {

			if (publicacion.es_denunciada.contains(usuario))
				publicacion.es_denunciada.remove(usuario);
			if (usuario.denuncia.contains(publicacion))
				usuario.denuncia.remove(publicacion);

			PublicacionDAO.save(publicacion);
			Usuario_RegistradoDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}

