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

public class Usuario_RegistradoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression usuario;
	public final StringExpression contrasenna;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression correo;
	public final StringExpression descripcion;
	public final StringExpression foto;
	public final StringExpression comercial;
	public final BooleanExpression privado;
	public final IntegerExpression edad;
	public final IntegerExpression es_bloqueadoId;
	public final AssociationExpression es_bloqueado;
	public final CollectionExpression Seguido;
	public final CollectionExpression Denunciado;
	public final CollectionExpression Seguidor;
	public final CollectionExpression Denunciante;
	public final CollectionExpression publica;
	public final CollectionExpression Realiza;
	public final CollectionExpression Le_gusta;
	public final CollectionExpression denuncia;
	public final CollectionExpression denunciaA;
	public final CollectionExpression Le_gusta_a;
	public final CollectionExpression envia;
	
	public Usuario_RegistradoDetachedCriteria() {
		super(Usuario_Registrado.class, Usuario_RegistradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		contrasenna = new StringExpression("contrasenna", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		comercial = new StringExpression("comercial", this.getDetachedCriteria());
		privado = new BooleanExpression("privado", this.getDetachedCriteria());
		edad = new IntegerExpression("edad", this.getDetachedCriteria());
		es_bloqueadoId = new IntegerExpression("es_bloqueado.", this.getDetachedCriteria());
		es_bloqueado = new AssociationExpression("es_bloqueado", this.getDetachedCriteria());
		Seguido = new CollectionExpression("ORM_seguido", this.getDetachedCriteria());
		Denunciado = new CollectionExpression("ORM_denunciado", this.getDetachedCriteria());
		Seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		Denunciante = new CollectionExpression("ORM_denunciante", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
		Realiza = new CollectionExpression("ORM_realiza", this.getDetachedCriteria());
		Le_gusta = new CollectionExpression("ORM_le_gusta", this.getDetachedCriteria());
		denuncia = new CollectionExpression("ORM_denuncia", this.getDetachedCriteria());
		denunciaA = new CollectionExpression("ORM_denunciaA", this.getDetachedCriteria());
		Le_gusta_a = new CollectionExpression("ORM_le_gusta_a", this.getDetachedCriteria());
		envia = new CollectionExpression("ORM_envia", this.getDetachedCriteria());
	}
	
	public Usuario_RegistradoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Usuario_RegistradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		contrasenna = new StringExpression("contrasenna", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		comercial = new StringExpression("comercial", this.getDetachedCriteria());
		privado = new BooleanExpression("privado", this.getDetachedCriteria());
		edad = new IntegerExpression("edad", this.getDetachedCriteria());
		es_bloqueadoId = new IntegerExpression("es_bloqueado.", this.getDetachedCriteria());
		es_bloqueado = new AssociationExpression("es_bloqueado", this.getDetachedCriteria());
		Seguido = new CollectionExpression("ORM_seguido", this.getDetachedCriteria());
		Denunciado = new CollectionExpression("ORM_denunciado", this.getDetachedCriteria());
		Seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		Denunciante = new CollectionExpression("ORM_denunciante", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
		Realiza = new CollectionExpression("ORM_realiza", this.getDetachedCriteria());
		Le_gusta = new CollectionExpression("ORM_le_gusta", this.getDetachedCriteria());
		denuncia = new CollectionExpression("ORM_denuncia", this.getDetachedCriteria());
		denunciaA = new CollectionExpression("ORM_denunciaA", this.getDetachedCriteria());
		Le_gusta_a = new CollectionExpression("ORM_le_gusta_a", this.getDetachedCriteria());
		envia = new CollectionExpression("ORM_envia", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createEs_bloqueadoCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("es_bloqueado"));
	}
	
	public Usuario_RegistradoDetachedCriteria createSeguidoCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("ORM_seguido"));
	}
	
	public Usuario_RegistradoDetachedCriteria createDenunciadoCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("ORM_denunciado"));
	}
	
	public Usuario_RegistradoDetachedCriteria createSeguidorCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("ORM_seguidor"));
	}
	
	public Usuario_RegistradoDetachedCriteria createDenuncianteCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("ORM_denunciante"));
	}
	
	public ComentarioDetachedCriteria createPublicaCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_publica"));
	}
	
	public PublicacionDetachedCriteria createRealizaCriteria() {
		return new PublicacionDetachedCriteria(createCriteria("ORM_realiza"));
	}
	
	public PublicacionDetachedCriteria createLe_gustaCriteria() {
		return new PublicacionDetachedCriteria(createCriteria("ORM_le_gusta"));
	}
	
	public PublicacionDetachedCriteria createDenunciaCriteria() {
		return new PublicacionDetachedCriteria(createCriteria("ORM_denuncia"));
	}
	
	public ComentarioDetachedCriteria createDenunciaACriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_denunciaA"));
	}
	
	public ComentarioDetachedCriteria createLe_gusta_aCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_le_gusta_a"));
	}
	
	public NotificacionDetachedCriteria createEnviaCriteria() {
		return new NotificacionDetachedCriteria(createCriteria("ORM_envia"));
	}
	
	public Usuario_Registrado uniqueUsuario_Registrado(PersistentSession session) {
		return (Usuario_Registrado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_Registrado[] listUsuario_Registrado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_Registrado[]) list.toArray(new Usuario_Registrado[list.size()]);
	}
}

