package interfaz;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaVideo_otro_usuario_item;

public class Video_otro_usuario_item extends VistaVideo_otro_usuario_item {
	
	private Video video;
	private Usuario_Registrado usuario;
	private Mi_cabecera cabeceraUserReg;
	private MainView inicio;
	private BDPrincipal datos;
	private Usuario_Registrado miUsuario;
	private Video_otro_usuario video_otro_usuario;
	
//	private Video _videoV;
//	private ImageButton _imagenPropietarioVideoIB;
//	private Button _dar_me_gusta_a_video;
//	private Button _denunciar_video;
//	private Label _nombreUsuarioL;
//	private Label _fechaPublicacionL;
//	private Label _ubicacionL;
//	private Label _descripcionL;
//	private Label _meGustaL;
//	private ImageButton _imagenMeGustaIB;
//	private ImageIcon _imagenComentariosII;
//	private Label _nComentariosL;
//	private Button _verComentariosB;
//	public Video_otro_usuario _video_otro_usuario;
//	public Perfil_otro_usuario _perfil_otro_usuario;
//	public Vista_detalle__usuario_registrado_ _vista_detalle__usuario_registrado_;
//	public Me_gusta__otro_usuario_ _me_gusta__otro_usuario_;
//
//	public void dar_me_gusta_a_video() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void perfil_otro_usuario() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void denunciar_video() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void vista_detalle__usuario_registrado_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void me_gusta__otro_usuario_() {
//		throw new UnsupportedOperationException();
//	}
	
	public Video_otro_usuario_item(Usuario_Registrado miUsuario, Publicacion publicacion, Usuario_Registrado usuario, MainView inicio, Mi_cabecera cabecera, Video_otro_usuario video_otro_usuario) {
		
		this.datos = cabecera.getDatos();
		this.inicio = inicio;
		this.cabeceraUserReg = cabecera;
		this.usuario = usuario;
		this.miUsuario = this.datos.cargarDatosUsuario(miUsuario.getUsuario());
		this.video_otro_usuario = video_otro_usuario;
		
		this.getUsuarioButton().addClickListener(event -> {
		
			verPerfilOtroUsuario();
			
		});
		
		this.getDenunciarButton().addClickListener(event -> {
			DenunciarButton(publicacion);
		});
		
		this.video = new Video(publicacion.getVideo().replace("src/main/webapp", ""),"100%","90%");
		this.getLayoutVideo().add(video);
		this.getIdNumMg().setText(String.valueOf(publicacion.le_gusta.size()));
		
		this.getIdBMeGusta().addClickListener(event -> {
			BMeGusta(publicacion);
		});
		
		this.getIdBComentarios().addClickListener(event -> {
			BComentarios(publicacion);
		});
		
	}
	
	private void verPerfilOtroUsuario() { 
		
		if(this.usuario.getPrivado()) {
			
			//System.out.println(miUsuario.getUsuario());
			
			//Notification.show("Aun no implementado");
			if(this.miUsuario.seguido.contains(this.usuario)) {
				this.cabeceraUserReg.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, this.usuario));
				this.inicio.removeAll();
				this.inicio.add(this.cabeceraUserReg.getPerfilPublico());
			}else {
				this.cabeceraUserReg.setPerfilPrivado(new Ver_perfil_privado__usuario_registrado_(this.cabeceraUserReg, this.usuario));
				this.inicio.removeAll();
				this.inicio.add(this.cabeceraUserReg.getPerfilPrivado());
			//this.inicio.cambiarPantalla(cabecera);
			}
		}else {
			
			this.cabeceraUserReg.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, this.usuario));
			this.inicio.removeAll();
			this.inicio.add(this.cabeceraUserReg.getPerfilPublico());
			
		}
		
		this.video_otro_usuario.clear();
		
	}
	
	public void DenunciarButton(Publicacion publicacion) {
		boolean flag = true;
		for (Usuario_Registrado denunciante : this.datos.cargarVideoPoID(publicacion.getID()).es_denunciada.toArray()) {
			if (denunciante.getUsuario().equals(this.miUsuario.getUsuario())) {
				
				flag = false;
			}
		}
		
		if (flag) {
			this.datos.denunciarPublicación(this.miUsuario, publicacion);
		}else{
			Notification.show("Ya has denunciado esta publicación");
		}
		
		
	}
	
	public void BMeGusta(Publicacion publicacion) {
		Publicacion publicacionAux = this.cabeceraUserReg.getDatos().cargarVideoPoID(publicacion.getID());
		boolean flag = false;
		for (Usuario_Registrado usuarios : publicacionAux.le_gusta.toArray()) {
			if (usuarios.getUsuario().equals(miUsuario.getUsuario())) {
				flag = true;
			}
		}
		if(flag) {
			Notification.show("Ya le has dado me gusta a esta publicación");
		}else {
			this.datos.annadirMeGusta(publicacionAux.getID(), this.miUsuario.getID());
			this.datos.annadirNotificacion("me_gusta", usuario, miUsuario, publicacionAux);
			this.getIdNumMg().setText(String.valueOf(Integer.parseInt(this.getIdNumMg().getText()) + 1));
		}	

	}
	
	public void BComentarios(Publicacion publicacion) {
		
		this.cabeceraUserReg.setDetalle(new Vista_detalle__usuario_registrado_(this.cabeceraUserReg, this.usuario, publicacion));
		this.cabeceraUserReg.getVl().removeAll();
		this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getDetalle());
		
	}
}