package br.fiap.main;

import br.fiap.aluno.Aluno;
import br.fiap.aluno.AlunoFundamental;
import br.fiap.aluno.AlunoGraduacao;
import br.fiap.aluno.AlunoPosGraduacao;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno[] aluno = new Aluno[3];

		aluno[0] = new AlunoFundamental(43223,"Wendel",10,8,2);
		aluno[1] = new AlunoGraduacao(42342,"Pepito",8,9,"Engenharia",10);
		aluno[2] = new AlunoPosGraduacao(5432,"Ana",10,6);
		
		for (Aluno a : aluno) {
			System.out.print(a + "\n");
		}

	}

}
