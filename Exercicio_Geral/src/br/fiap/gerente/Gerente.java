package br.fiap.gerente;

import br.fiap.empregado.Empregado;

public class Gerente extends Empregado {
	private double salario;
	private double bonus;

	public Gerente(String nome, String cpf, String matricula, double salario, double bonus) {
		super(nome, cpf, matricula);
		this.salario = salario;
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		String aux = "";
		aux += "Nome: "+ nome + "\n";
		aux += "CPF: "+ cpf + "\n";
		aux += "Matricula: "+matricula + "\n";
		aux += "Salario: "+salario + "\n";
		aux += "Bonus: "+bonus + "\n";
		aux += "\n";
		
		return (aux);
	}
}
