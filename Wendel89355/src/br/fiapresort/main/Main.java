package br.fiapresort.main;

import br.fiapresort.hospede.Hospede;
import br.fiapresort.hotel.Resort;
import br.fiapresort.reserva.Reserva;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reserva arrayReserva[] = new Reserva[4];

		arrayReserva[0] = new Reserva("26/11/2022", new Resort("Maranhão", 1, "432423-432"),
				new Hospede("Wendel", "341234-12"));
		arrayReserva[1] = new Reserva("15/05/2022", new Resort("Rio de Janeiro", 2, "534534-912"),
				new Hospede("Leticia", "12345-12"));
		arrayReserva[2] = new Reserva(new Hospede("Dobi", "4002-8922"),
				new Resort("Fernando de Noronha", 3, "9192-101"));
		arrayReserva[3] = new Reserva(new Hospede("Bidu", "6565-7676"), new Resort("São Paulo", 4, "4142-434"));

		System.out.println(" RESERVAS DO SISTEMA \n");
		for (Reserva r : arrayReserva) {
			// System.out.println(r);
			System.out.println(r.getDados());
			System.out.println(" ");
			System.out.println(" ");
		}

		System.out.println(" -------------------------------- ");
		System.out.println(" RESERVAS DO SISTEMA");
		System.out.println(" SÃO PAULO - 25/04/2022");
		System.out.println(" -------------------------------- ");
		System.out.println("  ");

		for (Reserva r : arrayReserva) {

			if (r.getCidade().equalsIgnoreCase("são paulo") && r.getData() == "25/04/2022") {
				System.out.println(r.getDados());
			}

		}

	}

}
