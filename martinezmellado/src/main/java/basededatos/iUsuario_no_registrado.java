package basededatos;

import java.util.List;

public interface iUsuario_no_registrado {

	public List buscarUsuario(String aBusqueda);

	public List buscarHashTag(String aBusqueda);

	public Usuario_Registrado datosUsuario(String aNombreUsuario);
	
	public Publicacion[] listarTodasPublicaciones();
	
	public Usuario_Registrado[] listarTodosUsuarios();
	
	public Hashtag ObtenerHahsTag(String aBusqueda);
	
	public Usuario_Registrado cargarDatosUsuario(String aNombreUsuario);
	
	public boolean cambiarContrasenna(String aNuevaContrasenna, String aNombreUsuario);
	
	public List buscarUsuarios(String aBusqueda);
	
	public Publicacion cargarVideoPoID(int id);
	
}