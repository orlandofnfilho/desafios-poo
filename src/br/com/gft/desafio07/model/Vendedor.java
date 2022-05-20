package br.com.gft.desafio07.model;

public class Vendedor extends Funcionario {

	public Vendedor() {
		super();
	}

	public Vendedor(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return super.bonificacao() + 3000.0;
	}

}
