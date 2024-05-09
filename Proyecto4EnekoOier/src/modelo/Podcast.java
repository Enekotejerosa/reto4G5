package modelo;

public class Podcast extends Multimedia {
	private String colaboradores;

	public Podcast(String nombre, int idAudio, String duracion, String audio, String colaboradores) {
		super(nombre, idAudio, duracion, audio);
		// TODO Auto-generated constructor stub
		this.colaboradores = colaboradores;
	}

	public String getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(String colaboradores) {
		this.colaboradores = colaboradores;
	}

	@Override
	public String toString() {
		return "Podcast [nombre=" + getNombre() + ",Duracion=" + getDuracion() + ", Audio=" + getAudio()
				+ ", colaboradores = " + colaboradores + "]";
	}

}
