package interfaz;

import java.util.List;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.notification.Notification;

import basededatos.Notificacion;
import basededatos.Usuario_Registrado;
import vistas.VistaVer_perfil_privado__usuario_registrado_;

public class Ver_perfil_privado__usuario_registrado_ extends VistaVer_perfil_privado__usuario_registrado_ {
	
	
//	private Label _usuarioPrivadoL;
	
	public Ver_perfil_privado__usuario_registrado_(Mi_cabecera cabecera, Usuario_Registrado usuario) {
		
		this.getDivCabecera().add(cabecera);
		this.getLabelSeguidores().setText("Seguidores: "+String.valueOf(usuario.seguidor.size()));
		this.getLabelMegustas().setText("Me gustas: "+String.valueOf(usuario.le_gusta.size()));
		this.getImage().setSrc(usuario.getFoto());
		this.getLabelUsuario().setText(usuario.getUsuario());
		this.getbSolictarSeguimiento().addClickListener(event -> {
			boolean flag = true;
			Usuario_Registrado mi_usuario = cabecera.getDatos().cargarDatosUsuario(cabecera.getUser().getUsuario());
			Usuario_Registrado propiertarioPerfil = cabecera.getDatos().cargarDatosUsuario(usuario.getUsuario());
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
        });
	}
	
}