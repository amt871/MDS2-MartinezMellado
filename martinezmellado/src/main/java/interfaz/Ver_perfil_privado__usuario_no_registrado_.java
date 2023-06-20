package interfaz;

import basededatos.Usuario_Registrado;
import interfaz.Ver_perfil__usuario_no_registrado_;
import vistas.VistaVer_perfil_privado__usuario_no_registrado_;

public class Ver_perfil_privado__usuario_no_registrado_ extends VistaVer_perfil_privado__usuario_no_registrado_ {
	
	//private Cabecera_usuario_no_registrado cabecera;
	//private Usuario_Registrado user;

	public Ver_perfil_privado__usuario_no_registrado_(Cabecera_usuario_no_registrado cabeceraNoReg,
			Usuario_Registrado usuario) {
		// TODO Auto-generated constructor stub
		
		//this.cabecera = cabeceraNoReg;
		//this.user = usuario;
		
		this.setCabecera(cabeceraNoReg);
		
		this.getLabelMeGustas().setText("Me gustas dados: "+usuario.le_gusta.size());
		this.getLabelSeguidores().setText("Seguidores: "+usuario.seguidor.size());
		this.getLabelUsuario().setText(usuario.getUsuario());
		this.getImage().setSrc(usuario.getFoto());
		
	}

}