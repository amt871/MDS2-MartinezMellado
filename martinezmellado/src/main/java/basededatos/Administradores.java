package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.Administrador;
import orm.AdministradorDAO;
import orm.MartinezMelladoMDSPersistentManager;
import orm.Usuario_Registrado;
import orm.Usuario_RegistradoDAO;

public class Administradores {
	public Sistema _sis_admin;
	public Vector<Administrador> _administrador = new Vector<Administrador>();

	public Administrador iniciarSesion(String aUser, String aPass) throws PersistentException {
		Administrador u = null;
        PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
        try {
            u = AdministradorDAO.loadAdministradorByQuery("usuario=aUser and contrasenna=aPass", null);
        }catch (Exception e) {
            t.rollback();
        }
        return u;
	}
}