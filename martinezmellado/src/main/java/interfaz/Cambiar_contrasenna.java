package interfaz;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import vistas.VistaCambiar_contrasenna;

public class Cambiar_contrasenna extends VistaCambiar_contrasenna{
//	private Button _guardar_contrasenna_nueva;
//	public Configurar _configurar;
//
//	public void guardar_contrasenna_nueva() {
//		throw new UnsupportedOperationException();
//	}
	
	private basededatos.Usuario_Registrado usuario;
	private basededatos.BDPrincipal datos;
	
	public void setUsuario(basededatos.Usuario_Registrado user) {//Inicializar
		
		this.usuario=user;
		this.datos = new basededatos.BDPrincipal();
		
	}
	
	public boolean cambiarContrasenna() {
		
		if(this.getInPass().isEmpty() || this.getInPassRepeat().isEmpty()) {
		
			Notification.show("Rellena los campos");
			return false;
		
		}
		
		if(this.getInPass().getValue().equals(this.getInPassRepeat().getValue())) {
			return datos.cambiarContrasenna(this.getInPass().getValue(), this.usuario.getUsuario());
		} else {
			Notification.show("Las contrasennas no coinciden");
			return false;
		}

	}
	
}