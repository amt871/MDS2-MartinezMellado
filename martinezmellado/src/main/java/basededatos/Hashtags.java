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
	        
	    }catch (Exception e) {
	        t.rollback();
	    }
	    return aux;
	}
}