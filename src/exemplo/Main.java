package exemplo;

import exemplo.classes.ControleRemoto;
import exemplo.classes.ImplementaPanasonic;
import exemplo.classes.ImplementaPhilco;

public class Main {

	public static void main(String[] args) {
		
		ControleRemoto controle = new ControleRemoto();
		controle.setImplementacao(new ImplementaPanasonic());
		controle.ligarTV();
		
		//Mudou de TV
		controle.setImplementacao(new ImplementaPhilco());
		controle.ligarTV();

	}

}
