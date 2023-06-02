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
package basededatos;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression usuario;
	public final StringExpression contrasenna;
	public final CollectionExpression ha_atendido;
	public final CollectionExpression bloquea;
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		usuario = new StringExpression("usuario", this);
		contrasenna = new StringExpression("contrasenna", this);
		ha_atendido = new CollectionExpression("ORM_ha_atendido", this);
		bloquea = new CollectionExpression("ORM_bloquea", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(MartinezMelladoMDSPersistentManager.instance().getSession());
	}
	
	public Denuncia_ArchivadaCriteria createHa_atendidoCriteria() {
		return new Denuncia_ArchivadaCriteria(createCriteria("ORM_ha_atendido"));
	}
	
	public Usuario_RegistradoCriteria createBloqueaCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("ORM_bloquea"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

