package interfaz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.server.VaadinService;

import basededatos.BDPrincipal;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaConfirmar_correo;

public class Confirmar_correo extends VistaConfirmar_correo {
//	private event _volver_a_enviar;
//	private Label _introduceElCodigoL;
//	private TextField _introduceElCodigoTF;
//	private Label _noHaLlegadoL;
//	private Button _volverAEnviarB;
//	private Label _nombreApp;
//	public Registro _registro;
//	public Gestor_de_correo_electronico _gestor_de_correo_electronico;

	/*
	 * public void confirmar_correo__externo_() { throw new
	 * UnsupportedOperationException(); }
	 * 
	 * public void volver_a_enviar() { throw new UnsupportedOperationException(); }
	 */

	// Object[] cosas;
	private Usuario_Registrado usuarioARegistrar;
	private InputStream fileData;
	private BDPrincipal datos;
	private MainView vl;

	public Confirmar_correo(MainView vl, Usuario_Registrado user, InputStream image, BDPrincipal datos) {

		this.vl = vl;
		this.usuarioARegistrar = user;
		this.fileData = image;
		this.datos = datos;

	}

	private void confirmarCodigo() {

		if (this.getbTextField().getValue().equals("1111")) {
			
			this.getbTextField().clear();
			// Notification.show("Correo confirmado correctamente");


			if (!datos.registrarse(usuarioARegistrar.getNombre(), usuarioARegistrar.getApellido(),
					usuarioARegistrar.getUsuario(), usuarioARegistrar.getContrasenna(), usuarioARegistrar.getCorreo(),
					usuarioARegistrar.getFechaNacimiento(), usuarioARegistrar.getDescripcion(),
					this.fileData == null ? "icons/user.svg" : "Usuarios/" + usuarioARegistrar.getUsuario() + "/imagen.jpg",
					usuarioARegistrar.getComercial())) {

				Notification.show("No se ha podido registrar el usuario");
				
			} else

			if (this.fileData == null)
				try {

					File image = new File("src/main/webapp/Usuarios/" + usuarioARegistrar.getUsuario() + "/imagen.jpg");

					//System.out.println(image.getAbsolutePath());
					
					// if(!image.exists())
					image.createNewFile();
					image = null;

					OutputStream out = new FileOutputStream("src/main/webapp/Usuarios/" + usuarioARegistrar.getUsuario() + "/imagen.jpg");

					// fileData.transferTo(out);

					byte[] buf = new byte[1024];
					int length;
					while ((length = fileData.read(buf)) > 0) {
						out.write(buf, 0, length);
					}
					// byte[] dataBytes = fileData.readAllBytes();

					fileData.close();

					// out.wri
					out.flush();
					out.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Notification.show("Error interno (No se ha cargado la Imagen)");
				}

			Notification.show("Registro completado");
			this.vl.removeAll();
			this.vl.add(new Iniciar_sesion(this.vl));
			
			
		} else
			Notification.show("Codigo incorrecto");

	}
}