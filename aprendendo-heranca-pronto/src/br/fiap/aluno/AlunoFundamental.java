package br.fiap.aluno;

public class AlunoFundamental extends Aluno {

	private int serie;

	public AlunoFundamental(long rm, String nome, double primeiraProva, double SegundaProva, int serie) {
		super(rm, nome, primeiraProva, SegundaProva);
		this.serie = serie;
	}

	public double calcularMedia() {
		return (primeiraProva + SegundaProva) / 2;
	}
	
	
}
