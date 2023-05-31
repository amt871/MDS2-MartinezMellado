package basededatos;

import java.time.Period;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.time.ZoneId;
import java.io.File;
import java.io.InputStream;
import java.time.LocalDate;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import orm.MartinezMelladoMDSPersistentManager;
import orm.Usuario_Registrado;
import orm.Usuario_RegistradoDAO;

public class Usuarios_Registrados {
	public Sistema _sis_usr_reg;
	public Vector<Usuario_Registrado> _usuario_Registrado = new Vector<Usuario_Registrado>();

	public boolean comprobarCredenciales(String aUser, String aPass) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado iniciarSesion(String aUser, String aPass) throws PersistentException {
		Usuario_Registrado u = null;
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			u = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario=aUser and contrasenna=aPass", null);
		} catch (Exception e) {
			t.rollback();
		}
		return u;

	}

	public void cambiarContrasenna(String aNuevaContrasenna, String aNombreUsuario) throws PersistentException {

		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado u = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario=aNombreUsuario", null);
			Usuario_RegistradoDAO.delete(u);
			u.setContrasenna(aNuevaContrasenna);
			Usuario_RegistradoDAO.save(u);
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void registrarse(String aNombre, String aApellidos, String aNomUsuario, String aContrasenna, String aCorreo,
			Date aFechaNaciemiento, String aDescripcion, String aFoto, String aTipo) throws PersistentException {

		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {

			Usuario_Registrado nuevo = new Usuario_Registrado();

			LocalDate fechaNacimientoLocalDate = aFechaNaciemiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			LocalDate fechaActual = LocalDate.now();

			Period periodo = Period.between(fechaNacimientoLocalDate, fechaActual);

			nuevo.setNombre(aNombre);
			nuevo.setApellido(aApellidos);
			nuevo.setUsuario(aNomUsuario);
			nuevo.setContrasenna(aContrasenna);
			nuevo.setCorreo(aCorreo);
			nuevo.setFechaNacimiento(aFechaNaciemiento);
			nuevo.setDescripcion(aDescripcion);
			nuevo.setFoto(aFoto);
			nuevo.setComercial(aTipo);
			nuevo.setEdad(periodo.getYears());
			nuevo.setPrivado(false);

			Usuario_RegistradoDAO.save(nuevo);

			t.commit();
			
			File file = new File("C:\\UsuariosProyectoMDS2\\"+aNombre);
			File videos = new File("C:\\UsuariosProyectoMDS2\\"+aNombre+"\\videos");
			file.mkdir();
			videos.mkdir();
			
		} catch (Exception e) {
			t.rollback();
		}
	}

	public List buscarUsuarios(String aBusqueda) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado datosUsuario(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void guardarDatos(String aFoto, String aUsuario, String aNombre, String aFechaDeNacimiento,
			String aCorreoElectronico, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public void guardarNuevaContrasenna(String aNuevaContrasenna, String aUsuario) {
		throw new UnsupportedOperationException();
	}

	public List listarUsuariosDenunciados() {
		throw new UnsupportedOperationException();
	}

	public void modificarEstadoUsuario(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}
}