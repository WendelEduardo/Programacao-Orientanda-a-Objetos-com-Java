import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Util {

	// ARRAY PARA ARMAZENAR OBJETOS DO TIPO BILHETE UNICO
	private BilheteUnico[] bd = new BilheteUnico[5];

	// VARIAVEL PARA CONTROLAR AS POSIÇÕES DO ARRAY
	private int index = 0;

	public void menuPrincipal() {

		String aux = "Escolha uma operação: \n1. Administrador \n2. Usuário\n3. Finalizar";

		int opcao;

		do {
			opcao = parseInt(showInputDialog(null, aux));

			if (opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Opção Inválida!");
			} else {
				if (opcao == 1) {
					menuAdministrador();
				} else if (opcao == 2) {
					menuUsuario();
				}
			}

		} while (opcao != 3);
		showMessageDialog(null, "Acesso finalizado!");

	}

	public void menuAdministrador() {
		String adm = "Operações: \n";
		adm += "1. Cadastrar Bilhete \n";
		adm += "2. Consultar Bilhete \n";
		adm += "3. Sair";

		int opcao;

		do {
			opcao = parseInt(showInputDialog(adm));

			if (opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Opção Inválida!");
			} else {
				switch (opcao) {
				case 1:
					cadastrarBilhete();
					break;
				case 2:
					consultarBilhete();
					break;

				}
			}

		} while (opcao != 3);

	}

	public void menuUsuario() {

		String user = "Operações: \n";
		user += "1 - Consultar Saldo \n";
		user += "2 - Carregar Bilhete \n";
		user += "3 - Passar na catraca \n";
		user += "4 - Sair";

		int opcao;

		do {
			opcao = parseInt(showInputDialog(user));

			if (opcao < 1 || opcao > 4) {
				showMessageDialog(null, "Opção Inválida!");
			} else {
				switch (opcao) {
				case 1:
					consultarSaldo();
					break;
				case 2:
					carregarBilhete();
					break;
				case 3:
					passarCatraca();
					break;
				}
			}

		} while (opcao != 4);
	}

	public void cadastrarBilhete() {

		if (index < bd.length) {
			String nome = showInputDialog("Digite o nome: ");
			String cpf = showInputDialog("Digite o cpf");
			String tipo = showInputDialog("Digite o tipo do cartão \nEstudante Professor ou Normal");

			bd[index] = new BilheteUnico(nome, cpf, tipo);
			index++;
		} else {
			showMessageDialog(null, "Procure um posto autorizado!");
		}

	}

	// MÉTODO AUXILIAR PARA PESQUISAR UM BILHETE PELO CPF DO USUÁRIO
	// MÉTODO RETORNA A POSIÇÃO VÁLIDA DO ARRAY OU -1 SE NÃO ENCONTRAR O OBJETO
	public int pesquisar(String cpf) {
		int aux = -1;

		for (int i = 0; i < index; i++) {
			if (bd[i].usuario.cpf.equalsIgnoreCase(cpf)) {
				aux = i;
				break;
			}
		}

		return aux;
	}

	// METODO PARA CONSULTAR E EXIBIR OS DADOS DO BILHETE (MENU ADMINISTRADOR)
	public void consultarBilhete() {
		int posicao;
		String aux, cpf;

		cpf = showInputDialog("Informe o CPF a ser pesquisado: ");
		posicao = pesquisar(cpf);

		if (posicao == -1) {
			showMessageDialog(null, cpf + ", Não encontrado!");
		} else {
			aux = "Nome do usuário: " + bd[posicao].usuario.nome + "\n";
			aux += "CPF do usuário: " + bd[posicao].usuario.cpf + "\n";
			aux += "Tipo do usuário: " + bd[posicao].usuario.tipo + "\n";
			aux += "Número do bilhete: " + bd[posicao].numero + "\n";
			aux += "Saldo do bilhete: " + String.format("R$" + "%.2f", bd[posicao].saldo) + "\n";

			showMessageDialog(null, aux);
		}
	}

	// METODO PARA CONSULTAR O SALDO DO BILHETE DE UM USUÁRIO
	public void consultarSaldo() {
		String cpf = showInputDialog("Digite seu CPF: ");
		int controla = pesquisar(cpf);

		if (controla == -1) {
			showMessageDialog(null, cpf + ", Não encontrado!");
		} else {
			showMessageDialog(null, "Saldo da conta: " + bd[controla].saldo + "\n");
		}
	}

	public void carregarBilhete() {
		String cpf = showInputDialog("Digite seu CPF: ");
		int controla = pesquisar(cpf);

		if (controla == -1) {
			showMessageDialog(null, cpf + ", Não encontrado!");
		} else {
			double valor = Double.parseDouble(showInputDialog("Digite o valor para carregar: "));
			bd[controla].carregarBilhete(valor);
			showMessageDialog(null, "Valor debitado!");
		}

	}

	public void passarCatraca() {
		int posicao;
		String aux, cpf;

		cpf = showInputDialog("Informe o CPF a ser pesquisado: ");
		posicao = pesquisar(cpf);

		if (posicao == -1) {
			showMessageDialog(null, cpf + ", Não encontrado!");
		} else {
			bd[posicao].passarNaCatraca();
			aux = "Tipo do usuário: " + bd[posicao].usuario.tipo + "\n";
			aux += "Número do bilhete: " + bd[posicao].numero + "\n";
			aux += "Saldo do bilhete: " + String.format("R$" + "%.2f", bd[posicao].saldo) + "\n";

			showMessageDialog(null, aux);
		}
	}

}