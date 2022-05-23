package br.fiap.main;

import java.util.ArrayList;

import br.fiap.cliente.PessoaFisica;
import br.fiap.cliente.PessoaJuridica;
import br.fiap.venda.Venda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Venda> venda = new ArrayList<>();

		venda.add(new Venda("Produto 1", new PessoaFisica("Wendel", "54353495-x")));
		venda.add(new Venda("Produto 2", new PessoaJuridica("Leticia", "765907")));
		venda.add(new Venda("Produto 3", new PessoaFisica("Dobi", "654634432-x")));
		venda.add(new Venda("Produto 4", new PessoaJuridica("Bidu", "43125464")));

		System.out.println("\n- vendas realizadas para clientes pessoa física -\n");
		for (int i = 0; i < venda.size(); i++) {
			if (venda.get(i).getCliente() instanceof PessoaFisica) {
				System.out.println(venda.get(i));
			}
		}

		System.out.println("\n \n- vendas realizadas para clientes pessoa jurídica -\n");
		for (int i = 0; i < venda.size(); i++) {
			if (venda.get(i).getCliente() instanceof PessoaJuridica) {
				System.out.println(venda.get(i));
			}
		}

	}

}
