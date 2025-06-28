package br.com.company.avariassonjaba.cliente;

import br.com.company.avariassonjaba.dt.ICliente;

public class TestaCliente {

	public static void main(String[] args) {
		/*
			Ainda no pacote cliente, crie a classe TestaCliente, que possuirá um main. 
			Usando ICliente como variável de referência, instancie um novo Cliente.
			Teste os getters acessíveis para ele. 
		*/
		ICliente cliente = new Cliente("Josias Marcos", 36, "73543005006", "270431949");
		
		System.out.println("Nome do cliente: " + cliente.getNome());
		System.out.println("CPF do cliente: " + cliente.getCpf());
	}
}
