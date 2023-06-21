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
import vistas.VistaBusqueda_hastag__administrador_;

public class Busqueda_hastag__administrador_ extends VistaBusqueda_hastag__administrador_{
//	private Label _hashtagL;
//	private TextField _buscadorTF;
//	private Button _buscarUsuarioB;
//	private Button _buscarHashtagB;
//	public Busqueda__administrador_ _busqueda__administrador_;
//	public Resultado_busqueda_hastag _resultado_busqueda_hastag;
//	public void resultado_busqueda_hastag() {
//		throw new UnsupportedOperationException();
//	}
	
	private Cabecera__administrador_ cabecera;
	private Scroller scroller;
	private VerticalLayout content;
	private List<Hashtag> hashtags;
	private ArrayList<Resultado_busqueda_hastag_item> items;

	public Busqueda_hastag__administrador_(Cabecera__administrador_ cabecera, String value) {
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
						new Busqueda_usuarios__administrador_(this.getCabecera(), this.getTfIn().getValue()));
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

			items = new ArrayList<Resultado_busqueda_hastag_item>();

			for (Hashtag has : hashtags)
				items.add(new Resultado_busqueda_hastag_item(has, this.cabecera));
			for (int i = 0; i < items.size(); i++)
				this.content.add(items.get(i));

		}
	}


}