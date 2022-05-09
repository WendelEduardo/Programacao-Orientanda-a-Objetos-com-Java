package br.fiap.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.fiap.empregado.Empregado;
import br.fiap.gerente.Gerente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux = "";
		int opcao = 0;

		ArrayList<Empregado> empregado = new ArrayList<Empregado>();

		aux += "Escolha uma operação:\r\n" + "1. Cadastrar Empregado\r\n" + "2. Cadastrar Cliente\r\n"
				+ "3. Pesquisar\r\n" + "4. Listar Empregados\r\n" + "5. Listar Clientes\r\n" + "6. Remover\r\n"
				+ "7. Finalizar ";

		while (opcao != 7) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(aux));

			switch (opcao) {
			case 1:
				String opcaoSubMenu = "";
				int intOpcaoSubMenu;
				opcaoSubMenu += "Deseja cadastrar que tipo de empregado? \n";
				opcaoSubMenu += "1 - Gerente \n";
				opcaoSubMenu += "2 - Vendedor \n";

				intOpcaoSubMenu = Integer.parseInt(JOptionPane.showInputDialog(opcaoSubMenu));

				switch (intOpcaoSubMenu) {
				case 1:
					String nome, cpf, matricula;
					double salario = 0, bonus = 0;

					nome = JOptionPane.showInputDialog("NOME: ");
					cpf = JOptionPane.showInputDialog("CPF: ");
					matricula = JOptionPane.showInputDialog("MATRICULA: ");
					salario = Double.parseDouble(JOptionPane.showInputDialog("SALARIO: "));
					bonus = Double.parseDouble(JOptionPane.showInputDialog("BONUS: "));
					empregado.add(new Gerente(nome, cpf, matricula, salario, bonus));

					JOptionPane.showMessageDialog(null, "EMPREGADO: " + nome + ", CADASTRADO!");
					break;
				}
				break;
			}
		}

		JOptionPane.showMessageDialog(null, "Finalizado!");

	}

}
