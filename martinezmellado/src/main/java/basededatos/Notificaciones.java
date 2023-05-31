package basededatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.Administrador;
import orm.AdministradorDAO;
import orm.MartinezMelladoMDSPersistentManager;
import orm.Notificacion;
import orm.NotificacionDAO;

public class Notificaciones {
	public Sistema _sis_not;
	public Vector<Notificacion> _notificacion = new Vector<Notificacion>();

	public List<Notificacion> listarNotificaciones(String aUsuario) throws PersistentException {
	    Notificacion[] u = null;
	    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
	    try {
	        u = NotificacionDAO.listNotificacionByQuery(null, null);
	    }catch (Exception e) {
	        t.rollback();
	    }
	    List<Notificacion> aux = new ArrayList<Notificacion>();
	    if (u != null) {
	        for (Notificacion Noti : u) {
	            aux.add(Noti);
	        }
	    }
	    return aux;
	}


	public void cambiarNotificacion(int aNotificacion) throws PersistentException {
		 PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		    try {
		        Notificacion u = NotificacionDAO.loadNotificacionByQuery("ID=" + aNotificacion, null);
		        NotificacionDAO.delete(u);
		    }catch (Exception e) {
		        t.rollback();
		    }
	}
}