package basededatos;

import java.util.List;

public interface iUsuario_no_registrado {

	public List cargarVideos();

	public List listarVideoBusqueda(String cadena);

	public List buscarUsuario(String aBusqueda);

	public List buscarHashTag(String aBusqueda);

	public List videosHashTag(String aHashtag);

	public Usuario_Registrado datosUsuario(String aNombreUsuario);
}