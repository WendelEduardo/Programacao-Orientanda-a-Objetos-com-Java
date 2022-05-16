package br.fiap.controle;

import java.util.ArrayList;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

import br.fiap.cliente.Cliente;
import br.fiap.gerente.Gerente;
import br.fiap.pessoa.Pessoa;
import br.fiap.vendedor.Vendedor;

public class Controle {

	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

	public void menuPrincipal() {
		String aux = "";
		int opcao = 0;

		aux += "Escolha uma opção:\r\n" + "1. Cadastrar Empregado\r\n" + "2. Cadastrar Cliente\r\n" + "3. Pesquisar\r\n"
				+ "4. Listar Empregados\r\n" + "5. Listar Clientes\r\n" + "6. Remover\r\n" + "7. Finalizar ";

		do {
			try {
				opcao = parseInt(showInputDialog(aux));

				if (opcao < 1 || opcao > 7) {
					showMessageDialog(null, "Opção inválida!");
				}

				switch (opcao) {
				case 1:
					cadastrarEmpregado();
					break;
				case 2:
					cadastrarCliente();
					break;
				case 3:
					pesquisar();
					break;
				case 4:
					listarEmpregados();
					break;
				case 5:
					listarClientes();
					break;
				case 6:
					remover();
					break;
				}

			} catch (NumberFormatException e) {
				showMessageDialog(null, "Você deve informar uma opção númerica!");
			}

		} while (opcao != 7);

		showMessageDialog(null, "Finalizado!");
	}

	private void cadastrarEmpregado() {
		String opcaoSubMenu = "", nome, cpf, matricula;
		int opcao = 0;

		opcaoSubMenu += "Deseja cadastrar que tipo de empregado? \n";
		opcaoSubMenu += "1 - Gerente \n";
		opcaoSubMenu += "2 - Vendedor \n";
		opcaoSubMenu += "3 - Retornar \n";

		do {
			try {
				opcao = parseInt(showInputDialog(opcaoSubMenu));

				if (opcao < 1 || opcao > 3) {
					showMessageDialog(null, "Opção inválida!");
				} else {
					if (opcao == 1 || opcao == 2) {
						nome = showInputDialog("NOME: ");
						cpf = showInputDialog("CPF: ");
						matricula = showInputDialog("MATRICULA: ");

						switch (opcao) {
						case 1:
							double salario = parseDouble(showInputDialog("SALARIO: "));
							double bonus = parseDouble(showInputDialog("BONUS: "));
							lista.add(new Gerente(nome, cpf, matricula, salario, bonus));

							showMessageDialog(null, "Empregado: " + nome + ", cadastrado!");
							break;

						case 2:
							double totalDasVendas = parseDouble(showInputDialog("Total das vendas: "));
							double comissao = parseDouble(showInputDialog("Comissão: "));

							lista.add(new Vendedor(nome, cpf, matricula, totalDasVendas, comissao));

							showMessageDialog(null, "Vendedor: " + nome + ", cadastrado!");
							break;
						}
					} else {
						break;
					}
				}

			} catch (NumberFormatException e) {
				showMessageDialog(null, "Você deve digitar uma opção númerica!");
			}
		} while (opcao != 3);

	}

	private void cadastrarCliente() {
		String nome = showInputDialog("NOME: ");
		String cpf = showInputDialog("CPF: ");
		double valorDaDivida = parseDouble(showInputDialog("Valor da divída: "));

		lista.add(new Cliente(nome, cpf, valorDaDivida));
	}

	private void pesquisar() {
		int indice = pesquisarAux();
		if (indice == -1) {
			showMessageDialog(null, "Não encontrado!");
		}

		String cpf = showInputDialog("Digite o CPF que deseja excluir: ");

		for (Pessoa p : lista) {
			if (p.getCPF().equals(cpf)) {

			}
		}
	}

	private int pesquisarAux() {

		return 0;
	}

	private void listarEmpregados() {
		String gerente = "";
		String vendedor = "";

		for (Pessoa p : lista) {
			if (p instanceof Gerente) {
				gerente += p + "\n";
			} else if (p instanceof Vendedor) {
				vendedor += p + "\n";
			}
		}

		showMessageDialog(null, "GERENTES \n \n" + gerente);
		showMessageDialog(null, "VENDEDORES \n \n" + vendedor);
	}

	private void listarClientes() {
		String cliente = "";

		for (Pessoa p : lista) {
			if (p instanceof Cliente) {
				cliente += p;
			}
		}

		showMessageDialog(null, "CLIENTES \n \n" + cliente);
	}

	private void remover() {
		/*
		 * String cpf = showInputDialog("Digite o CPF que deseja excluir: ");
		 * 
		 * for(Pessoa p : lista) { if(p.getCPF().equals(cpf)) {
		 * 
		 * } }
		 */
	}
}