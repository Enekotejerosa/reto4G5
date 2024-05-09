package modelo;

import java.util.ArrayList;

public class Album {
	private String titulo;
	private int anyo;
	private String Genero;
	private String imagen;
	private ArrayList<Cancion> canciones = new ArrayList<Cancion>();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	public Album(String titulo, int anyo, String genero, String imagen, ArrayList<Cancion> canciones) {
		super();
		this.titulo = titulo;
		this.anyo = anyo;
		Genero = genero;
		this.imagen = imagen;
		this.canciones = canciones;
	}

	@Override
	public String toString() {
		return "Album [titulo=" + titulo + ", anyo=" + anyo + ", Genero=" + Genero + ", imagen=" + imagen
				+ ", canciones=" + canciones + "]";
	}

	public Album() {
	}

}
