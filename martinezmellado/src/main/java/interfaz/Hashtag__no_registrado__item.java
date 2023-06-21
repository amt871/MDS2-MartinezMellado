package interfaz;

import basededatos.Hashtag;
import vistas.VistaHashtag__no_registrado__item;

public class Hashtag__no_registrado__item extends VistaHashtag__no_registrado__item{

	private Cabecera_usuario_no_registrado cabecera;
	private Hashtag hashtag;
	
	public Hashtag__no_registrado__item(Hashtag has, Cabecera_usuario_no_registrado cabecera) {
		// TODO Auto-generated constructor stub
		
		this.cabecera = cabecera;
		this.hashtag = has;
		this.getbHashtag().setText(hashtag.getHashtag());
		this.getLabelVideos().setText("Publicaciones: "+hashtag.esta.size());
		//System.out.println(hashtag.esta.size());
		this.getStyle().set("width", "90%");
		
		this.getbHashtag().addClickListener(event ->{
			
			this.cabecera.setHashtags(new Videos_hashtag__no_registrado_(this.hashtag, this.cabecera));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getHashtags());
			
		});
	}

}