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

public class PublicacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression RealizadaId;
	public final AssociationExpression Realizada;
	public final StringExpression descripcion;
	public final StringExpression ubicacion;
	public final StringExpression video;
	public final StringExpression publicidad;
	public final CollectionExpression Le_gusta;
	public final CollectionExpression es_denunciada;
	public final CollectionExpression pertenece;
	public final CollectionExpression tiene;
	
	public PublicacionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		RealizadaId = new IntegerExpression("Realizada.", this);
		Realizada = new AssociationExpression("Realizada", this);
		descripcion = new StringExpression("descripcion", this);
		ubicacion = new StringExpression("ubicacion", this);
		video = new StringExpression("video", this);
		publicidad = new StringExpression("publicidad", this);
		Le_gusta = new CollectionExpression("ORM_le_gusta", this);
		es_denunciada = new CollectionExpression("ORM_es_denunciada", this);
		pertenece = new CollectionExpression("ORM_pertenece", this);
		tiene = new CollectionExpression("ORM_tiene", this);
	}
	
	public PublicacionCriteria(PersistentSession session) {
		this(session.createCriteria(Publicacion.class));
	}
	
	public PublicacionCriteria() throws PersistentException {
		this(MartinezMelladoMDSPersistentManager.instance().getSession());
	}
	
	public Usuario_RegistradoCriteria createRealizadaCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("Realizada"));
	}
	
	public Usuario_RegistradoCriteria createLe_gustaCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("ORM_le_gusta"));
	}
	
	public Usuario_RegistradoCriteria createEs_denunciadaCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("ORM_es_denunciada"));
	}
	
	public HashtagCriteria createPerteneceCriteria() {
		return new HashtagCriteria(createCriteria("ORM_pertenece"));
	}
	
	public ComentarioCriteria createTieneCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_tiene"));
	}
	
	public Publicacion uniquePublicacion() {
		return (Publicacion) super.uniqueResult();
	}
	
	public Publicacion[] listPublicacion() {
		java.util.List list = super.list();
		return (Publicacion[]) list.toArray(new Publicacion[list.size()]);
	}
}

