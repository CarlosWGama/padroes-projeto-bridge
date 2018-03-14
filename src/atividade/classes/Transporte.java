package atividade.classes;

import atividade.classes.implementacao.IImplementacaoTransporte;

public class Transporte {

	public IImplementacaoTransporte transporte;
	
	public double viajar(int origem, int destino) {
		return transporte.viajar(origem, destino);
	}
}

