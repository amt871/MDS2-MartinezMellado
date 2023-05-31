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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Denuncia_ArchivadaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression atendidaId;
	public final AssociationExpression atendida;
	public final IntegerExpression idElemento;
	public final StringExpression tipo;
	
	public Denuncia_ArchivadaDetachedCriteria() {
		super(Denuncia_Archivada.class, Denuncia_ArchivadaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		atendidaId = new IntegerExpression("atendida.", this.getDetachedCriteria());
		atendida = new AssociationExpression("atendida", this.getDetachedCriteria());
		idElemento = new IntegerExpression("idElemento", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
	}
	
	public Denuncia_ArchivadaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Denuncia_ArchivadaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		atendidaId = new IntegerExpression("atendida.", this.getDetachedCriteria());
		atendida = new AssociationExpression("atendida", this.getDetachedCriteria());
		idElemento = new IntegerExpression("idElemento", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createAtendidaCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("atendida"));
	}
	
	public Denuncia_Archivada uniqueDenuncia_Archivada(PersistentSession session) {
		return (Denuncia_Archivada) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Denuncia_Archivada[] listDenuncia_Archivada(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Denuncia_Archivada[]) list.toArray(new Denuncia_Archivada[list.size()]);
	}
}

