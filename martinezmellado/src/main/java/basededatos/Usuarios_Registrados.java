package basededatos;

import java.util.List;
import java.util.Vector;
import orm.Usuario_Registrado;

public class Usuarios_Registrados {
	public Sistema _sis_usr_reg;
	public Vector<Usuario_Registrado> _usuario_Registrado = new Vector<Usuario_Registrado>();

	public boolean comprobarCredenciales(String aUser, String aPass) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado iniciarSesion(String aUser, String aPass) {
		throw new UnsupportedOperationException();
	}

	public void cambiarContrasenna(String aNuevaContrasenna, String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void registrarse(String aNombre, String aApellidos, String aNomUsuario, String aContrasenna, String aCorreo, String aFechaNaciemiento, String aDescripcion, String aFoto, String aTipo) {
		throw new UnsupportedOperationException();
	}

	public List buscarUsuarios(String aBusqueda) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado datosUsuario(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void guardarDatos(String aFoto, String aUsuario, String aNombre, String aFechaDeNacimiento, String aCorreoElectronico, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public void guardarNuevaContrasenna(String aNuevaContrasenna, String aUsuario) {
		throw new UnsupportedOperationException();
	}

	public List listarUsuariosDenunciados() {
		throw new UnsupportedOperationException();
	}

	public void modificarEstadoUsuario(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}
}