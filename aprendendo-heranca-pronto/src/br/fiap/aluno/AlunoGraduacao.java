package br.fiap.aluno;

public class AlunoGraduacao extends Aluno {

	private String curso;
	private double trabalho;

	public AlunoGraduacao(long rm, String nome, double primeiraProva, double SegundaProva, String curso,
			double trabalho) {
		super(rm, nome, primeiraProva, SegundaProva);
		this.curso = curso;
		this.trabalho = trabalho;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}

	public double calcularMedia() {
		return (primeiraProva + SegundaProva) / 2 * 0.70 + trabalho * 0.30;
	}
}
