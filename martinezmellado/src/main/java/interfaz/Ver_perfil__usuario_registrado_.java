package interfaz;

import com.vaadin.flow.component.Component;

import vistas.VistaVer_perfil__usuario_registrado_;

//import basededatos.iVer_perfil__usuario_registrado_;

public class Ver_perfil__usuario_registrado_ extends VistaVer_perfil__usuario_registrado_ {
//	private Button _denunciar_perfil;
//	private Button _dejar_de_seguir;
//	private Button _seguir_solicitar_seguir;
//	private Label _nSeguidoresL;
//	private Label _nombreUsuarioL;
//	private Label _nMeGustasL;
//	public iVer_perfil__usuario_registrado_ _iVer_perfil__usuario_registrado_;

/*	public void denunciar_perfil() {
		throw new UnsupportedOperationException();
	}

	public void dejar_de_seguir() {
		throw new UnsupportedOperationException();
	}

	public void seguir_solicitar_seguir() {
		throw new UnsupportedOperationException();
	}*/
	
	//private basededatos.Usuario_Registrado usuario;
	
	public Ver_perfil__usuario_registrado_(Component cabecera, basededatos.Usuario_Registrado usuario) {
	
		this.getDivCabecera().add(cabecera);
		this.getLabelSeguidores().setText("Seguidores: "+String.valueOf(usuario.seguidor.size()));
		this.getLabelMegustas().setText("Me gustas: "+String.valueOf(usuario.le_gusta.size()));
		this.getImage().setSrc(usuario.getFoto());
		
	}
	
	
}