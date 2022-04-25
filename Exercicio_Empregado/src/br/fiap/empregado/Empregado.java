package br.fiap.empregado;

public abstract class Empregado {

	protected String nome;
	protected long matricula;

	public Empregado(String nome, long matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public abstract double calcularSalario();

	@Override
	public String toString() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "Matricula: " + matricula + "\n";

		return aux;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
}
