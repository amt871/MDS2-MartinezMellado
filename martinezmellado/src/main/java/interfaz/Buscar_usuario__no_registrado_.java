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

import basededatos.Usuario_Registrado;
import vistas.VistaBuscar_usuario__no_registrado_;

public class Buscar_usuario__no_registrado_ extends VistaBuscar_usuario__no_registrado_ {
//	private TextField _buscadorTF;
//	private Button _buscarUsuarioB;
//	private Button _buscarHashtagB;
//	public Buscar__no_registrado_ _buscar__no_registrado_;
//	public Usuario__no_registrado_ _usuario__no_registrado_;
	//
//	public void usuario__no_registrado_() {
//		throw new UnsupportedOperationException();
//	}

	private Cabecera_usuario_no_registrado cabecera;
	private Scroller scroller;
	private VerticalLayout content;
	private List<Usuario_Registrado> usuarios;
	private ArrayList<Usuario__no_registrado__item> items;

	public Buscar_usuario__no_registrado_(Cabecera_usuario_no_registrado cabecera, String value) {
		// TODO Auto-generated constructor stub
		this.setCabecera(cabecera);
		this.cabecera = cabecera;
		this.scroller = this.getScroller();
		this.content = new VerticalLayout();

		this.scroller.setScrollDirection(ScrollDirection.VERTICAL);
		this.content.setWidth("100%");
		this.content.setHeight("100%");
		this.scroller.setContent(this.content);

		this.getbBuscarUsuario().addClickListener(event -> {

			if (this.getTfIn().isEmpty())
				Notification.show("Ningun usuario a buscar");
			else
				buscarUsuario(this.getTfIn().getValue());

		});

		this.getbBuscarHashtag().addClickListener(event -> {

			if (this.getTfIn().isEmpty())
				Notification.show("Ningun usuario a buscar");
			else {
				this.getCabecera().setBusquedaHashtag(
						new Buscar_hashtag__no_registrado_(this.getCabecera(), this.getTfIn().getValue()));
				this.getCabecera().getVl().removeAll();
				this.getCabecera().getVl().add(this.getCabecera().getBusquedaHashtag());
			}
		});

		buscarUsuario(value);

	}

	private void buscarUsuario(String user) {

		usuarios = this.cabecera.getDatos().buscarUsuarios(user);

		// System.out.println(user);
		// System.out.println(usuarios.size());

		this.content.removeAll();

		if (usuarios.isEmpty()) {

			this.content.setAlignItems(Alignment.CENTER);
			this.content.setJustifyContentMode(JustifyContentMode.CENTER);
			this.content.add(new Label("No hay usuarios"));

		} else {

			if (usuarios.size() == 1 && usuarios.get(0).getEs_bloqueado() != null) {
				this.content.setAlignItems(Alignment.CENTER);
				this.content.setJustifyContentMode(JustifyContentMode.CENTER);
				this.content.add(new Label("No hay usuarios"));
				return;
			}
			this.content.setAlignItems(null);
			this.content.setJustifyContentMode(JustifyContentMode.START);

			items = new ArrayList<Usuario__no_registrado__item>();

			for (Usuario_Registrado usu : usuarios) {
				if (usu.getEs_bloqueado() != null) {
					continue;
				}
				items.add(new Usuario__no_registrado__item(usu, this.cabecera));
			}
			for (int i = 0; i < items.size(); i++)
				this.content.add(items.get(i));

		}

	}

}