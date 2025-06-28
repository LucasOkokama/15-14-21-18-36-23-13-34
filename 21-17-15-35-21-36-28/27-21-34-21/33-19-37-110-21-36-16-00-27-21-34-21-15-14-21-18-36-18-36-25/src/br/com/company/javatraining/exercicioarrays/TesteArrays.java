package br.com.company.javatraining.exercicioarrays;

public class TesteArrays {
	/*		
		Crie uma classe TesteArrays.
		
		Crie um método main e declare um array de Strings com algumas posições. 
		Certifique de inserir alguns elementos nulos e vazios neste array
		Exemplo de array: String[] array = { "pos1", null, "", null, "posicao", "", "elemento"};
		
		Crie um método static trataArrays que receba um array de String como parâmetro.
		Este método deve percorrer o array passado e, se a posição do array não for nula nem vazia, imprimir o comprimento da String desta posição.
	*/
	
	public static void main (String[] args) {
		String[] myArray = { "pos1", null, "", null, "pos5", "", "pos7"};
		
		trataArrays(myArray);
	}
	
	public static void trataArrays(String[] array) {
		for(String elementos : array) {
			if(elementos != null && !elementos.isEmpty()) {
				System.out.println("\""+ elementos + "\" tem " + elementos.length() + " caracteres");
			}
		}
	}
}
