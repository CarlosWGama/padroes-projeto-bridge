package atividade.classes;

public class Transporte {

	public String tipo = "carro";
	
	public double viajar(int origem, int destino) {
		//Pega a distância em KM
		double distancia = destino - origem;
		
		double tempoGastoEmHoras;
		
		switch(tipo) {
			case "carro": 
				tempoGastoEmHoras = (distancia / 60);
				break;
			case "bicicleta":
				tempoGastoEmHoras = distancia / 20;
				break;
			default:
				tempoGastoEmHoras = distancia / 10;
		}
		return tempoGastoEmHoras;
	}
}
