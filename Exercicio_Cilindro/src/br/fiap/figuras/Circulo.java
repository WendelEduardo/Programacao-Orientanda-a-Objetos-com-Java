package br.fiap.figuras;

public class Circulo extends Figura {

	public Circulo(int coordenadaX, int coordenadaY, double raio) {
		super(coordenadaX, coordenadaY, raio);
	}

	public double calcularArea() {
		return 3.14*(raio*raio);
	}

}
