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
@Table(name="Notificacion")
public class Notificacion implements Serializable {
	public Notificacion() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_NOTIFICACION_TIENE) {
			this.tiene = (Usuario_Registrado) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_NOTIFICACION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_NOTIFICACION_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Usuario_Registrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Usuario_RegistradoUsuarioID", referencedColumnName="UsuarioID", nullable=false) }, foreignKey=@ForeignKey(name="FKNotificaci243088"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario_Registrado tiene;
	
	@Column(name="Fecha", nullable=true)	
	private Date fecha;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	@Column(name="Vista", nullable=false, length=1)	
	private boolean vista;
	
	@Column(name="UsuarioOrigen", nullable=true, length=255)	
	private String usuarioOrigen;
	
	@Column(name="Publicacion", nullable=false, length=10)	
	private int publicacion;
	
	@Column(name="Comentario", nullable=false, length=1)	
	private boolean comentario;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setFecha(Date value) {
		this.fecha = value;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setVista(boolean value) {
		this.vista = value;
	}
	
	public boolean getVista() {
		return vista;
	}
	
	public void setUsuarioOrigen(String value) {
		this.usuarioOrigen = value;
	}
	
	public String getUsuarioOrigen() {
		return usuarioOrigen;
	}
	
	public void setPublicacion(int value) {
		this.publicacion = value;
	}
	
	public int getPublicacion() {
		return publicacion;
	}
	
	public void setComentario(boolean value) {
		this.comentario = value;
	}
	
	public boolean getComentario() {
		return comentario;
	}
	
	public void setTiene(Usuario_Registrado value) {
		if (tiene != null) {
			tiene.envia.remove(this);
		}
		if (value != null) {
			value.envia.add(this);
		}
	}
	
	public Usuario_Registrado getTiene() {
		return tiene;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tiene(Usuario_Registrado value) {
		this.tiene = value;
	}
	
	private Usuario_Registrado getORM_Tiene() {
		return tiene;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
