package interfaz;

import basededatos.Comentario;
import basededatos.Usuario_Registrado;
import vistas.VistaComentario__administrador__item;

public class Comentario__administrador__item extends VistaComentario__administrador__item{
//	private Label _nombrePropietarioComentarioL;
//	private ImageButton _fotoPropietarioComentarioIB;
//	private Label _comentarioL;
//	private Label _nMeGustasL;
//	public Comentario__administrador_ _comentario__administrador_;
//	public Ver_perfil__administrador_ _ver_perfil__administrador_;
//	public Ver_perfil__administrador_ _unnamed_Ver_perfil__administrador__;
//	public Publicaciones_asociadas_a_un_hastag _publicaciones_asociadas_a_un_hastag;

	private Cabecera__administrador_ cabecera;
	private Usuario_Registrado usuario;
	private Comentario comentario;
	
	public Comentario__administrador__item(Comentario comentario, Cabecera__administrador_ cabecera) {
		// TODO Auto-generated constructor stub
		
		this.cabecera = cabecera;
		this.getImage().addClickListener(event -> {
			verPerfilOtroUsuarioAdmin();
		});
		
		this.usuario = cabecera.getDatos().cargarDatosUsuario(comentario.getAutor());
		
		this.comentario = cabecera.getDatos().cargarComentario(this.usuario, cabecera.getDatos().cargarVideoPoID(Integer.valueOf(comentario.getPublicacion())));
		// TODO Auto-generated constructor stub
		
		this.getImage().setSrc("Usuarios/"+comentario.getAutor()+"/imagen.jpg");
		this.getLabelcomentario().setText(comentario.getComentario());
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
		//this.getStyle().set("position", "relative");
		
		this.getbEliminar().addClickListener(event -> {
			
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