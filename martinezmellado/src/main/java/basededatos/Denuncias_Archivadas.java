package basededatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Denuncias_Archivadas {
	public Sistema _sis_den;
	public Vector<Denuncia_Archivada> _denuncia_Archivada = new Vector<Denuncia_Archivada>();

	public List listarDenunciasArchivadas() throws PersistentException {
		Denuncia_Archivada[] u = null;
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			u = Denuncia_ArchivadaDAO.listDenuncia_ArchivadaByQuery(null, null);
		} catch (Exception e) {
			t.rollback();
		}
		List<Denuncia_Archivada> aux = new ArrayList<Denuncia_Archivada>();
		if (u != null) {
			aux = Arrays.asList(u);
		}

		return aux;
	}

	public void ArchivarDenuncia(String aElemento, String aTipo) throws PersistentException {
		PersistentTransaction t = MartinezMelladoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Denuncia_Archivada aux = new Denuncia_Archivada();
			aux.setIdElemento(Integer.valueOf(aElemento));
			aux.setTipo(aTipo);
			aux.setAtendida(null);
			Denuncia_ArchivadaDAO.save(aux);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}	
}