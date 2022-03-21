import java.util.Random;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class BilheteUnico {

	// ARRAY PARA ARMAZENAR OBJETOS DO TIPO BILHETE UNICO
	BilheteUnico[] bd = new BilheteUnico[5];

	// VARIAVEL PARA CONTROLAR AS POSIÇÕES DO ARRAY
	int index = 0;

	int numero;
	double saldo;
	static double valorDaPassagem = 4.40;
	Usuario usuario;

	public BilheteUnico(String nome, String cpf, String tipo) {
		Random gerador = new Random();

		this.numero = gerador.nextInt(10000);
		this.saldo = 0;
		this.usuario = new Usuario(nome, cpf, tipo);
	}

	public double consultadorSaldo() {
		return this.saldo;
	}

	public void carregarBilhete(double valor) {
		this.saldo += valor;
	}

	public void passarNaCatraca() {
		if (saldo < valorDaPassagem) {
			System.out.println("Saldo Zerado!");
		} else {
			if (usuario.tipo.equalsIgnoreCase("estudante") || (usuario.tipo.equalsIgnoreCase("professor"))) {
				saldo -= (valorDaPassagem / 2);
			} else {
				saldo -= valorDaPassagem;
			}
		}
	}

	public void cadastrarBilhete() {

		if (index < bd.length) {
			String nome = showInputDialog("Digite o nome: ");
			String cpf = showInputDialog("Digite o cpf");
			String tipo = showInputDialog("Digite o tipo do cartão \nEstudanteProfessor ou Normal");

			bd[index] = new BilheteUnico(nome, cpf, tipo);
			index++;
		} else {
			showMessageDialog(null, "Procure um posto autorizado!");
		}

	}
}