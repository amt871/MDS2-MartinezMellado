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
import org.orm.criteria.AbstractORMCriteria;
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

public class ComentarioCriteria extends AbstractORMCriteria {
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
	
	public ComentarioCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		perteneceId = new IntegerExpression("pertenece.ID", this);
		pertenece = new AssociationExpression("pertenece", this);
		es_publicadoId = new IntegerExpression("es_publicado.", this);
		es_publicado = new AssociationExpression("es_publicado", this);
		autor = new StringExpression("autor", this);
		publicacion = new StringExpression("publicacion", this);
		comentario = new StringExpression("comentario", this);
		es_denunciada = new CollectionExpression("ORM_es_denunciada", this);
		Le_gusta = new CollectionExpression("ORM_le_gusta", this);
	}
	
	public ComentarioCriteria(PersistentSession session) {
		this(session.createCriteria(Comentario.class));
	}
	
	public ComentarioCriteria() throws PersistentException {
		this(MartinezMelladoMDSPersistentManager.instance().getSession());
	}
	
	public PublicacionCriteria createPerteneceCriteria() {
		return new PublicacionCriteria(createCriteria("pertenece"));
	}
	
	public Usuario_RegistradoCriteria createEs_publicadoCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("es_publicado"));
	}
	
	public Usuario_RegistradoCriteria createEs_denunciadaCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("ORM_es_denunciada"));
	}
	
	public Usuario_RegistradoCriteria createLe_gustaCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("ORM_le_gusta"));
	}
	
	public Comentario uniqueComentario() {
		return (Comentario) super.uniqueResult();
	}
	
	public Comentario[] listComentario() {
		java.util.List list = super.list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

