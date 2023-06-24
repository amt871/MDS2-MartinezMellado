package basededatos;

import java.util.List;

public interface iAdministrador {

	public Administrador iniciarSesionAdministrador(String aUser, String aPass);

	public List buscarHashTag(String aBusqueda);

	public List listarPublicacionesDenunciadas();
	
	public List listarUsuariosDenunciados();
	
	public List listarComentariosDenunciados();

	public void archivarDenuncia(String aElemento, String aTipo, Administrador encargado);
	
	public void retirarDenunciaComentario(Comentario comentario);
	
	public void retirarDenunciaPublicacion(Publicacion publicacion);
	
	public void retirarDenunciaUsuario(Usuario_Registrado denunciado);
	
	public Publicacion cargarVideoPorRuta(String ruta);
	
	public void eliminarComentario(Comentario comentario);
	
	public void eliminarPublicaion(Publicacion publicaion);
	
	public void bloquearUsuario(Usuario_Registrado usuario, Administrador adminstrador);
	
	public List listarDenunciasArchivadas();
	
	public Usuario_Registrado cargarDatosUsuario(String aNombreUsuario);
	
	public List buscarUsuarios(String aBusqueda);
	
	public Publicacion cargarVideoPoID(int id);
	
	public Comentario cargarComentario(Usuario_Registrado usuario, Publicacion publicacion);
	
	public Publicacion[] listarTodasPublicaciones();
	
	public Usuario_Registrado[] listarTodosUsuarios();
}