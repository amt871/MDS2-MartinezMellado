package basededatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.Comentario;
import orm.ComentarioDAO;
import orm.MartinezMelladoMDSPersistentManager;
import orm.Publicacion;
import orm.PublicacionDAO;

public class Comentarios {
	public Sistema _sis_com;
	public Vector<Comentario> _comentario = new Vector<Comentario>();

	public List listarComentariosDenunciados() throws PersistentException {
		List<Comentario> aux = new ArrayList<Comentario>();
	    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
	    try {
	        Comentario[] comentarios = ComentarioDAO.listComentarioByQuery(null, null);
	        if (comentarios != null) {
	            aux = Arrays.asList(comentarios);
	            for (Comentario comentario : aux) {
					if (comentario.es_denunciada.size() <= 0) {
						aux.remove(comentario);
					}
				}
	        }
	        
	    }catch (Exception e) {
	        t.rollback();
	    }
	    return aux;
	}
}