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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression usuario;
	public final StringExpression contrasenna;
	public final CollectionExpression ha_atendido;
	public final CollectionExpression bloquea;
	
	public AdministradorDetachedCriteria() {
		super(Administrador.class, AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		contrasenna = new StringExpression("contrasenna", this.getDetachedCriteria());
		ha_atendido = new CollectionExpression("ORM_ha_atendido", this.getDetachedCriteria());
		bloquea = new CollectionExpression("ORM_bloquea", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		contrasenna = new StringExpression("contrasenna", this.getDetachedCriteria());
		ha_atendido = new CollectionExpression("ORM_ha_atendido", this.getDetachedCriteria());
		bloquea = new CollectionExpression("ORM_bloquea", this.getDetachedCriteria());
	}
	
	public Denuncia_ArchivadaDetachedCriteria createHa_atendidoCriteria() {
		return new Denuncia_ArchivadaDetachedCriteria(createCriteria("ORM_ha_atendido"));
	}
	
	public Usuario_RegistradoDetachedCriteria createBloqueaCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("ORM_bloquea"));
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

