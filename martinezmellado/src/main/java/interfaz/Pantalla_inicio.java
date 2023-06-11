package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;

import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;

import proyectoMDS.MainView;
import vistas.VistaPantalla_inicio;

public class Pantalla_inicio extends VistaPantalla_inicio {
	
	private MainView vlMain;
	private BDPrincipal datos;
	//private Registro registro;
	
	public Pantalla_inicio(MainView vl) {
		
		
		this.vlMain = vl;
		
		this.datos = new BDPrincipal();
		
		//registro = new Registro(this.vlMain, this.datos, this);
		
		this.getbRegistrarse().addClickListener(event -> {
			
			registrarse();
			
		});
		
		this.getbIniciarSesion().addClickListener(evente -> {
			
			inicioSesion();
			
		});
		
	}
	
	public Pantalla_inicio(MainView vl, BDPrincipal datos) {
		
		
		this.vlMain = vl;
		
		this.datos = datos;
		
		//registro = new Registro(this.vlMain, this.datos, this);
		
		this.getbRegistrarse().addClickListener(event -> {
			
			registrarse();
			
		});
		
		this.getbIniciarSesion().addClickListener(event -> {
			
			inicioSesion();
			
		});
		
	}

	private void inicioSesion() {
		// TODO Auto-generated method stub
		this.vlMain.removeAll();
		this.vlMain.add(new Iniciar_sesion(this.vlMain, this.datos));
		
		try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void registrarse() {

		this.vlMain.removeAll();
		this.vlMain.add(new Registro(this.vlMain, this.datos));
		
		try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
//	private event _acceder;
//	private Button _registrarseB;
//	private Button _iniciarSesionB;
//	private Button _accederB;
//	private ImageIcon _logoII;
//	private Label _nombreAppL;
//	private Label _esloganL;
//	public Cibernauta _cibernauta;
//	public Iniciar_sesion _iniciar_sesion;
//	public Registro _registro;
//
//	public void acceder() {
//		throw new UnsupportedOperationException();
//	}
	
}