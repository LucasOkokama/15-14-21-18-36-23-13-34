package br.com.company.javatraining.testesdeclasses;

import java.util.HashMap;

public class TesteHashMap {
	/*		
		Crie a classe TesteHashMap com método main.
		
		Declare um novo HashMap e adicione o nome de seus colegas de treinamento (utilize uma chave única!) com o método put(Object, Object).
		
		Atribua algum outro valor para o elemento com a chave do seu nome. 
		Imprima, utilizando o método get(Object chave) e verifique o que acontece.
		Remova o elemento cuja chave indica o conteúdo de seu nome.
		
		Imprima os valores do HashMap criado.
	*/
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Aluno 1");
		hm.put(2, "Aluno 2");
		hm.put(3, "Aluno 3");
		hm.put(4, "Aluno 4");

		hm.put(2, "Aluno Selecionado");
		System.out.println(hm.get(2));
		hm.remove(2);

		System.out.println("\n");
		
		for(String aluno : hm.values()) {
			System.out.println(aluno);
		}
	}
}
