package interfaz;

import java.time.LocalDate;
import java.util.ArrayList;

import com.vaadin.flow.component.notification.Notification;

import antlr.debug.Event;
import basededatos.Comentario;
import basededatos.Denuncia_Archivada;
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

	public Denuncias_item(Denuncia_Archivada denuncia) {
		this.getbAceptar().setVisible(false);
		this.getbPosponer().setVisible(false);
		this.getbRechazar().setVisible(false);
		this.getImagen().setVisible(false);
		this.getTexto().setVisible(false);
		this.getTextoDescripcion().setText(denuncia.getTipo());
	}

	public Denuncias_item(Cabecera__administrador_ cabecera, MainView inicio, Comentario comentario) {

		this.cabecera = cabecera;
		this.inicio = inicio;
		this.comentario = comentario;
		this.publicacion = this.cabecera.getDatos().cargarVideoPoID(Integer.valueOf(this.comentario.getPublicacion()));
		this.getImagen().setSrc("icons/video.png");
		this.getTexto().setText("Video de procedencia");
		this.getTextoDescripcion().setText("Comentario denuciado: " + this.comentario.getComentario());

		this.getbPosponer().addClickListener(event -> {
			bPosponerC();
		});

		this.getbAceptar().addClickListener(event -> {
			bAceptarC();
		});

		this.getbRechazar().addClickListener(event -> {
			bRechazaC();
		});
		
		this.getImagen().addClickListener(event -> {
			verPublicacion();
		});

	}

	public Denuncias_item(Cabecera__administrador_ cabecera, MainView inicio, Publicacion publicacion) {

		this.cabecera = cabecera;
		this.inicio = inicio;
		this.publicacion = publicacion;

		this.getImagen().setSrc("icons/video.png");
		this.getTexto().setText("Publicacion denunciada");
		this.getTextoDescripcion().setText(
				"La publicacion denunciada pertene al usuario : " + this.publicacion.getRealizada().getUsuario());

		this.getbPosponer().addClickListener(event -> {
			bPosponerP();
		});

		this.getbAceptar().addClickListener(event -> {
			bAceptarP();
		});

		this.getbRechazar().addClickListener(event -> {
			bRechazaP();
		});
		
		this.getImagen().addClickListener(event -> {
			verPublicacion();
		});
	}

	public Denuncias_item(Cabecera__administrador_ cabecera, MainView inicio, Usuario_Registrado usuario) {

		this.cabecera = cabecera;
		this.inicio = inicio;
		this.usuario = usuario;

		this.getImagen().setSrc(this.usuario.getFoto());
		this.getTexto().setText(this.usuario.getUsuario());
		this.getTextoDescripcion().setText("El usuario : " + this.usuario.getUsuario()
				+ " ha sido denunciado un total de " + this.usuario.denunciante.size() + " veces");

		this.getbPosponer().addClickListener(event -> {
			bPosponerU();
		});

		this.getbAceptar().addClickListener(event -> {
			bAceptarU();
		});

		this.getbRechazar().addClickListener(event -> {
			bRechazaU();
		});
		
		this.getImagen().addClickListener(envet -> {
			verPerfilAdministrador();
		});
	}

	public void bPosponerC() {
		this.setVisible(false);
		if (!this.cabecera.getComDenuVist().contains(comentario)) {
			this.cabecera.getComDenuVist().add(comentario);
		}
	}

	public void bAceptarC() {
		this.cabecera.getDatos().retirarDenunciaComentario(comentario);
		String texto = "El comentario : " + this.comentario.getComentario() + ". Publicado por el usuario: "
				+ this.comentario.getEs_publicado().getUsuario() + " ha sido borrado a fecha de "
				+ LocalDate.now().toString() + "por " + this.cabecera.getAdministardor().getUsuario() + ".";
		this.cabecera.getDatos().archivarDenuncia(String.valueOf(this.comentario.getID()), texto,
				this.cabecera.getAdministardor());
		this.cabecera.getDatos().eliminarComentario(comentario);
		Notification.show("Denuncia procesada");
		this.setVisible(false);
		this.cabecera.getComDenuVist().remove(comentario);

	}
	
	public void bRechazaC() {
		this.cabecera.getDatos().retirarDenunciaComentario(comentario);
		Notification.show("Denuncia rechazada");
		this.setVisible(false);
		this.cabecera.getComDenuVist().remove(comentario);
	}
	
	public void bPosponerP() {
		this.setVisible(false);
		if (!this.cabecera.getPubDenuVist().contains(this.publicacion)) {
			this.cabecera.getPubDenuVist().add(this.publicacion);
		}
	}
	
	public void bAceptarP() {
		this.cabecera.getDatos().retirarDenunciaPublicacion(publicacion);
		String texto = "La publicacion con descripcion: " + this.publicacion.getDescripcion()
				+ ". Publicado por el usuario: " + this.publicacion.getRealizada().getUsuario()
				+ " ha sido borrada a fecha de " + LocalDate.now().toString() + "por "
				+ this.cabecera.getAdministardor().getUsuario() + ".";
		this.cabecera.getDatos().archivarDenuncia(String.valueOf(this.publicacion.getID()), texto,
				this.cabecera.getAdministardor());
		this.cabecera.getDatos().eliminarPublicaion(publicacion);
		Notification.show("Denuncia procesada");
		this.setVisible(false);
		this.cabecera.getPubDenuVist().remove(publicacion);

	}
	
	public void bRechazaP() {
		this.cabecera.getDatos().retirarDenunciaPublicacion(this.publicacion);
		Notification.show("Denuncia rechazada");
		this.setVisible(false);
		this.cabecera.getPubDenuVist().remove(this.publicacion);
	}
	
	public void bPosponerU() {
		this.setVisible(false);
		if (!this.cabecera.getUsrDenuVist().contains(usuario)) {
			this.cabecera.getUsrDenuVist().add(usuario);
		}
	}
	
	public void bAceptarU() {
		this.cabecera.getDatos().retirarDenunciaUsuario(usuario);
		String texto = "El usuario: " + this.usuario.getUsuario() + ". Acumulando en su contra: "
				+ this.usuario.denunciante.size() + " denuncias, por lo que ha sido bloqueado a fecha de "
				+ LocalDate.now().toString() + " por " + this.cabecera.getAdministardor().getUsuario() + ".";
		this.cabecera.getDatos().archivarDenuncia(String.valueOf(this.usuario.getID()), texto,
				this.cabecera.getAdministardor());
		this.cabecera.getDatos().bloquearUsuario(usuario, this.cabecera.getAdministardor());
		Notification.show("Denuncia procesada");
		this.setVisible(false);
		this.cabecera.getUsrDenuVist().remove(this.usuario);
	}
	
	public void bRechazaU() {
		this.cabecera.getDatos().retirarDenunciaUsuario(this.usuario);
		Notification.show("Denuncia rechazada");
		this.setVisible(false);
		this.cabecera.getUsrDenuVist().remove(this.usuario);
	}
	
	public void verPerfilAdministrador() {
		this.cabecera.setPerfil(
				new Ver_perfil__administrador_(this.cabecera, this.usuario));
		this.cabecera.getVl().removeAll();
		this.cabecera.getVl().add(this.cabecera.getPerfil());
	}
	
	public void verPublicacion() {
		this.cabecera.setDetalle(new Vista_detalle__administrador_(this.cabecera, this.publicacion));
		this.cabecera.getVl().removeAll();
		this.cabecera.getVl().add(this.cabecera.getDetalle());
	}
}