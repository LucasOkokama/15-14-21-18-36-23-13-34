package br.com.company.companyclasses;

import java.time.LocalDate;
import java.util.Date;

import br.com.company.gen.util.ManipulaJavaUtilDate;

public class TestesDobraData {
	/*		
		Dada a String s = "23/01/2014"
		Crie uma String que contenha a representação de "s" no formato ANO_MES_DIA
		Crie uma String que contenha a representação de "s" no formato MES_DIA_ANO
		Crie uma String que contenha a representação de "s" no formato DIA_MES_ANO
		
		Crie um Date "d" a partir de "s".
		A partir de "d", crie uma String diaMesAno que contenha a data no formato DIA_MES_ANO.
		A partir de "d", crie uma String com a representação de "d" por extenso.
		A partir de "d", imprima o dia da semana correspondente.
	*/
	
	public static void main (String[] args) {
			String s = "23/01/2014";
			
			int AMD = ManipulaJavaUtilDate.ANO_MES_DIA;
			int MDA = ManipulaJavaUtilDate.MES_DIA_ANO;
			int DMA = ManipulaJavaUtilDate.DIA_MES_ANO;
			
			System.out.println(ManipulaJavaUtilDate.getInstance(s, DMA).imprimeData(AMD));
			System.out.println(ManipulaJavaUtilDate.getInstance(s, DMA).imprimeData(MDA));
			System.out.println(ManipulaJavaUtilDate.getInstance(s, DMA).imprimeData(DMA));
	
			
			System.out.println("\n");
			
			
			Date  d = ManipulaJavaUtilDate.getInstance(s, DMA).toDate();
			
			String diaMesAno = ManipulaJavaUtilDate.getInstance(s, DMA).imprimeData(DMA);
			System.out.println(diaMesAno);
			
			String dataPorExtenso = ManipulaJavaUtilDate.getInstance(s, DMA).imprimePorExtenso();
			System.out.println(dataPorExtenso);
			
			String diaDaSemana = ManipulaJavaUtilDate.getInstance(s, DMA).imprimeDiaDaSemana();
			System.out.println(diaDaSemana);
	}
}
