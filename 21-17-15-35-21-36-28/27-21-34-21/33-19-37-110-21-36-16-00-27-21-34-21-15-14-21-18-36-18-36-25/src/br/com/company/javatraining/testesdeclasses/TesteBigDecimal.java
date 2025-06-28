package br.com.company.javatraining.testesdeclasses;

import java.math.BigDecimal;

import br.com.company.gen.util.CalculoMat;

public class TesteBigDecimal {
	/*	
		Crie uma classe TesteBigDecimal com o main.
		
		Instancie 2 BigDecimal utilizando o método getBigDecimal de CalculoMat.
		
		Ainda utilizando os métodos de CalculoMat:
			- Verifique se o primeiro é maior que o segundo
			- Verifique se o primeiro é menor que o segundo
			- Multiplique os dois objetos BigDecimal
	*/
	
	public static void main (String[] args) {
		BigDecimal bd = CalculoMat.getBigDecimal("1,111");
		BigDecimal bd2 = CalculoMat.getBigDecimal("1,222");
		
		System.out.println(bd + " > " + bd2 + " = " +  CalculoMat.ehMaior(bd, bd2));
		System.out.println(bd + " < " + bd2 + " = " +  CalculoMat.ehMenor(bd, bd2));
		System.out.println(bd + " * " + bd2 + " = " +  CalculoMat.multiplica(bd, bd2));
	}
}
