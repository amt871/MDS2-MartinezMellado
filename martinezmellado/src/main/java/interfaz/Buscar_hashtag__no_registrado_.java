package interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

import basededatos.Hashtag;
import vistas.VistaBuscar_hashtag__no_registrado_;

public class Buscar_hashtag__no_registrado_ extends VistaBuscar_hashtag__no_registrado_{
	
	private Cabecera_usuario_no_registrado cabecera;
	private Scroller scroller;
	private VerticalLayout content;
	private List<Hashtag> hashtags;
	private ArrayList<Hashtag__no_registrado__item> items;

	public Buscar_hashtag__no_registrado_(Cabecera_usuario_no_registrado cabecera, String value) {
		// TODO Auto-generated constructor stub
		
		this.scroller = this.getScroller();
		this.content = new VerticalLayout();
		
		this.cabecera = cabecera;
		
		this.setCabecera(cabecera);

		this.scroller.setScrollDirection(ScrollDirection.VERTICAL);
		this.content.setWidth("100%");
		this.content.setHeight("100%");
		this.scroller.setContent(this.content);

		this.getbBuscarUsuario().addClickListener(event -> {

			if (this.getTfIn().isEmpty())
				Notification.show("Ningun usuario a buscar");
			else {
				this.getCabecera().setBusquedaUsuarios(
						new Buscar_usuario__no_registrado_(this.getCabecera(), this.getTfIn().getValue()));
				this.getCabecera().getVl().removeAll();
				this.getCabecera().getVl().add(this.getCabecera().getBusquedaUsuarios());
			}
		});

		this.getbBuscarHashtag().addClickListener(event -> {

			if (this.getTfIn().isEmpty())
				Notification.show("Ningun hashtag a buscar");
			else
				buscarHashtag(this.getTfIn().getValue());

		});

		buscarHashtag(value);

	}

	private void buscarHashtag(String hashtag) {
		// TODO Auto-generated method stub
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

			items = new ArrayList<Hashtag__no_registrado__item>();

			for (Hashtag has : hashtags)
				items.add(new Hashtag__no_registrado__item(has, this.cabecera));
			for (int i = 0; i < items.size(); i++)
				this.content.add(items.get(i));

		}
	}
//	}
}