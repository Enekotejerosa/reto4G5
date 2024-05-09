package modelo;

import java.util.ArrayList;

public class Musico extends Artista {
	private Caracteristica caracteristica;
	private ArrayList<Album> albumes = new ArrayList<Album>();

	public ArrayList<Album> getAlbumes() {
		return albumes;
	}

	public void setAlbumes(ArrayList<Album> albumes) {
		this.albumes = albumes;
	}
/**
 * 
 * @param nombreArtista
 * @param descripcion
 * @param imagen
 * @param caracteristica
 */
	public Musico(String nombreArtista, String descripcion, String imagen, Caracteristica caracteristica, ArrayList<Album> albumes) {
		super(nombreArtista, descripcion, imagen);
		// TODO Auto-generated constructor stub
		this.caracteristica = caracteristica;
		this.albumes = albumes;
	}

	@Override
public String toString() {
	return "Musico [caracteristica=" + caracteristica + ", albumes=" + albumes + ", getNombreArtista()="
			+ getNombreArtista() + ", getDescripcion()=" + getDescripcion() + ", getImagen()=" + getImagen() + "]";
}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}
/**
 * 
 * @param caracteristica
 */
	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}

public Musico() {
	
}

	

}
