package br.com.gft.desafio02.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.desafio02.model.Livro;
import br.com.gft.desafio02.model.Loja;
import br.com.gft.desafio02.model.VideoGame;

public class Main {

	public static void main(String[] args) {

		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Aneis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);

		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500, 30, "sony", "One", false);

		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);

		List<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);

		Loja americanas = new Loja("Americanas", "12345678", livros, games);

		System.out.println("R$ " + l2.calcularImposto() + " de imposto sobre o livro " + l2.getNome());
		System.out.println("Livro Educativo nao tem imposto: " + l3.getNome());
		System.out.println("Imposto " + ps4Usado.getNome() + " " + ps4Usado.getModelo() + " usado, R$ "
				+ ps4Usado.calcularImposto());
		System.out.println("Imposto " + ps4.getNome() + " " + ps4.getModelo() + " R$ " + ps4.calcularImposto());

		System.out.println("----------------------------------------------------------------------");
		System.out.println("A loja " + americanas.getNome() + " possui esses livros para venda: ");
		americanas.listaLivros();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("A loja " + americanas.getNome() + " possui esses video-games para venda: ");
		americanas.listaVideoGames();
		System.out.println("----------------------------------------------------------------------");
		System.out
				.println("O patrimonio da loja " + americanas.getNome() + " e R$ " + americanas.calculaPatrimonio());

	}

}
