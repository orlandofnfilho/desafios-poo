package br.com.gft.desafio07.main;

import java.util.Locale;

import br.com.gft.desafio07.model.Gerente;
import br.com.gft.desafio07.model.Supervisor;
import br.com.gft.desafio07.model.Vendedor;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Gerente g1 = new Gerente("Luiz", 45, 6000.0);
		Supervisor s1 = new Supervisor("Carlos", 35, 4000.0);
		Vendedor v1 = new Vendedor("Pedro", 30, 2000.0);

		System.out.println(g1);
		System.out.println(s1);
		System.out.println(v1);

	}

}
