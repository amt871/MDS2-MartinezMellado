package interfaz;

import java.sql.Date;

import org.orm.PersistentException;

import basededatos.*;

import com.vaadin.flow.component.notification.Notification;

import orm.Usuario_Registrado;
import orm.Usuario_RegistradoDAO;
import vistas.VistaRegistro;

public class Registro extends VistaRegistro {
//	private TextField_ _nombreTF;
//	private Label_ _nombreB;
//	private TextField_ _apellidosTF;
//	private Label_ _apellidosL;
//	private TextField_ _usuarioTF;
//	private Label _usuarioL;
//	private TextField _contrasenaTF;
//	private Label _contrasenaL;
//	private TextFiled _correoTF;
//	private TextField _fechaDeNacimientoTF;
//	private Label _fechaDeNacimientoL;
//	private TextField _descripcionTF;
//	private Label _descripcionL;
//	private Button _selecccionarB;
//	private Label _fotoL;
//	private CheckBox _usuarioComercial;
//	private Button _registrarseB;
//	private Label _esloganL;
//	private Label _nombreAppL;
//	private ImageIcon _logoII;
//	public Pantalla_inicio _pantalla_inicio;
//	public Cabecera_usuario_no_registrado _cabecera_usuario_no_registrado;
//	public Confirmar_correo _confirmar_correo;
//
//	public void confirmar_correo() {
//		throw new UnsupportedOperationException();
//	}
	
	BDPrincipal datos = new BDPrincipal();

	public Registro() {

		this.getbRegistrar().addClickListener(event -> {

			if (this.getIdNombre().isEmpty()) {

				Notification.show("Introduce el Nombre");
				return;
			}

			if (this.getIdApellidos().isEmpty()) {

				Notification.show("Introduce el Apellido");
				return;
			}

			if (this.getIdUsuario().isEmpty()) {

				Notification.show("Introduce el Nombre de Usuario");
				return;
			}

			if (this.getIdContrasenna().isEmpty()) {

				Notification.show("Introduce la Contrasenna");
				return;
			}

			if (this.getIdCorreo().isEmpty()) {

				Notification.show("Introduce el Correo");
				return;
			}

			if (this.getIdFechaNacimiento().isEmpty()) {

				Notification.show("Introduce la Fecha de Nacimiento");
				return;
			}

	
			if(datos.registrarse(this.getIdNombre().getValue(), this.getIdApellidos().getValue(), this.getIdUsuario().getValue(), this.getIdContrasenna().getValue(),
					this.getIdCorreo().getValue(), this.getIdFechaNacimiento().getValue(), this.getIdDescripcion().getValue(),
					"C:/Usuarios/UsuariosProyectoMDS2/"+this.getIdNombre().getValue()+"/imagen.jpg", 
					this.getUsrComBool().getValue() ? "Comercial" : "Normal"))
				Notification.show("Registro completo");
			else
				Notificacion.show("Registo no completado");
					
		});

	}

}//LAS IMAGENES SON LAS QUE HAY EN META-INF