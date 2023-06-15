package interfaz;

import basededatos.Comentario;
import vistas.VistaComentario_item;

public class Comentario_item extends VistaComentario_item{

	public Comentario_item(Comentario comentario) {
		// TODO Auto-generated constructor stub
		
		this.getImgUser().setSrc("Usuarios/"+comentario.getAutor()+"/imagen.jpg");
		this.getLabelComentario().setText(comentario.getComentario());
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
		//this.getStyle().set("position", "relative");
	}
//	private Button _denunciarB;
//	private ImageButton _imagenUsuarioIB;
//	private Label _nombreUsuarioL;
//	public Comentario _comentario;
//	public Perfil_otro_usuario _perfil_otro_usuario;
//
//	public void perfil_otro_usuario() {
//		throw new UnsupportedOperationException();
//	}
	
	
	
}