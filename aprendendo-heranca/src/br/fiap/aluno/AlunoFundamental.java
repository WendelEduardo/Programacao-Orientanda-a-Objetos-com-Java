package br.fiap.aluno;

public class AlunoFundamental extends Aluno {
	private int serie;

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public double calcularMedia() {
		return (primeiraProva+SegundaProva)/2;
	}
}
