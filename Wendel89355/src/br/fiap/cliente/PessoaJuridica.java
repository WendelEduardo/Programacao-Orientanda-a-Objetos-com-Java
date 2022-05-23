package br.fiap.cliente;

public class PessoaJuridica extends Cliente {
	private String cnpj;

	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		String aux = "";
		aux += "Nome: " + getNome() + "  -  ";
		aux += "CNPJ: " + cnpj;
		return aux;
	}
}
