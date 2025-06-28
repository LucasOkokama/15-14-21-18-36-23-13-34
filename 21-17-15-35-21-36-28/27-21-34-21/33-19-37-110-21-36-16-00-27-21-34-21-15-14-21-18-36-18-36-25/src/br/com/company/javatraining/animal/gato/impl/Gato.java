package br.com.company.javatraining.animal.gato.impl;

public abstract class Gato {
	/*	
		Crie uma classe abstrata Gato.
		
		Definam comportamentos referentes a gatos dentro da classe abstrata.
	*/
	protected String nome;
    protected int idade;
    protected String cor;
    protected String[] vacinas;
	
	public abstract void miar();
    public abstract void arranhar();
    public abstract void subirEmMoveis();
}
