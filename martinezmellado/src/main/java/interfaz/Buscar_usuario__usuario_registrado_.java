package interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import basededatos.Usuario_Registrado;

import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

import vistas.VistaBuscar_usuario__usuario_registrado_;

public class Buscar_usuario__usuario_registrado_ extends VistaBuscar_usuario__usuario_registrado_ {
//	public Buscar__usuario_registrado_ _buscar__usuario_registrado_;
//	public Usuario__usuario_registrado_ _usuario__usuario_registrado_;
//
//	public void usuario__usuario_registrado_() {
//		throw new UnsupportedOperationException();
//	}
	
	private Scroller scroller;
	private VerticalLayout content;
	private Mi_cabecera cabecera;
	private List<Usuario_Registrado> usuarios;
	private ArrayList<Usuario__usuario_registrado__item> items;
	
	
	public Buscar_usuario__usuario_registrado_(Mi_cabecera cabecera, String user) {
		
		this.setCabecera(cabecera);
		this.cabecera = cabecera;
		this.scroller = this.getScroller();
		this.content = new VerticalLayout();
		
		this.scroller.setScrollDirection(ScrollDirection.VERTICAL);
		this.content.setWidth("100%");
		this.content.setHeight("100%");
		this.scroller.setContent(this.content);
		
		buscarUsuario(user);
		
		this.getbBuscarUsuario().addClickListener(event ->{
			
			buscarUsuario(this.getTfIn().getValue());
			
		});
		
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
			
			items = new ArrayList<Usuario__usuario_registrado__item>();
			
			for(Usuario_Registrado usu : usuarios)
				items.add(new Usuario__usuario_registrado__item(usu,this.cabecera));
			for(int i=0; i<items.size(); i++)
				this.content.add(items.get(i));
			
		}
			
			
		
	}
	
	public void clear() {
		if(this.usuarios != null)
			this.usuarios.clear();
		if(this.items != null)
			this.items.clear();
		
		this.usuarios = null;
		this.items = null;
		
	}
	
}