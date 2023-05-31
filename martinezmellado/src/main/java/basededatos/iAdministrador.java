package basededatos;

import java.util.List;

import orm.*;

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

	public void modificarEstadoUsuario(String aNombreUsuario);
}