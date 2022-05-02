package br.fiap.figuras;

public abstract class Figura {
	protected int coordenadaX;
	protected int coordenadaY;
	protected double raio;

	public Figura(int coordenadaX, int coordenadaY, double raio) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.raio = raio;
	}

	public abstract double calcularArea();


	@Override
	public String toString() {
		String aux = "";
		aux += "Coordenada x: " + coordenadaX + " \n";
		aux += "Coordenada y: " + coordenadaY + " \n";
		aux += "Raio: " + raio + " \n";
		return aux;
	}

}