package modelo;

import java.util.ArrayList;

public class Podcaster extends Artista {

	private String genero;
	private ArrayList<Podcast> podcasts = new ArrayList<Podcast>();

	@Override
	public String toString() {
		return "Podcaster [genero=" + genero + ", podcasts=" + podcasts + ", getNombreArtista()=" + getNombreArtista()
				+ ", getDescripcion()=" + getDescripcion() + "]";
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Podcast> getPodcasts() {
		return podcasts;
	}

	public void setPodcasts(ArrayList<Podcast> podcasts) {
		this.podcasts = podcasts;
	}

	public Podcaster(String nombreArtista, String descripcion, String imagen, String genero, ArrayList<Podcast> podcasts) {
		super(nombreArtista, descripcion, imagen);
		// TODO Auto-generated constructor stub
		this.genero = genero;
		this.podcasts = podcasts;
	}

	public Podcaster() {
		
	}


}
