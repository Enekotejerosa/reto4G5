package modelo;

public abstract class Artista {

	public Artista(String nombreArtista, String descripcion, String imagen) {
		this.nombreArtista = nombreArtista;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public String getDescripcion() {
		return descripcion;
	}
 
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	private String nombreArtista;
	private String descripcion;
	private String imagen;
	
	public Artista() {
		
	}

}
