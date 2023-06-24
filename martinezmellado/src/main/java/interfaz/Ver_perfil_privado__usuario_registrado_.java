package interfaz;

import java.util.List;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.notification.Notification;

import basededatos.Notificacion;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaVer_perfil_privado__usuario_registrado_;

public class Ver_perfil_privado__usuario_registrado_ extends VistaVer_perfil_privado__usuario_registrado_ {
	
	private Usuario_Registrado usuario;
	
//	private Label _usuarioPrivadoL;
	
	public Ver_perfil_privado__usuario_registrado_(Mi_cabecera cabecera, Usuario_Registrado usuario) {
		
		this.usuario = cabecera.getDatos().cargarDatosUsuario(usuario.getUsuario());
		
		this.getDivCabecera().add(cabecera);
		this.getLabelSeguidores().setText("Seguidores: "+String.valueOf(this.usuario.seguidor.size()));
		int megustas = 0;
		for(Publicacion publi : usuario.realiza.toArray())
			megustas += publi.le_gusta.size();
		this.getLabelMegustas().setText(megustas+" me gustas");
		this.getImage().setSrc(this.usuario.getFoto());
		this.getLabelUsuario().setText(this.usuario.getUsuario());
		this.getbSolictarSeguimiento().addClickListener(event -> {
			bSolictarSeguimiento(cabecera);
        });
	}
	
	public void bSolictarSeguimiento(Mi_cabecera cabecera) {
		boolean flag = true;
		Usuario_Registrado mi_usuario = cabecera.getDatos().cargarDatosUsuario(cabecera.getUser().getUsuario());
		Usuario_Registrado propiertarioPerfil = cabecera.getDatos().cargarDatosUsuario(this.usuario.getUsuario());
		List<Notificacion> listaNotificaciones = cabecera.getDatos().listarNitificaciones(propiertarioPerfil.getUsuario());
		for (Notificacion notificacion : listaNotificaciones) {
			if(notificacion.getTipo().equals("seguir")) {
				if (notificacion.getUsuarioOrigen().equals(mi_usuario.getUsuario())) {
					flag = false;
					Notification.show("El usuario ya tiene una solicitud de seguimiento tuya");
				}
			}
		}
		if (flag) {
			cabecera.getDatos().annadirNotificacion("seguir", propiertarioPerfil, mi_usuario , null);
		}
	}
	
}