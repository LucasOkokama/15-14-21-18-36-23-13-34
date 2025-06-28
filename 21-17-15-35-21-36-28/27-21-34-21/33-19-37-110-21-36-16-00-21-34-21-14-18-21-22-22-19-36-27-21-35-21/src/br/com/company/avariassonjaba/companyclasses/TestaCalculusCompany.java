package br.com.company.avariassonjaba.companyclasses;

import java.math.BigDecimal;

import br.com.company.utils.CalculoMat;

public class TestaCalculusCompany {
	public static void main(String[] args) {
		/*
			Declare uma variável “valor” do tipo double com valor 7.5;
			Crie uma String chamada “numerico” e atribua a ela o “valor” (lembre-se de transformar o “.” Em “,”);
		*/
		double valor = 7.5;
		String numerico = CalculoMat.getString(BigDecimal.valueOf(valor));
		
		
		/*
			Instancie um novo BigDecimal “valorBD” passando o valor da String “numerico”;
		*/
		BigDecimal valorBD = CalculoMat.getBigDecimal(numerico);
		
		
		/*
			Fazer a divisão de “valorBD” por um novo BigDecimal de valor 3.98;
		*/
		BigDecimal valorDivisao = CalculoMat.divide(valorBD, new BigDecimal(3.98));
		
		
		/*
			Arredondar o resultado e imprimir na tela com duas casas decimais.
		*/
		System.out.println(CalculoMat.arredonda(valorDivisao, 2));
	}
}
