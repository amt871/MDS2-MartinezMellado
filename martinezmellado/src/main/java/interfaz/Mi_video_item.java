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
	private Cabecera_comercial cabeceraCom;
	private Video video;
	private Publicacion publi;
	private Cabecera_usuario_no_registrado cabeceraNoReg;
	private Cabecera__administrador_ cabeceraAdmin;
	
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

	public Mi_video_item(Publicacion publi2, Cabecera_comercial cabecera2) {
		// TODO Auto-generated constructor stub
		this.video = new Video(publi2.getVideo().replace("src/main/webapp/",""));
		this.publi = publi2;
		this.getLabelDescripcion().setText(publi.getDescripcion().length()<15 ? publi.getDescripcion() : publi.getDescripcion().substring(0, 11)+"...");
		this.getLayoutVideo().add(this.video);
		this.cabeceraCom = cabecera2;
		this.video.setWidth("80%");
		this.video.setHeight("80%");
		//this.getLabelTitulo().setText(titulo);
		this.getStyle().set("height", "100%");
		this.getStyle().set("width", "25%");
		
		this.getButton().addClickListener(event ->{
			
			this.cabeceraCom.setDetalle(new Vista_detalle__usuario_registrado_(this.cabeceraCom, this.cabeceraCom.getUser(), this.publi));
			this.cabeceraCom.getVl().removeAll();
			this.cabeceraCom.getVl().add(this.cabeceraCom.getDetalle());
			
		});
	}

	public Mi_video_item(Publicacion publi2, Cabecera_usuario_no_registrado cabecera2) {
		// TODO Auto-generated constructor stub
		this.video = new Video(publi2.getVideo().replace("src/main/webapp/",""));
		this.publi = publi2;
		this.getLabelDescripcion().setText(publi.getDescripcion().length()<15 ? publi.getDescripcion() : publi.getDescripcion().substring(0, 11)+"...");
		this.getLayoutVideo().add(this.video);
		this.cabeceraNoReg = cabecera2;
		this.video.setWidth("80%");
		this.video.setHeight("80%");
		//this.getLabelTitulo().setText(titulo);
		this.getStyle().set("height", "100%");
		this.getStyle().set("width", "25%");
		
		this.getButton().addClickListener(event ->{
			
			this.cabeceraNoReg.setDetalle(new Vista_detalle__no_registrado_(this.cabeceraNoReg, this.publi));
			this.cabeceraNoReg.getVl().removeAll();
			this.cabeceraNoReg.getVl().add(this.cabeceraNoReg.getDetalle());
			
		});
	}

	public Mi_video_item(Publicacion publi2, Cabecera__administrador_ cabecera2) {
		// TODO Auto-generated constructor stub
		
		this.video = new Video(publi2.getVideo().replace("src/main/webapp/",""));
		this.publi = publi2;
		this.getLabelDescripcion().setText(publi.getDescripcion().length()<15 ? publi.getDescripcion() : publi.getDescripcion().substring(0, 11)+"...");
		this.getLayoutVideo().add(this.video);
		this.cabeceraAdmin = cabecera2;
		this.video.setWidth("80%");
		this.video.setHeight("80%");
		//this.getLabelTitulo().setText(titulo);
		this.getStyle().set("height", "100%");
		this.getStyle().set("width", "25%");
		
		this.getButton().addClickListener(event ->{
			
			this.cabeceraAdmin.setDetalle(new Vista_detalle__administrador_(this.cabeceraAdmin, this.publi));
			this.cabeceraAdmin.getVl().removeAll();
			this.cabeceraAdmin.getVl().add(this.cabeceraAdmin.getDetalle());
			
		});
	}
}