package br.fiap.controle;

import javax.swing.JOptionPane;

import br.fiap.empregado.Empregado;

public class Controle {

	Empregado ListaEmpregado[] = new Empregado[3];
	int indice;

	public Controle(int tamanho) {

	}

	public void Inserir(Empregado empregado) {
		String nome = JOptionPane.showInputDialog("Digite o nome o empregado");
		empregado.setNome(nome);

		long matricula = Long.parseLong(JOptionPane.showInputDialog("Digite o nome o empregado"));
		empregado.setMatricula(matricula);
	}

	/*
	 * public Empregado pesquisar(int matricula) { return; }
	 */

	public String listar() {
		return "";
	}

}
