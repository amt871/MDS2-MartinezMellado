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
	
	public void añadirPublicacionHashTag(  String hashtag, Publicacion publicacion ) throws PersistentException {
	    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
	    try {
	        	Hashtag aux = HashtagDAO.loadHashtagByQuery("hashtag= '" + hashtag + "'" , null);
	        	publicacion = PublicacionDAO.loadPublicacionByQuery("Video= '" + publicacion.getVideo() + "'" , null);
	        	if (aux == null) {
	        		aux = HashtagDAO.createHashtag();
	        		aux.setHashtag(hashtag);
	        		
	        	}
	        	
	        	aux.esta.add(publicacion);
	        	
	        	HashtagDAO.save(aux);
	        	
	        	t.commit();
	        
	    }catch (Exception e) {
	        t.rollback();
	        e.printStackTrace();
	    }
	}
}