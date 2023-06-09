package basededatos;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Administradores {
	public Sistema _sis_admin;
	public Vector<Administrador> _administrador = new Vector<Administrador>();

	public Administrador iniciarSesion(String aUser, String aPass) throws PersistentException {
		Administrador u = null;
        PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
        try {
            u = AdministradorDAO.loadAdministradorByQuery("usuario=aUser and contrasenna=aPass", null);
            t.commit();
        }catch (Exception e) {
            t.rollback();
            e.printStackTrace();
        }
        return u;
	}
}