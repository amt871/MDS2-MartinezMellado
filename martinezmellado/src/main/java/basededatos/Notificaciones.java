package basededatos;

import java.util.List;
import java.util.Vector;
import orm.Notificacion;

public class Notificaciones {
	public Sistema _sis_not;
	public Vector<Notificacion> _notificacion = new Vector<Notificacion>();

	public List listarNotificaciones(String aUsuario) {
		throw new UnsupportedOperationException();
	}

	public void cambiarNotificacion(String aNotificacion) {
		throw new UnsupportedOperationException();
	}
}