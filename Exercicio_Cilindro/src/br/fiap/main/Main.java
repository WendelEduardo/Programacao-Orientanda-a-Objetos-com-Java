package br.fiap.main;

import br.fiap.figuras.Cilindro;
import br.fiap.figuras.Circulo;
import br.fiap.figuras.Figura;
import br.fiap.volume.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura[] figura = new Figura[4];
		

		figura[0] = new Circulo(2, 3, 4);
		figura[1] = new Cilindro(3, 3, 3.5, 3.75);
		figura[2] = new Circulo(4, 4, 4);
		figura[3] = new Cilindro(5, 5, 5, 5);
		
		for(Figura f:figura) {
			System.out.println("Area " + f.calcularArea());		
		}
		
		System.out.println(" ");
		
		for(Figura f:figura) {
			if(f instanceof Volume) {
				System.out.println("Volume do Cilindro: " + ((Volume) f).calcularVolume());
			}
		}
		
	}

}
