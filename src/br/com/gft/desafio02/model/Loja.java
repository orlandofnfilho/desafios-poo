package br.com.gft.desafio02.model;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;

	private List<Livro> livros;
	private List<VideoGame> videoGames;

	public Loja() {

	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void listaLivros() {
		if (livros.size() <= 0) {
			System.out.println("A loja nao tem livros no seu estoque.");
		} else {
			for (Livro l : livros) {
				System.out.println("Titulo: " + l.getNome() + ", preco: " + l.getPreco() + ", quantidade: " + l.getQtd()
						+ " em estoque.");
			}
		}

	}

	public void listaVideoGames() {
		if (videoGames.size() <= 0) {
			System.out.println("A loja nao tem video-games no seu estoque.");
		} else {
			for (VideoGame v : videoGames) {
				System.out.println("Video-game: " + v.getModelo() + ", preco: " + v.getPreco() + ", quantidade: "
						+ v.getQtd() + " em estoque.");
			}
		}
	}

	public double calculaPatrimonio() {

		double totalLivros = 0.0;
		double totalVideoGames = 0.0;
		for (Livro l : livros) {
			totalLivros = totalLivros + l.getPreco() * l.getQtd();
		}

		for (VideoGame v : videoGames) {
			totalVideoGames = totalVideoGames + v.getPreco() * v.getQtd();
		}

		double patrimonio = totalLivros + totalVideoGames;

		return patrimonio;

	}

	public double totalImposto() {
		double totalLivros = 0.0;
		double totalVideoGames = 0.0;
		double total = 0.0;
		for (Livro l : livros) {
			totalLivros += l.calcularImposto();
		}

		for (VideoGame v : videoGames) {
			totalVideoGames += v.calcularImposto();
		}

		total = totalLivros + totalVideoGames;
		return total;
	}

}
