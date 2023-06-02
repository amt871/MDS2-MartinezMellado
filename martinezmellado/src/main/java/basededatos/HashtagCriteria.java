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

public class HashtagCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression Hashtag;
	public final CollectionExpression esta;
	
	public HashtagCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		Hashtag = new StringExpression("Hashtag", this);
		esta = new CollectionExpression("ORM_esta", this);
	}
	
	public HashtagCriteria(PersistentSession session) {
		this(session.createCriteria(Hashtag.class));
	}
	
	public HashtagCriteria() throws PersistentException {
		this(MartinezMelladoMDSPersistentManager.instance().getSession());
	}
	
	public PublicacionCriteria createEstaCriteria() {
		return new PublicacionCriteria(createCriteria("ORM_esta"));
	}
	
	public Hashtag uniqueHashtag() {
		return (Hashtag) super.uniqueResult();
	}
	
	public Hashtag[] listHashtag() {
		java.util.List list = super.list();
		return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
	}
}

