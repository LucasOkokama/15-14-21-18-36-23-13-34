package br.com.company.avariassonjaba.companyclasses;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

import br.com.company.gen.util.ManipulaArquivos;
import br.com.company.gen.util.ManipulaJavaUtilDate;
import br.com.company.gen.util.MaskedInput;
import br.com.company.utils.CalculoMat;

public class TestaCompanyClasses {
	public static void main(String[] args) {
		/*
			Instancie uma nova data do tipo Date, com o seu aniversário. 
			Através dessa data Date, obtenha a String no formato DDMMAAAA.
			Através dessa data Date, obtenha a String DIA_MES_ANO. 
		*/
		int DMA = ManipulaJavaUtilDate.DDMMAAAA;
		int D_M_A = ManipulaJavaUtilDate.DIA_MES_ANO;
		
		Date aniversario = ManipulaJavaUtilDate.getInstance("10/04/2010", D_M_A).toDate();
		String aniversarioDMA = ManipulaJavaUtilDate.getInstance(aniversario).imprimeData(DMA);
		String aniversarioD_M_A = ManipulaJavaUtilDate.getInstance(aniversario).imprimeData(D_M_A);

		
		
		/*
			Crie uma nova String com seu primeiro nome.
			Aplique uma máscara em seu nome, de modo que seu nome termine e comece com "**".
		*/
		String primeiroNome = "Geremias";
		String primeiroNomeFormatado = MaskedInput.maskInput(primeiroNome, "**AAAAA**");

		
		/*
			Instancie um novo BigDecimal com o valor 0.55
			Crie uma referência String, e atribua o valor do BigDecimal criado nessa referência. Faça a conversão nescessária. 
		*/
		BigDecimal bd = BigDecimal.valueOf(0.55);
		String bdString = CalculoMat.getString(bd);

	
		/*
			Crie uma String com o valor “0,66” e uma referência BigDecimal. Atribua o valor String nessa referência. 
		*/
		String bdStringDois = "0,66";
		BigDecimal bdDois = CalculoMat.getBigDecimal(bdStringDois);

	
		/*
			Imprima os valores convertidos e verifique os valores. 
		*/
		System.out.println(bdString);
		System.out.println(bdDois);
		
		
		/*
			Crie um arquivo chamado java.txt, com o conteúdo das 3 Strings criadas (seu aniversário, primeiro nome e um valor), 
			de modo que cada linha contenha um dos valores. 
		*/
		String[] arquivo = { aniversarioD_M_A, primeiroNomeFormatado, bdString };
		String path = "C:\\Users\\lucas\\Downloads\\java.txt";
		
		try {
			ManipulaArquivos.criaArquivo(path, arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
			Renomeie esse arquivo para javamodificado.txt.
		*/
		String pathRenomearArquivo = "C:\\Users\\lucas\\Downloads\\javamodificado.txt";
		if(ManipulaArquivos.existe(path)) {
			File nomeAntigo = new File(path);
			File nomeNovo = new File(pathRenomearArquivo);
			
			nomeAntigo.renameTo(nomeNovo);
		}
	}
}
