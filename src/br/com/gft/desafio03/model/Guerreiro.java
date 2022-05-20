package br.com.gft.desafio03.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

	private List<String> habilidade = new ArrayList<>();

	private static Random r = new Random();

	public Guerreiro() {
		super();
	}

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void attack() {
		int ataqueFisico = 0;
		ataqueFisico = getForca() * getLevel() + r.nextInt(301);
		System.out.println("Dano do ataque: " + ataqueFisico);

	}

	@Override
	public void lvlUp() {
		super.lvlUp();
		this.setVida(getVida() + 600);
		this.setMana(getMana() + 200);
		this.setForca(getForca() + 10);
		this.setInteligencia(getInteligencia() + 1);

	}
	
	@Override
	public String toString() {
		return "Guerreiro [habilidade=" + habilidade + ", nome=" + getNome() + ", vida=" + getVida() + ", mana="
				+ getMana() + ", xp=" + getXp() + ", inteligencia=" + getInteligencia() + ", forca="
				+ getForca() + ", level=" + getLevel() + "]";
	}

}
