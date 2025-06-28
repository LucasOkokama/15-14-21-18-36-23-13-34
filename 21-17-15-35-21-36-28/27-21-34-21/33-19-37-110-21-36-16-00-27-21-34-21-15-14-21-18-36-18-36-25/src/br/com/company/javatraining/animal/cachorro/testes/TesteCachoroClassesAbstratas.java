package br.com.company.javatraining.animal.cachorro.testes;

import br.com.company.javatraining.animal.cachorro.impl.Cachorro;

public class TesteCachoroClassesAbstratas {
	/*			
		Crie um método main e tente instanciar a classe abstrata. 
		Como é possível ter acesso aos métodos e variáveis dessa classe? 
		R: Através de subclasses concretas que estendem a classe abstrata.
		   Essas subclasses herdam os métodos e variáveis da classe abstrata e precisam implementar os métodos abstratos.
		   Portanto você instancia as subclasses e acessa as variáveis/métodos via essas instâncias.
		
		Se elas não podem ser instanciadas elas podem ter construtores?
		R: Sim. O construtor não pode ser usado para criar instâncias diretas da classe abstrata.
		   No entanto, esse construtor pode ser chamado pela subclasses via super().
	*/
	
	public static void main (String[] args) {}
}
