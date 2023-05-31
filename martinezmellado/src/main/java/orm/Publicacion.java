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

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Publicacion")
public class Publicacion implements Serializable {
	public Publicacion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PUBLICACION_LE_GUSTA) {
			return ORM_le_gusta;
		}
		else if (key == ORMConstants.KEY_PUBLICACION_ES_DENUNCIADA) {
			return ORM_es_denunciada;
		}
		else if (key == ORMConstants.KEY_PUBLICACION_PERTENECE) {
			return ORM_pertenece;
		}
		else if (key == ORMConstants.KEY_PUBLICACION_TIENE) {
			return ORM_tiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PUBLICACION_REALIZADA) {
			this.Realizada = (Usuario_Registrado) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_PUBLICACION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_PUBLICACION_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Usuario_Registrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Usuario_RegistradoUsuarioID", referencedColumnName="UsuarioID", nullable=false) }, foreignKey=@ForeignKey(name="FKPublicacio335975"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario_Registrado Realizada;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Ubicacion", nullable=true, length=255)	
	private String ubicacion;
	
	@Column(name="Video", nullable=true, length=255)	
	private String video;
	
	@Column(name="Fecha", nullable=true)	
	private Date fecha;
	
	@Column(name="Publicidad", nullable=true, length=255)	
	private String publicidad;
	
	@ManyToMany(targetEntity=Usuario_Registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Registrado_Publicacion", joinColumns={ @JoinColumn(name="PublicacionID") }, inverseJoinColumns={ @JoinColumn(name="Usuario_RegistradoUsuarioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_le_gusta = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Usuario_Registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Registrado_Publicacion2", joinColumns={ @JoinColumn(name="PublicacionID") }, inverseJoinColumns={ @JoinColumn(name="Usuario_RegistradoUsuarioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_denunciada = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Hashtag.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Hashtag_Publicacion", joinColumns={ @JoinColumn(name="PublicacionID") }, inverseJoinColumns={ @JoinColumn(name="HashtagID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece = new java.util.HashSet();
	
	@OneToMany(mappedBy="pertenece", targetEntity=Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setUbicacion(String value) {
		this.ubicacion = value;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setVideo(String value) {
		this.video = value;
	}
	
	public String getVideo() {
		return video;
	}
	
	public void setFecha(Date value) {
		this.fecha = value;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setPublicidad(String value) {
		this.publicidad = value;
	}
	
	public String getPublicidad() {
		return publicidad;
	}
	
	public void setRealizada(Usuario_Registrado value) {
		if (Realizada != null) {
			Realizada.realiza.remove(this);
		}
		if (value != null) {
			value.realiza.add(this);
		}
	}
	
	public Usuario_Registrado getRealizada() {
		return Realizada;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Realizada(Usuario_Registrado value) {
		this.Realizada = value;
	}
	
	private Usuario_Registrado getORM_Realizada() {
		return Realizada;
	}
	
	private void setORM_Le_gusta(java.util.Set value) {
		this.ORM_le_gusta = value;
	}
	
	private java.util.Set getORM_Le_gusta() {
		return ORM_le_gusta;
	}
	
	@Transient	
	public final Usuario_RegistradoSetCollection le_gusta = new Usuario_RegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_PUBLICACION_LE_GUSTA, ORMConstants.KEY_USUARIO_REGISTRADO_LE_GUSTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_denunciada(java.util.Set value) {
		this.ORM_es_denunciada = value;
	}
	
	private java.util.Set getORM_Es_denunciada() {
		return ORM_es_denunciada;
	}
	
	@Transient	
	public final Usuario_RegistradoSetCollection es_denunciada = new Usuario_RegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_PUBLICACION_ES_DENUNCIADA, ORMConstants.KEY_USUARIO_REGISTRADO_DENUNCIA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Pertenece(java.util.Set value) {
		this.ORM_pertenece = value;
	}
	
	private java.util.Set getORM_Pertenece() {
		return ORM_pertenece;
	}
	
	@Transient	
	public final HashtagSetCollection pertenece = new HashtagSetCollection(this, _ormAdapter, ORMConstants.KEY_PUBLICACION_PERTENECE, ORMConstants.KEY_HASHTAG_ESTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Tiene(java.util.Set value) {
		this.ORM_tiene = value;
	}
	
	private java.util.Set getORM_Tiene() {
		return ORM_tiene;
	}
	
	@Transient	
	public final ComentarioSetCollection tiene = new ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_PUBLICACION_TIENE, ORMConstants.KEY_COMENTARIO_PERTENECE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
