package basededatos;

import java.util.List;

public interface iAdministrador {

	public Administrador iniciarSesionAdministrador(String aUser, String aPass);

	public List cargarVideos();

	public String listarVideosBusquedaAdministrador();

	public List buscarUsuarios(String aBusqueda);

	public List buscarHashTag(String aBusqueda);

	public List videosHashTag(String aHashtag);

	public List listarDenunciasAdministrador();

	public void archivarDenuncia(String aElemento, String aTipo);

	public Usuario_Registrado datosUsuarioPerfil();

	public boolean modificarEstadoUsuario(String aNombreUsuario);
	
	public void retirarDenunciaComentario(Comentario comentario, Usuario_Registrado usuario);
	
	public void retirarDenunciaPublicacion(Publicacion publicacion, Usuario_Registrado usuario);
	
	public void retirarDenunciaUsuario(Usuario_Registrado denunciante, Usuario_Registrado denunciado);
}