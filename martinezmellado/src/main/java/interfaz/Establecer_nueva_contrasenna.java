package interfaz;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaEstablecer_nueva_contrasenna;

public class Establecer_nueva_contrasenna extends VistaEstablecer_nueva_contrasenna {
//	private event _confirmar;
//	private Label _nuevaContrasennaL;
//	private TextField _nuevaContrasennaTF;
//	private Label _confirmarContrasenaL;
//	private Label _confirmarContrasenaTF;
//	private Button _aceptarB;
//	private Label _nombreApp;
	public Confirmar_codigo _confirmar_codigo;
	private BDPrincipal datos;
	private MainView vl;
	private String correo;
	
	public Establecer_nueva_contrasenna(MainView vl, BDPrincipal datos, String correo) {
		this.vl = vl;
		this.datos = datos;
		this.correo = correo;
		this.getIdBoton().addClickListener(event ->{
			confirmar();
		});
		
		this.getInicio().addClickListener(event ->{
			
			this.vl.removeAll();
			this.vl.add(new Pantalla_inicio(this.vl, this.datos));
			
		});
	}

	public void confirmar() {
		if (this.getIdPass1().isEmpty() || this.getIdPass2().isEmpty()) {
			Notification.show("Rellene los dos campos");
		}else if (this.getIdPass1().getValue().equals(this.getIdPass2().getValue())){
			
			Usuario_Registrado aux = this.datos.cargarUsuarioCorreo(this.correo);
			this.datos.cambiarContrasenna(this.getIdPass1().getValue(), aux.getUsuario());
			this.vl.removeAll();
			this.vl.add(new Pantalla_inicio(vl));
		} else {
			Notification.show("Las contraseñas no coinciden");
		}
	}
	
	
}