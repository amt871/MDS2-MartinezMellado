package interfaz;

import java.util.ArrayList;

import antlr.debug.Event;
import basededatos.Comentario;
import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaDenuncias_item;

public class Denuncias_item extends VistaDenuncias_item {

	private Comentario comentario;
	private Publicacion publicacion;
	private Usuario_Registrado usuario;
	private Cabecera__administrador_ cabecera;
	private MainView inicio;

	public Denuncias_item(Cabecera__administrador_ cabecera, MainView inicio, Comentario comentario, ArrayList<Comentario> ComDenuVist) {

		this.cabecera = cabecera;
		this.inicio = inicio;
		this.comentario = comentario;
		this.getImagen().setSrc("icons/video.png");
		this.getTexto().setText("Video de procedencia");
		this.getTextoDescripcion().setText("Comentario denuciado: " + this.comentario.getComentario());
		
		this.getbPosponer().addClickListener(event -> {
			this.setVisible(false);
			ComDenuVist.add(comentario);
		});
		
		this.getbAceptar().addClickListener(event -> {
			
		});
		
	}

	public Denuncias_item(Cabecera__administrador_ cabecera, MainView inicio, Publicacion publicacion, ArrayList<Publicacion> PubDenuVist) {

		this.cabecera = cabecera;
		this.inicio = inicio;
		this.publicacion = publicacion;
	}

	public Denuncias_item(Cabecera__administrador_ cabecera, MainView inicio, Usuario_Registrado usuario, ArrayList<Usuario_Registrado> UsrDenuVist) {

		this.cabecera = cabecera;
		this.inicio = inicio;
		this.usuario = usuario;
	}

//	public void vista_detalle__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ver_perfil__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void posponer_denuncia() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void rechazar_denuncia() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void aceptar_denuncia() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void ver_perfil_Bloqueado() {
//		throw new UnsupportedOperationException();
//	}

}