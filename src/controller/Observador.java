package controller;

public class Observador implements IObservador{

	@Override
	public void update(int acao) {
		
		if (acao % 2 == 0)
			System.out.println("O n�mero � par");
		if (acao % 2 == 1)
			System.out.println("O n�mero � impar");
		
	}

}
