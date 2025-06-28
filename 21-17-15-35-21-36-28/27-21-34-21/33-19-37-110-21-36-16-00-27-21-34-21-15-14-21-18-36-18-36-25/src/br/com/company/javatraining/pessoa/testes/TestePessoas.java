package br.com.company.javatraining.pessoa.testes;

import br.com.company.javatraining.pessoa.dt.TECpfNaoInformadoException;
import br.com.company.javatraining.pessoa.dt.TEDataNascimentoNaoInformadoException;
import br.com.company.javatraining.pessoa.dt.TEEnderecoNaoInformadoException;
import br.com.company.javatraining.pessoa.dt.TEIdadeInvalidaException;
import br.com.company.javatraining.pessoa.dt.TENomeNaoInformadoException;
import br.com.company.javatraining.pessoa.impl.Pessoa;
import br.com.company.javatraining.pessoa.testes.TOPessoa;

public class TestePessoas {
	/*
		Crie uma classe TestePessoa com um método main e a instancie com o uso do construtor default. Imprima a ficha desta pessoa.
		Instancie uma outra Pessoa com o construtor completo e imprima a ficha desta pessoa.
		
		Execute o método de Pessoa para avaliar o CPF das duas pessoas.
		Caso o CPF não possua 11 dígitos, imprima “O CPF deve ter 11 dígitos!” caso contrário imprima “CPF correto!” . 
		Utilize o operador ternário.
		
		
		
		Dados os métodos:
		- metodoA();
		- public metodoB();
		- private metodoC();
		- protected metodoD();

		Explique onde esses métodos seriam visíveis, supondo que a classe que os contém fosse:
		- public
		- default
		
		R: Se a classe for PUBLIC:
		- Somente Classes do mesmo package poderão ver o metodoA()
		- Todos poderão ver o metodoB()
		- Somente a própria classe poderá ver o metodoC()
		- Classes do mesmo package e subclasses (mesmo que estejam em outros pacotes) poderão ver o metodoD()
		
		Já se a classe em questão for DEFAULT:
		- A classe não poderá ser acessada por classes de outros pacotes. 
		- Por isso, mesmo métodos public ou protected da classe só poderão ser acessados dentro do mesmo pacote
		- Na prática, todos os métodos ficam restritos ao próprio pacote, mesmo que seu modificador permita mais.
	*/
	
	
	/* 
		Exercicios Adicionais
		
		Na classe TestePessoas, instancie uma nova TOPessoa com uma variável de referência do tipo ITOPessoa.
		Chame os métodos criados através desta variável.
	*/
	
	public static void main (String[] args) 
			throws TENomeNaoInformadoException, 
				   TEIdadeInvalidaException, 
				   TECpfNaoInformadoException, 
				   TEDataNascimentoNaoInformadoException, 
				   TEEnderecoNaoInformadoException {
		Pessoa myPerson = new Pessoa();
        Pessoa myPerson2 = new Pessoa("Josias Pavelão", 22, "12345672901");

		exibirFicha(myPerson);
		System.out.println(
			    Pessoa.checkCpf(myPerson.getCpf()) ? "CPF correto!" : "O CPF deve ter 11 dígitos!"
			);
		
		System.out.println("\n");
		
		exibirFicha(myPerson2);
		System.out.println(
			    Pessoa.checkCpf(myPerson2.getCpf()) ? "CPF correto!" : "O CPF deve ter 11 dígitos!"
			);
	
		System.out.println("\n\n\n");
		
		
		TOPessoa pessoa = new TOPessoa("Jaderson Teixeira", 30, "78472958736", "01-05-2008", "Rua Morangos, 7835");
		System.out.println("Nome: "+ pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
		System.out.println("Endereço: " + pessoa.getEndereco());
	}
	
	public static void exibirFicha(Pessoa pessoa) {
        System.out.println("==== FICHA DA PESSOA ====");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println();
    }	
}
