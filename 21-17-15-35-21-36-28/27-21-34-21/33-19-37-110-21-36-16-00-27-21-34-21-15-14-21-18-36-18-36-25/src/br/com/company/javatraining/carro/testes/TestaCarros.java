package br.com.company.javatraining.carro.testes;

import br.com.company.javatraining.carro.impl.Chrysler;
import br.com.company.javatraining.carro.impl.Proprietario;

public class TestaCarros {
	
	/*		
		Crie uma classe TestaCarros com o método main
		
		Crie duas variáveis de referência para o carro.
		Crie dois objetos do tipo do seu carro e os atribua as variáveis.
		Adicione, utilizando o método somaKilometragem valores para os dois carros
		
		Imprima a "ficha" dos carros, utilizando o padrão (nome, cor, ano, modelo, potencia, kilometragem, proprietario1, proprietario2)
		
		Altere a cor de apenas 1 dos carros e imprima novamente a "ficha" desse carro, utilizando o mesmo padrão
	*/

	public static void main (String[] args) {
		String[] donos = {"Lucas", "João"};
		Proprietario dono = new Proprietario("Lucas", 30, 'M', 2010);
		Chrysler myCar = new Chrysler("300C", "Preto", 2021, 296, 45.6, donos, true, dono);
		Chrysler myCar2 = new Chrysler("PT Cruiser", "Branco", 2008, 262, 14.9, donos, false, dono);
		
		myCar.somaKilometragem(15);
		myCar2.somaKilometragem(3);
		
		exibirFicha(myCar);
		exibirFicha(myCar2);
		
		myCar2.setCor("Laranja");
		exibirFicha(myCar2);
	}
	
	 public static void exibirFicha(Chrysler carro) {
	        System.out.println("==== FICHA DO CARRO ====");
	        System.out.println("Nome: " + carro.getNome());
	        System.out.println("Cor: " + carro.getCor());
	        System.out.println("Ano: " + carro.getAno());
	        System.out.println("Potência: " + carro.getPotencia() + " cv");
	        System.out.println("Kilometragem: " + carro.getKilometragem() + " km");
	        System.out.println("Proprietários:");
	        for (String dono : carro.getNomeDosProprietarios()) {
	            System.out.println("   - " + dono);
	        }
	        System.out.println();
	    }	
}
