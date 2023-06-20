package interfaz;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import proyectoMDS.MainView;
import vistas.VistaRecuperar_contrasenna;

public class Recuperar_Contrasenna extends VistaRecuperar_contrasenna {
//	private Label _introduceCorreoL;
//	private TextField _introduceCorreoTF;
//	private Button _enviarB;
//	private Label _nombreAppL;
//	public Iniciar_sesion _iniciar_sesion;
//	public Confirmar_codigo _confirmar_codigo;
//
//	public void confirmar_codigo() {09b v c//		throw new UnsupportedOperationException();

	private BDPrincipal datos;
	private MainView vl;

	public Recuperar_Contrasenna(BDPrincipal datos, MainView vl) {
		this.datos = datos;
		this.vl = vl;

		this.getbEnviar().addClickListener(event -> {
			if (!this.getIdCorreo().isEmpty()) {
				if (this.datos.cargarUsuarioCorreo(this.getIdCorreo().getValue()) != null) {
					this.vl.removeAll();
					this.vl.add(new Confirmar_codigo(datos, vl, this.getIdCorreo().getValue()));
				} else {
					Notification.show("El correo electronico introducido no pertenece a ningun usuario");
				}
			} else {
				Notification.show("Introduzca su correo electronico en el campo de texto");
			}
		});
		
		this.getInicio().addClickListener(event ->{
			
			this.vl.removeAll();
			this.vl.add(new Pantalla_inicio(this.vl, this.datos));
			
		});
	}

}