import java.util.Random;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class BilheteUnico {

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

}