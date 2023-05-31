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

public class NotificacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression tieneId;
	public final AssociationExpression tiene;
	public final StringExpression tipo;
	public final BooleanExpression vista;
	public final StringExpression usuarioOrigen;
	public final IntegerExpression publicacion;
	public final BooleanExpression comentario;
	
	public NotificacionDetachedCriteria() {
		super(Notificacion.class, NotificacionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		tieneId = new IntegerExpression("tiene.", this.getDetachedCriteria());
		tiene = new AssociationExpression("tiene", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		vista = new BooleanExpression("vista", this.getDetachedCriteria());
		usuarioOrigen = new StringExpression("usuarioOrigen", this.getDetachedCriteria());
		publicacion = new IntegerExpression("publicacion", this.getDetachedCriteria());
		comentario = new BooleanExpression("comentario", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, NotificacionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		tieneId = new IntegerExpression("tiene.", this.getDetachedCriteria());
		tiene = new AssociationExpression("tiene", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		vista = new BooleanExpression("vista", this.getDetachedCriteria());
		usuarioOrigen = new StringExpression("usuarioOrigen", this.getDetachedCriteria());
		publicacion = new IntegerExpression("publicacion", this.getDetachedCriteria());
		comentario = new BooleanExpression("comentario", this.getDetachedCriteria());
	}
	
	public Usuario_RegistradoDetachedCriteria createTieneCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("tiene"));
	}
	
	public Notificacion uniqueNotificacion(PersistentSession session) {
		return (Notificacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion[] listNotificacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

