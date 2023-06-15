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
import org.orm.PersistentSession;
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
            e.printStackTrace();
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
			e.printStackTrace();
		}
		return u;

	}

	public boolean cambiarContrasenna(String aNuevaContrasenna, String aNombreUsuario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		boolean flag = false;
		try {
			Usuario_Registrado u = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aNombreUsuario + "'",
					null);
			//Usuario_RegistradoDAO.delete(u);
			u.setContrasenna(aNuevaContrasenna);
			Usuario_RegistradoDAO.save(u);
			t.commit();
			flag = true;
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
		return flag;
		
	}
	
	

	public boolean registrarse(String aNombre, String aApellidos, String aNomUsuario, String aContrasenna, String aCorreo,
			Date aFechaNaciemiento, String aDescripcion, String aFoto, String aTipo) throws PersistentException {

		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		boolean flag = false;
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
			
			File file = new File("src/main/webapp//Usuarios/" + aNomUsuario);
			File videos = new File("src/main/webapp/Usuarios/" + aNomUsuario + "/videos");
			
			//System.out.println("Ruta del usuario: "+file.getAbsolutePath());
			
			/*System.out.println("Se crea el directorio del usuario: "+*/file.mkdir()/*)*/;
			/*System.out.println("Se crea el directorio de videos: "+*/videos.mkdir()/*)*/;

			file = null;
			videos = null;
			flag = true;
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
		return flag;
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
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
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
			e.printStackTrace();
		}
		return u;
	}

	public boolean guardarDatos(String aFoto, String aUsuario, String aNombre, Date aFechaDeNacimiento,
			String aCorreoElectronico, String aDescripcion) throws PersistentException {
		//System.out.println("Estoy en Usuario_Registrados");
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		Boolean flag = false;
		try {
			
			//System.out.println("Solicito el usuario: "+aUsuario);

			Usuario_Registrado nuevo = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aUsuario +"'", null);

			LocalDate fechaNacimientoLocalDate = aFechaDeNacimiento.toInstant().atZone(ZoneId.systemDefault())
					.toLocalDate();
			LocalDate fechaActual = LocalDate.now();

			Period periodo = Period.between(fechaNacimientoLocalDate, fechaActual);
			
			//Usuario_RegistradoDAO.delete(nuevo);
			
			//System.out.println("La base de datos me devuelve el usuario: "+ nuevo.getUsuario());
			
			nuevo.setUsuario(aUsuario);
			nuevo.setNombre(aNombre);
			nuevo.setFechaNacimiento(aFechaDeNacimiento);
			nuevo.setCorreo(aCorreoElectronico);
			nuevo.setDescripcion(aDescripcion);
			nuevo.setEdad(periodo.getYears());
			nuevo.setFoto(aFoto);

			//System.out.println(Usuario_RegistradoDAO.save(nuevo));
			Usuario_RegistradoDAO.save(nuevo);
			
			Usuario_RegistradoDAO.refresh(nuevo);
			t.commit();
			//System.out.println("Usuarios_Registrados bien");
			//MartinezMelladoMDSPersistentManager.instance().getSession().flush();
			
			flag = true;

		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
			//System.out.println("Usuarios_Registrados excepcion");
		}
		
		MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
		MartinezMelladoMDSPersistentManager.instance().getSession().clear();
		return flag;
		
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
			e.printStackTrace();
		}
		MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
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
	        e.printStackTrace();
	    }
	    return aux;
	}

	public boolean modificarEstadoUsuario(String aNombreUsuario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		boolean flag = false;
		try {

			Usuario_Registrado nuevo = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aNombreUsuario +"'", null);
			
			if (nuevo.getPrivado() == true) {
				nuevo.setPrivado(false);
			} else {
				nuevo.setPrivado(true);
			}

			Usuario_RegistradoDAO.save(nuevo);
			
			t.commit();

			//MartinezMelladoMDSPersistentManager.instance().getSession().flush();
			
			flag = true;
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();

		}
		MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
		return flag;
	}
	
	public List listarSeguidos(String aNombreUsuario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		Usuario_Registrado u = null;
		List<Usuario_Registrado> aux =  new ArrayList<Usuario_Registrado>();
		try {
			u = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aNombreUsuario+"'", null);
			if (u != null) {
				for (Usuario_Registrado usuario_Registrado : u.seguido.toArray()) {
					aux.add(usuario_Registrado);
				}
			}
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return aux;
	}
	
	public List<Usuario_Registrado> listarSeguidores(String aNombreUsuario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		Usuario_Registrado u = null;
		List<Usuario_Registrado> aux =  new ArrayList<Usuario_Registrado>();
		try {
			u = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("usuario='" + aNombreUsuario+"'", null);
			if (u != null) {
				for (Usuario_Registrado usuario_Registrado : u.seguidor.toArray()) {
					aux.add(usuario_Registrado);
				}
			}
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return aux;
	}
	
	public void retirarDenunciaUsuario(Usuario_Registrado denunciante, Usuario_Registrado denunciado)
			throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado auxDenunciante = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(denunciante.getORMID());
			Usuario_Registrado auxDenunciado = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(denunciado.getORMID());
			
			if (auxDenunciado.denunciante.contains(auxDenunciante))
				auxDenunciado.denunciante.remove(auxDenunciante);
			if (auxDenunciante.denunciado.contains(auxDenunciado))
				auxDenunciante.denunciado.remove(auxDenunciado);

			Usuario_RegistradoDAO.save(auxDenunciante);
			Usuario_RegistradoDAO.save(auxDenunciado);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
	}
	
	public boolean segimiento(Usuario_Registrado seguido , Usuario_Registrado seguidor) throws PersistentException {
			PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
			boolean flag = false;
			try {
				
				//System.out.println()
				
				seguido = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(seguido.getID());
				seguidor = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(seguidor.getID());
				
				//System.out.println(seguido.seguidor.contains(seguidor));
				//System.out.println(seguidor.seguido.contains(seguido));
				
				if(!seguido.seguidor.contains(seguidor)){
					seguido.seguidor.add(seguidor);
					seguidor.seguido.add(seguido);
					//System.out.println("Añado seguidor");
				}
				else {
					seguido.seguidor.remove(seguidor);
					seguidor.seguido.remove(seguido);
					//System.out.println("Elimino seguidor");
				}
				
				//System.out.println(seguido.seguidor.contains(seguidor));
				//System.out.println(seguidor.seguido.contains(seguido));
				
				Usuario_RegistradoDAO.save(seguidor);
				//Usuario_RegistradoDAO.refresh(seguidor);
				
				Usuario_RegistradoDAO.save(seguido);
				//Usuario_RegistradoDAO.refresh(seguido);

				t.commit();
				flag = true;

			} catch (Exception e) {
				t.rollback();
				e.printStackTrace();
			}
			MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
			return flag;
	}
	
	public void denunciarUsuario(Usuario_Registrado denunciante, Usuario_Registrado denunciado) throws PersistentException {
		 PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		    try { 
		    	Usuario_Registrado auxDenunciante = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(denunciante.getORMID());
				Usuario_Registrado auxDenunciado = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(denunciado.getORMID());
		    	
				auxDenunciante.denunciado.add(auxDenunciado);
				//auxDenunciado.denunciante.add(auxDenunciante);
		    	
		    	Usuario_RegistradoDAO.save(auxDenunciado);
		    	Usuario_RegistradoDAO.save(auxDenunciante);	    	
		    	
		    	t.commit();
		    	
		    }catch (Exception e) {
		        t.rollback();
		        e.printStackTrace();
		    }
		    MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
	}
	
	public Usuario_Registrado[] listarUltimosUsuarios(int id) throws PersistentException {
		
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		Usuario_Registrado[] usuarios = null;;
		try { 
			usuarios = Usuario_RegistradoDAO.listUsuario_RegistradoByQuery("UsuarioID<>"+id, "UsuarioID DESC");
	    	
	    	
	    	
	    }catch (Exception e) {
	        t.rollback();
	        e.printStackTrace();
			return null;
	    }
		return usuarios;
	}
}