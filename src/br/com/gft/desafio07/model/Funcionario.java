package br.com.gft.desafio07.model;

public class Funcionario {

	private String nome;
	private Integer idade;
	private Double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, Integer idade, Double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public double bonificacao() {
		return salario;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNome: " + nome);
		sb.append("\nIdade: " + idade);
		sb.append("\nSalario: " + String.format("%.2f", salario));
		sb.append("\nBonificacao: " + String.format("%.2f", bonificacao()));
		return sb.toString();
	}

}
