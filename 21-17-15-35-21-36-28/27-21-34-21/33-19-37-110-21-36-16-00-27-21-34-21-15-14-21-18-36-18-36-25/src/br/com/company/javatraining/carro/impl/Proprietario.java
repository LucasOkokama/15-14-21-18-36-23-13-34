package br.com.company.javatraining.carro.impl;

public class Proprietario {
	/*		
		Crie uma classe Proprietario.
		
		Adicione 4 variáveis de instância (nome, idade, sexo e anoHabilitacao). 
		A variável sexo deve ser do tipo char. 
		Crie getters e setters.
		
		Crie um construtor completo e faça as validações para idade (maior ou igual a 18) e ano (entre 1920 e 2014). 
		Caso sejam inválidas, atribua 18 para idade e 1920 para ano.
		
		Caso seja passado um valor diferente de 'M', 'm', 'F' ou 'f' para sexo, atribua 'M' a ela.
		
		Caso o nome do proprietário não seja informado, nome deve receber "Nome não informado"
	*/
	protected String nome;
	protected int idade;
	protected char sexo;
	protected int anoHabilitacao;
	
	public Proprietario(String nome, int idade, char sexo, int anoHabilitacao) {
		this.nome = nome.isEmpty() || nome == null ? "Nome não informado" : nome;
		this.idade = idade >= 18 ? idade : 18;
		this.sexo = sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f' ? sexo : 'M';
		this.anoHabilitacao = anoHabilitacao >= 1920 && anoHabilitacao <= 2014 ? anoHabilitacao : 1920;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public int getAnoHabilitacao() {
		return anoHabilitacao;
	}
	public void setAnoHabilitacao(int anoHabilitacao) {
		this.anoHabilitacao = anoHabilitacao;
	}
}
