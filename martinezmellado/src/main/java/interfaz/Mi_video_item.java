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
	
	public Mi_video_item(String src,String titulo, String altura, String anchura) {
		
		this.getLayoutVideo().add(new Video(src, altura, anchura));
		this.getLabelTitulo().setText(titulo);
		
	}
	
	public void data(String src,String titulo, String altura, String anchura) {
		
		this.getLayoutVideo().add(new Video(src, altura, anchura));
		this.getLabelTitulo().setText(titulo);
		
	}
}