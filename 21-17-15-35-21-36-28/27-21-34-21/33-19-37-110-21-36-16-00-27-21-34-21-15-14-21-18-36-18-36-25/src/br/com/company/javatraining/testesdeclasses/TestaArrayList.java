package br.com.company.javatraining.testesdeclasses;

import java.util.ArrayList;

public class TestaArrayList {
	/*	
		Criem uma classe TestaArrayList com método main.

		Declare um novo ArrayList.
		
		Adicione 5 elementos (String) utilizando o método add(Object)
		Adicione 2 elementos (String) utilizando o método add(int, Object)

		Verifique se o array está vazio com o método isEmpty()
		Remova 2 elementos com o método remove(int)

		Substitua o elemento de índice 2 com o método set(int, Object)

		Declare um array estático String[] array e converta o conteúdo de seu ArrayList para um array estático de Strings
		Ex: String[] = (String[]) array.toArray(new String[array.size()]);
	*/
	
	public static void main (String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Elemento 1");
		al.add("Elemento 2");
		al.add("Elemento 3");
		al.add("Elemento 4");
		al.add("Elemento 5");
		
		al.add(2, "Elemento 2.1");
		al.add(5, "Elemento 4.1");
		
		if(!al.isEmpty()) {
			al.remove(0);
			al.remove(2);
			
			al.set(2, "Elemento 4 ALTERADO");
			
			String[] array = (String[]) al.toArray(new String[al.size()]);
			
			for(String elementos : array) {
				System.out.println(elementos);
			}
		}
	}
}
