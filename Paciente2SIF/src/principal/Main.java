package principal;

import paciente.Paciente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente p = new Paciente();

		p.setAltura(1.78);
		p.setNome("Wendel");
		p.setPeso(65);

		System.out.println(p.getNome());
		System.out.println(p.getPeso());
		System.out.println(p.getAltura());
	}
}