package basededatos;
import java.util.Date;

public interface iComercial {

	public Usuario_Registrado cargarDatosUsuario(String aNombreUsuario);

	public boolean guardarDatos(String aFoto, String aUsuario, String aNombre, Date aFechaDeNacimiento, String aCorreoElectronico, String aDescripcion);

	public void guardarNuevaContrasenna(String aNuevaContrasena, String aUsuario);

	public void nuevaPublicacion(String aDescripcion, String aUbicacion, String aVideo, String aFecha, String aTipo, String aPropietario);
	
}