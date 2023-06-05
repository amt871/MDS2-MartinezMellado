package basededatos;

import java.util.Date;

public interface iCibernauta {

	public boolean comprobarCredenciales(String aUser, String aPass);

	public Usuario_Registrado iniciarSesion(String aUser, String aPass);

	public void cambiarContrasenna(Object aNuevaContrasenna, String aNombreUsuario);

	public boolean registrarse(String aNombre, String aApellidos, String aNomUsuario, String aContrasenna, String aCorreo, String aFechaNacimiento, String aDescripcion, String aFoto, String aTipo);

	public boolean registrarse(String aNombre, String aApellidos, String aNomUsuario, String aContrasenna, String aCorreo, Date aFechaNacimiento, String aDescripcion, String aFoto, String aTipo);
}