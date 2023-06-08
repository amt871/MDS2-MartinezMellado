package interfaz;

import com.vaadin.flow.component.Component;

import basededatos.Usuario_Registrado;
import vistas.VistaVer_perfil_privado__usuario_registrado_;

public class Ver_perfil_privado__usuario_registrado_ extends VistaVer_perfil_privado__usuario_registrado_ {
//	private Label _usuarioPrivadoL;
	
	public Ver_perfil_privado__usuario_registrado_(Component cabecera, Usuario_Registrado usuario) {
		
		this.getDivCabecera().add(cabecera);
		this.getLabelSeguidores().setText("Seguidores: "+String.valueOf(usuario.seguidor.size()));
		this.getLabelMegustas().setText("Me gustas: "+String.valueOf(usuario.le_gusta.size()));
		this.getImage().setSrc(usuario.getFoto());
		this.getLabelUsuario().setText(usuario.getUsuario());
		
	}
	
}