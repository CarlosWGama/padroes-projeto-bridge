package exemplo.classes;

public class ImplementaPanasonic implements IImplementaControle {

	private TVPanasonic tv = new TVPanasonic();
	
	@Override
	public void implementaLigar() {
		tv.iniciar();
	}

	@Override
	public void implementaDesligar() {
		tv.encerrar();
	}

	@Override
	public void implementaMudarCanal() {
		tv.mudarCanal();
	}
}
