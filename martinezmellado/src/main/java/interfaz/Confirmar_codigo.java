package interfaz;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import proyectoMDS.MainView;
import vistas.VistaConfirmar_codigo;

public class Confirmar_codigo extends VistaConfirmar_codigo {
//	private JLabel _introduceCorreoL;
//	private JTextField _introduceCorreoTF;
//	private JButton _confirmar;
//	private Label _nombreAppL;
//	public Recuperar_Contrasenna _recuperar_Contrasenna;
//	public Gestor_de_correo_electronico _gestor_de_correo_electronico;
//	public Establecer_nueva_contrasenna _establecer_nueva_contrasenna;
//
//	public void confirmar_codigo_recuperacion_contrasenna() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void establecer_nueva_contrasenna() {
//		throw new UnsupportedOperationException();
//	}
	
	private BDPrincipal datos;
	private MainView vl;
	
	public Confirmar_codigo(BDPrincipal datos, MainView vl, String correo){
		this.datos = datos;
		this.vl = vl;
		this.getbEnviar().addClickListener(event -> {
			if (!this.getIdCodigo().isEmpty()) {
				if (this.getIdCodigo().getValue().equals("1111")) {
					this.vl.removeAll();
					this.vl.add(new Establecer_nueva_contrasenna(vl, datos, correo));
				}else {
					Notification.show("El codigo introducino no es el correcto");
				}
			}else {
				Notification.show("Introduzca el codigo que se la ha enviado a su correo electronico");
			}
		});
	}
		
	
}