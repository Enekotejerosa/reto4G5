package modelo;

public class Cancion extends Multimedia {



	public Cancion(String nombre, int idAudio, String duracion, String audio) {
		super(nombre, idAudio, duracion, audio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cancion [getNombre()=" + getNombre() + ", getDuracion()=" + getDuracion() + ", getAudio()=" + getAudio()
				+ "]";
	}



}
