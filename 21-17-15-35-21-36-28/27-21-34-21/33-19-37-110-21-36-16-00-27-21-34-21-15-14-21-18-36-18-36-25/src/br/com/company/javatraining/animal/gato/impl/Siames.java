package br.com.company.javatraining.animal.gato.impl;

import br.com.company.javatraining.animal.cachorro.dt.IAnimal;

public class Siames extends Gato implements IAnimal {
	/*		
		Crie uma classe Siames dentro do mesmo pacote. Esta classe deve implementar a interface Animal e estender a classe Gato.
	*/
	
	@Override
	public void miar() {
		System.out.println(nome + " está miando!");
	}
	
	@Override
	public void dormir() {
		System.out.println(nome + " está dormindo!");
	}
	
	@Override
	public void subirEmMoveis() {
		System.out.println(nome + " está subindo nos móveis!");
	}
	
	@Override
	public void arranhar() {
		System.out.println(nome + " está arranhando!");
	}
	
	@Override
	public void comer() {
		System.out.println(nome + " está comendo!");
	}
}

