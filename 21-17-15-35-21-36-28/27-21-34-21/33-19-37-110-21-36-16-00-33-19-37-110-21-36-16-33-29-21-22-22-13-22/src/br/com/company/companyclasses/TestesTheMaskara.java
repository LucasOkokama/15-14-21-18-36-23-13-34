package br.com.company.companyclasses;

import br.com.company.gen.util.MaskedInput;
import br.com.company.utils.Formatador;

public class TestesTheMaskara {
	/*
		Dada a String cep = "04114040"
		A partir de cep, crie a String cepFormatado no formato 04114-040
		
		Dada a String teste = "TREINAMENTO"
		A partir de teste, crie uma String testeFormatado no formato T*R*E*I*N*A*M*E*N*T*O
		
		Utilizando a classe Formatador, retire os caracteres da String cepFormatado e imprima (deve ser igual à String cep)
		A partir de testeFormatado, crie uma String testeUnMasked retirando os * da String
	*/
	
	public static void main(String[] args) {
		String cep = "04114040";
		String teste = "TREINAMENTO";
				
		String cepFormatado = MaskedInput.maskInput(cep, "AAAAA-AAA");
		System.out.println(cepFormatado);
		
		String testeFormatado = MaskedInput.maskInput(teste, "A*A*A*A*A*A*A*A*A*A*A");
		System.out.println(testeFormatado);
		
		String cepNaoFormatado = Formatador.tiraCaracterDeNumeros(cepFormatado);
		System.out.println(cepNaoFormatado);
		
		String testeUnMasked = MaskedInput.unMaskInput(testeFormatado, "A*A*A*A*A*A*A*A*A*A*A");
		System.out.println(testeUnMasked);
	}
}
