package br.fiap.pessoa;

public abstract class Pessoa {
	protected String cpf;
	protected String nome;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String toString() {
		String aux = "";
		return aux;
	}

	public String getCPF() {
		return cpf;
	}
}
