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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Hashtag")
public class Hashtag implements Serializable {
	public Hashtag() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_HASHTAG_ESTA) {
			return ORM_esta;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_HASHTAG_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_HASHTAG_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Hashtag", nullable=false, length=255)	
	private String Hashtag;
	
	@ManyToMany(mappedBy="ORM_pertenece", targetEntity=Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_esta = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setHashtag(String value) {
		this.Hashtag = value;
	}
	
	public String getHashtag() {
		return Hashtag;
	}
	
	private void setORM_Esta(java.util.Set value) {
		this.ORM_esta = value;
	}
	
	private java.util.Set getORM_Esta() {
		return ORM_esta;
	}
	
	@Transient	
	public final PublicacionSetCollection esta = new PublicacionSetCollection(this, _ormAdapter, ORMConstants.KEY_HASHTAG_ESTA, ORMConstants.KEY_PUBLICACION_PERTENECE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
