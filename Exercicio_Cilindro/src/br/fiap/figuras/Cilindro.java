package br.fiap.figuras;

import br.fiap.volume.Volume;

public class Cilindro extends Figura implements Volume{

	double altura;

	public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
		super(coordenadaX, coordenadaY, raio);
		this.altura = altura;
	}

	public double calcularArea() {
		return 3.14*(raio*raio) * altura;
	}

	public double calcularVolume() {
		return 0.0;
	}

}
