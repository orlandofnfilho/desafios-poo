package br.com.gft.desafio07.model;

public class Supervisor extends Funcionario {

	public Supervisor() {
		super();
	}

	public Supervisor(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return super.bonificacao() + 5000.0;
	}

}
