package interfaz;

import basededatos.Usuario_Registrado;
import proyectoMDS.MainView;
import vistas.VistaUsuario__usuario_registrado__item;

public class Usuario__usuario_registrado__item extends VistaUsuario__usuario_registrado__item{
//	private ImageButton _imagenUsuarioIB;
//	private Label _nombreUsuarioL;
//	private Label _nSeguidoresL;
//	private Label _descripcionL;
//	private Label _ultimaPublicacionL;
//	private ImagenIcon _previewUltimaPublicacionII;
//	public Usuario__usuario_registrado_ _usuario__usuario_registrado_;
//	public Perfil_otro_usuario _perfil_otro_usuario;
//
//	public void perfil_otro_usuario() {
//		throw new UnsupportedOperationException();
//	}
	
	private Usuario_Registrado usuario;
	private Usuario_Registrado miUsuario;
	private Mi_cabecera cabeceraUserReg;
	private MainView inicio;
	
	public Usuario__usuario_registrado__item(Usuario_Registrado usu, Mi_cabecera cabecera) {
		
		this.usuario = usu;
		this.miUsuario = cabecera.getUser();
		this.cabeceraUserReg = cabecera;
		this.inicio = cabecera.getVl();
		this.getLabelDescripcion().setText(usu.getDescripcion().isEmpty() ? "Usuario sin descricpion" : usu.getDescripcion());
		this.getLabelSeguidores().setText("Seguidores: "+usu.seguidor.size());
		if (usu.getComercial().equals("Comercial")) {
			this.getLabelUsuario().setText(usu.getUsuario() + " (Empresa)");
		} else {
			this.getLabelUsuario().setText(usu.getUsuario());
		}
		this.getImageUser().setSrc(usu.getFoto());
		
		this.getbUser().addClickListener(event ->{
			
			verPerfilOtroUsuario();
			
		});
	}
	
	private void verPerfilOtroUsuario() {
		
		if(this.usuario.getPrivado()) {
			
			//System.out.println(miUsuario.getUsuario());
			
			//Notification.show("Aun no implementado");
			if(this.miUsuario.seguido.contains(this.usuario)) {
				this.cabeceraUserReg.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, this.usuario));
				this.inicio.removeAll();
				this.inicio.add(this.cabeceraUserReg.getPerfilPublico());
			}else {
				this.cabeceraUserReg.setPerfilPrivado(new Ver_perfil_privado__usuario_registrado_(this.cabeceraUserReg, this.usuario));
				this.inicio.removeAll();
				this.inicio.add(this.cabeceraUserReg.getPerfilPrivado());
			//this.inicio.cambiarPantalla(cabecera);
			}
		}else {
			
			this.cabeceraUserReg.setPerfilPublico(new Ver_perfil__usuario_registrado_(this.cabeceraUserReg, this.usuario));
			this.inicio.removeAll();
			this.inicio.add(this.cabeceraUserReg.getPerfilPublico());
			
		}
		
		//this.video_otro_usuario.clear();
		
	}
}