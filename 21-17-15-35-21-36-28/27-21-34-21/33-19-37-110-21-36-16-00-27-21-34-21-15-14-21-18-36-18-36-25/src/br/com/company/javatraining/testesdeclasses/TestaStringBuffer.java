package br.com.company.javatraining.testesdeclasses;

public class TestaStringBuffer {
	/*
		Crie uma nova classe TestaStringBuffer com um método main.
		
		Declare um novo StringBuffer sb = new StringBuffer ("Teste");
		
		Teste os métodos append, delete, insert, reverse neste objeto. 
		
		O que cada um deles faz?
		R: append --> Adiciona uma string no final do conteúdo atual
		   delete ---> Remove os caracteres entre os índices start (inclusive) e end (exclusive)
		   insert ---> Insere uma string a partir da posição informada
		   reverse --> Inverte a sequência de caracteres
		
		Concatene neste objeto a String "de StringBuffer"
		Remova "de" e imprima no console.
		
		Chame o método deleteCharAt(-20). 
		O que acontece?
		R: Isso lança uma exceção em tempo de execução já que o indíce informado não existe
	*/
	
	public static void main (String[] args) {
		StringBuffer bf = new StringBuffer("Teste");
		
		bf.append("de StringBuffer");
		bf.delete(5, 7);
		bf.insert(6, "técnico do ");
		bf.reverse();
		
		bf.deleteCharAt(-20);
		
		System.out.println(bf.toString());
	}
}
