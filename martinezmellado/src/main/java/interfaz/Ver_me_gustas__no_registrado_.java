package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

import basededatos.Publicacion;
import basededatos.Usuario_Registrado;
import vistas.VistaVer_me_gustas__no_registrado_;

public class Ver_me_gustas__no_registrado_ extends VistaVer_me_gustas__no_registrado_{
//	private Button _volver;
//	private ImageButton _fotoPropietarioIB;
//	private Label _nombrePropietarioL;
//	private Label _listaMgL;
//	public Inicio_no_registrado_item _inicio_no_registrado;
//	public Ver_Perfil__no_registrado_ _ver_perfil__no_registrado_;
//	public Me_gusta__no_registrado_ _me_gusta__no_registrado_;
//	
//	public void ver_perfil__no_registrado_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void volver() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void me_gusta__no_registrado_() {
//		throw new UnsupportedOperationException();
//	}
	
	private Scroller scroller;
	private VerticalLayout vl;
	private Publicacion publi;
	private Usuario_Registrado propietario;

	public Ver_me_gustas__no_registrado_(Cabecera_usuario_no_registrado cabecera, Publicacion publicacion) {
		// TODO Auto-generated constructor stub
		
		this.setCabecera(cabecera);
		this.propietario = publicacion.getRealizada();
		this.publi = publicacion;
		this.getLayoutVideo().add(new Video(publicacion.getVideo().replace("src/main/webapp/", ""),"90%", "90%"));
		this.getImage().setSrc(publicacion.getRealizada().getFoto());
		this.getbAnterior().addClickListener(e ->{
			
			this.propietario =this.getCabecera().getDatos().cargarDatosUsuario(this.propietario.getUsuario());
			this.publi = this.getCabecera().getDatos().cargarVideoPoID(this.publi.getID());
			cabecera.setDetalle(new Vista_detalle__no_registrado_(cabecera, this.publi));
			cabecera.getVl().removeAll();
			cabecera.getVl().add(cabecera.getDetalle());
			
		});
		
		this.getImage().addClickListener(e ->{
			
			this.propietario = this.getCabecera().getDatos().cargarDatosUsuario(this.propietario.getUsuario());
			cabecera.setPerfilPublico(new Ver_perfil__usuario_no_registrado_(cabecera, this.propietario));
			cabecera.getVl().removeAll();
			cabecera.getVl().add(cabecera.getPerfilPublico());
			
		});

			
			scroller = this.getScroller();
			vl = new VerticalLayout();

			scroller.setScrollDirection(ScrollDirection.VERTICAL);
			scroller.setContent(vl);
			vl.setHeight("100%");
			vl.setWidth("100%");
			vl.setAlignItems(Alignment.CENTER);
			
			//vl.getStyle().set("background-color", "black");
			
			addItem();
			

		}
		
		public void addItem() {
			
			//System.out.println(this.usuario.realiza.size());
			if(this.publi.le_gusta.size()==0) {
				vl.setJustifyContentMode(JustifyContentMode.CENTER);
				vl.add(new Label("Esta publicacion no tiene me gustas"));
			}else {
				
//				vl.setAlignItems(Alignment.CENTER);
//				vl.setJustifyContentMode(JustifyContentMode.CENTER);
				//vl.setHeight("100%");
				//vl.setWidth("100%");
				
				//vl.add(new Video("Usuarios/Juanra1997/videos/2023-06-05T23-00-09.914853900.mp4"));
				
				//vl.add(new Mi_video_item("Usuarios/Juanra1997/videos/2023-06-05T23-00-09.914853900.mp4", "Ninna gritona", "100%", "25%"));
				
				//Publicacion[] videos = null;
				
				//videos = this.usuario.realiza.toArray();
				
				/*Arrays.sort(videos, new Comparator<Publicacion>() {
				    public int compare(Publicacion p1, Publicacion p2) {
				        return Integer.compare(p1.getID(), p2.getID());
				    }
				});*/
				
				//videos
				
				//if(videos != null) {
					//int contador = 0;
					//int index = 0;
					//ArrayList<HorizontalLayout> array = new ArrayList<HorizontalLayout>();
					//ArrayList<VistaMi_video> array = new ArrayList<VistaMi_video>();
					for(int i = 0; i<this.publi.le_gusta.toArray().length; i++) {
						this.vl.add(new Me_gusta__no_registrado__item(this.getCabecera(), this.publi.le_gusta.toArray()[i]));
						//System.out.println(videos[i].getVideo());
						/*if(contador == 0) {
							//System.out.println(contador);
							array.add(new HorizontalLayout());
							//System.out.println("Add horizontal");
							array.get(index).setJustifyContentMode(JustifyContentMode.CENTER);
							array.get(index).setAlignItems(Alignment.CENTER);
							array.get(index).getStyle().set("height", "100%");
							array.get(index).getStyle().set("width", "100%");
							array.get(index).getStyle().set("position", "relative");
							//array.get(index).getStyle().set("overflow", "auto");
							array.get(index).setBoxSizing(BoxSizing.BORDER_BOX);
//							array.get(index).setPadding(true);
//							array.get(index).setMargin(false);
//							array.get(index).setSpacing(false);
							
							//array.get(index).getStyle().set("background-color", "black");
							
							vl.add(array.get(index));
						}*/
						
						//String titulo = videos[i].getDescripcion().length() > 15 ? videos[i].getDescripcion().substring(0,11)+"..." : videos[i].getDescripcion();
						
						//array.get(index).add(new Mi_video_item(videos[i], this.getCabecera())/*, "100%", "25%")*/);
						//array.get(index).add(new)
						//contador++;
						//if(contador==4) {
							///index ++;
							//contador = 0;
							//vl.add(array.get(0));
							//break;
						}
						
					//}
					
				//}
				
			}
			
		}


}