package br.fiap.aluno;

public abstract class Aluno {
	protected long rm;
	protected String nome;
	protected double primeiraProva;
	protected double SegundaProva;

	public Aluno(long rm, String nome, double primeiraProva, double SegundaProva) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.primeiraProva = primeiraProva;
		this.SegundaProva = SegundaProva;
	}

	public abstract double calcularMedia();
	
	@Override
	public String toString() {
		String aux = "";
		aux += "RM: "+ rm + "\n"; 
		aux += "Nome: "+ nome + "\n"; 
		aux += "Média: " + calcularMedia() + "\n"; 
		
		return aux;
	}

	
}