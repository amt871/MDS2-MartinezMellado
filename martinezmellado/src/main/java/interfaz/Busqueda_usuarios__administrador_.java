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

import basededatos.Usuario_Registrado;
import vistas.VistaBusqueda_usuarios__administrador_;

public class Busqueda_usuarios__administrador_ extends VistaBusqueda_usuarios__administrador_{
//	private TextField _buscadorTF;
//	private Button _busquedaUsuario;
//	private Button _busquedaHashtagB;
//	public Busqueda__administrador_ _busqueda__administrador_;
//	public Resultado_busqueda_usuarios _resultado_busqueda_usuarios;
//	
//	public void resultado_busqueda_usuarios() {
//		throw new UnsupportedOperationException();
//	}
	
	private Cabecera__administrador_ cabecera;
	private Scroller scroller;
	private VerticalLayout content;
	private List<Usuario_Registrado> usuarios;
	private ArrayList<Resultado_busqueda_usuarios_item> items;

	public Busqueda_usuarios__administrador_(Cabecera__administrador_ cabecera, String value) {
		// TODO Auto-generated constructor stub
		
		this.setCabecera(cabecera);
		this.cabecera = cabecera;
		this.scroller = this.getScroller();
		this.content = new VerticalLayout();
		
		this.scroller.setScrollDirection(ScrollDirection.VERTICAL);
		this.content.setWidth("100%");
		this.content.setHeight("100%");
		this.scroller.setContent(this.content);
		
		
		
		this.getbBuscarUsuario().addClickListener(event ->{
			
			if(this.getTfIn().isEmpty())
				Notification.show("Ningun usuario a buscar");
			else
				buscarUsuario(this.getTfIn().getValue());
			
		});
		
		this.getbBuscarHashtag().addClickListener(event ->{
			
			if(this.getTfIn().isEmpty())
				Notification.show("Ningun usuario a buscar");
			else {
				this.getCabecera().setBusquedaHashtag(new Busqueda_hastag__administrador_(this.getCabecera(), this.getTfIn().getValue()));
				this.getCabecera().getVl().removeAll();
				this.getCabecera().getVl().add(this.getCabecera().getBusquedaHashtag());
			}
		});
		
		buscarUsuario(value);
		
	}
	
	private void buscarUsuario(String user) {
		
		usuarios = this.cabecera.getDatos().buscarUsuarios(user);
		
		//System.out.println(user);
		//System.out.println(usuarios.size());
		
		this.content.removeAll();
		
		if(usuarios.isEmpty()) {
			
			this.content.setAlignItems(Alignment.CENTER);
			this.content.setJustifyContentMode(JustifyContentMode.CENTER);
			this.content.add(new Label("No hay usuarios"));
			
		}else {
			
			this.content.setAlignItems(null);
			this.content.setJustifyContentMode(JustifyContentMode.START);
			
			items = new ArrayList<Resultado_busqueda_usuarios_item>();
			
			for(Usuario_Registrado usu : usuarios)
				items.add(new Resultado_busqueda_usuarios_item(usu,this.cabecera));
			for(int i=0; i<items.size(); i++)
				this.content.add(items.get(i));
			
		}
			
			
		
	}


}