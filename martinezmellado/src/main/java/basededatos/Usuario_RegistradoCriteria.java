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

public class Usuario_RegistradoCriteria extends AbstractORMCriteria {
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
	
	public Usuario_RegistradoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		usuario = new StringExpression("usuario", this);
		contrasenna = new StringExpression("contrasenna", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		correo = new StringExpression("correo", this);
		descripcion = new StringExpression("descripcion", this);
		foto = new StringExpression("foto", this);
		comercial = new StringExpression("comercial", this);
		privado = new BooleanExpression("privado", this);
		edad = new IntegerExpression("edad", this);
		es_bloqueadoId = new IntegerExpression("es_bloqueado.", this);
		es_bloqueado = new AssociationExpression("es_bloqueado", this);
		Seguido = new CollectionExpression("ORM_seguido", this);
		Denunciado = new CollectionExpression("ORM_denunciado", this);
		Seguidor = new CollectionExpression("ORM_seguidor", this);
		Denunciante = new CollectionExpression("ORM_denunciante", this);
		publica = new CollectionExpression("ORM_publica", this);
		Realiza = new CollectionExpression("ORM_realiza", this);
		Le_gusta = new CollectionExpression("ORM_le_gusta", this);
		denuncia = new CollectionExpression("ORM_denuncia", this);
		denunciaA = new CollectionExpression("ORM_denunciaA", this);
		Le_gusta_a = new CollectionExpression("ORM_le_gusta_a", this);
		envia = new CollectionExpression("ORM_envia", this);
	}
	
	public Usuario_RegistradoCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario_Registrado.class));
	}
	
	public Usuario_RegistradoCriteria() throws PersistentException {
		this(MartinezMelladoMDSPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createEs_bloqueadoCriteria() {
		return new AdministradorCriteria(createCriteria("es_bloqueado"));
	}
	
	public Usuario_RegistradoCriteria createSeguidoCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("ORM_seguido"));
	}
	
	public Usuario_RegistradoCriteria createDenunciadoCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("ORM_denunciado"));
	}
	
	public Usuario_RegistradoCriteria createSeguidorCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("ORM_seguidor"));
	}
	
	public Usuario_RegistradoCriteria createDenuncianteCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("ORM_denunciante"));
	}
	
	public ComentarioCriteria createPublicaCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_publica"));
	}
	
	public PublicacionCriteria createRealizaCriteria() {
		return new PublicacionCriteria(createCriteria("ORM_realiza"));
	}
	
	public PublicacionCriteria createLe_gustaCriteria() {
		return new PublicacionCriteria(createCriteria("ORM_le_gusta"));
	}
	
	public PublicacionCriteria createDenunciaCriteria() {
		return new PublicacionCriteria(createCriteria("ORM_denuncia"));
	}
	
	public ComentarioCriteria createDenunciaACriteria() {
		return new ComentarioCriteria(createCriteria("ORM_denunciaA"));
	}
	
	public ComentarioCriteria createLe_gusta_aCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_le_gusta_a"));
	}
	
	public NotificacionCriteria createEnviaCriteria() {
		return new NotificacionCriteria(createCriteria("ORM_envia"));
	}
	
	public Usuario_Registrado uniqueUsuario_Registrado() {
		return (Usuario_Registrado) super.uniqueResult();
	}
	
	public Usuario_Registrado[] listUsuario_Registrado() {
		java.util.List list = super.list();
		return (Usuario_Registrado[]) list.toArray(new Usuario_Registrado[list.size()]);
	}
}

