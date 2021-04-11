package controller;

import java.util.Scanner;

import model.Artista;
import model.Endereco;
import model.Entretenimento;
import model.Estilo;
import model.Musica;
import model.Video;

public class EstoqueController {

	private static Entretenimento [] estoque;
	private static Entretenimento [] compras= new Entretenimento[4];

	
	public static void main(String[] args) {

		EstoqueController estoqueController = new EstoqueController();
		estoqueController.inicializar();
	
		System.out.println("Informe o nome da música");
		Scanner scanner = new Scanner(System.in);
		String nomeMusicaUsuario = scanner.nextLine();
		
		Entretenimento entretenimento = 
				estoqueController.existe(nomeMusicaUsuario);
		
		if(entretenimento != null) {
			compras[0]= entretenimento;
			float total = estoqueController.calcularTotal(compras);
			
			System.out.println("Nome : " + entretenimento.getNome());
			System.out.println("Valor : " +entretenimento.getValor());
			System.out.println("Nome do Artista : " +entretenimento.getArtista().getNome());
			System.out.println("Rua do Artista : " +entretenimento.getArtista().getEndereco().getRua());
			System.out.println("Estilo : " +entretenimento.getEstilo().getNome());
			
			System.out.println("O total da compra foi : " + total);
		}else {
			System.out.println("MUSICA OU VIDEO NÃO EXITE");
		}
		
		
		scanner.close();
	}
	
	public void inicializar() {
		Estilo forro = new Estilo("Forro");
		Estilo mpb = new Estilo("Mpb");
		
		Endereco agamenom = new Endereco("Agamenom", "Espinheiro");

		Artista joao = new Artista("João do morro", agamenom);
		Artista caetano = new Artista("Caetano", agamenom);

		
		estoque = new Entretenimento[4];
		estoque[0] = new Musica("RITA", joao, 35, forro);
		estoque[1] = new Video("JAVA1", caetano, 12, mpb);
		estoque[2] = new Musica("MUSICA1", joao, 13, forro);
		estoque[3] = new Musica("MUSICA2", joao, 25, forro);
	}
	
	public void remover(Entretenimento entretenimento) {
		for (int i = 0; i < estoque.length; i++) {
			if(entretenimento.equals(estoque[i])) {
				estoque[i] = null;
			}
		}
	}
	
	public Entretenimento existe(String nomeDaMusica) {
		
		for (int i = 0; i < estoque.length; i++) {
			if(nomeDaMusica.equals(estoque[i].getNome())) {
				return estoque[i];
			}
		}
		
		return null;
	}
	
	public float calcularTotal(Entretenimento [] carrinhoCompras) {
		float total = 0;
		
		for (int i = 0; i < carrinhoCompras.length; i++) {
			if(carrinhoCompras[i] != null) {
				total += carrinhoCompras[i].getValor();	
			}
		}
		
		return total;
	}

}
