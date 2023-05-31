/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Juanra(University of Almeria)
 * License Type: Academic
 */
package orm;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Denuncia_ArchivadaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression atendidaId;
	public final AssociationExpression atendida;
	public final IntegerExpression idElemento;
	public final StringExpression tipo;
	
	public Denuncia_ArchivadaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		atendidaId = new IntegerExpression("atendida.", this);
		atendida = new AssociationExpression("atendida", this);
		idElemento = new IntegerExpression("idElemento", this);
		tipo = new StringExpression("tipo", this);
	}
	
	public Denuncia_ArchivadaCriteria(PersistentSession session) {
		this(session.createCriteria(Denuncia_Archivada.class));
	}
	
	public Denuncia_ArchivadaCriteria() throws PersistentException {
		this(MartinezMelladoMDSPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createAtendidaCriteria() {
		return new AdministradorCriteria(createCriteria("atendida"));
	}
	
	public Denuncia_Archivada uniqueDenuncia_Archivada() {
		return (Denuncia_Archivada) super.uniqueResult();
	}
	
	public Denuncia_Archivada[] listDenuncia_Archivada() {
		java.util.List list = super.list();
		return (Denuncia_Archivada[]) list.toArray(new Denuncia_Archivada[list.size()]);
	}
}

