package interfaz;

import java.util.Vector;

import basededatos.BDPrincipal;
import proyectoMDS.MainView;
import vistas.VistaInicio_no_registrado;
import vistas.VistaInicio_no_registrado_item;

public class Inicio_no_registrado extends VistaInicio_no_registrado {

//	public Usuario_no_registrado _usuario_no_registrado;
//	public Cabecera_usuario_no_registrado _cabecera_usuario_no_registrado;
//	public Vector<Inicio_no_registrado_item> _item = new Vector<Inicio_no_registrado_item>();
	
	private MainView vl;
	private BDPrincipal datos;
	private Cabecera_usuario_no_registrado cabecera;
	
	public Inicio_no_registrado(Cabecera_usuario_no_registrado cabeceraNoReg) {
		// TODO Auto-generated constructor stub
		this.cabecera = cabeceraNoReg;
		
		this.setCabecera(cabeceraNoReg);
	}
}