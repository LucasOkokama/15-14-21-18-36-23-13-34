package br.com.company.javatraining.animal.cachorro.testes;

import br.com.company.javatraining.animal.cachorro.Beagle;

public class TesteCachorroHeranca {
	/*		
		Crie uma nova classe de testes TesteCachorroHeranca.
	
		Crie um método main e dentro desse método, crie uma instância da classe concreta. 
		Todos os métodos da interface e da classe abstrata estarão disponíveis através desta variável de referência.
		Chame os métodos definidos.
	*/
	
	public static void main (String[] args) throws Exception {
		String[] vacinas = {"V10", "Antirrábica", "Gripe Canina"};
        Beagle myDog = new Beagle("Branca com marrom", 3, "Keli", vacinas);
        
        myDog.latir();
        myDog.comer();
        myDog.dormir();
	}
}
