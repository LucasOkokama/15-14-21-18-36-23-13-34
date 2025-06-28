package br.com.company.javatraining.animal.cachorro.testes;

import br.com.company.javatraining.animal.cachorro.Beagle;
import br.com.company.javatraining.animal.cachorro.impl.Cachorro;

public class TestaCachorroSobrecarga {
	/*
		Crie uma classe de testes TestaCachorroSobrecarga. Crie o método main e teste os novos métodos latir().
		
		Se existisse dois métodos:
				- public void latir(long par)
				- public void latir(int par)
				
		Qual método seria chamado no caso "latir(1234)"?
		R: O método chamado será latir(int par), porque o número 1234 é um inteiro (int)
		
		
		Tente sobrescrever qualquer um dos métodos de String
		R: String é uma CLASS FINAL e não pode ser sobrescrita.
	*/

	public static void main (String[] args) throws Exception {
		String[] vacinas = {"V10", "Antirrábica", "Gripe Canina"};
		Cachorro myDog = new Beagle("Keli", 1, "Branco com marrom", vacinas);
		
		myDog.latir();
		myDog.latir2("auauau");
		myDog.latir3("auauua", "bark bark");
	}
}
