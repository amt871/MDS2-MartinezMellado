package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

import basededatos.Comentario;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaVista_detalle__no_registrado_;

public class Vista_detalle__no_registrado_ extends VistaVista_detalle__no_registrado_ {
//	private Button _volver;
//	private ImageButton _imagenPropietarioIB;
//	private Label _nombrePropietarioL;
//	private Label _fechaPublicacionL;
//	private Label _ubicacionL;
//	private Label _comentariosL;
//	private Label _meGustasL;
//	private ImageIcon _imagenMeGustasII;
//	public Inicio_no_registrado_item _inicio_no_registrado;
//	public Videos_hashtag__no_registrado__item _videos_hashtag__no_registrado_;
//	public Ver_Perfil__no_registrado_ _ver_perfil__no_registrado_;
//	public Comentario__no_registrado_ _comentario__no_registrado_;
//	public void ver_perfil__no_registrado_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volver() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void comentario__no_registrado_() {
//		throw new UnsupportedOperationException();
//	}
	
	private VerticalLayout vl;
	private Scroller scroller;
	private Publicacion publicacion;
	private Cabecera_usuario_no_registrado cabecera;
	private Usuario_Registrado propietario;

	public Vista_detalle__no_registrado_(Cabecera_usuario_no_registrado cabeceraNoReg, Publicacion publi) {
		// TODO Auto-generated constructor stub
		
		this.propietario = publi.getRealizada();
		this.cabecera = cabeceraNoReg;
		this.setCabecera(cabeceraNoReg);
		this.getLabelFecha().setText(publi.getFecha().toString());
		this.getLabelUbicacion().setText(publi.getUbicacion());
		this.getLabelUsuario().setText(publi.getRealizada().getUsuario());
		this.getImage().setSrc(publi.getRealizada().getFoto());
		this.getVlVideo().add(new Video(publi.getVideo().replace("src/main/webapp/", ""),"90%","90%"));
		
		this.getImage().addClickListener(event ->{
			
			verPerfilOtroUsuarioNoReg();
			
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
				vl.add(new Comentario_item(comentarios[i], this.cabecera));
		
		
	}
	
	private void verPerfilOtroUsuarioNoReg() {

		if (this.propietario.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			
				this.cabecera.setPerfilPrivado(
						new Ver_perfil_privado__usuario_no_registrado_(this.cabecera, this.propietario));
				this.cabecera.getVl().removeAll();
				this.cabecera.getVl().add(this.cabecera.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			
		} else {

			this.cabecera
					.setPerfilPublico(new Ver_perfil__usuario_no_registrado_(this.cabecera, this.propietario));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getPerfilPublico());

		}
	}
}