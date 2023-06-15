package interfaz;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaSiguiendo_item;

public class Siguiendo_item extends VistaSiguiendo_item {
//	private Button _dejar_de_seguir;
//	private ImageButton _imagenUsuarioIB;
//	private Label _nombreUsuarioL;
//	private Label _nSeguidoresL;
//	public Siguiendo _siguiendo;
	Usuario_Registrado usuario;
	Usuario_Registrado seguido;
	private Mi_cabecera cabeceraUserReg;
	private MainView inicio;

	public Siguiendo_item(Usuario_Registrado seguido,Usuario_Registrado miUsuario,  BDPrincipal datos,  Mi_cabecera mi_cabecera, MainView inicio) {
		this.cabeceraUserReg = mi_cabecera;
		this.inicio = inicio;
		this.usuario = datos.cargarDatosUsuario(miUsuario.getUsuario());
		this.seguido = datos.cargarDatosUsuario(seguido.getUsuario());
		
		this.getFotoUsr().addClickListener(event ->{
			verPerfilOtroUsuario();
		});
		
		this.getbDejarDeSeguir().addClickListener(event ->{
			datos.segimiento(this.seguido, usuario);
			this.setVisible(false);
		});
		
		
		this.getFotoUsr().setSrc(this.seguido.getFoto());
		this.getnSeguidores().setText(this.seguido.seguidor.size() + " seguidores");
		this.getnUsuario().setText(this.seguido.getUsuario());
		this.getbDejarDeSeguir().setText("Dejar de seguir");
	}
	

	private void verPerfilOtroUsuario() {

		if (this.seguido.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			if (usuario.seguido.contains(this.seguido)) {
				this.cabeceraUserReg
						.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, this.seguido));
				this.inicio.removeAll();
				this.inicio.add(this.cabeceraUserReg.getPerfilPublico());
			} else {
				this.cabeceraUserReg.setPerfilPrivado(
						new Ver_perfil_privado__usuario_registrado_(this.cabeceraUserReg, this.seguido));
				this.inicio.removeAll();
				this.inicio.add(this.cabeceraUserReg.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			}
		} else {

			this.cabeceraUserReg
					.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, seguido));
			this.inicio.removeAll();
			this.inicio.add(this.cabeceraUserReg.getPerfilPublico());

		}
	}
}