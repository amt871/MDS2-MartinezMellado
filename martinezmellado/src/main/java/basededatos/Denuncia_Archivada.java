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
@Table(name="Denuncia_Archivada")
public class Denuncia_Archivada implements Serializable {
	public Denuncia_Archivada() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_DENUNCIA_ARCHIVADA_ATENDIDA) {
			this.atendida = (Administrador) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_DENUNCIA_ARCHIVADA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_DENUNCIA_ARCHIVADA_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuarioID", referencedColumnName="UsuarioID", nullable=false) }, foreignKey=@ForeignKey(name="FKDenuncia_A579174"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Administrador atendida;
	
	@Column(name="IdElemento", nullable=true, length=10)	
	private int idElemento;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setIdElemento(int value) {
		this.idElemento = value;
	}
	
	public int getIdElemento() {
		return idElemento;
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setAtendida(Administrador value) {
		if (atendida != null) {
			atendida.ha_atendido.remove(this);
		}
		if (value != null) {
			value.ha_atendido.add(this);
		}
	}
	
	public Administrador getAtendida() {
		return atendida;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Atendida(Administrador value) {
		this.atendida = value;
	}
	
	private Administrador getORM_Atendida() {
		return atendida;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
