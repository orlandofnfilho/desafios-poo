package br.com.gft.desafio04.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.desafio04.model.Pessoa;

public class Main {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();

		
		Pessoa p1 = new Pessoa("Joao", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("Jessica", 18);
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);

		pessoas.sort((o1, o2) -> -o1.getIdade().compareTo(o2.getIdade()));

		System.out.println("Exercicio 4:");
		System.out.println("Pessoa mais velha: " + pessoas.get(0).getNome());

		System.out.println("-----------------------------------");

		// Exercício 5
		System.out.println("Exercicio 5:");

		System.out.println("Antes: "+pessoas.size());
		pessoas.removeIf(p -> p.getIdade() < 18);

		System.out.println("Depois: "+pessoas.size());

		System.out.println("-----------------------------------");

		// Exercicio 6
		System.out.println("Exercicio 6:");

		System.out.println(pessoas.contains(p4));

	}

}
