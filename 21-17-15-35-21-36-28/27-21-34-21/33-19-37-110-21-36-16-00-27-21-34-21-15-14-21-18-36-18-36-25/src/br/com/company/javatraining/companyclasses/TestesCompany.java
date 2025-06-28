package br.com.company.javatraining.companyclasses;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import br.com.company.gen.util.ManipulaArquivos;
import br.com.company.gen.util.ManipulaJavaUtilDate;
import br.com.company.gen.util.MaskedInput;
import br.com.company.gen.util.Validador;
import br.com.company.utils.Formatador;

public class TestesCompany {
	/*		
		Crie uma classe TestesCompany com método main.

		Utilizando a classe ManipulaArquivos, leia o arquivo "ExercicioFinal.txt" da sua área de trabalho.
		
		Verifiquem o conteúdo do arquivo:
			- linha 1: nome do exercício
			- linha 2: nome da empresa
			- linha 3: endereço da empresa
			- linha 4: CEP sem formatação
			- linha 5: telefone
			
		Na classe criada, leia o arquivo, utilizando a classe ManipulaArquivos

		Crie variáveis para armazenar cada linha (identificadores claros!)
		
		Mascare o conteúdo da linha 4 (cep) e guarde em uma variável. (MaskedInput)
		Mascare o conteúdo da linha 5 (telefone) para que seja exibido no formato (55 11) 3283 5666
		
		Dada um date com valor "2014/01/07", converta para String (ManipulaJavaUtilDate) no formato DIA_MES_ANO e guarde-a numa variável
		
		Guarde seu nome completo em uma Variável do tipo String
		
		Verifique a validade de seu cpf (Validador) e, caso seja válido, guarde o valor formatado (Formatador) em uma variável
		
		Criem um novo arquivo (ManipulaArquivos) de modo que as informações fiquem dispostas da seguinte forma:
			- linha 1: nome do exercício
			- linha 2: nome da empresa
			- linha 3: endereço
			- linha 4: cep formatado
			- linha 5: telefone formatado
			- linha 6: data formatada (DIA_MES_ANO) e por extenso
			- linha 7: nome completo
			- linha 8: data de aniversário DIA_MES_ANO
			- linha 8: cpf formatado
	*/
	
	public static void main (String[] args) throws IOException {
		String[] exercicioFinal = ManipulaArquivos.leArquivo("C:\\Users\\lucas\\Downloads\\ExercicioFinal.txt");
		
		String nomeExercicioL1 = exercicioFinal[0];
		String nomeEmpresaL2 = exercicioFinal[1];
		String enderecoL3 = exercicioFinal[2];
		String cepL4 = exercicioFinal[3];
		String telefoneL5 = exercicioFinal[4];
		
		
		String cepFormatado = MaskedInput.maskInput(cepL4, "AAAAA-AAA");
		String telefoneFormatado = MaskedInput.maskInput(telefoneL5, "(AA AA) AAAA AAAA");

		
		int AMD = ManipulaJavaUtilDate.ANO_MES_DIA;
		int DMA = ManipulaJavaUtilDate.DIA_MES_ANO;
		Date data = ManipulaJavaUtilDate.getInstance("2014/01/07", AMD).toDate();
		ManipulaJavaUtilDate dataInstance = ManipulaJavaUtilDate.getInstance(data);
		String dataFormatada = dataInstance.imprimeData(DMA) + " | " + dataInstance.imprimePorExtenso();
		
		
		String nome = "Lucas Kazuhiro Okokama";
		
		String dataAniversario = "05/02/2005";
		
		String cpf = "12345678909";
		String cpfFormatado = Validador.ehCpfValido(cpf) ? Formatador.aplicaMascaraCPF(cpf) : "CPF Inválido";
		
		
		String[] exercicioFinalCompleto = {nomeExercicioL1, nomeEmpresaL2, enderecoL3, cepFormatado, telefoneFormatado, dataFormatada, nome, dataAniversario, cpfFormatado};
		
		
		String exercicioFinalCompletoPath = "C:\\Users\\lucas\\Downloads\\ExercicioFinalCompleto.txt";
		ManipulaArquivos.criaArquivo(exercicioFinalCompletoPath, exercicioFinalCompleto);
	}
}










