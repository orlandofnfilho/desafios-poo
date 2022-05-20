package br.com.gft.desafio07.model;

public class Gerente extends Funcionario {

	public Gerente() {
		super();
	}

	public Gerente(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return super.bonificacao() + 10000.0;
	}

}
