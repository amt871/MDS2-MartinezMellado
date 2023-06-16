package interfaz;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

import basededatos.BDPrincipal;
import basededatos.Comentario;
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
	
	private Scroller scroller;
	private VerticalLayout vl;
	private BDPrincipal datos;
	private Publicacion publicacion;
	private Mi_cabecera cabeceraUserReg;
	
	public Vista_detalle__usuario_registrado_(Mi_cabecera cabeceraUserReg) {
		// TODO Auto-generated constructor stub
		this.setCabecera(cabeceraUserReg);
	}

	public Vista_detalle__usuario_registrado_(Mi_cabecera cabeceraUserReg, Usuario_Registrado usuario, Publicacion publicacion) {
		// TODO Auto-generated constructor stub
		this.cabeceraUserReg = cabeceraUserReg;
		this.datos = cabeceraUserReg.getDatos();
		this.publicacion = publicacion;
		this.setCabecera(cabeceraUserReg);
		this.getImgUser().setSrc(usuario.getFoto());
		this.getLabelDescripcion().setText(publicacion.getDescripcion());
		this.getLabelUsuario().setText(publicacion.getRealizada().getUsuario());
		this.getLabelFecha().setText(publicacion.getFecha().toString());
		this.getLabelUbi().setText(publicacion.getUbicacion());
		this.getLayoutVideo().add(new Video(publicacion.getVideo().replace("src/main/webapp/", ""),"90%", "90%"));
		
		this.getbAddComentario().addClickListener(event -> {
			if (this.datos.cargarComentario(this.getCabecera().getUser(), publicacion) != null) {
				Notification.show("Ya has comentado esta publicacion ateriormente");
			}else {
				if(addComentario()) {
					this.datos.annadirNotificacion("comentario", usuario, cabeceraUserReg.getUser(), publicacion);
					this.vl.removeAll();
					addItems();
				}
				this.getFieldComentario().clear();
			}
			
		});
		
		this.vl = new VerticalLayout();
		
		scroller = this.getScroller();
		
		scroller.setScrollDirection(ScrollDirection.VERTICAL);
		scroller.setContent(vl);
		vl.setHeight("100%");
		vl.setWidth("100%");
		vl.setAlignItems(Alignment.CENTER);
		//vl.setJustifyContentMode(JustifyContentMode.CENTER);
		
		if(this.datos.cargarComentariosPublicacion(publicacion).length == 0) {
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Esta publicacion no tiene comentarios"));
		}else
			addItems();
		
		//this.getLabelDescripcion()
	}
	
	private void addItems() {
		
		Comentario[] comentarios = this.datos.cargarComentariosPublicacion(publicacion);
		
		for(int i=0; i<comentarios.length; i++)
		vl.add(new Comentario_item(comentarios[i], this.cabeceraUserReg));
		
		
	}
	
	private boolean addComentario() {
		
		if(this.getFieldComentario().isEmpty())
			return false;
		
		return this.datos.annadirComentario(this.getCabecera().getUser().getUsuario(), publicacion, this.getFieldComentario().getValue());
		
		//return true;
		
	}
}