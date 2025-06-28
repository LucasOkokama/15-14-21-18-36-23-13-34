package br.com.company.javatraining.carro.testes;

import br.com.company.javatraining.carro.impl.Carro;
import br.com.company.javatraining.carro.impl.CarroUtil;
import br.com.company.javatraining.carro.impl.Chrysler;
import br.com.company.javatraining.carro.impl.Gol;
import br.com.company.javatraining.carro.impl.Proprietario;

public class TestaCarrosPolimorfismo {
	/*		
		Crie a classe TestaCarrosPolimorfismo.
		
		Nesta classe, crie duas variáveis de referência do tipo Carro e instanciem um <SeuCarro> e um Gol
		
		Imprima a "ficha" dos dois carros utilizando o padrão (nome, cor, ano, modelo, potencia, kilometragem).
		
		Crie um array do tipo Carro com 4 posições. 
		
		Quais tipos de variáveis podem ser colocadas dentro deste array?
		R: Qualquer objeto que seja da classe Carro ou que estenda Carro pode ser colocado dentro desse array
		
		Dentro da classe TestaCarrosPolimorfismo, chame o método verificaCarro uma variável do tipo <SeuCarro> e em seguida uma variável do tipo Gol.
	*/
	
	public static void main (String[] args) {
		Proprietario dono = new Proprietario("Lucas", 30, 'M', 2010);
		String[] proprietarios = {"Lucas", "João"};
		
		Carro meuCarro = new Chrysler("300C", "Preto", 2020, 296, 15.4, proprietarios, true, dono);
		Carro gol = new Gol("Gol G7", "Branco", 2022, 105, 5.0);
		
		exibirFicha(meuCarro);
		CarroUtil.verificaCarro(meuCarro);
		System.out.println("\n\n\n");
		
		exibirFicha(gol);
		CarroUtil.verificaCarro(gol);
		
		
		Carro[] carros = new Carro[4];
		carros[0] = new Chrysler("300C", "Preto", 2020, 296, 15.4, proprietarios, true, dono);
		carros[1] = new Gol("Gol G7", "Branco", 2022, 105, 5.0);
		carros[2] = new Gol("Gol Rallye", "Vermelho", 2018, 110, 25.0);
		carros[3] = new Chrysler("PT Cruiser", "Cinza", 2010, 220, 80.0, proprietarios, false, dono);
	}
	
	public static void exibirFicha(Carro carro) {
		System.out.println("==== FICHA DO CARRO ====");
	    System.out.println("Nome: " + carro.getNome());
	    System.out.println("Cor: " + carro.getCor());
	    System.out.println("Ano: " + carro.getAno());
	    System.out.println("Potência: " + carro.getPotencia() + " cv");
	    System.out.println("Kilometragem: " + carro.getKilometragem() + " km");
	    System.out.println();
	}	
}
