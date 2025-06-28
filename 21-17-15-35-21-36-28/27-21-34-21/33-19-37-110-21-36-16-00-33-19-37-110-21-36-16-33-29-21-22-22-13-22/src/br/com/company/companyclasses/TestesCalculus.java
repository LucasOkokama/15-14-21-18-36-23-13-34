package br.com.company.companyclasses;

import java.math.BigDecimal;

import br.com.company.gen.util.CalculoMat;

public class TestesCalculus {
	/*			
		Dada a String s = "2347234823323,123456789"
		
		A partir de s, crie um BigDecimal e o imprima
		Crie um BigDecimal igual a 0 e o imprima.
		
		Crie um array de BigDecimal e some todos seus elementos.
		
		Verifique se a primeira posição do array é menor que a segunda posição do array.
	*/
	
	public static void main (String[] args) {
		String s = "2347234823323,123456789";
		
		BigDecimal bd = CalculoMat.getBigDecimal(s);
		System.out.println(bd);
		
		BigDecimal bd2 = CalculoMat.getBigDecimal("0");
		System.out.println(bd2);
		
		System.out.println("\n");
		
		
		BigDecimal[] bdArray = new BigDecimal[] {
			CalculoMat.getBigDecimal("123,545656"),
			CalculoMat.getBigDecimal("68,99999"),
			CalculoMat.getBigDecimal("32,000000001"),
		};
		
		BigDecimal bdSoma = BigDecimal.ZERO;
		for(BigDecimal num: bdArray) {
			bdSoma = bdSoma.add(num);
		}
		
		System.out.println("A soma dos elementos do Array é: " + bdSoma);
		System.out.println("\n");
		
		
		System.out.println(bdArray[0] + " < " + bdArray[1] + " = " + CalculoMat.ehMenor(bdArray[0], bdArray[1]));
	}
}
