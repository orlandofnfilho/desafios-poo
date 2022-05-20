package br.com.gft.desafio01.main;

import java.util.Locale;

import br.com.gft.desafio01.model.Veiculo;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Veiculo v1 = new Veiculo("Honda", "Civic", "KFJ-6624", "Azul", 10000, false, 0, 0, 7000.0);

		System.out.println(v1);

		System.out.println();
		System.out.println("Testando ligar: ");
		v1.ligar();

		System.out.println();
		System.out.println("Testando desligar: ");
		v1.desligar();

		System.out.println();
		System.out.println("Testando pintar: ");
		v1.pintar("Preto");

		System.out.println();
		System.out.println("Testando abastecer: ");
		v1.abastecer(20);

		// So vai adicionar o que falta para encher o tanque
		v1.abastecer(100);

		System.out.println();
		System.out.println("Testando acelerar: ");
		v1.ligar();
		v1.acelerar();

		System.out.println();
		System.out.println("Testando frear: ");
		if (v1.isLigado() && v1.getVelocidade() > 0) {
			v1.frear();
		} else {
			System.out.println("Veiculo parado!");
		}

		System.out.println();
		System.out.println(v1);

	}

}
