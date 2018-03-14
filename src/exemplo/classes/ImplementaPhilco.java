package exemplo.classes;

public class ImplementaPhilco implements IImplementaControle {

	private TVPhilco tv = new TVPhilco();
	
	@Override
	public void implementaLigar() {
		tv.ligar();
	}

	@Override
	public void implementaDesligar() {
		tv.desligar();
	}

	@Override
	public void implementaMudarCanal() {
		tv.setCanal();
	}
}
