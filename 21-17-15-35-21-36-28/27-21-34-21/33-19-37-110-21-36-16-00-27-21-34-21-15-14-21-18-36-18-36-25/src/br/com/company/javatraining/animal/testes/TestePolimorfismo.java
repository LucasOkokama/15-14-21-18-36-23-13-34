package br.com.company.javatraining.animal.testes;

import br.com.company.javatraining.animal.cachorro.Beagle;
import br.com.company.javatraining.animal.cachorro.dt.IAnimal;
import br.com.company.javatraining.animal.gato.impl.Siames;
import br.com.company.javatraining.animal.impl.AnimalUtil;

public class TestePolimorfismo {
	/*		
		Crie uma classe TestePolimorfismo.
		
		Crie um método main e crie uma instância de Siames da seguinte forma: Animal a = new Siames();
		
		
		
		Quais métodos são acessíveis através desta variável de referência? 
		R: A variável a é do tipo IAnimal, então só terá acesso aos métodos definidos na interface IAnimal
		
		Qual objeto foi criado na memória?
		R: Foi criado um objeto da classe Siames na memória.
		
		
		
		Utilizando a variável declarada, instancie um <SeuCachorro>. Responda o item anterior novamente.
		
		Quais métodos são acessíveis através desta variável de referência? 
		R: A variável a é do tipo IAnimal, então só terá acesso aos métodos definidos na interface IAnimal
		
		Qual objeto foi criado na memória?
		R: Foi criado um objeto da classe Beagle na memória.
		
		
		
		Dentro da classe TestePolimorfismo, chamem o método verificaAnimal passando uma variável do tipo Animal.
	*/
	
	public static void main (String[] args) {
		IAnimal a = new Siames();
		AnimalUtil.verificaAnimal(a);
		
		a = new Beagle();
		AnimalUtil.verificaAnimal(a);
	}
}
