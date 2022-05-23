package br.fiap.venda;

import br.fiap.cliente.Cliente;

public class Venda {
	private String produto;
	private Cliente cliente;

	public Venda(String produto, Cliente cliente) {
		super();
		this.produto = produto;
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		String aux = "";
		aux += "Produto: " + produto + "\n";
		aux += "Cliente: " + cliente + "\n";
		return aux;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
