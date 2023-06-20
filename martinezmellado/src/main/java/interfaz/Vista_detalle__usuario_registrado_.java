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
	private Cabecera_comercial cabeceraCom;
	private Usuario_Registrado miUsuario;

	public Vista_detalle__usuario_registrado_(Mi_cabecera cabeceraUserReg, Usuario_Registrado usuario, Publicacion publicacion) {
		// TODO Auto-generated constructor stub
		this.miUsuario = null;
		this.cabeceraUserReg = cabeceraUserReg;
		this.datos = cabeceraUserReg.getDatos();
		this.publicacion = publicacion;
		this.miUsuario = this.cabeceraUserReg.getDatos().cargarDatosUsuario(this.cabeceraUserReg.getUser().getUsuario());
		this.setCabecera(cabeceraUserReg);
		this.getImgUser().setSrc(publicacion.getRealizada().getFoto());
		this.getLabelDescripcion().setText(publicacion.getDescripcion());
		this.getLabelUsuario().setText(publicacion.getRealizada().getUsuario());
		this.getLabelFecha().setText(publicacion.getFecha().toString());
		this.getLabelUbi().setText(publicacion.getUbicacion());
		this.getLayoutVideo().add(new Video(publicacion.getVideo().replace("src/main/webapp/", ""),"90%", "90%"));
		this.getImgUser().addClickListener(event -> {
			verPerfilPropietario();
		});
		
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
		
		if(this.publicacion.tiene.toArray().length == 0) {
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Esta publicacion no tiene comentarios"));
		}else
			addItems();
		
		//this.getLabelDescripcion()
	}
	
	public Vista_detalle__usuario_registrado_(Cabecera_comercial cabeceraCom, Usuario_Registrado user,
			Publicacion publi) {
		// TODO Auto-generated constructor stub
		this.miUsuario = null;
		this.cabeceraCom = cabeceraCom;
		this.datos = cabeceraCom.getDatos();
		this.publicacion = publi;
		this.miUsuario = this.cabeceraCom.getDatos().cargarDatosUsuario(this.cabeceraCom.getUser().getUsuario());
		this.setCabeceraCom(cabeceraCom);
		this.getImgUser().setSrc(publicacion.getRealizada().getFoto());
		this.getLabelDescripcion().setText(publicacion.getDescripcion());
		this.getLabelUsuario().setText(publicacion.getRealizada().getUsuario());
		this.getLabelFecha().setText(publicacion.getFecha().toString());
		this.getLabelUbi().setText(publicacion.getUbicacion());
		this.getLayoutVideo().add(new Video(publicacion.getVideo().replace("src/main/webapp/", ""),"90%", "90%"));
		this.getImgUser().addClickListener(event -> {
			verPerfilPropietario();
		});
		
		this.getbAddComentario().addClickListener(event -> {
			boolean flag = false;
			for (Comentario comen : this.publicacion.tiene.toArray()) {
				if (comen.getAutor().equals(user.getUsuario())) {
					flag = true;
				}
			}
			if (this.datos.cargarComentario(this.getCabecera().getUser(), publicacion) != null) {
				Notification.show("Ya has comentado esta publicacion ateriormente");
			}else {
				if(addComentario()) {
					this.datos.annadirNotificacion("comentario", user, cabeceraCom.getUser(), publicacion);
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
		
		if(this.publicacion.tiene.toArray().length == 0) {
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Esta publicacion no tiene comentarios"));
		}else
			addItems();
	}

	private void addItems() {
		
		Comentario[] comentarios = this.publicacion.tiene.toArray();
		
		for(int i=0; i<comentarios.length; i++)
			if(this.cabeceraUserReg !=null)
				vl.add(new Comentario_item(comentarios[i], this.cabeceraUserReg));
			else
				vl.add(new Comentario_item(comentarios[i], this.cabeceraCom));
		
		
	}
	
	private boolean addComentario() {
		
		if(this.getFieldComentario().isEmpty())
			return false;
		
		return this.datos.annadirComentario(this.getCabecera().getUser().getUsuario(), publicacion, this.getFieldComentario().getValue());
		
		//return true;
		
	}
	
	private void verPerfilPropietario() {
		if (publicacion.getRealizada().getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			if (this.miUsuario.seguido.contains(publicacion.getRealizada())) {
				this.cabeceraUserReg
						.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, publicacion.getRealizada()));
				this.cabeceraUserReg.getVl().removeAll();
				this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getPerfilPublico());
			} else {
				this.cabeceraUserReg.setPerfilPrivado(
						new Ver_perfil_privado__usuario_registrado_(this.cabeceraUserReg, publicacion.getRealizada()));
				this.cabeceraUserReg.getVl().removeAll();
				this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			}
		} else {

			this.cabeceraUserReg
					.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, publicacion.getRealizada()));
			this.cabeceraUserReg.getVl().removeAll();
			this.cabeceraUserReg.getVl().add(this.cabeceraUserReg.getPerfilPublico());

		}
	}
}