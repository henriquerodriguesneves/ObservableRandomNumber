package controller;

public class Observador implements IObservador{

	@Override
	public void update(int acao) {
		
		if (acao % 2 == 0)
			System.out.println("O número é par");
		if (acao % 2 == 1)
			System.out.println("O número é impar");
		
	}

}
