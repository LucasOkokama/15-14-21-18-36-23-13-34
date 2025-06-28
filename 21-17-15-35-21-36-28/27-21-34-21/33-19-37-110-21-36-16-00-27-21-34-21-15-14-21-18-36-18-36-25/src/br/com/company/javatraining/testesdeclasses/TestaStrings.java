package br.com.company.javatraining.testesdeclasses;

public class TestaStrings {
	/*
		Crie uma classe TestaStrings.
 		Nesta classe, crie um método main e declare uma String s = "Teste de Strings          "
 		
 		Teste os métodos replace, substring, toLowerCase, toString e trim(). 
 		
 		O que cada um deles fazem?
 		R: replace(a, b)	---> Substitui todos os a por b.
		   substring(x)		---> Retorna a string a partir da posição x.
		   toLowerCase()	---> Transforma tudo em minúsculas.
		   toString()		---> Retorna a própria string.
 		   trim() 			---> Remove espaços do início e fim da string.
 		   
 		Chamem o método charAt() para retornar o caracter "d"
 		Chamem o método length() para saber o tamanho da String
 		
 		Chame o método trim() para remover os espaços em branco
 		Imprimam novamente o valor de s. Ele foi alterado?
 		R: Não, visto que o resultado de trim() não foi armazenado em 's'
	*/
	public static void main (String[] args) {
		String s = "Teste de Strings          ";
		
		System.out.println("replace(\"e\", \"x\"): '" + s.replace("e", "o") + "'");
		System.out.println("substring(6): '" + s.substring(10) + "'");
		System.out.println("toLowerCase(): '" + s.toLowerCase() + "'");
		System.out.println("toString(): '" + s.toString() + "'");
        System.out.println("trim(): '" + s.trim() + "'");
        
        System.out.println("charAt(): '" + s.charAt(6) + "'");
        System.out.println("length(): '" + s.length() + "'");
	}
}
