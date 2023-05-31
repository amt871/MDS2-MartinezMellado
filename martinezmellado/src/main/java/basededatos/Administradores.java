package basededatos;

import java.util.Vector;
import orm.Administrador;

public class Administradores {
	public Sistema _sis_admin;
	public Vector<Administrador> _administrador = new Vector<Administrador>();

	public Administrador iniciarSesion(String aUser, String aPass) {
		throw new UnsupportedOperationException();
	}
}