package interfaz;

import basededatos.Hashtag;
import basededatos.PublicacionSetCollection;
import vistas.VistaHashtag__usuario_registrado__item;

public class Hashtag__usuario_registrado__item extends VistaHashtag__usuario_registrado__item{
//	private Label _nombreHashTagL;
//	private Label _nVideosAsociadosL;
//	public Hashtag__usuario_registrado_ _hashtag__usuario_registrado_;
//	public Video_hashtag__usuario_registrado_ _video_hashtag__usuario_registrado_;
	
	private Mi_cabecera cabecera;
	private Hashtag hashtag;

	public Hashtag__usuario_registrado__item(Hashtag hashtag, Mi_cabecera cabecera) {
		// TODO Auto-generated constructor stub
		
		this.cabecera = cabecera;
		this.hashtag = hashtag;
		this.getbHashtag().setText(hashtag.getHashtag());
		this.getLabelVideos().setText("Publicaciones: "+hashtag.esta.size());
		//System.out.println(hashtag.esta.size());
		this.getStyle().set("width", "90%");
		
		this.getbHashtag().addClickListener(event ->{
			
			this.cabecera.setHashtags(new Video_hashtag__usuario_registrado_(this.hashtag, this.cabecera));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getHashtags());
			
		});
		
	}

}