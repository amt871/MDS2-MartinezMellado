package basededatos;

public interface iCibernauta {

	public boolean comprobarCredenciales(String aUser, String aPass);

	public Usuario_Registrado iniciarSesion(String aUser, String aPass);

	public void cambiarContrasenna(Object aNuevaContrasenna, String aNombreUsuario);

	public void registrarse(String aNombre, String aApellidos, String aNomUsuario, String aContrasenna, String aCorreo, String aFechaNacimiento, String aDescripcion, String aFoto, String aTipo);
}