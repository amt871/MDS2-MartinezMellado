package basededatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Hashtags {
	public Sistema _sis_has;
	public Vector<Hashtag> _hashtag = new Vector<Hashtag>();

	/*** REVISAR
	public List buscarHahsTag(String aBusqueda) throws PersistentException {
		List<Publicacion> aux = new ArrayList<Publicacion>();
	    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
	    try {
	        Publicacion[] publicaciones = PublicacionDAO.listPublicacionByQuery(null, null);
	        if (publicaciones != null) {
	            aux = Arrays.asList(publicaciones);
	            Hashtag has = HashtagDAO.loadHashtagByQuery("Hashtag = '" + aBusqueda + "'", null);
	            for (Publicacion publicacion : aux) {
	            	HashtagSetCollection listaHashtag = publicacion.pertenece;
					if (listaHashtag.size() <= 0) {
						if (!listaHashtag.contains(has)) {
							aux.remove(publicacion);
						}
					}
				}
	        }
	        t.commit();
	        
	    }catch (Exception e) {
	        t.rollback();
	        e.printStackTrace();
	    }
	    return aux;
	}
	REVISAR*///
	///Borrar el de abajo
	public List buscarHahsTag(String aBusqueda) throws PersistentException {
		List<Hashtag> aux = new ArrayList<Hashtag>();
	    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
	    try {
	        Hashtag[] hashtags = HashtagDAO.listHashtagByQuery("hashtag like '%"+aBusqueda+"%'", null);
	        //System.out.println(hashtags.length);
	        if (hashtags != null) {
	            for(int i = 0; i<hashtags.length; i++)
	            	aux.add(hashtags[i]);
	        }
	        t.commit();
	        
	    }catch (Exception e) {
	        t.rollback();
	        e.printStackTrace();
	    }
	    return aux;
	}
	///Borrar el de arriba, no nos pasemos
	public void annadirPublicacionHashTag(  String hashtag, Publicacion publicacion ) throws PersistentException {
	    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
	    try {
	        	Hashtag aux = HashtagDAO.loadHashtagByQuery("hashtag= '" + hashtag + "'" , null);
	        	Publicacion publicacionAux = PublicacionDAO.loadPublicacionByQuery("video = '" + publicacion.getVideo() + "'", null);
	        	//System.out.println(publicacion.getVideo());
	        	if (aux == null) {
	        		aux = HashtagDAO.createHashtag();
	        		aux.setHashtag(hashtag);
	        		
	        	}
	        	
	        	aux.esta.add(publicacionAux);
	        	
	        	HashtagDAO.save(aux);

	        	t.commit();
	        
	    }catch (Exception e) {
	        t.rollback();
	        e.printStackTrace();
	    }
	    MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
	}
	
	public Hashtag ObtenerHahsTag(String aBusqueda) throws PersistentException {
	    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
	    Hashtag hashtag = null;
	    try {
	    	hashtag = HashtagDAO.loadHashtagByQuery("hashtag = '"+aBusqueda+"'", null);

	        t.commit();
	        
	    }catch (Exception e) {
	        t.rollback();
	        e.printStackTrace();
	    }
	    return hashtag;
	}
}