package br.com.gft.desafio04.model;

import java.util.Comparator;
import java.util.Objects;

public class Pessoa{
	
	private String nome;
	private Integer idade;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
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

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}
	
	
	
	
}
