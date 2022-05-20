package br.com.gft.desafio03.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

	private List<String> magia = new ArrayList<>();

	private static Random r = new Random();

	public Mago() {
		super();
	}

	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getMagia() {
		return magia;
	}

	public void attack() {
		int ataqueMagico = 0;
		ataqueMagico = getInteligencia() * getLevel() + r.nextInt(301);
		System.out.println("Dano do ataque: " + ataqueMagico);

	}

	@Override
	public void lvlUp() {
		super.lvlUp();
		this.setVida(getVida() + 200);
		this.setMana(getMana() + 400);
		this.setInteligencia(getInteligencia() + 10);
		this.setForca(getForca() + 1);

	}

	@Override
	public String toString() {
		return "Mago [magia=" + magia + ", nome=" + getNome() + ", vida=" + getVida() + ", mana="
				+ getMana() + ", xp=" + getXp() + ", inteligencia=" + getInteligencia() + ", forca="
				+ getForca() + ", level=" + getLevel() + "]";
	}
	
	

}
