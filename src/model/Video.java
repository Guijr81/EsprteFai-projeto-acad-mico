package model;

public class Video extends Entretenimento{

	private long totalLikes;
	
	public long getTotalLikes() {
		return totalLikes;
	}
	
	public void setTotalLikes(long totalLikes) {
		this.totalLikes = totalLikes;
	}

	public Video(String nome, Artista artista, float valor, Estilo estilo) {
		super(nome, artista, valor, estilo);
	}

	//SOBREESCRITA
	public float GetValor() {
		return 20f;
	}
}
