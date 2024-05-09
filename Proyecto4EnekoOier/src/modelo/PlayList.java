package modelo;

import java.util.ArrayList;

public class PlayList {
	private String titulo;
	private String fec_registro;
	private ArrayList<Cancion> canciones = new ArrayList<Cancion>();
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFec_registro() {
		return fec_registro;
	}
	public void setFec_registro(String fec_registro) {
		this.fec_registro = fec_registro;
	}
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}
	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	public PlayList(String titulo, String fec_registro, ArrayList<Cancion> canciones) {
		this.titulo = titulo;
		this.fec_registro = fec_registro;
		this.canciones = canciones;
	}
	@Override
	public String toString() {
		return "PlayList [titulo=" + titulo + ", fec_registro=" + fec_registro + ", canciones=" + canciones + "]";
	}
	public PlayList(String titulo, String fec_registro) {
		this.titulo = titulo;
		this.fec_registro = fec_registro;
	}

	public PlayList() {
		// TODO Auto-generated constructor stub
	}
	
}
