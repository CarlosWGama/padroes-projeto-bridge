package atividade;

import atividade.classes.Transporte;
import atividade.classes.implementacao.IImplementacaoTransporte;
import atividade.classes.implementacao.ImplementaCarro;

public class Main {

	public static void main(String[] args) {
		
		Transporte transporte = new Transporte();
		transporte.transporte = new ImplementaCarro();
		System.out.println("Tempo de viagem: " + 
				String.format("%.2f", transporte.viajar(10, 90))
		);
	}

}
