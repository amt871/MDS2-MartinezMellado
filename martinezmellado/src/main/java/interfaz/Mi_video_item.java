package interfaz;

import vistas.VistaMi_video_item;

public class Mi_video_item extends VistaMi_video_item {
//	private ImageButton _previsualizacionVideoIB;
//	private Label _descripccionVideoL;
//	public Mi_video _mi_video;
//	public Ver_mi_video _ver_mi_video;

	/*public void ver_mi_video() {
		throw new UnsupportedOperationException();
	}*/
	
	private Video video;
	
	public Mi_video_item(String src,String titulo, String altura, String anchura) {
		
		//this.getLayoutVideo().add(new Video(src,"100%","100%"));
		this.video = new Video(src);
		this.getLayoutVideo().add(this.video);
		this.getLabelTitulo().setText(titulo);
		this.getStyle().set("height", altura);
		this.getStyle().set("width", anchura);
		
	}
	
	public void data(String src,String titulo, String altura, String anchura) {
		
		this.video = new Video(src);
		this.getLayoutVideo().add(this.video);
		this.getLabelTitulo().setText(titulo);
		//this.getStyle().set("height", "90%");
		//this.getStyle().set("width", "25%");
		
	}
	
	public Mi_video_item(String src, String titulo) {
		this.video = new Video(src);
		this.getLayoutVideo().add(this.video);
		this.video.setWidth("80%");
		this.video.setHeight("80%");
		this.getLabelTitulo().setText(titulo);
		this.getStyle().set("height", "100%");
		this.getStyle().set("width", "25%");
	}
}