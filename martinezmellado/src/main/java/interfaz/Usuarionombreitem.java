package interfaz;

import vistas.VistaUsuarionombreitem;

public class Usuarionombreitem extends VistaUsuarionombreitem {
	
	
	public Usuarionombreitem(String src, String nombreUsuario) {
		
		this.getImagen().setSrc(src);
		this.getLabelUsuario().setText(nombreUsuario);
		
	}

}
