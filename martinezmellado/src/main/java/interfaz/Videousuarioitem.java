package interfaz;

import basededatos.Usuario_Registrado;
import vistas.VistaVideousuarioitem;

public class Videousuarioitem extends VistaVideousuarioitem{
	
	private Video video;
	private Usuario_Registrado propietario;
	
	public Videousuarioitem(Usuario_Registrado propietario, Video video) {
		
		this.getStyle().set("position", "relative");
		
		this.video = video;
		this.propietario = propietario;
		
		this.getDivVideo().add(this.video);
		this.getLabelUsuario().setText(this.propietario.getUsuario());
		
		this.video.setHeight("25%");
		this.video.setWidth("25%");
		
	}

}
