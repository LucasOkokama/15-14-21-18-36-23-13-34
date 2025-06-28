package br.com.company.companyclasses;

import br.com.company.gen.util.Validador;

public class TestesAvendator {
	/*
		Verifique se seu cpf é válido		
		Verifique se o cnpj 75191651000105 é válido
		Verifica se o E-mail treinamento@company.com.br é válido
	*/
	
	public static void main (String[] args) {
		String cpf = "123.456.789-09";
		String cpfInvalido = "123.456.789-00";
		String cnpj = "75191651000105";
		String email = "treinamento@company.com.br";
				
		System.out.println("O CPF " + cpf + " é válido = " + Validador.ehCpfValido(cpf));
		System.out.println("O CPF " + cpfInvalido + " é válido = " + Validador.ehCpfValido(cpfInvalido));
		System.out.println("O CNPJ " + cnpj + " é válido = " + Validador.ehCnpjValido(cnpj));
		System.out.println("O email " + email + " é válido = " + Validador.ehEmailValido(email));
	}
}
