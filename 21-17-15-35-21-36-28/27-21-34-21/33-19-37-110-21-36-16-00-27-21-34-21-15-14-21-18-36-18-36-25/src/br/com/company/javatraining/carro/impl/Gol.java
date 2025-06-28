package br.com.company.javatraining.carro.impl;

import br.com.company.javatraining.carro.impl.Carro;

public class Gol extends Carro {
	/*		
		Crie uma classe com o nome de um carro (Gol)
		
		Faça Gol extends Carro e <SeuCarro> extends Carro.
	*/
	
	public Gol(String nome, String cor, int ano, int potencia, double kilometragem) {
        super(nome, cor, ano, potencia, kilometragem);
    }
	
	/*		
		Adicione o método abrirVidros() no Gol.
	*/
	public void abrirVidros() {
		System.out.println("Abrindo vidro!");
	};
}
