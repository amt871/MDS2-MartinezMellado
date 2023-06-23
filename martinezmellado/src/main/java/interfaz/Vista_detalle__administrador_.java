package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

import basededatos.Comentario;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaVista_detalle__administrador_;

public class Vista_detalle__administrador_ extends VistaVista_detalle__administrador_ {
//	private Button _borrar_comentario;
//	private Button _eliminar_publicacion;
//	private Button _volver__administrador_;
//	private Video _videoV;
//	private ImagenIcon _fotoPropietarioVideoII;
//	private Label _nombrePropietarioVideoL;
//	private Label _fechaPublicacionL;
//	private Label _ubicacionL;
//	private Label _descripcionPublicacionL;
//	private Label _nMeGustasL;
//	private ImageIcon _imagenMeGustasII;
//	public Ver_perfil__administrador_ _ver_perfil__administrador_;
//	public Video_otro_usuario__administrador__item _video_otro_usuario__administrador_;
//	public Denuncias_item _denuncias;
//	public Busqueda__administrador_ _busqueda__administrador_;
//	public Publicaciones_asociadas_a_un_hastag_item _publicaciones_asociadas_a_un_hastag;
//	public Comentario__administrador_ _comentario__administrador_;
//	public Ver_perfil__administrador_ _unnamed_Ver_perfil__administrador__;
//
//	public void borrar_comentario() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void eliminar_publicacion() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ver_perfil__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volver__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void comentario__administrador_() {
//		throw new UnsupportedOperationException();
//	}

	private Scroller scroller;
	private Publicacion publicacion;
	private Cabecera__administrador_ cabecera;
	private Usuario_Registrado propietario;
	private VerticalLayout vl;
	
	public Vista_detalle__administrador_(Cabecera__administrador_ cabeceraAdmin, Publicacion publi) {
		// TODO Auto-generated constructor stub
		this.propietario = publi.getRealizada();
		this.cabecera = cabeceraAdmin;
		this.setCabecera(cabeceraAdmin);
		this.getLabelFecha().setText(publi.getFecha().toString());
		this.getLabelUbi().setText(publi.getUbicacion());
		this.getLabelUsuario().setText(publi.getRealizada().getUsuario());
		this.getImage().setSrc(publi.getRealizada().getFoto());
		this.getLabelMeGustas().setText(String.valueOf(publi.le_gusta.size()));
		this.getLabelDescripcion().setText(publi.getDescripcion());
		this.getLayoutVideo().add(new Video(publi.getVideo().replace("src/main/webapp/", ""),"90%","90%"));
		
		this.getImage().addClickListener(event ->{
			
			verPerfilOtroUsuarioAdmin();
			
		});
		
		this.publicacion = publi;
		this.vl = new VerticalLayout();
		
		scroller = this.getScroller();
		
		scroller.setScrollDirection(ScrollDirection.VERTICAL);
		scroller.setContent(vl);
		vl.setHeight("100%");
		vl.setWidth("100%");
		vl.setAlignItems(Alignment.CENTER);
		//vl.setJustifyContentMode(JustifyContentMode.CENTER);
		
		if(publi.tiene.toArray().length == 0) {
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Esta publicacion no tiene comentarios"));
		}else
			addItems();
	}

	private void addItems() {
		
		Comentario[] comentarios = this.publicacion.tiene.toArray();
		
		for(int i=0; i<comentarios.length; i++)
				vl.add(new Comentario__administrador__item(comentarios[i], this.cabecera));
		
		
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