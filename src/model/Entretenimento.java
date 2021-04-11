package model;

public class Entretenimento {

	private String nome;
	private Artista artista;
	private float valor;
	private Estilo estilo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Estilo getEstilo() {
		return estilo;
	}
	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}
	
	public Entretenimento(String nome, Artista artista, float valor, Estilo estilo) {
		this.nome = nome;
		this.artista = artista;
		this.valor = valor;
		this.estilo = estilo;
	}
	
	public float GetValor() {
		return this.valor;
	}
}
