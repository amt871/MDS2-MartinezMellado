package basededatos;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

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
	        t.commit();
	    }catch (Exception e) {
	        t.rollback();
	    }
	    return aux;
	}
	
	public void annadirComentario(String usuario, Publicacion publicacion, String comentario) throws PersistentException {
		 PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		    try { 
		    	Usuario_Registrado usr = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + usuario +"'", null);
		    	Comentario coment = new Comentario();
		    	
		    	coment.setAutor(usr.getUsuario());
		    	coment.setComentario(comentario);
		    	coment.setEs_publicado(usr);
		    	coment.setFechaPublicacion(Date.valueOf(LocalDate.now()));
		    	coment.setPertenece(publicacion);
		    	coment.setPublicacion(String.valueOf(publicacion.getID()));
		    	
		    	usr.publica.add(coment);
		    	
		    	ComentarioDAO.save(coment);
		    	Usuario_RegistradoDAO.save(usr);	
		    	
		    	t.commit();
		    	
		    }catch (Exception e) {
		        t.rollback();
		        e.printStackTrace();
		    }
	}
	
	public void denunciarComentario(Usuario_Registrado usuario, Comentario comentario) throws PersistentException {
		 PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		    try { 
		    	
		    	comentario.es_denunciada.add(usuario);
		    	usuario.denunciaA.add(comentario);
		    	
		    	ComentarioDAO.save(comentario);
		    	Usuario_RegistradoDAO.save(usuario);	    	
		    	
		    	t.commit();
		    	
		    }catch (Exception e) {
		        t.rollback();
		        e.printStackTrace();
		    }
	}
	
	public void retirarDenunciaComentario(Comentario comentario, Usuario_Registrado usuario)
			throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {

			if (comentario.es_denunciada.contains(usuario))
				comentario.es_denunciada.remove(usuario);
			if (usuario.denunciaA.contains(comentario))
				usuario.denunciaA.remove(comentario);

			ComentarioDAO.save(comentario);
			Usuario_RegistradoDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
	}
	
	public Comentario cargarComentario(Usuario_Registrado usuario, Publicacion publicacion) throws PersistentException {
		 PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		    try { 
		    	Comentario aux =  ComentarioDAO.loadComentarioByQuery("autor = '" + usuario.getUsuario() + "' and publicacion = '" + publicacion.getVideo() + '"', null);	    	
		    	t.commit();
		    	return aux;
		    }catch (Exception e) {
		        t.rollback();
		        e.printStackTrace();
		    }
		    return null;
	}
}