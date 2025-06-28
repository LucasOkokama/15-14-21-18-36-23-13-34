package br.com.company.javatraining.carro.impl;

import br.com.company.javatraining.carro.impl.Carro;
import br.com.company.javatraining.carro.impl.Chrysler;
import br.com.company.javatraining.carro.impl.Gol;

public class CarroUtil {
	/*		
		Crie uma nova classe CarroUtil.
		
		Neste classe, crie o método verificaCarro. 
		Este método deve receber um parâmetro Carro e verificar se trata-se de <SeuCarro> ou Gol, imprimindo “<SeuCarro>” ou "Gol".
		
		Caso o tipo seja <SeuCarro>, chame o método ligarSom(). Caso seja um Gol, chame o método abrirVidros();
	*/
	
	public static void verificaCarro(Carro carro) {
		if(carro instanceof Chrysler) {
			System.out.println("Chrysler");
			((Chrysler) carro).ligarSom();
		}
		else if(carro instanceof Gol) {
			System.out.println("Gol");
			((Gol) carro).abrirVidros();
		}
	}
}
