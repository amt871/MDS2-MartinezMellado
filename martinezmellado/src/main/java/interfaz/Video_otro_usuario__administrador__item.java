package interfaz;

import basededatos.Publicacion;
import basededatos.Usuario_Registrado;

import vistas.VistaVideo_otro_usuario__administrador__item;

public class Video_otro_usuario__administrador__item extends VistaVideo_otro_usuario__administrador__item {
//	private Button _eliminar_publicacion;
//	private Video _videoV;
//	private ImageIcon _fotoPropietarioVideoII;
//	private Label _nombrePropietarioVideoL;
//	private Label _fechaPublicaconL;
//	private Label _ubicacionL;
//	private Label _descripcionPublicacionL;
//	private Label _meGustasL;
//	private ImageIcon _imagenMeGustasII;
//	private Label _nComnetariosL;
//	private ImageIcon _imagenNComentariosII;
//	public Video_otro_usuario__administrador_ _video_otro_usuario__administrador_;
//	public Ver_me_gustas__administrador_ _ver_me_gustas__administrador_;
//	public Vista_detalle__administrador_ _vista_detalle__administrador_;
//	public Ver_perfil__administrador_ _ver_perfil__administrador_;
//	public Ver_perfil__administrador_ _unnamed_Ver_perfil__administrador__;
//
//	public void eliminar_publicacion() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ver_me_gustas__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void vista_detalle__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ver_perfil__administrador_() {
//		throw new UnsupportedOperationException();
//	}
	

	private Cabecera__administrador_ cabecera;
	private Publicacion publi;
	private Usuario_Registrado propietario;
	
	public Video_otro_usuario__administrador__item(Cabecera__administrador_ cabecera, Publicacion publicacion) {
		// TODO Auto-generated constructor stub
		this.cabecera = cabecera;
		this.publi = publicacion;
		this.propietario = publi.getRealizada();
		
		this.getImage().addClickListener(e ->{
			
			verPerfilOtroUsuarioAdmin();
			
		});
		
		this.getbComentarios().addClickListener(e ->{
			
			this.cabecera.setDetalle(new Vista_detalle__administrador_(this.cabecera, this.publi));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getDetalle());
			
		});
		
		this.getbEliminar().addClickListener(even ->{
			this.cabecera.getDatos().eliminarPublicaion(publicacion);
			this.setVisible(false);
		});
		
	}
	
	private void verPerfilOtroUsuarioAdmin() {


			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			
				this.cabecera.setPerfil(
						new Ver_perfil__administrador_(this.cabecera, this.propietario));
				this.cabecera.getVl().removeAll();
				this.cabecera.getVl().add(this.cabecera.getPerfil());
				// this.inicio.cambiarPantalla(cabecera);
			

	}
}