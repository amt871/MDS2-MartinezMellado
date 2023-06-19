package interfaz;

import basededatos.Hashtag;
import basededatos.PublicacionSetCollection;
import vistas.VistaHashtag__usuario_registrado__item;

public class Hashtag__usuario_registrado__item extends VistaHashtag__usuario_registrado__item{
//	private Label _nombreHashTagL;
//	private Label _nVideosAsociadosL;
//	public Hashtag__usuario_registrado_ _hashtag__usuario_registrado_;
//	public Video_hashtag__usuario_registrado_ _video_hashtag__usuario_registrado_;

	public Hashtag__usuario_registrado__item(Hashtag hashtag, Mi_cabecera cabecera) {
		// TODO Auto-generated constructor stub
		
		this.getbHashtag().setText(hashtag.getHashtag());
		this.getLabelVideos().setText("Publicaciones: "+hashtag.esta.size());
		System.out.println(hashtag.esta.size());
		this.getStyle().set("width", "90%");
		
		this.getbHashtag().addClickListener(event ->{
			
			
			
		});
		
	}

}