package br.com.company.javatraining.animal.cachorro.testes;

import br.com.company.javatraining.animal.cachorro.Beagle;
import br.com.company.javatraining.dt.FalhaAoCriarCachorroException;

public class TestesCachorro {

	public static void main (String[] args) throws FalhaAoCriarCachorroException {
		/*			
			Neste pacote, crie uma classe TestesCachorro
			Adicione o método main na classe TestesCachorro
			
			No método main, adicione uma variável do tipo <SeuCachorro> e a associe a uma nova instância do tipo <SeuCachorro>
			Ex: <SeuCachorro> <nomeVariavel> = new <SeuCachorro>();
		*/
		
		/*			
			Execute novamente a classe TestesCachorro. Qual construtor foi chamado? 
			Faça as alterações para que o construtor com idade no parâmetro seja chamado.
		*/
		Beagle myDog = new Beagle(10);
		
		
		/*		 	
			Através da variável de referência, atribua alguns valores aos atributos do seu cachorro
			Imprima no console os valores atribuídos
			
			Faça chamadas a esses métodos (latir, comer, domir) no método main da classe TestesCachorros e execute-a
		*/
		myDog.setCor("Branca");
		myDog.setIdade(12);
		myDog.setNome("Bibi");
		
		System.out.println(myDog.getNome() + " é um cachorro da raça Beagle de cor " + myDog.getCor() + " que tem " + myDog.getIdade() + " anos de idade");
		
		
		myDog.latir();
		myDog.comer();
		myDog.dormir();
		
		
		
		
				
		/*	 		
	 		No método main da classe TesteCachorros, crie uma variável local do tipo String[] 
	 		e atribua uma nova instância de String[] com 4 posições. Popule esse array com 4 nomes de vacinas
	 		
	 		Crie em TestesCachorros uma nova variável do tipo <SeuCachorro> e utilize o novo construtor (<SeuCachorro>(String[]))
		*/
		String[] vacinas = new String[4];
		vacinas[0] = "Raiva";
		vacinas[1] = "V10";
		vacinas[2] = "Giárdia";
		vacinas[3] = "Antirrábica";
		
		Beagle myVaccinatedDog = new Beagle(vacinas);
	}
}

