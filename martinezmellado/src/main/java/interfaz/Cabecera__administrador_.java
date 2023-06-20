package interfaz;

import basededatos.BDPrincipal;
import proyectoMDS.MainView;
import vistas.VistaCabecera__administrador_;

public class Cabecera__administrador_ extends VistaCabecera__administrador_{
//	private ImageButton _cerrar_sesion__Administrador_;
//	private Button _inicioB;
//	private Button _busquedaB;
//	private Buttton _administrarB;
//	private Label _salirL;
//	public Administrador _administrador;
//	public Video_otro_usuario__administrador_ _video_otro_usuario__administrador_;
//	public Administrar _administrar;
//	public Busqueda__administrador_ _busqueda__administrador_;
//
//	public void video_otro_usuario__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void administrar() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void cerrar_sesion__Administrador_() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void busqueda__administrador_() {
//		throw new UnsupportedOperationException();
//	}
//	
//	public Cabecera__administrador_() {
//		
//	}

	private MainView vl;
	private BDPrincipal datos;
	private Iniciar_sesion__administrador_ iniciarSesion;
	private Video_otro_usuario__administrador_ inicio;
	
	public Cabecera__administrador_(MainView vl, BDPrincipal datos,
			Iniciar_sesion__administrador_ iniciar_sesion__administrador_) {
		// TODO Auto-generated constructor stub
		this.vl = vl;
		this.datos = datos;
		this.iniciarSesion = iniciar_sesion__administrador_;
		
		this.getbAdministrar2().addClickListener(event ->{
			
			this.vl.removeAll();
			this.vl.add(this.inicio = new Video_otro_usuario__administrador_(this));
			
		});
	}
	
	
}