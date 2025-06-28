package br.com.company.javatraining.carro.impl;

import br.com.company.javatraining.carro.impl.Carro;
import br.com.company.javatraining.carro.impl.Proprietario;

public class Chrysler extends Carro {
	/*
	 	Crie uma classe com o nome de um carro
	 	
	 	Criem variáveis de instância "nome, cor, ano, modelo, potencia, kilometragem e nomeDosProprietarios" (2 proprietários). 
	 	Todos os modificadores com modificador protected
	 	
	 	Crie getters e setters para as variáveis potencia e cor
	 	
	 	Crie um construtor com todas as variáveis de carro.
	 	
	 	Crie um método que fará a soma da kilometragem na variável kilometragem
	 	Ex: public void somaKilometragem(double valor)
	*/
	protected String[] nomeDosProprietarios;
	
	/*		
		Adicione uma variável booleana "carroNovo" na classe <SeuCarro>. Essa variável deve ser inicializada no construtor.
		
		A classe <SeuCarro> deve ter uma variável de instância do tipo Proprietario. 
		Essa variável deve ser passada ao se criar uma nova instância de <SeuCarro>
		
		Cria uma variável "qtdCriada" que contará o número de <SeuCarro> criados. 
		A cada novo objeto, a variável deve ser incrementada.
		
		A cada instância de carro:
		- Se o carro for novo, kilometragem deve ser 0;
		- Se não for novo, kilometragem deve ser diferente de 0;
		- Caso não seja informado o nome de <SeuCarro>, atribua a ele o nome do proprietário
	*/
	protected boolean carroNovo;
	protected Proprietario dono;
	protected static int qtdCriada = 0;
	
	public Chrysler(String nome, String cor, int ano, int potencia, double kilometragem, String[] nomeDosProprietarios, boolean carroNovo, Proprietario dono){
		super(nome, cor, ano, potencia, kilometragem);
		this.nomeDosProprietarios = nomeDosProprietarios;
		this.carroNovo = carroNovo;
		this.dono = dono;
		
		qtdCriada++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(double kilometragem) {
		this.kilometragem = kilometragem;
	}

	public String[] getNomeDosProprietarios() {
		return nomeDosProprietarios;
	}

	public void setNomeDosProprietarios(String[] nomeDosProprietarios) {
		this.nomeDosProprietarios = nomeDosProprietarios;
	}


	public void somaKilometragem(double valor) {
		this.kilometragem += valor;
	}
	
	
	/*		
		Adicione o método ligarSom() em <SeuCarro>
	*/
	public void ligarSom() {
		System.out.println(" Ligando som!");
	}
}
