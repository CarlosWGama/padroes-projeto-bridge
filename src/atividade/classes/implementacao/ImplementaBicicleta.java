package atividade.classes.implementacao;

public class ImplementaBicicleta implements IImplementacaoTransporte {

	@Override
	public double viajar(int origem, int destino) {
		double distancia = (destino - origem);
		return  distancia / 20;
	}		
}
