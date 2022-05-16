package br.fiap.cliente;

import br.fiap.pessoa.Pessoa;

public class Cliente extends Pessoa {
	private double valorDaDivida;

	public Cliente(String nome, String cpf, double valorDaDivida) {
		super(nome, cpf);
		this.valorDaDivida = valorDaDivida;
	}

	@Override
	public String toString() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "CPF: " + cpf + "\n";
		aux += "Valor Da Divida: " + valorDaDivida + "\n";
		aux += "\n";

		return (aux);
	}

}
