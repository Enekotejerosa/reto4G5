package modelo;

public abstract class Multimedia {
	private String nombre;
	private int idAudio;
	private String duracion;
	private String audio;

	public String getNombre() {
		return nombre;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getAudio() {
		return audio;
	}

	public void setImagen(String imagen) {
		this.audio = imagen;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public int getIdAudio() {
		return idAudio;
	}

	public void setIdAudio(int idAudio) {
		this.idAudio = idAudio;
	}

	public Multimedia(String nombre, int idAudio, String duracion, String audio) {
		this.nombre = nombre;
		this.idAudio = idAudio;
		this.duracion = duracion;
		this.audio = audio;
	}

	@Override
	public String toString() {
		return "Multimedia [nombre=" + nombre + ", idAudio=" + idAudio + ", duracion=" + duracion + ", audio=" + audio
				+ "]";
	}


}
