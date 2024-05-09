package modelo;

import java.util.ArrayList;

public class Usuarios {
	private int idUsuario;
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasena;
	private String fec_nacimiento;
	private String fec_registro;
	private ArrayList<PlayList> playlists = new ArrayList<PlayList>();
	private String tipoCliente;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public ArrayList<PlayList> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(ArrayList<PlayList> playlists) {
		this.playlists = playlists;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getFec_nacimiento() {
		return fec_nacimiento;
	}

	public void setFec_nacimiento(String fec_nacimiento) {
		this.fec_nacimiento = fec_nacimiento;
	}

	public String getFec_registro() {
		return fec_registro;
	}

	public void setFec_registro(String fec_registro) {
		this.fec_registro = fec_registro;
	}

	

	public Usuarios(int idUsuario, String nombre, String apellido, String usuario, String contrasena,
			String fec_nacimiento, String fec_registro, ArrayList<PlayList> playlists, String tipoCliente) {
	
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.fec_nacimiento = fec_nacimiento;
		this.fec_registro = fec_registro;
		this.playlists = playlists;
		this.tipoCliente = tipoCliente;
	}

	public Usuarios(String nombre, String apellido, String usuario, String contrasena, String fec_nacimiento,
			String fec_registro, String tipoCliente) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.fec_nacimiento = fec_nacimiento;
		this.fec_registro = fec_registro;
		this.tipoCliente = tipoCliente;
	}

	public Usuarios() {
		// TODO Auto-generated constructor stub
	}

	public Usuarios(int idUsuario, String nombre, String apellido, String usuario, String contrasena, String fec_nacimiento,
			String fec_registro, String tipoCliente, ArrayList<PlayList> playlists) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.fec_nacimiento = fec_nacimiento;
		this.fec_registro = fec_registro;
		this.playlists = playlists;
		this.tipoCliente = tipoCliente;
	}

	@Override
	public String toString() {
		return "Usuarios [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario="
				+ usuario + ", contrasena=" + contrasena + ", fec_nacimiento=" + fec_nacimiento + ", fec_registro="
				+ fec_registro + ", playlists=" + playlists + ", tipoCliente=" + tipoCliente + "]";
	}

	
	

}
