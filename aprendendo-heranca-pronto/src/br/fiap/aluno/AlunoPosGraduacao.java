package br.fiap.aluno;

public class AlunoPosGraduacao extends Aluno {

	public AlunoPosGraduacao(long rm, String nome, double primeiraProva, double SegundaProva) {
		super(rm, nome, primeiraProva, SegundaProva);
	}

	public double calcularMedia() {
		return primeiraProva * 0.4 + SegundaProva * 0.6;
	}
}
