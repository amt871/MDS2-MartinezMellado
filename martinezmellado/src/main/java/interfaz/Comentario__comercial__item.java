package interfaz;

import com.vaadin.flow.component.notification.Notification;

import basededatos.Comentario;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaComentario__comercial__item;

public class Comentario__comercial__item extends VistaComentario__comercial__item{
//	private ImageIcon _imagenUsuarioII;
//	private Label _textoComentariosL;
//	private Label _nombreUsuarioL;
//	public Comentario__comercial_ _comentario__comercial_;
	
	private Cabecera_comercial cabeceraCom;
	private Usuario_Registrado miUsuario;
	private Usuario_Registrado usuario;
	private Comentario comentario;
	
	public Comentario__comercial__item(Comentario comentario2, Cabecera_comercial cabeceraCom) {
		// TODO Auto-generated constructor stub
		this.cabeceraCom = cabeceraCom;
		this.miUsuario = this.cabeceraCom.getDatos().cargarDatosUsuario(this.cabeceraCom.getUser().getUsuario());
		
		this.usuario = this.cabeceraCom.getDatos().cargarDatosUsuario(comentario2.getAutor());
		
		this.comentario = this.cabeceraCom.getDatos().cargarComentario(this.usuario, this.cabeceraCom.getDatos().cargarVideoPoID(Integer.valueOf(comentario2.getPublicacion())));
		// TODO Auto-generated constructor stub
		
		this.getImgUser().setSrc(comentario2.getEs_publicado().getFoto());
		this.getLabelComentario().setText(comentario2.getComentario());
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "20%");
		//this.getStyle().set("position", "relative");
		
		this.getbDenunciar().addClickListener(event -> {
			Usuario_Registrado miUsr = cabeceraCom.getDatos().cargarDatosUsuario(cabeceraCom.getUser().getUsuario());
			Usuario_Registrado usr = cabeceraCom.getDatos().cargarDatosUsuario(comentario2.getAutor());
			Publicacion publi = cabeceraCom.getDatos().cargarVideoPoID(Integer.valueOf(comentario2.getPublicacion()));
			Comentario aux = cabeceraCom.getDatos().cargarComentario(usr, publi);
			
			boolean flag = true;
			for (Usuario_Registrado denunciante : aux.es_denunciada.toArray()){
				if (denunciante.getUsuario().equals(miUsr.getUsuario())) {
					flag = false;
				}
			}
			
			
			if (flag) {
				cabeceraCom.getDatos().denunciarComentario(miUsr, comentario2);
			}else{
				Notification.show("Ya has denunciado este comentario");
			}
		});
	}
}