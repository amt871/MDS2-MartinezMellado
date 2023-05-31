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

public class NotificacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression tieneId;
	public final AssociationExpression tiene;
	public final StringExpression tipo;
	public final BooleanExpression vista;
	public final StringExpression usuarioOrigen;
	public final IntegerExpression publicacion;
	public final BooleanExpression comentario;
	
	public NotificacionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		tieneId = new IntegerExpression("tiene.", this);
		tiene = new AssociationExpression("tiene", this);
		tipo = new StringExpression("tipo", this);
		vista = new BooleanExpression("vista", this);
		usuarioOrigen = new StringExpression("usuarioOrigen", this);
		publicacion = new IntegerExpression("publicacion", this);
		comentario = new BooleanExpression("comentario", this);
	}
	
	public NotificacionCriteria(PersistentSession session) {
		this(session.createCriteria(Notificacion.class));
	}
	
	public NotificacionCriteria() throws PersistentException {
		this(MartinezMelladoMDSPersistentManager.instance().getSession());
	}
	
	public Usuario_RegistradoCriteria createTieneCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("tiene"));
	}
	
	public Notificacion uniqueNotificacion() {
		return (Notificacion) super.uniqueResult();
	}
	
	public Notificacion[] listNotificacion() {
		java.util.List list = super.list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

