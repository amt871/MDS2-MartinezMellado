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

public class ComentarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression perteneceId;
	public final AssociationExpression pertenece;
	public final IntegerExpression es_publicadoId;
	public final AssociationExpression es_publicado;
	public final StringExpression autor;
	public final StringExpression publicacion;
	public final StringExpression comentario;
	public final CollectionExpression es_denunciada;
	public final CollectionExpression Le_gusta;
	
	public ComentarioDetachedCriteria() {
		super(Comentario.class, ComentarioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		perteneceId = new IntegerExpression("pertenece.ID", this.getDetachedCriteria());
		pertenece = new AssociationExpression("pertenece", this.getDetachedCriteria());
		es_publicadoId = new IntegerExpression("es_publicado.", this.getDetachedCriteria());
		es_publicado = new AssociationExpression("es_publicado", this.getDetachedCriteria());
		autor = new StringExpression("autor", this.getDetachedCriteria());
		publicacion = new StringExpression("publicacion", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		es_denunciada = new CollectionExpression("ORM_es_denunciada", this.getDetachedCriteria());
		Le_gusta = new CollectionExpression("ORM_le_gusta", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ComentarioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		perteneceId = new IntegerExpression("pertenece.ID", this.getDetachedCriteria());
		pertenece = new AssociationExpression("pertenece", this.getDetachedCriteria());
		es_publicadoId = new IntegerExpression("es_publicado.", this.getDetachedCriteria());
		es_publicado = new AssociationExpression("es_publicado", this.getDetachedCriteria());
		autor = new StringExpression("autor", this.getDetachedCriteria());
		publicacion = new StringExpression("publicacion", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		es_denunciada = new CollectionExpression("ORM_es_denunciada", this.getDetachedCriteria());
		Le_gusta = new CollectionExpression("ORM_le_gusta", this.getDetachedCriteria());
	}
	
	public PublicacionDetachedCriteria createPerteneceCriteria() {
		return new PublicacionDetachedCriteria(createCriteria("pertenece"));
	}
	
	public Usuario_RegistradoDetachedCriteria createEs_publicadoCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("es_publicado"));
	}
	
	public Usuario_RegistradoDetachedCriteria createEs_denunciadaCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("ORM_es_denunciada"));
	}
	
	public Usuario_RegistradoDetachedCriteria createLe_gustaCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("ORM_le_gusta"));
	}
	
	public Comentario uniqueComentario(PersistentSession session) {
		return (Comentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario[] listComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

