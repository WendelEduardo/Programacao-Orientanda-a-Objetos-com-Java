package br.fiap.aluno;

public class AlunoGraduacao extends Aluno {
	private String curso;
	private double trabalho;

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
		return (primeiraProva+SegundaProva)/2;
	}
}
