package basededatos;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.PersistentTransaction;

public class Publicaciones {
	public Sistema _sis_publi;
	public Vector<Publicacion> _publicacion = new Vector<Publicacion>();

	public List<Publicacion> cargarVideos() throws PersistentException {
		Publicacion[] u = null;
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			u = PublicacionDAO.listPublicacionByQuery(null, null);
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		List<Publicacion> aux = new ArrayList<Publicacion>();
		if (u != null) {
			for (Publicacion publicacion : u) {
				aux.add(publicacion);
			}
		}
		return aux;
	}

	public List<Publicacion> listarVideosBusqueda(String cadena) throws PersistentException {
		List<Publicacion> aux = new ArrayList<Publicacion>();
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			String queryStr = "Descripcion like '%" + cadena + "%'";
			Publicacion[] publicaciones = PublicacionDAO.listPublicacionByQuery(queryStr, null);
			if (publicaciones != null) {
				aux = Arrays.asList(publicaciones);
			}
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}

		return aux;
	}

	public List videosHashTag(String aHashtag) throws PersistentException {
		List<Publicacion> aux = new ArrayList<Publicacion>();
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			String queryStr = "Hashtag like '%" + aHashtag + "%'";
			Publicacion[] publicaciones = PublicacionDAO.listPublicacionByQuery(queryStr, null);
			if (publicaciones != null) {
				aux = Arrays.asList(publicaciones);
			}
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}

		return aux;
	}

	public void nuevaPublicacion(String aDescripcion, String aUbicacion, String aVideo, String aFecha, String aTipo,
			String aPropietario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usr = Usuario_RegistradoDAO
					.loadUsuario_RegistradoByQuery("usuario = '" + aPropietario + "'", null);
			Publicacion aux = new Publicacion();
			aux.setDescripcion(aDescripcion);
			aux.setUbicacion(aUbicacion);
			aux.setVideo(aVideo);
			aux.setFecha(Date.valueOf(LocalDate.now()));
			aux.setPublicidad(aTipo);
			aux.setRealizada(usr);
			aux.setORM_Realizada(usr);
			PublicacionDAO.save(aux);
			usr.realiza.add(aux);
			Usuario_RegistradoDAO.save(usr);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		 MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
	}

	public List listarPublicacionesDenunciadas() throws PersistentException {
		List<Publicacion> aux = new ArrayList<Publicacion>();
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Publicacion[] publicaciones = PublicacionDAO.listPublicacionByQuery(null, null);
			if (publicaciones != null) {
				aux = Arrays.asList(publicaciones);
				for (Publicacion publicacion : aux) {
					if (publicacion.es_denunciada.size() <= 0) {
						aux.remove(publicacion);
					}
				}
			}
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return aux;
	}

	public Publicacion cargarVideo(String aVideo) throws PersistentException {
		Publicacion u = null;
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			u = PublicacionDAO.loadPublicacionByQuery("ID = '" + aVideo + "'", aVideo);
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return u;
	}

	public Publicacion[] listarVideosUsuario(int id) throws PersistentException {

		return PublicacionDAO.listPublicacionByQuery("Usuario_RegistradoUsuarioID='" + id + "'", null);

	}

	/*
	 * public static Publicacion[] listPublicacionByQuery(String condition, String
	 * orderBy) throws PersistentException { try { PersistentSession session =
	 * MartinezMelladoMDSPersistentManager.instance().getSession(); return
	 * listPublicacionByQuery(session, condition, orderBy); } catch (Exception e) {
	 * e.printStackTrace(); throw new PersistentException(e); } }
	 */

	public void retirarDenunciaPublicacion(Publicacion publicacion, Usuario_Registrado usuario)
			throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Publicacion auxPublicacion = PublicacionDAO.loadPublicacionByORMID(publicacion.getORMID());
			Usuario_Registrado auxUsuario_Registrado = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(usuario.getORMID()); 

			if (auxPublicacion.es_denunciada.contains(auxUsuario_Registrado))
				auxPublicacion.es_denunciada.remove(auxUsuario_Registrado);
			if (auxUsuario_Registrado.denuncia.contains(auxPublicacion))
				auxUsuario_Registrado.denuncia.remove(auxPublicacion);

			PublicacionDAO.refresh(auxPublicacion);
			Usuario_RegistradoDAO.refresh(auxUsuario_Registrado);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		 MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
	}

	public void denunciarPublicación(Usuario_Registrado usuario, Publicacion publicacion) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Publicacion auxPublicacion = PublicacionDAO.loadPublicacionByORMID(publicacion.getORMID());
			Usuario_Registrado auxUsuario_Registrado = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(usuario.getORMID()); 

			auxPublicacion.es_denunciada.add(auxUsuario_Registrado);
			//auxUsuario_Registrado.denuncia.add(auxPublicacion);
			;

			PublicacionDAO.refresh(auxPublicacion);
			Usuario_RegistradoDAO.refresh(auxUsuario_Registrado);

			t.commit();

		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
	}

	public void annadirMeGusta(int publicacion, int usuario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Publicacion auxP = PublicacionDAO.loadPublicacionByQuery("ID = '" + publicacion + "'" , null);
			Usuario_Registrado auxU = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("ID = '" + usuario + "'", null);
			
			auxP.le_gusta.add(auxU);
			auxU.le_gusta.add(auxP);

			PublicacionDAO.save(auxP);
			Usuario_RegistradoDAO.save(auxU);

			t.commit();

		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		MartinezMelladoMDSPersistentManager.instance().disposePersistentManager();
		
	}

	public Publicacion cargarVideoPorRuta(String ruta) throws PersistentException {
		Publicacion u = null;
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			u = PublicacionDAO.loadPublicacionByQuery("Video = '" + ruta + "'", null);
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return u;
	}

	public Publicacion[] listarUltimasPublicacions(int id) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		Publicacion[] publicaciones;
		Usuario_Registrado[] banList;
		Usuario_Registrado Usuario;
		List<Publicacion> listaDevolucion = new ArrayList<>();
		Publicacion[] devolver = null;
		try {
			publicaciones = PublicacionDAO.listPublicacionByQuery(null, null);
			Usuario = Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery("UsuarioID=" + id, null);
			banList = Usuario.seguidor.toArray();

			for (Publicacion publicacion : publicaciones) {
				boolean banPublicacion = false;

				if (publicacion.getRealizada().equals(Usuario)) {
					banPublicacion = true;
				} else {
					for (Usuario_Registrado seguido : banList) {
						if (publicacion.getRealizada().equals(seguido)) {
							banPublicacion = true;
							break;
						}
					}
				}

				if (!banPublicacion) {
					listaDevolucion.add(publicacion);
				}
			}
			
			devolver = new Publicacion[listaDevolucion.size()];
			
			for(int i = 0; i<devolver.length; i++)
				devolver[i] = listaDevolucion.get(i);
				
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}

		return devolver;
	}
	
	public Publicacion cargarVideoPoID(int id) throws PersistentException {
		Publicacion u = null;
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			u = PublicacionDAO.loadPublicacionByQuery("ID = '" + id + "'", null);
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return u;
	}
}
