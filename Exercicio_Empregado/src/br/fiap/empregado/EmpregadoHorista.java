package br.fiap.empregado;

public class EmpregadoHorista extends Empregado {

	private int totalDeHorasTrabalhadas;
	private double valorDaHoraTrabalhada;

	public EmpregadoHorista(String nome, long matricula, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
		super(nome, matricula);
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}

	public int getTotalDeHorasTrabalhadas() {
		return totalDeHorasTrabalhadas;
	}

	public void setTotalDeHorasTrabalhadas(int totalDeHorasTrabalhadas) {
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
	}

	public double getValorDaHoraTrabalhada() {
		return valorDaHoraTrabalhada;
	}

	public void setValorDaHoraTrabalhada(double valorDaHoraTrabalhada) {
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}

	public double calcularSalario() {
		return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
	}

	public String toString() {
		String aux = super.toString();
		aux += "Total de horas trabalhadas: " + totalDeHorasTrabalhadas + "\n";
		aux += "Valor da hora trabalhada: : " + valorDaHoraTrabalhada + "\n";

		return aux;
	}
}
