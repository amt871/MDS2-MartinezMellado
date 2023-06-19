package interfaz;

import basededatos.Publicacion;
import proyectoMDS.MainView;
import vistas.VistaMi_video_item;

public class Mi_video_item extends VistaMi_video_item {
//	private ImageButton _previsualizacionVideoIB;
//	private Label _descripccionVideoL;
//	public Mi_video _mi_video;
//	public Ver_mi_video _ver_mi_video;

	/*public void ver_mi_video() {
		throw new UnsupportedOperationException();
	}*/
	
	private Mi_cabecera cabecera;
	private Video video;
	private Publicacion publi;
	
	/*public Mi_video_item(String src,String titulo, String altura, String anchura, MainView vl) {
		
		//this.getLayoutVideo().add(new Video(src,"100%","100%"));
		this.video = new Video(src);
		this.getLayoutVideo().add(this.video);
		//this.getLabelTitulo().setText(titulo);
		this.getStyle().set("height", altura);
		this.getStyle().set("width", anchura);
		
		
		
	}
	
	public void data(String src,String titulo, String altura, String anchura) {
		
		this.video = new Video(src);
		this.getLayoutVideo().add(this.video);
		//this.getLabelTitulo().setText(titulo);
		//this.getStyle().set("height", "90%");
		//this.getStyle().set("width", "25%");
		
	}*/
	
	public Mi_video_item(Publicacion publi, Mi_cabecera cabecera) {
		this.video = new Video(publi.getVideo().replace("src/main/webapp/",""));
		this.publi = publi;
		this.getLabelDescripcion().setText(publi.getDescripcion().length()<15 ? publi.getDescripcion() : publi.getDescripcion().substring(0, 11)+"...");
		this.getLayoutVideo().add(this.video);
		this.cabecera = cabecera;
		this.video.setWidth("80%");
		this.video.setHeight("80%");
		//this.getLabelTitulo().setText(titulo);
		this.getStyle().set("height", "100%");
		this.getStyle().set("width", "25%");
		
		this.getButton().addClickListener(event ->{
			
			this.cabecera.setDetalle(new Vista_detalle__usuario_registrado_(this.cabecera, this.cabecera.getUser(), this.publi));
			this.cabecera.getVl().removeAll();
			this.cabecera.getVl().add(this.cabecera.getDetalle());
			
		});
	}
}