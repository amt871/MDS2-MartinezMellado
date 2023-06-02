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
import java.sql.Date;

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Comentario")
public class Comentario implements Serializable {
	public Comentario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_COMENTARIO_ES_DENUNCIADA) {
			return ORM_es_denunciada;
		}
		else if (key == ORMConstants.KEY_COMENTARIO_LE_GUSTA) {
			return ORM_le_gusta;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMENTARIO_ES_PUBLICADO) {
			this.es_publicado = (Usuario_Registrado) owner;
		}
		
		else if (key == ORMConstants.KEY_COMENTARIO_PERTENECE) {
			this.pertenece = (Publicacion) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_COMENTARIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_COMENTARIO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Publicacion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PublicacionID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario115544"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Publicacion pertenece;
	
	@ManyToOne(targetEntity=Usuario_Registrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Usuario_RegistradoUsuarioID", referencedColumnName="UsuarioID", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario595139"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario_Registrado es_publicado;
	
	@Column(name="Autor", nullable=true, length=255)	
	private String autor;
	
	@Column(name="Publicacion", nullable=true, length=255)	
	private String publicacion;
	
	@Column(name="Comentario", nullable=true, length=255)	
	private String comentario;
	
	@Column(name="FechaPublicacion", nullable=true)	
	private Date fechaPublicacion;
	
	@ManyToMany(targetEntity=Usuario_Registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Registrado_Comentario", joinColumns={ @JoinColumn(name="ComentarioID") }, inverseJoinColumns={ @JoinColumn(name="Usuario_RegistradoUsuarioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_denunciada = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Usuario_Registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Registrado_Comentario2", joinColumns={ @JoinColumn(name="ComentarioID") }, inverseJoinColumns={ @JoinColumn(name="Usuario_RegistradoUsuarioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_le_gusta = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setAutor(String value) {
		this.autor = value;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setPublicacion(String value) {
		this.publicacion = value;
	}
	
	public String getPublicacion() {
		return publicacion;
	}
	
	public void setComentario(String value) {
		this.comentario = value;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setFechaPublicacion(Date value) {
		this.fechaPublicacion = value;
	}
	
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}
	
	public void setEs_publicado(Usuario_Registrado value) {
		if (es_publicado != null) {
			es_publicado.publica.remove(this);
		}
		if (value != null) {
			value.publica.add(this);
		}
	}
	
	public Usuario_Registrado getEs_publicado() {
		return es_publicado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_publicado(Usuario_Registrado value) {
		this.es_publicado = value;
	}
	
	private Usuario_Registrado getORM_Es_publicado() {
		return es_publicado;
	}
	
	private void setORM_Es_denunciada(java.util.Set value) {
		this.ORM_es_denunciada = value;
	}
	
	private java.util.Set getORM_Es_denunciada() {
		return ORM_es_denunciada;
	}
	
	@Transient	
	public final Usuario_RegistradoSetCollection es_denunciada = new Usuario_RegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_COMENTARIO_ES_DENUNCIADA, ORMConstants.KEY_USUARIO_REGISTRADO_DENUNCIAA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Le_gusta(java.util.Set value) {
		this.ORM_le_gusta = value;
	}
	
	private java.util.Set getORM_Le_gusta() {
		return ORM_le_gusta;
	}
	
	@Transient	
	public final Usuario_RegistradoSetCollection le_gusta = new Usuario_RegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_COMENTARIO_LE_GUSTA, ORMConstants.KEY_USUARIO_REGISTRADO_LE_GUSTA_A, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setPertenece(Publicacion value) {
		if (pertenece != null) {
			pertenece.tiene.remove(this);
		}
		if (value != null) {
			value.tiene.add(this);
		}
	}
	
	public Publicacion getPertenece() {
		return pertenece;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece(Publicacion value) {
		this.pertenece = value;
	}
	
	private Publicacion getORM_Pertenece() {
		return pertenece;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
