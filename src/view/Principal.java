package view;

import controller.GeraNumeros;
import controller.Observador;

public class Principal {
	
	public static void main(String[] args) {
		
		Observador o1 = new Observador();
		GeraNumeros gerador = new GeraNumeros(o1);
		
		gerador.notifica(1);
				
	}
	
}
