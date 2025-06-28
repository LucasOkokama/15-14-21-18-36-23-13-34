package br.com.company.companyclasses;

import br.com.company.utils.Formatador;

public class TestesForumatureido {
	/*		
		Crie uma String com o valor de seu cpf (apenas os dígitos)
		Aplique a máscara de cpf e imprima
		
		Crie uma String cnpj = "03167751000195";
		Aplique a máscara de cnpj e imprima
		
		Dada a String s = "1234":
			- preencha a String com zeros String para que ela fique com tamanho 10
			- preencha a String com 'f' a direita até o tamanho 10
			- preencha a String com 'f' a esquerda até o tamanho 10
	*/
	
	public static void main (String[] args) {
		String cpf = "69480696846";
		System.out.println(Formatador.aplicaMascaraCPF(cpf));
				
		String cnpj = "03167751000195";
		System.out.println(Formatador.aplicaMascaraCNPJ(cnpj));
		
		
		System.out.println("\n");

		
		String s = "1234";
		System.out.println(Formatador.preencheZeros(s, 10));		
		System.out.println(Formatador.preenche(s, 10, 'f', 1));
		System.out.println(Formatador.preenche(s, 10, 'f', 0));
	}
}
