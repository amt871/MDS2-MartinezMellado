package interfaz;

import basededatos.Publicacion;
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
		
		int megustas = 0;
		for(Publicacion publi : usuario.realiza.toArray())
			megustas += publi.le_gusta.size();
		
		this.getLabelMeGustas().setText(megustas + " me gustas");
		this.getLabelSeguidores().setText("Seguidores: "+usuario.seguidor.size());
		this.getLabelUsuario().setText(usuario.getUsuario()+" -> Privado");
		this.getImage().setSrc(usuario.getFoto());
		
	}

}