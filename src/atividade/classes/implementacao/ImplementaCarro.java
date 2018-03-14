package atividade.classes.implementacao;

public class ImplementaCarro implements IImplementacaoTransporte {

	@Override
	public double viajar(int origem, int destino) {
		double distancia = (destino - origem);
		return  distancia / 60;
	}		
}


