package interfaz;

import com.vaadin.flow.component.notification.Notification;

import antlr.debug.Event;
import basededatos.Comentario;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaComentario_item;

public class Comentario_item extends VistaComentario_item {

	public Comentario_item(Comentario comentario, Mi_cabecera cabecera) {
		// TODO Auto-generated constructor stub
		
		this.getImgUser().setSrc("Usuarios/"+comentario.getAutor()+"/imagen.jpg");
		this.getLabelComentario().setText(comentario.getComentario());
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
		//this.getStyle().set("position", "relative");
		
		this.getbDenunciar().addClickListener(event -> {
			Usuario_Registrado miUsr = cabecera.getDatos().cargarDatosUsuario(cabecera.getUser().getUsuario());
			Usuario_Registrado usr = cabecera.getDatos().cargarDatosUsuario(comentario.getAutor());
			Publicacion publi = cabecera.getDatos().cargarVideoPoID(Integer.valueOf(comentario.getPublicacion()));
			Comentario aux = cabecera.getDatos().cargarComentario(usr, publi);
			
			boolean flag = true;
			for (Usuario_Registrado denunciante : aux.es_denunciada.toArray()){
				if (denunciante.getUsuario().equals(miUsr.getUsuario())) {
					flag = false;
				}
			}
			
			
			if (flag) {
				cabecera.getDatos().denunciarComentario(miUsr, comentario);
			}else{
				Notification.show("Ya has denunciado este comentario");
			}
		});
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