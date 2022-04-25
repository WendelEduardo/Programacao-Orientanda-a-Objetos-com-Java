package br.fiapresort.hospede;

public class Hospede {
	private String nome;
	private String cpf;
	private int pontuacao;

	public Hospede(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getDados() {
		String aux = "---- Hospede ---- \n";
		aux += "Nome: " + nome + "\n";
		aux += "CPF: " + cpf + "\n";
		aux += "Pontuacao: " + pontuacao + "\n";
		return aux;
	}

}
