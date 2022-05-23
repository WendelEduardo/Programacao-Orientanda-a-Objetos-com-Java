package br.fiap.cliente;

public class PessoaFisica extends Cliente {
	private String cpf;

	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		String aux = "";
		aux += "Nome: " + getNome() + "  -  ";
		aux += "CPF: " + cpf;
		return aux;
	}
}
