package interfaz;

import java.util.List;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.Notificacion;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaMis_seguidores_item;

public class Mis_seguidores_item extends VistaMis_seguidores_item {
//	private Button _seguir_solicitar_seguir;
//	private Button _eliminar_seguidor;
//	private event _dejar_de_seguir;
//	private ImageButton _fotoPerfilIB;
//	private Label _nombreUsuarioL;
//	private Label _numeroSeguidoresL;
//	public Mis_seguidores _mis_seguidores;
//
//	public void seguir_solicitar_seguir() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void eliminar_seguidor() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void dejar_de_seguir() {
//		throw new UnsupportedOperationException();
//	}
	Usuario_Registrado usuario;
	Usuario_Registrado seguidor;
	private Mi_cabecera cabeceraUserReg;
	private MainView inicio;
	private boolean seguido;
	
	public Mis_seguidores_item(Usuario_Registrado seguido,Usuario_Registrado miUsuario,  BDPrincipal datos,  Mi_cabecera mi_cabecera, MainView inicio) {
		this.usuario = datos.cargarDatosUsuario(miUsuario.getUsuario());
		this.seguidor = datos.cargarDatosUsuario(seguido.getUsuario());
		
		this.cabeceraUserReg = mi_cabecera;
		this.inicio = inicio;
		
		this.getFotoUsr().addClickListener(event ->{
			verPerfilOtroUsuario();
		});
			
		this.getbSeguir().addClickListener(event ->{
			bSeguir(datos);
		});
		
		this.getbEliminar().addClickListener(event ->{
			bEliminar(datos);
		});
		
		this.getFotoUsr().setSrc(this.seguidor.getFoto());
		this.getnSeguidoresUsr().setText(this.seguidor.seguidor.size() + " seguidores");
		this.getnUsuario().setText(this.seguidor.getUsuario());
		this.seguido = false;
		for (Usuario_Registrado usr : this.usuario.seguido.toArray()) {
			if (usr.getUsuario().equals(this.seguidor.getUsuario())) {
				this.seguido = true;
			}
		}
		//System.out.println(flag);
		if(!this.seguido) {
			this.getbSeguir().setText("Seguir");
		}else {
			this.getbSeguir().setText("Dejar de seguir");
		}
	}
	
	private void verPerfilOtroUsuario() {

		if (this.seguidor.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			if (usuario.seguido.contains(this.seguidor)) {
				this.cabeceraUserReg
						.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, this.seguidor));
				this.inicio.removeAll();
				this.inicio.add(this.cabeceraUserReg.getPerfilPublico());
			} else {
				this.cabeceraUserReg.setPerfilPrivado(
						new Ver_perfil_privado__usuario_registrado_(this.cabeceraUserReg, this.seguidor));
				this.inicio.removeAll();
				this.inicio.add(this.cabeceraUserReg.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			}
		} else {

			this.cabeceraUserReg
					.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, seguidor));
			this.inicio.removeAll();
			this.inicio.add(this.cabeceraUserReg.getPerfilPublico());

		}
	}
	private void bSeguir(BDPrincipal datos) {
		if (!this.seguidor.getPrivado() || this.seguido) {
			if(datos.segimiento(this.seguidor, this.usuario))
				if(this.getbSeguir().getText().equals("Seguir")) {
					this.seguido = true;
					this.getbSeguir().setText("Dejar de seguir");
					datos.annadirNotificacion("seguir", this.seguidor, this.usuario, null);
				}else {
					this.seguido = false;
					this.getbSeguir().setText("Seguir");
				}
		}else {
			boolean flag = true;
			List<Notificacion> listaNotificaciones = this.cabeceraUserReg.getDatos().listarNitificaciones(this.seguidor.getUsuario());
			for (Notificacion notificacion : listaNotificaciones) {
				if(notificacion.getTipo().equals("seguir")) {
					if (notificacion.getUsuarioOrigen().equals(this.usuario.getUsuario())) {
						flag = false;
						Notification.show("El usuario ya tiene una solicitud de seguimiento tuya");
					}
				}
			}
			if (flag) {
				this.cabeceraUserReg.getDatos().annadirNotificacion("seguir", this.seguidor, this.seguidor , null);
			}
		}
		
	}
	
	private void bEliminar(BDPrincipal datos) {
		
		datos.segimiento(this.usuario, this.seguidor);
		Notification.show("El usuario " + this.seguidor + " ha dejado de sueguirle");
		this.setVisible(false);
		
	}
}