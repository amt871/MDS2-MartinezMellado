package interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

import basededatos.Hashtag;
import basededatos.Usuario_Registrado;
import vistas.VistaBuscar_hashtag__usuario_registrado_;

public class Buscar_hashtag__usuario_registrado_ extends VistaBuscar_hashtag__usuario_registrado_ {
//	private TextField _buscadorTF;
//	private Button _buscarUsuarioB;
//	private Button _buscarHashTagB;
//	public Buscar__usuario_registrado_ _buscar__usuario_registrado_;
//	public Hashtag__usuario_registrado_ _hashtag__usuario_registrado_;
//
//	public void hashtag__usuario_registrado_() {
//		throw new UnsupportedOperationException();
//	}

	private Mi_cabecera cabecera;
	private Scroller scroller;
	private VerticalLayout content;
	private List<Hashtag> hashtags;
	private ArrayList<Hashtag__usuario_registrado__item> items;
	

	public Buscar_hashtag__usuario_registrado_(Mi_cabecera cabecera, String hashtag) {

		this.cabecera = cabecera;
		this.setCabecera(cabecera);

		this.scroller = this.getScroller();
		this.content = new VerticalLayout();

		this.scroller.setScrollDirection(ScrollDirection.VERTICAL);
		this.content.setWidth("100%");
		this.content.setHeight("100%");
		this.scroller.setContent(this.content);

		this.getbBuscarUsuario().addClickListener(event -> {

			if (this.getTfBusqueda().isEmpty())
				Notification.show("Ningun usuario a buscar");
			else {
				this.getCabecera().setBusquedaUsuarios(
						new Buscar_usuario__usuario_registrado_(this.getCabecera(), this.getTfBusqueda().getValue()));
				this.getCabecera().getVl().removeAll();
				this.getCabecera().getVl().add(this.getCabecera().getBusquedaUsuarios());
			}
		});

		this.getbBuscarHashtag().addClickListener(event -> {

			if (this.getTfBusqueda().isEmpty())
				Notification.show("Ningun hashtag a buscar");
			else
				buscarHashtag(this.getTfBusqueda().getValue());

		});

		buscarHashtag(hashtag);

	}

	private void buscarHashtag(String hashtag) {
		// TODO Auto-generated method stub
		if(!hashtag.startsWith("#"))
			hashtag = "#"+hashtag;
		hashtags = this.cabecera.getDatos().buscarHashTag(hashtag);

		// System.out.println(user);
		// System.out.println(usuarios.size());

		this.content.removeAll();

		if (hashtags.isEmpty()) {

			this.content.setAlignItems(Alignment.CENTER);
			this.content.setJustifyContentMode(JustifyContentMode.CENTER);
			this.content.add(new Label("No hay hashtags"));

		} else {

			this.content.setAlignItems(null);
			this.content.setJustifyContentMode(JustifyContentMode.START);

			items = new ArrayList<Hashtag__usuario_registrado__item>();

			for (Hashtag has : hashtags)
				items.add(new Hashtag__usuario_registrado__item(has, this.cabecera));
			for (int i = 0; i < items.size(); i++)
				this.content.add(items.get(i));

		}
	}
	
	private void clear() {
		
		if(this.hashtags!=null)
			this.hashtags.clear();
		if(this.items!=null)
			this.items.clear();
		this.hashtags=null;
		this.items=null;
		
	}
}