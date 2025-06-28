package br.com.company.avariassonjaba.validador;

import br.com.company.avariassonjaba.dt.TECpfInvalidoException;
import br.com.company.avariassonjaba.dt.TECpfNaoInformadoException;
import br.com.company.utils.Formatador;

public class TestaValidador {
	public static void main(String[] args) {
		/*
			Dentro do método main(), crie 4 atributos do tipo String com o valor de seu CPF divido pela pontuação 
			(Supondo CPF = 123.456.789-12, String a = “123”; String b = “456”...); 
		*/
		String cpfUm = "946";
		String cpfDois = "044";
		String cpfTres = "840";
		String cpfQuatro = "23";
		
		/*
			Instancie um novo objeto do tipo StringBuffer como nome “sbCpf”;
		*/
		StringBuffer sbCpf = new StringBuffer();
		
		/*
			Utilizando um método de StringBuffer, faça a concatenação das 4 Strings em “sbCpf”; 
		*/
		sbCpf.append(cpfUm).append(cpfDois).append(cpfTres).append(cpfQuatro);
		
		/*
			Crie uma nova String “cpf” e atribua a ela, o valor final de “sbCpf”; 
		*/
		String cpf = sbCpf.toString();
		

		/*
			Faça a formatação do seu “cpf” e chame o método validaCpf, passando a String “cpf” criada acima. Imprima uma mensagem em caso de sucesso; 
		*/
		cpf = Formatador.aplicaMascaraCPF(cpf);
		
		try{
			if(ValidadorAvaliacao.validaCpf(cpf)) {
				System.out.println("O CPF '" + cpf + "' é VÁLIDO.");			
			}			
		}
		catch(TECpfNaoInformadoException | TECpfInvalidoException e) {
			 System.out.println("Erro do Exercicio: " + e.getMessage());
		}
		catch(Exception e){
			System.out.println("Outros erros: " + e.getMessage());
		}
	}
}
