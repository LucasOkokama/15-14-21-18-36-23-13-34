package br.com.company.javatraining.pessoa.impl;

public class Pessoa {
	/*			
		No pacote criado, crie um classe Pessoa com os atributos protected: String nome, int idade, String cpf.
		Crie um construtor default e um construtor completo para esta classe.
		Crie getters e setters para os atributos da classe.
		
		Crie um método static na classe para verificar se o CPF informado possui 11 dígitos. 
		O método deve retornar true caso o CPF tenha 11 digitos ou false caso contrário
	*/
	protected String nome;
	protected int idade;
	protected String cpf = "";
	
	public Pessoa() {}
	public Pessoa(String nome, int idade, String cpf) {
	    this.nome = nome;
	    this.idade = idade;
	    this.cpf = cpf;
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
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public static boolean checkCpf(String cpf) {
		return cpf.length() == 11;
	}
}

