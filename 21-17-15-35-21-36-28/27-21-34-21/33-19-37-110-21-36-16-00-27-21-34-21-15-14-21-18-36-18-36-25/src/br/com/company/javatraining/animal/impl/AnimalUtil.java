package br.com.company.javatraining.animal.impl;

import br.com.company.javatraining.animal.cachorro.dt.IAnimal;
import br.com.company.javatraining.animal.cachorro.impl.Cachorro;
import br.com.company.javatraining.animal.gato.impl.Gato;

public class AnimalUtil {
	/*		
		Crie uma classe AnimalUtil.
		
		Nesta classe, criem o método verificaAnimal. 
		Esse método deverá receber um parâmetro do tipo animal. 
		A partir disto, ele deve verificar se o Animal é um Cachorro ou um Gato, imprimindo "Cachorro" ou "Gato".
		
		Se for um cachorro, chamar o método latir()
		Se for um gato, chamar o método miar()
		
		Faça com que não seja necessário ter que criar instâncias da classe AnimalUtil para utilizar os métodos da classe.
	*/
	
	public static void verificaAnimal(IAnimal animal) {
		if (animal instanceof Cachorro) {
			System.out.println("Cachorro");
			((Cachorro) animal).latir();
			System.out.println("\n");
		} else if (animal instanceof Gato){
			System.out.println("Gato");
			((Gato) animal).miar();
			System.out.println("\n");
		}
		
	}
}
