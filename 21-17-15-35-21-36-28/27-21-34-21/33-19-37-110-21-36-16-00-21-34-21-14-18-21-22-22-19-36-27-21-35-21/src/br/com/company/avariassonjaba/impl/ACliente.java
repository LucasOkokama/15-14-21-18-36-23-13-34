package br.com.company.avariassonjaba.impl;

public abstract class ACliente {
	/*
		Crie a classe abstrata ACliente, que possui os atributos private: nome, idade, cpf e rg (os tipos dos atributos ficam a seu critério).
	*/
	private String nome;
	private int idade;
	private String cpf;
	private String rg;
	
	/*
		Crie dois construtures, um default e um completo. Também crie APENAS getters para todos estes atributos.
	*/
	public ACliente() {
		super();
	}
	
	public ACliente(String nome, int idade, String cpf, String rg) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;
	}

	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getRg() {
		return rg;
	}
}
