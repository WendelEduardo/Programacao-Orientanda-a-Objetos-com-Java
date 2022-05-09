package br.fiap.gerente;

import br.fiap.empregado.Empregado;

public class Gerente extends Empregado{
	private double salario; 
	private double bonus; 

	public Gerente(String nome, String cpf, String matricula, double salario, double bonus) {
		super(nome, cpf, matricula);
		this.salario = salario;
		this.bonus = bonus;
	}


}
