package atividade;

import atividade.classes.Transporte;

public class Main {

	public static void main(String[] args) {
		
		
		Transporte transporte = new Transporte();
		System.out.println("Tempo de viagem: " + 
				String.format("%.2f", transporte.viajar(10, 90))
		);
	}

}
