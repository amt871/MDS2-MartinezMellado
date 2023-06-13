package interfaz;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import vistas.VistaCambiar_contrasenna;

public class Cambiar_contrasenna extends VistaCambiar_contrasenna{
//	private Button _guardar_contrasenna_nueva;
//	public Configurar _configurar;
//
//	public void guardar_contrasenna_nueva() {
//		throw new UnsupportedOperationException();
//	}
	
	private Usuario_Registrado usuario;
	private BDPrincipal datos;
	
	public Cambiar_contrasenna(Usuario_Registrado user, Mi_cabecera cabecera) {
		// TODO Auto-generated constructor stub
//	}
//
//	public void setUsuario(basededatos.Usuario_Registrado user) {//Inicializar
//		
		this.usuario=user;
		this.datos = cabecera.getDatos();
		this.setCabecera(cabecera);
		
		this.getbGuardar().addClickListener(event -> {
			
			if(cambiarContrasenna())
				if(this.getCabeceraCom()!=null)
					this.getCabeceraCom().getbPerfil().click();
				else
					this.getCabecera().getPerfil().getbConfigurar().click();
			
		});
		
		this.getbCancelar().addClickListener(event -> {
			
			if(this.getCabeceraCom()!=null)
				this.getCabeceraCom().getbPerfil().click();
			else
				this.getCabecera().getPerfil().getbConfigurar().click();
			
		});
		
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