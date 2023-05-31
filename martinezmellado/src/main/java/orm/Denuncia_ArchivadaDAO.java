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
package orm;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Denuncia_ArchivadaDAO {
	public static Denuncia_Archivada loadDenuncia_ArchivadaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return loadDenuncia_ArchivadaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada getDenuncia_ArchivadaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return getDenuncia_ArchivadaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada loadDenuncia_ArchivadaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return loadDenuncia_ArchivadaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada getDenuncia_ArchivadaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return getDenuncia_ArchivadaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada loadDenuncia_ArchivadaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Denuncia_Archivada) session.load(Denuncia_Archivada.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada getDenuncia_ArchivadaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Denuncia_Archivada) session.get(Denuncia_Archivada.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada loadDenuncia_ArchivadaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Denuncia_Archivada) session.load(Denuncia_Archivada.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada getDenuncia_ArchivadaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Denuncia_Archivada) session.get(Denuncia_Archivada.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDenuncia_Archivada(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return queryDenuncia_Archivada(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDenuncia_Archivada(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return queryDenuncia_Archivada(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada[] listDenuncia_ArchivadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return listDenuncia_ArchivadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada[] listDenuncia_ArchivadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return listDenuncia_ArchivadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDenuncia_Archivada(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Denuncia_Archivada as Denuncia_Archivada");
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
	
	public static List queryDenuncia_Archivada(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Denuncia_Archivada as Denuncia_Archivada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Denuncia_Archivada", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada[] listDenuncia_ArchivadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDenuncia_Archivada(session, condition, orderBy);
			return (Denuncia_Archivada[]) list.toArray(new Denuncia_Archivada[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada[] listDenuncia_ArchivadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDenuncia_Archivada(session, condition, orderBy, lockMode);
			return (Denuncia_Archivada[]) list.toArray(new Denuncia_Archivada[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada loadDenuncia_ArchivadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return loadDenuncia_ArchivadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada loadDenuncia_ArchivadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return loadDenuncia_ArchivadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada loadDenuncia_ArchivadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Denuncia_Archivada[] denuncia_Archivadas = listDenuncia_ArchivadaByQuery(session, condition, orderBy);
		if (denuncia_Archivadas != null && denuncia_Archivadas.length > 0)
			return denuncia_Archivadas[0];
		else
			return null;
	}
	
	public static Denuncia_Archivada loadDenuncia_ArchivadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Denuncia_Archivada[] denuncia_Archivadas = listDenuncia_ArchivadaByQuery(session, condition, orderBy, lockMode);
		if (denuncia_Archivadas != null && denuncia_Archivadas.length > 0)
			return denuncia_Archivadas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDenuncia_ArchivadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return iterateDenuncia_ArchivadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDenuncia_ArchivadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MartinezMelladoMDSPersistentManager.instance().getSession();
			return iterateDenuncia_ArchivadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDenuncia_ArchivadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Denuncia_Archivada as Denuncia_Archivada");
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
	
	public static java.util.Iterator iterateDenuncia_ArchivadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Denuncia_Archivada as Denuncia_Archivada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Denuncia_Archivada", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada createDenuncia_Archivada() {
		return new Denuncia_Archivada();
	}
	
	public static boolean save(Denuncia_Archivada denuncia_Archivada) throws PersistentException {
		try {
			MartinezMelladoMDSPersistentManager.instance().saveObject(denuncia_Archivada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Denuncia_Archivada denuncia_Archivada) throws PersistentException {
		try {
			MartinezMelladoMDSPersistentManager.instance().deleteObject(denuncia_Archivada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Denuncia_Archivada denuncia_Archivada)throws PersistentException {
		try {
			if (denuncia_Archivada.getAtendida() != null) {
				denuncia_Archivada.getAtendida().ha_atendido.remove(denuncia_Archivada);
			}
			
			return delete(denuncia_Archivada);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Denuncia_Archivada denuncia_Archivada, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (denuncia_Archivada.getAtendida() != null) {
				denuncia_Archivada.getAtendida().ha_atendido.remove(denuncia_Archivada);
			}
			
			try {
				session.delete(denuncia_Archivada);
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
	
	public static boolean refresh(Denuncia_Archivada denuncia_Archivada) throws PersistentException {
		try {
			MartinezMelladoMDSPersistentManager.instance().getSession().refresh(denuncia_Archivada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Denuncia_Archivada denuncia_Archivada) throws PersistentException {
		try {
			MartinezMelladoMDSPersistentManager.instance().getSession().evict(denuncia_Archivada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia_Archivada loadDenuncia_ArchivadaByCriteria(Denuncia_ArchivadaCriteria denuncia_ArchivadaCriteria) {
		Denuncia_Archivada[] denuncia_Archivadas = listDenuncia_ArchivadaByCriteria(denuncia_ArchivadaCriteria);
		if(denuncia_Archivadas == null || denuncia_Archivadas.length == 0) {
			return null;
		}
		return denuncia_Archivadas[0];
	}
	
	public static Denuncia_Archivada[] listDenuncia_ArchivadaByCriteria(Denuncia_ArchivadaCriteria denuncia_ArchivadaCriteria) {
		return denuncia_ArchivadaCriteria.listDenuncia_Archivada();
	}
}
