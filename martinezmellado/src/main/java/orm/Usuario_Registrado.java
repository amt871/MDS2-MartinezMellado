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
@Table(name="Usuario_Registrado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioID", referencedColumnName="ID")
public class Usuario_Registrado extends Usuario implements Serializable {
	public Usuario_Registrado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADO_SEGUIDO) {
			return ORM_seguido;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_DENUNCIADO) {
			return ORM_denunciado;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_SEGUIDOR) {
			return ORM_seguidor;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_DENUNCIANTE) {
			return ORM_denunciante;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_PUBLICA) {
			return ORM_publica;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_REALIZA) {
			return ORM_realiza;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_LE_GUSTA) {
			return ORM_le_gusta;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_DENUNCIA) {
			return ORM_denuncia;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_DENUNCIAA) {
			return ORM_denunciaA;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_LE_GUSTA_A) {
			return ORM_le_gusta_a;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_ENVIA) {
			return ORM_envia;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADO_ES_BLOQUEADO) {
			this.es_bloqueado = (Administrador) owner;
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
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Apellido", nullable=true, length=255)	
	private String apellido;
	
	@Column(name="Correo", nullable=true, length=255)	
	private String correo;
	
	@Column(name="FechaNacimiento", nullable=true)	
	private Date fechaNacimiento;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@Column(name="Comercial", nullable=true, length=255)	
	private String comercial;
	
	@Column(name="Privado", nullable=false, length=1)	
	private boolean privado;
	
	@Column(name="Edad", nullable=false, length=10)	
	private int edad;
	
	@ManyToOne(targetEntity=Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuarioID", referencedColumnName="UsuarioID") }, foreignKey=@ForeignKey(name="Administrador_UsuarioRegistrado"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Administrador es_bloqueado;
	
	@ManyToMany(targetEntity=Usuario_Registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Registrado_Usuario_Registrado", joinColumns={ @JoinColumn(name="Usuario_RegistradoUsuarioID2") }, inverseJoinColumns={ @JoinColumn(name="Usuario_RegistradoUsuarioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguido = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Usuario_Registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Registrado_Usuario_Registrado2", joinColumns={ @JoinColumn(name="Usuario_RegistradoUsuarioID2") }, inverseJoinColumns={ @JoinColumn(name="Usuario_RegistradoUsuarioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denunciado = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_seguido", targetEntity=Usuario_Registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguidor = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_denunciado", targetEntity=Usuario_Registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denunciante = new java.util.HashSet();
	
	@OneToMany(mappedBy="es_publicado", targetEntity=Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_publica = new java.util.HashSet();
	
	@OneToMany(mappedBy="Realizada", targetEntity=Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_realiza = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_le_gusta", targetEntity=Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_le_gusta = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_es_denunciada", targetEntity=Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denuncia = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_es_denunciada", targetEntity=Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denunciaA = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_le_gusta", targetEntity=Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_le_gusta_a = new java.util.HashSet();
	
	@OneToMany(mappedBy="tiene", targetEntity=Notificacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_envia = new java.util.HashSet();
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setFechaNacimiento(Date value) {
		this.fechaNacimiento = value;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setComercial(String value) {
		this.comercial = value;
	}
	
	public String getComercial() {
		return comercial;
	}
	
	public void setPrivado(boolean value) {
		this.privado = value;
	}
	
	public boolean getPrivado() {
		return privado;
	}
	
	public void setEdad(int value) {
		this.edad = value;
	}
	
	public int getEdad() {
		return edad;
	}
	
	private void setORM_Seguido(java.util.Set value) {
		this.ORM_seguido = value;
	}
	
	private java.util.Set getORM_Seguido() {
		return ORM_seguido;
	}
	
	@Transient	
	public final Usuario_RegistradoSetCollection seguido = new Usuario_RegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_SEGUIDO, ORMConstants.KEY_USUARIO_REGISTRADO_SEGUIDOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Denunciado(java.util.Set value) {
		this.ORM_denunciado = value;
	}
	
	private java.util.Set getORM_Denunciado() {
		return ORM_denunciado;
	}
	
	@Transient	
	public final Usuario_RegistradoSetCollection denunciado = new Usuario_RegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_DENUNCIADO, ORMConstants.KEY_USUARIO_REGISTRADO_DENUNCIANTE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEs_bloqueado(Administrador value) {
		if (es_bloqueado != null) {
			es_bloqueado.bloquea.remove(this);
		}
		if (value != null) {
			value.bloquea.add(this);
		}
	}
	
	public Administrador getEs_bloqueado() {
		return es_bloqueado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_bloqueado(Administrador value) {
		this.es_bloqueado = value;
	}
	
	private Administrador getORM_Es_bloqueado() {
		return es_bloqueado;
	}
	
	private void setORM_Seguidor(java.util.Set value) {
		this.ORM_seguidor = value;
	}
	
	private java.util.Set getORM_Seguidor() {
		return ORM_seguidor;
	}
	
	@Transient	
	public final Usuario_RegistradoSetCollection seguidor = new Usuario_RegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_SEGUIDOR, ORMConstants.KEY_USUARIO_REGISTRADO_SEGUIDO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Denunciante(java.util.Set value) {
		this.ORM_denunciante = value;
	}
	
	private java.util.Set getORM_Denunciante() {
		return ORM_denunciante;
	}
	
	@Transient	
	public final Usuario_RegistradoSetCollection denunciante = new Usuario_RegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_DENUNCIANTE, ORMConstants.KEY_USUARIO_REGISTRADO_DENUNCIADO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Publica(java.util.Set value) {
		this.ORM_publica = value;
	}
	
	private java.util.Set getORM_Publica() {
		return ORM_publica;
	}
	
	@Transient	
	public final ComentarioSetCollection publica = new ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_PUBLICA, ORMConstants.KEY_COMENTARIO_ES_PUBLICADO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Realiza(java.util.Set value) {
		this.ORM_realiza = value;
	}
	
	private java.util.Set getORM_Realiza() {
		return ORM_realiza;
	}
	
	@Transient	
	public final PublicacionSetCollection realiza = new PublicacionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_REALIZA, ORMConstants.KEY_PUBLICACION_REALIZADA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Le_gusta(java.util.Set value) {
		this.ORM_le_gusta = value;
	}
	
	private java.util.Set getORM_Le_gusta() {
		return ORM_le_gusta;
	}
	
	@Transient	
	public final PublicacionSetCollection le_gusta = new PublicacionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_LE_GUSTA, ORMConstants.KEY_PUBLICACION_LE_GUSTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Denuncia(java.util.Set value) {
		this.ORM_denuncia = value;
	}
	
	private java.util.Set getORM_Denuncia() {
		return ORM_denuncia;
	}
	
	@Transient	
	public final PublicacionSetCollection denuncia = new PublicacionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_DENUNCIA, ORMConstants.KEY_PUBLICACION_ES_DENUNCIADA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_DenunciaA(java.util.Set value) {
		this.ORM_denunciaA = value;
	}
	
	private java.util.Set getORM_DenunciaA() {
		return ORM_denunciaA;
	}
	
	@Transient	
	public final ComentarioSetCollection denunciaA = new ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_DENUNCIAA, ORMConstants.KEY_COMENTARIO_ES_DENUNCIADA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Le_gusta_a(java.util.Set value) {
		this.ORM_le_gusta_a = value;
	}
	
	private java.util.Set getORM_Le_gusta_a() {
		return ORM_le_gusta_a;
	}
	
	@Transient	
	public final ComentarioSetCollection le_gusta_a = new ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_LE_GUSTA_A, ORMConstants.KEY_COMENTARIO_LE_GUSTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Envia(java.util.Set value) {
		this.ORM_envia = value;
	}
	
	private java.util.Set getORM_Envia() {
		return ORM_envia;
	}
	
	@Transient	
	public final NotificacionSetCollection envia = new NotificacionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_ENVIA, ORMConstants.KEY_NOTIFICACION_TIENE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
