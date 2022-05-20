package br.com.gft.desafio03.main;

import java.util.Locale;

import br.com.gft.desafio03.model.Guerreiro;
import br.com.gft.desafio03.model.Mago;
import br.com.gft.desafio03.model.Personagem;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Mago m1 = new Mago("Exeqt0r", 3000, 5000, 90, 125, 40, 80);

		m1.getMagia().add("Wind vortex");
		m1.getMagia().add("Hurricane");
		m1.getMagia().add("Silence");

		Guerreiro g1 = new Guerreiro("DeathSmell", 9000, 1500, 70, 35, 135, 80);

		g1.getHabilidade().add("Triple Sonic Slash");
		g1.getHabilidade().add("Battle Roar");
		g1.getHabilidade().add("Duelist Spirit");

		Guerreiro g2 = new Guerreiro("Martelx", 10000, 1300, 80, 35, 137, 80);

		g2.getHabilidade().add("Triple Sonic Slash");
		g2.getHabilidade().add("Battle Roar");
		g2.getHabilidade().add("Duelist Spirit");

		System.out.println(m1);
		m1.lvlUp();
		System.out.println(m1);

		System.out.println(g1);
		g1.lvlUp();
		System.out.println(g1);

		System.out.println();
		m1.attack();
		g1.attack();

		System.out.println();
		System.out.println("Quantidade de personagens criados: " + Personagem.getSequence());

	}

}
