package basededatos;

import java.time.Period;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
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

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

public class Usuarios_Registrados {
	public Sistema _sis_usr_reg;
	public Vector<Usuario_Registrado> _usuario_Registrado = new Vector<Usuario_Registrado>();

	public boolean comprobarCredenciales(String aUser, String aPass) throws PersistentException {

		Usuario_Registrado u = null;
        Boolean aux = false;
        PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
        try {
            u = Usuario_RegistradoDAO
                    .loadUsuario_RegistradoByQuery("usuario='" + aUser + " ' and contrasenna='" + aPass + "'", null);
            if (u != null)  aux = true;
        } catch (Exception e) {
            t.rollback();
        }
        return aux;
		
	}

	public Usuario_Registrado iniciarSesion(String aUser, String aPass) throws PersistentException {
		Usuario_Registrado u = null;
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			u = Usuario_RegistradoDAO
					.loadUsuario_RegistradoByQuery("usuario='" + aUser + " ' and contrasenna='" + aPass + "'", null);
		} catch (Exception e) {
			t.rollback();
		}
		return u;

	}

	public void cambiarContrasenna(String aNuevaContrasenna, String aNombreUsuario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado u = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aNombreUsuario + "'",
					null);
			Usuario_RegistradoDAO.delete(u);
			u.setContrasenna(aNuevaContrasenna);
			Usuario_RegistradoDAO.save(u);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void registrarse(String aNombre, String aApellidos, String aNomUsuario, String aContrasenna, String aCorreo,
			Date aFechaNaciemiento, String aDescripcion, String aFoto, String aTipo) throws PersistentException {

		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {

//			Usuario_Registrado u = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aNomUsuario + "'",
//					null);
//
//			if (u != null) {
//				return;
//			}

			Usuario_Registrado nuevo = new Usuario_Registrado();

			LocalDate fechaNacimientoLocalDate = aFechaNaciemiento.toInstant().atZone(ZoneId.systemDefault())
					.toLocalDate();
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

			File file = new File("C:\\UsuariosProyectoMDS2\\" + aNomUsuario);
			File videos = new File("C:\\UsuariosProyectoMDS2\\" + aNomUsuario + "\\videos");
			file.mkdir();
			videos.mkdir();
			file = null;
			videos = null;

		} catch (Exception e) {
			t.rollback();
		}
	}

	public List buscarUsuarios(String aBusqueda) throws PersistentException {
		List<Usuario_Registrado> aux = new ArrayList<Usuario_Registrado>();
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			String queryStr = "Nombre like '%" + aBusqueda + "%'";
			Usuario_Registrado[] publicaciones = Usuario_RegistradoDAO.listUsuario_RegistradoByQuery(queryStr, null);
			if (publicaciones != null) {
				aux = Arrays.asList(publicaciones);
			}
		} catch (Exception e) {
			t.rollback();
		}
		return aux;
	}

	public Usuario_Registrado datosUsuario(String aNombreUsuario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		Usuario_Registrado u = null;
		try {
			u = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aNombreUsuario+"'", null);
		} catch (Exception e) {
			t.rollback();
		}
		return u;
	}

	public void guardarDatos(String aFoto, String aUsuario, String aNombre, Date aFechaDeNacimiento,
			String aCorreoElectronico, String aDescripcion) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {

			Usuario_Registrado nuevo = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aNombre +"'", null);

			LocalDate fechaNacimientoLocalDate = aFechaDeNacimiento.toInstant().atZone(ZoneId.systemDefault())
					.toLocalDate();
			LocalDate fechaActual = LocalDate.now();

			Period periodo = Period.between(fechaNacimientoLocalDate, fechaActual);
			
			Usuario_RegistradoDAO.delete(nuevo);
			
			nuevo.setUsuario(aUsuario);
			nuevo.setNombre(aNombre);
			nuevo.setFechaNacimiento(aFechaDeNacimiento);
			nuevo.setCorreo(aCorreoElectronico);
			nuevo.setDescripcion(aDescripcion);

			Usuario_RegistradoDAO.save(nuevo);
			
			t.commit();

		} catch (Exception e) {
			t.rollback();
		}
	}

	public void guardarNuevaContrasenna(String aNuevaContrasenna, String aUsuario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado u = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aUsuario + "'",
					null);
			Usuario_RegistradoDAO.delete(u);
			u.setContrasenna(aNuevaContrasenna);
			Usuario_RegistradoDAO.save(u);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public List listarUsuariosDenunciados() throws PersistentException {
		List<Usuario_Registrado> aux = new ArrayList<Usuario_Registrado>();
	    PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
	    try {
	    	Usuario_Registrado[] usuarios = Usuario_RegistradoDAO.listUsuario_RegistradoByQuery(null, null);
	        if (usuarios != null) {
	            aux = Arrays.asList(usuarios);
	            for (Usuario_Registrado usuario : aux) {
					if (usuario.denunciado.size() <= 0) {
						aux.remove(usuario);
					}
				}
	        }
	        
	    }catch (Exception e) {
	        t.rollback();
	    }
	    return aux;
	}

	public void modificarEstadoUsuario(String aNombreUsuario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {

			Usuario_Registrado nuevo = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aNombreUsuario +"'", null);

			
			Usuario_RegistradoDAO.delete(nuevo);
			
			if (nuevo.getPrivado() == true) {
				nuevo.setPrivado(false);
			} else {
				nuevo.setPrivado(true);
			}

			Usuario_RegistradoDAO.save(nuevo);
			
			t.commit();

		} catch (Exception e) {
			t.rollback();
		}
	}
	
	public List listarSeguidos(String aNombreUsuario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		Usuario_Registrado u = null;
		List<Usuario_RegistradoSetCollection> aux =  null;
		try {
			u = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aNombreUsuario+"'", null);
			if (u != null) {
				aux =  Arrays.asList(u.seguido);
			}
			
		} catch (Exception e) {
			t.rollback();
		}
		return aux;
	}
	
	public List listarSeguidores(String aNombreUsuario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		Usuario_Registrado u = null;
		List<Usuario_RegistradoSetCollection> aux =  null;
		try {
			u = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aNombreUsuario+"'", null);
			if (u != null) {
				aux =  Arrays.asList(u.seguidor);
			}
			
		} catch (Exception e) {
			t.rollback();
		}
		return aux;
	}
}