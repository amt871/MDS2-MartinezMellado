/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Juanra(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class PublicacionDAO {
	public static Publicacion loadPublicacionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return loadPublicacionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion getPublicacionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return getPublicacionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return loadPublicacionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion getPublicacionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return getPublicacionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Publicacion) session.load(Publicacion.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion getPublicacionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Publicacion) session.get(Publicacion.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Publicacion) session.load(Publicacion.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion getPublicacionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Publicacion) session.get(Publicacion.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicacion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return queryPublicacion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicacion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return queryPublicacion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion[] listPublicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return listPublicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion[] listPublicacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return listPublicacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicacion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Publicacion as Publicacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicacion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Publicacion as Publicacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Publicacion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion[] listPublicacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPublicacion(session, condition, orderBy);
			return (Publicacion[]) list.toArray(new Publicacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion[] listPublicacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPublicacion(session, condition, orderBy, lockMode);
			return (Publicacion[]) list.toArray(new Publicacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return loadPublicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return loadPublicacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Publicacion[] publicacions = listPublicacionByQuery(session, condition, orderBy);
		if (publicacions != null && publicacions.length > 0)
			return publicacions[0];
		else
			return null;
	}
	
	public static Publicacion loadPublicacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Publicacion[] publicacions = listPublicacionByQuery(session, condition, orderBy, lockMode);
		if (publicacions != null && publicacions.length > 0)
			return publicacions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePublicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return iteratePublicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return iteratePublicacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Publicacion as Publicacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Publicacion as Publicacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Publicacion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion createPublicacion() {
		return new Publicacion();
	}
	
	public static boolean save(Publicacion publicacion) throws PersistentException {
		try {
			MartinezMelladoMDSPersistentManager.instance().saveObject(publicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Publicacion publicacion) throws PersistentException {
		try {
			MartinezMelladoMDSPersistentManager.instance().deleteObject(publicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Publicacion publicacion)throws PersistentException {
		try {
			if (publicacion.getRealizada() != null) {
				publicacion.getRealizada().realiza.remove(publicacion);
			}
			
			Usuario_Registrado[] lLe_gustas = publicacion.le_gusta.toArray();
			for(int i = 0; i < lLe_gustas.length; i++) {
				lLe_gustas[i].le_gusta.remove(publicacion);
			}
			Usuario_Registrado[] lEs_denunciadas = publicacion.es_denunciada.toArray();
			for(int i = 0; i < lEs_denunciadas.length; i++) {
				lEs_denunciadas[i].denuncia.remove(publicacion);
			}
			Hashtag[] lPerteneces = publicacion.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].esta.remove(publicacion);
			}
			Comentario[] lTienes = publicacion.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setPertenece(null);
			}
			return delete(publicacion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Publicacion publicacion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (publicacion.getRealizada() != null) {
				publicacion.getRealizada().realiza.remove(publicacion);
			}
			
			Usuario_Registrado[] lLe_gustas = publicacion.le_gusta.toArray();
			for(int i = 0; i < lLe_gustas.length; i++) {
				lLe_gustas[i].le_gusta.remove(publicacion);
			}
			Usuario_Registrado[] lEs_denunciadas = publicacion.es_denunciada.toArray();
			for(int i = 0; i < lEs_denunciadas.length; i++) {
				lEs_denunciadas[i].denuncia.remove(publicacion);
			}
			Hashtag[] lPerteneces = publicacion.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].esta.remove(publicacion);
			}
			Comentario[] lTienes = publicacion.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setPertenece(null);
			}
			try {
				session.delete(publicacion);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Publicacion publicacion) throws PersistentException {
		try {
			MartinezMelladoMDSPersistentManager.instance().getSession().refresh(publicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Publicacion publicacion) throws PersistentException {
		try {
			MartinezMelladoMDSPersistentManager.instance().getSession().evict(publicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByCriteria(PublicacionCriteria publicacionCriteria) {
		Publicacion[] publicacions = listPublicacionByCriteria(publicacionCriteria);
		if(publicacions == null || publicacions.length == 0) {
			return null;
		}
		return publicacions[0];
	}
	
	public static Publicacion[] listPublicacionByCriteria(PublicacionCriteria publicacionCriteria) {
		return publicacionCriteria.listPublicacion();
	}
}
