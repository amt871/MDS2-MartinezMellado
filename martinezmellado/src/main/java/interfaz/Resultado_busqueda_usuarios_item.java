package interfaz;

import basededatos.Usuario_Registrado;
import vistas.VistaResultado_busqueda_usuarios_item;

public class Resultado_busqueda_usuarios_item extends VistaResultado_busqueda_usuarios_item{
	
//	private ImageButton _fotoPerfilUsuarfioIB;
//	private Label _nombreUsuarioL;
//	private Label _numeroSegidoresL;
//	private Label _descripcionL;
//	private Label _ultimaPublicacionL;
//	private ImageIcon _previsualizacionVideo;
//	public Resultado_busqueda_usuarios _resultado_busqueda_usuarios;
//	public Ver_perfil__administrador_ _ver_perfil__administrador_;
//	public Ver_perfil__administrador_ _unnamed_Ver_perfil__administrador__;
//
//	public void ver_perfil__administrador_() {
//		throw new UnsupportedOperationException();
//	}

	private Cabecera__administrador_ cabecera;
	private Usuario_Registrado usuario;
	
	public Resultado_busqueda_usuarios_item(Usuario_Registrado usu, Cabecera__administrador_ cabecera) {
		// TODO Auto-generated constructor stub
		this.cabecera = cabecera;
		this.usuario = usu;
		this.getImage().setSrc(usu.getFoto());
		this.getDescripcion().setText(usu.getDescripcion());
		this.getSeguidores().setText("Seguidores: "+usu.seguidor.size());
		this.getNombreUsuario().setText(usu.getUsuario());
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
		this.getImage().addClickListener(e ->{
			
			verPerfilOtroUsuarioAdmin();
			
		});
	}
	
	private void verPerfilOtroUsuarioAdmin() {


		// System.out.println(miUsuario.getUsuario());

		// Notification.show("Aun no implementado");
		
			this.cabecera.setPerfil(
					new Ver_perfil__administrador_(this.cabecera, this.usuario));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getPerfil());
			// this.inicio.cambiarPantalla(cabecera);
		

}

}