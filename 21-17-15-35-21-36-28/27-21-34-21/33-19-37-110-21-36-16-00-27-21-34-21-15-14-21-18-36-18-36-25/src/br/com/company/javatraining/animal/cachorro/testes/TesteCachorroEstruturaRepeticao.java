package br.com.company.javatraining.animal.cachorro.testes;

import br.com.company.javatraining.animal.cachorro.Beagle;

public class TesteCachorroEstruturaRepeticao {
	/*		
		Crie a classe TesteCachorroEstruturaRepeticao.
		
		No método main, crie duas variáveis de referência e atribua a elas objetos distintos.
		
		Imprima a "ficha" dos cachorros, percorrendo o array vacinas, utilizando for, while e do/while.
	*/
	
	public static void main (String[] args) throws Exception {
		int j = 0;
		int k = 0;
		
		String[] vacinas1 = {"V10", "Antirrábica", "Gripe Canina"};
        Beagle myDog = new Beagle("Branca com marrom", 3, "Keli", vacinas1);

        String[] vacinas2 = {"V10", "Leptospirose"};
        Beagle myDog2 = new Beagle("Preta", 5, "Thor", vacinas2);
        
        
        
     
        System.out.println("Ficha do " + myDog.getNome() + " (usando FOR)");
        System.out.println("Vacinas:");
        for(int i=0; i<myDog.getVacinas().length; i++) {
        	System.out.println("  - " + myDog.getVacinas()[i]);
        }
        
        System.out.println("\n");
        
        
        
        System.out.println("Ficha do " + myDog2.getNome() + " (usando WHILE)");
        System.out.println("Vacinas:");
        while(j < myDog2.getVacinas().length) {
        	System.out.println("  - " + myDog2.getVacinas()[j]);
        	j++;
        }
        
        System.out.println("\n");

        
        
        System.out.println("Ficha do " + myDog2.getNome() + " (usando DO/WHILE)");
        System.out.println("Vacinas:");
        do{
        	System.out.println("  - " + myDog2.getVacinas()[k]);
        	k++;
        }while(k < myDog2.getVacinas().length);
        
        System.out.println("\n");

        
        
        System.out.println("Ficha do " + myDog2.getNome() + " (usando toString + FOR)");
        System.out.println(myDog2);
	}
}
