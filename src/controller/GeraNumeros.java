package controller;

public class GeraNumeros implements IObservavel{
	
	private Observador observador;

	
	public GeraNumeros(Observador observador) {
		this.observador = observador;
	}

	@Override
	public void notifica(int acao) {
		
		int numeroRandom = (int)((Math.random() * 1000) + 1);
		System.out.println("Número gerado: " + numeroRandom);
		acao = numeroRandom;
		observador.update(acao);
		
	}

}
