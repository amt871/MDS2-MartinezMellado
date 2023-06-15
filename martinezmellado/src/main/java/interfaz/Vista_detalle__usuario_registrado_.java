package interfaz;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaVista_detalle__usuario_registrado_;

public class Vista_detalle__usuario_registrado_ extends VistaVista_detalle__usuario_registrado_{
//	private Button _volver__usuario_registrado_;
//	private ImageButton _imagenPropietarioVideoIB;
//	private Label _nombrePropietarioVideoL;
//	private Label _fechaPublicacionL;
//	private Label _ubicacionL;
//	private Button _anadirComentarioB;
//	public Video_otro_usuario_item _video_otro_usuario;
//	public Video_hashtag__usuario_registrado__item _video_hashtag__usuario_registrado_;
//	public Comentario__usuario_registrado_ _comentario__usuario_registrado_;
//	public Escribir_comentario _escribir_comentario;

//	public Vista_detalle__usuario_registrado_(Mi_cabecera cabeceraUserReg) {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void comentario__usuario_registrado_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void escribir_comentario() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volver__usuario_registrado_() {
//		throw new UnsupportedOperationException();
//	}
	
	public Vista_detalle__usuario_registrado_(Mi_cabecera cabeceraUserReg) {
		// TODO Auto-generated constructor stub
		this.setCabecera(cabeceraUserReg);
	}

	public Vista_detalle__usuario_registrado_(Mi_cabecera cabeceraUserReg, Usuario_Registrado usuario, Publicacion publicacion) {
		// TODO Auto-generated constructor stub
		this.setCabecera(cabeceraUserReg);
		this.getImgUser().setSrc(usuario.getFoto());
		this.getDivVideo().add(new Video(publicacion.getVideo().replace("src/main/webapp/", ""),"90%", "90%"));
		//this.getLabelDescripcion()
	}
}