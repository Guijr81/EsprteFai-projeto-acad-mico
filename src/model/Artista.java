package model;

public class Artista {

	private String nome;
	private Endereco endereco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Artista(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
}
