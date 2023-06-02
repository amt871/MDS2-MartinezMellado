package interfaz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
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
	basededatos.Usuario_Registrado usuarioARegistrar;
	InputStream fileData;
	BDPrincipal datos;

	public Confirmar_correo(/* Object[] cosas */) {

		// this.cosas = cosas;
		this.datos = new BDPrincipal();

	}

	public boolean confirmarCodigo(Object[] cosas) {

		if (this.getbTextField().getValue().equals("1111")) {
			// Notification.show("Correo confirmado correctamente");

			usuarioARegistrar = (basededatos.Usuario_Registrado) cosas[1];

			if (!datos.registrarse(usuarioARegistrar.getNombre(), usuarioARegistrar.getApellido(),
					usuarioARegistrar.getUsuario(), usuarioARegistrar.getContrasenna(), usuarioARegistrar.getCorreo(),
					usuarioARegistrar.getFechaNacimiento(), usuarioARegistrar.getDescripcion(),
					cosas[2] == null ? "icons/user.svg" : "Usuarios/" + usuarioARegistrar.getUsuario() + "/imagen.jpg",
					usuarioARegistrar.getComercial()))

				return false;
			else

			if (cosas[2] != null)
				try {

					fileData = (InputStream) cosas[2];
					File image = new File((String) cosas[3]);

					// if(!image.exists())
					image.createNewFile();

					OutputStream out = new FileOutputStream((String) cosas[3]);

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
					image = null;

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Notification.show("Error interno (No se ha cargado la Imagen)");
				}

			Notification.show("Registro completado");
			return true;
		} else
			Notification.show("Codigo incorrecto");

		return false;

	}
}