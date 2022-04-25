package br.fiapresort.reserva;

import br.fiapresort.hospede.Hospede;
import br.fiapresort.hotel.Resort;

public class Reserva {
	private String data = "25/04/2022";
	private Resort resort;
	private Hospede hospede;

	public Reserva(String data, Resort resort, Hospede hospede) {
		this.data = data;
		this.resort = resort;
		this.hospede = hospede;
	}

	public Reserva(Hospede hospede, Resort resort) {
		this.hospede = hospede;
		this.resort = resort;
	}

	public String getDados() {
		String aux = "---------------- RESERVA ---------------- \n";

		aux += "Data: " + data + "\n";
		aux += "\n";
		aux += hospede.getDados();
		aux += "\n";
		aux += resort.getDados();
		
		return aux;
		
	}

	public String getCidade() {
		return resort.getCidade();
	}

	public String getData() {
		return this.data;
	}

}
