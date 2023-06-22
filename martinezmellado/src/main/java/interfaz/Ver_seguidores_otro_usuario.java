package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

import basededatos.Comentario;
import basededatos.Usuario_Registrado;
import vistas.VistaVer_seguidores_otro_usuario;

public class Ver_seguidores_otro_usuario extends VistaVer_seguidores_otro_usuario{
	
	private Mi_cabecera cabecera;
	private Usuario_Registrado usuario;
	private Scroller scroller;
	private VerticalLayout vl;
	private Cabecera_usuario_no_registrado cabeceraNoReg;

	public Ver_seguidores_otro_usuario(Mi_cabecera cabecera, Usuario_Registrado usuario) {
		// TODO Auto-generated constructor stub
		
		this.cabecera = cabecera;
		this.usuario = usuario;
		
		this.getImage().setSrc(usuario.getFoto());
		
		this.getImage().addClickListener(e->{
			
			verPerfilPropietario();
			
		});
		
		this.setCabeceraReg(cabecera);
		
		this.vl = new VerticalLayout();

		scroller = this.getScroller();

		scroller.setScrollDirection(ScrollDirection.VERTICAL);
		scroller.setContent(vl);
		vl.setHeight("100%");
		vl.setWidth("100%");
		vl.setAlignItems(Alignment.CENTER);
		// vl.setJustifyContentMode(JustifyContentMode.CENTER);

		if (this.usuario.seguidor.size() == 0) {
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Este usuario no tiene seguidores"));
		} else
			addItems();
	}

	public Ver_seguidores_otro_usuario(Cabecera_usuario_no_registrado cabecera2, Usuario_Registrado usuario2) {
		// TODO Auto-generated constructor stub
		this.cabeceraNoReg = cabecera2;
		this.usuario = usuario2;
		
		this.getImage().setSrc(usuario.getFoto());
		
		this.getImage().addClickListener(e->{
			
			verPerfilPropietarioNoReg();
			
		});
		
		this.setCabeceraNoReg(cabeceraNoReg);
		
		this.vl = new VerticalLayout();

		scroller = this.getScroller();

		scroller.setScrollDirection(ScrollDirection.VERTICAL);
		scroller.setContent(vl);
		vl.setHeight("100%");
		vl.setWidth("100%");
		vl.setAlignItems(Alignment.CENTER);
		// vl.setJustifyContentMode(JustifyContentMode.CENTER);

		if (this.usuario.seguidor.size() == 0) {
			vl.setJustifyContentMode(JustifyContentMode.CENTER);
			vl.add(new Label("Este usuario no tiene seguidores"));
		} else
			addItems();
	}

	private void addItems() {

		//Comentario[] comentarios = this.publicacion.tiene.toArray();

		for (int i = 0; i < this.usuario.seguidor.toArray().length; i++)
			if (this.cabecera != null)
				vl.add(new Ver_seguidores_otro_usuario_item(this.usuario.seguidor.toArray()[i], this.cabecera));
			else
				vl.add(new Ver_seguidores_otro_usuario_item(this.usuario.seguidor.toArray()[i], this.cabeceraNoReg));

	}
	
	private void verPerfilPropietario() {
		if (this.usuario.getID() == this.cabecera.getUser().getID()) {
				if(cabecera != null) 
					this.cabecera.setPerfil(new Mi_perfil(this.cabecera.getVl(), cabecera));
					this.cabecera.getVl().removeAll();
					this.cabecera.getVl().add(this.cabecera.getPerfil());
		}else if (this.usuario.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			if (this.cabecera.getUser().seguido.contains(this.usuario)) {
				this.cabecera
						.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabecera, this.usuario));
				this.cabecera.getVl().removeAll();
				this.cabecera.getVl().add(this.cabecera.getPerfilPublico());
			} else {
				this.cabecera.setPerfilPrivado(
						new Ver_perfil_privado__usuario_registrado_(this.cabecera, this.usuario));
				this.cabecera.getVl().removeAll();
				this.cabecera.getVl().add(this.cabecera.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			}
		} else {

			this.cabecera
					.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabecera, this.usuario));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getPerfilPublico());

		}
	}
	
	private void verPerfilPropietarioNoReg() {

		if (this.usuario.getPrivado()) {

			// System.out.println(miUsuario.getUsuario());

			// Notification.show("Aun no implementado");
			
				this.cabeceraNoReg.setPerfilPrivado(
						new Ver_perfil_privado__usuario_no_registrado_(this.cabeceraNoReg, this.usuario));
				this.cabeceraNoReg.getVl().removeAll();
				this.cabeceraNoReg.getVl().add(this.cabeceraNoReg.getPerfilPrivado());
				// this.inicio.cambiarPantalla(cabecera);
			
		} else {

			this.cabeceraNoReg
					.setPerfilPublico(new Ver_perfil__usuario_no_registrado_(this.cabeceraNoReg, this.usuario));
			this.cabeceraNoReg.getVl().removeAll();
			this.cabeceraNoReg.getVl().add(this.cabeceraNoReg.getPerfilPublico());

		}

	}
	
	

}
