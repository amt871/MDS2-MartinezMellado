package interfaz;

import basededatos.Hashtag;
import vistas.VistaResultado_busqueda_hastag_item;

public class Resultado_busqueda_hastag_item extends VistaResultado_busqueda_hastag_item{
//	private Label _nombreHashtagL;
//	private Label _nVideosAsociadosL;
//	public Resultado_busqueda_hastag _resultado_busqueda_hastag;
//	public Publicaciones_asociadas_a_un_hastag _publicaciones_asociadas_a_un_hastag;
//
//	public void publicaciones_asociadas_a_un_hastag() {
//		throw new UnsupportedOperationException();
//	}
	
	private Cabecera__administrador_ cabecera;;
	private Hashtag hashtag;
	
	public Resultado_busqueda_hastag_item(Hashtag has, Cabecera__administrador_ cabecera) {
		// TODO Auto-generated constructor stub
		this.cabecera = cabecera;
		this.hashtag = has;
		this.getbHashtag().setText(hashtag.getHashtag());
		this.getLabelVideos().setText("Publicaciones: "+hashtag.esta.size());
		//System.out.println(hashtag.esta.size());
		this.getStyle().set("width", "90%");
		
		this.getbHashtag().addClickListener(event ->{
			
			this.cabecera.setHashtags(new Publicaciones_asociadas_a_un_hastag(this.hashtag, this.cabecera));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getHashtags());
			
		});
	
	}
	
}