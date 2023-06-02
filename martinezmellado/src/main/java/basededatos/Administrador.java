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
@Table(name="Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioID", referencedColumnName="ID")
public class Administrador extends Usuario implements Serializable {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMINISTRADOR_HA_ATENDIDO) {
			return ORM_ha_atendido;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_BLOQUEA) {
			return ORM_bloquea;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="atendida", targetEntity=Denuncia_Archivada.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_ha_atendido = new java.util.HashSet();
	
	@OneToMany(mappedBy="es_bloqueado", targetEntity=Usuario_Registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_bloquea = new java.util.HashSet();
	
	private void setORM_Ha_atendido(java.util.Set value) {
		this.ORM_ha_atendido = value;
	}
	
	private java.util.Set getORM_Ha_atendido() {
		return ORM_ha_atendido;
	}
	
	@Transient	
	public final Denuncia_ArchivadaSetCollection ha_atendido = new Denuncia_ArchivadaSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_HA_ATENDIDO, ORMConstants.KEY_DENUNCIA_ARCHIVADA_ATENDIDA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Bloquea(java.util.Set value) {
		this.ORM_bloquea = value;
	}
	
	private java.util.Set getORM_Bloquea() {
		return ORM_bloquea;
	}
	
	@Transient	
	public final Usuario_RegistradoSetCollection bloquea = new Usuario_RegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_BLOQUEA, ORMConstants.KEY_USUARIO_REGISTRADO_ES_BLOQUEADO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
