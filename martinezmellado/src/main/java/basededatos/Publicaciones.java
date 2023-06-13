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
			t.commit();
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
			t.commit();
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
			t.commit();
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
			t.commit();
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
			t.commit();
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

			if (publicacion.es_denunciada.contains(usuario))
				publicacion.es_denunciada.remove(usuario);
			if (usuario.denuncia.contains(publicacion))
				usuario.denuncia.remove(publicacion);

			PublicacionDAO.refresh(publicacion);
			Usuario_RegistradoDAO.refresh(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
	}

	public void denunciarPublicación(Usuario_Registrado usuario, Publicacion publicacion) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {

			publicacion.es_denunciada.add(usuario);
			usuario.denuncia.add(publicacion);
			;

			PublicacionDAO.refresh(publicacion);
			Usuario_RegistradoDAO.refresh(usuario);

			t.commit();

		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
	}

	public void annadirMeGusta(Publicacion publicacion, Usuario_Registrado usuario) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {

			publicacion.le_gusta.add(usuario);
			usuario.le_gusta.add(publicacion);
			;

			PublicacionDAO.refresh(publicacion);
			Usuario_RegistradoDAO.refresh(usuario);

			t.commit();

		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
	}

	public Publicacion cargarVideoPorRuta(String ruta) throws PersistentException {
		Publicacion u = null;
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			u = PublicacionDAO.loadPublicacionByQuery("Video = '" + ruta + "'", null);
			t.commit();
			return u;
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

			t.commit();
			
			Publicacion[] devolver = new Publicacion[listaDevolucion.size()];
			
			for(int i = 0; i<devolver.length; i++)
				devolver[i] = listaDevolucion.get(i);
			return devolver;
				
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		}
		
	}
	
	public Publicacion cargarVideoPoID(int id) throws PersistentException {
		Publicacion u = null;
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			u = PublicacionDAO.loadPublicacionByQuery("ID = '" + id + "'", null);
			t.commit();
			return u;
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return u;
	}
}
