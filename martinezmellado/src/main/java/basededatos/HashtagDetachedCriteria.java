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

public class HashtagDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression Hashtag;
	public final CollectionExpression esta;
	
	public HashtagDetachedCriteria() {
		super(Hashtag.class, HashtagCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		Hashtag = new StringExpression("Hashtag", this.getDetachedCriteria());
		esta = new CollectionExpression("ORM_esta", this.getDetachedCriteria());
	}
	
	public HashtagDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, HashtagCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		Hashtag = new StringExpression("Hashtag", this.getDetachedCriteria());
		esta = new CollectionExpression("ORM_esta", this.getDetachedCriteria());
	}
	
	public PublicacionDetachedCriteria createEstaCriteria() {
		return new PublicacionDetachedCriteria(createCriteria("ORM_esta"));
	}
	
	public Hashtag uniqueHashtag(PersistentSession session) {
		return (Hashtag) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hashtag[] listHashtag(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
	}
}

