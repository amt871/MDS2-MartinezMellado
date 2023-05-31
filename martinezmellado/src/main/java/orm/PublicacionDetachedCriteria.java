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

public class PublicacionDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public PublicacionDetachedCriteria() {
		super(Publicacion.class, PublicacionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		RealizadaId = new IntegerExpression("Realizada.", this.getDetachedCriteria());
		Realizada = new AssociationExpression("Realizada", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		ubicacion = new StringExpression("ubicacion", this.getDetachedCriteria());
		video = new StringExpression("video", this.getDetachedCriteria());
		publicidad = new StringExpression("publicidad", this.getDetachedCriteria());
		Le_gusta = new CollectionExpression("ORM_le_gusta", this.getDetachedCriteria());
		es_denunciada = new CollectionExpression("ORM_es_denunciada", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_pertenece", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
	}
	
	public PublicacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, PublicacionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		RealizadaId = new IntegerExpression("Realizada.", this.getDetachedCriteria());
		Realizada = new AssociationExpression("Realizada", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		ubicacion = new StringExpression("ubicacion", this.getDetachedCriteria());
		video = new StringExpression("video", this.getDetachedCriteria());
		publicidad = new StringExpression("publicidad", this.getDetachedCriteria());
		Le_gusta = new CollectionExpression("ORM_le_gusta", this.getDetachedCriteria());
		es_denunciada = new CollectionExpression("ORM_es_denunciada", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_pertenece", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
	}
	
	public Usuario_RegistradoDetachedCriteria createRealizadaCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("Realizada"));
	}
	
	public Usuario_RegistradoDetachedCriteria createLe_gustaCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("ORM_le_gusta"));
	}
	
	public Usuario_RegistradoDetachedCriteria createEs_denunciadaCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("ORM_es_denunciada"));
	}
	
	public HashtagDetachedCriteria createPerteneceCriteria() {
		return new HashtagDetachedCriteria(createCriteria("ORM_pertenece"));
	}
	
	public ComentarioDetachedCriteria createTieneCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public Publicacion uniquePublicacion(PersistentSession session) {
		return (Publicacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Publicacion[] listPublicacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Publicacion[]) list.toArray(new Publicacion[list.size()]);
	}
}

