package br.com.company.javatraining.animal.cachorro;

import br.com.company.javatraining.animal.cachorro.dt.IAnimal;
import br.com.company.javatraining.animal.cachorro.impl.Cachorro;

/*
	Faça com que a classe <SeuCachorro> estenda a classe abstrata Cachorro e implemente a interface Animal
	
	Agora, <SeuCachorro> é um Animal e é um Cachorro. Logo, <SeuCachorro> deve definir todos os comportamentos de Animal e Cachorro.
*/
public class Beagle extends Cachorro implements IAnimal  {
	/*
		No pacote, crie uma classe com um nome de uma raça de cachorro (Beagle, Boxer, Pastor, Labrador, …)
	*/
	
	/*
		Altere a classe <SeuCachorro>, adicionando as seguintes variáveis de instância:
		public String cor, 
		public int idade
		public String nome;
	*/
	
	/*
		Altere o modificador de acesso do atributo nome de <SeuCachorro> para private. Rode a classe TesteCachorros.
		Altere o modificador de acesso do atributo nome de <SeuCachorro> para protected. Rode a classe TesteCachorros.
		Altere o modificador de acesso do atributo nome de <SeuCachorro> para default. Rode a classe TesteCachorros.
		
		O que deve ser feito para que as variáveis tenham modificadores diferentes de public e ainda possam ser manipuladas?
		R: Utilizar métodos públicos
	*/
	/*
	public String cor;
	public int idade;
	public String nome;
	*/
	
	/*	
		Na classe <SeuCachorro>, adicione uma variável de instância do tipo String[] e dê a ela o nome vacinas
	*/
	/*
	public String[] vacinas;
	*/
	
	
	/*	
		Crie, em <SeuCachorro>, um construtor public e sem parâmetros.
		Dentro desse construtor, faça com que seja impressa a frase: "Dentro do construtor default"
		Execute novamente a classe TestesCachorro
		
		Adiciona outro construtor e faça com que ele receba a idade como parâmetro. 
		Neste construtor, faça com que seja impressa a frase: "Dentro do construtor com parâmetro idade"
		
		Execute novamente a classe TestesCachorro. Qual construtor foi chamado? 
		Faça as alterações para que o construtor com idade no parâmetro seja chamado.
	*/
	public Beagle() {
		System.out.println("Dentro do construtor default");
	}
	
	public Beagle(int idade) {
		super(idade);
		System.out.println("Dentro do construtor com parâmetro idade");
	}
	
	/*	
		Adicione na classe <SeuCachorro> um novo construtor que deverá receber como parâmetro uma String[] e 
		atribuí-la à variável de instância vacinas
	*/
	public Beagle(String[] vacinas) {
		super(vacinas);
	}
	
	/*
		Em <SeuCachorro>, crie um construtor completo (todas as variáveis).
	*/
	public Beagle(String nome, int idade, String cor, String[] vacinas) throws Exception {
	    super(nome, idade, cor, vacinas);
	}
	
	 /*  	
	 	Em <SeuCachorro>, crie o método toString() para imprimir a "ficha" de <SeuCachorro>.
	 */
	/*	
		Toda classe herda os métodos da classe Object, como toString() e equals(Object arg0). 
		Sobrescreva estes métodos na classe <SeuCachorro>, de modo que:
			- toString() imprima uma "ficha" do seu cachorro;
			- equals(Object arg0) verifica se um cachorro é igual ao outro. Lembre-se do cast!
	 */
	 @Override
	 public String toString() {
		 String ficha = "Nome: " + nome + "\n";
		 ficha += "Idade: " + idade + " anos\n";
		 ficha += "Cor: " + cor + "\n";
		 ficha += "Vacinas:\n";
	
		 if (vacinas != null && vacinas.length > 0) {
	        for (String vacina : vacinas) {
	            ficha += "  - " + vacina + "\n";
	     }
	     } else {
	        ficha += "  Nenhuma vacina registrada\n";
	     }
		    
		 return ficha;
	  }
	 
	 @Override
	 public boolean equals(Object arg0) {
	     if (this == arg0) return true;
	     if (arg0 == null || getClass() != arg0.getClass()) return false;
	
	     Beagle outroBeagle = (Beagle) arg0;
	
	     boolean vacinasIguais = java.util.Arrays.equals(this.vacinas, outroBeagle.vacinas);
	
	     return this.nome.equals(outroBeagle.nome) &&
	            this.idade == outroBeagle.idade &&
	            this.cor.equals(outroBeagle.cor) &&
	            vacinasIguais;
	 }
	
	
	/*
		Crie os métodos public void latir(), public void comer() e public void dormir() dentro da classe <SeuCachorro>. 
		
		Implemente esses métodos, fazendo com que cada um imprima a ação do método
		Ex: System.out.println(nome + " está latindo!");
	*/
	 
	/*	
		Implementem esses métodos em <SeuCachorro>.
	*/
	@Override
	public void latir() {
		System.out.println(nome + " está latindo!");
	}
	
	@Override
	public void latir2(String latido) {
		System.out.println("O cachorro late com " + latido);
	}
	
	@Override
	public void latir3(String latidoUm, String latidoDois) {
		System.out.println("O cachorro late com " + latidoUm + " e com " + latidoDois);
	}
	
	@Override
	public void comer() {
		System.out.println(nome + " está comendo!");
	}
	
	@Override
	public void dormir() {
		System.out.println(nome + " está dormindo!");
	};
}
