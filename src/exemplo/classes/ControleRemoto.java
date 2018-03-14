package exemplo.classes;

public class ControleRemoto {

	private IImplementaControle implementacao;
	
	public void setImplementacao(IImplementaControle implementacao) {
		this.implementacao = implementacao;
	}
	
	public void ligarTV() {
		implementacao.implementaLigar();
	}
	
	public void desligarTV() { 
		implementacao.implementaDesligar();
	}
	
	public void mudarCanal() { 
		implementacao.implementaMudarCanal();
	}
}



