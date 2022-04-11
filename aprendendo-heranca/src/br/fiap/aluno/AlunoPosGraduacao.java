package br.fiap.aluno;

public class AlunoPosGraduacao extends Aluno {
	
	public double calcularMedia() {
		return (primeiraProva+SegundaProva)/2;
	}
}
