package br.fiap.empregado;

public class EmpregadoComissionado extends Empregado {

	private double totalDeVendas;
	private double comissao;

	public EmpregadoComissionado(String nome, long matricula, double totalDeVendas, double comissao) {
		super(nome, matricula);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}

	public double getTotalDeVendas() {
		return totalDeVendas;
	}

	public void setTotalDeVendas(double totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalario() {
		return totalDeVendas * comissao / 100;
	}

	public String toString() {
		String aux = super.toString();
		aux += "Total de vendas: " + totalDeVendas + "\n";
		aux += "Comissão: : " + comissao + "\n";

		return aux;
	}

}
