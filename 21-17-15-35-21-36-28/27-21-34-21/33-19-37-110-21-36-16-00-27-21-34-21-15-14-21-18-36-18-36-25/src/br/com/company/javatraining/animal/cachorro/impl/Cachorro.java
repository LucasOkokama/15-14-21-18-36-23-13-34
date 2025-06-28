package br.com.company.javatraining.animal.cachorro.impl;

import br.com.company.javatraining.dt.FalhaAoCriarCachorroException;

public abstract class Cachorro {
	/*	
		Crie uma classe abstrata com nome Cachorro. 
		Coloquem métodos comuns a todos os cachorros nessa classe.
		Estes métodos devem ser criados utilizando o modificador abstract
		
		Defina variáveis de instância dessa classe abstrata. 
		Crie getters e setters.
	*/
	
	/*		
		Faça com que todas as validações (nome vazio ou nulo, idade negativa, ...) de cachorro lancem exceptions, caso alguma condição não seja atendida.
		Toda exceção lançada deverá conter uma mensagem informando o porque a exceção foi lançada.
	*/
	protected String nome;
	protected int idade;
	protected String cor;
	protected String[] vacinas;
	
	
	/*		
		Altere o contrutor da classe abstrata Cachorro e faça com que lance Exceptions caso:
			- A cor do cachorro seja nulo ou vazio ("");
			- O nome seja nulo ou vazio ("");
	*/
	/* 	
		Faça com que os métodos da classe abstrata Cachorro que lançam Exception passem a lançar FalhaAoCriarCachorroException 
	*/
	/*	
		O que acontece caso ocorra uma Exception não prevista? 
		No caso, não é permitido que NENHUMA outra exceção seja lançada por Cachorro, a não ser FalhaAoCriarCachorroException.
		
		Capture as exceções e a substitua pela exceção criada.
	*/
	public Cachorro(String nome, int idade, String cor, String[] vacinas) throws FalhaAoCriarCachorroException {
		try {
			if(nome == null || nome.isEmpty()) {
				throw new FalhaAoCriarCachorroException("Nome inválido!");
			}else {
				this.nome = nome;    		
			}
			
			this.idade = idade;
			
			if(cor == null || cor.isEmpty()) {
				throw new FalhaAoCriarCachorroException("Cor inválida!");
			}
			else {
				this.cor = cor;			
			}
			
			this.vacinas = vacinas;    		
		}
		catch(Exception e) {
			throw new FalhaAoCriarCachorroException(e.getMessage());
		}
	}
	
	public Cachorro() {}
	
	public Cachorro(int idade) {
		this.idade = idade;
	}
	
	public Cachorro(String[] vacinas) {
		this.vacinas = vacinas;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws FalhaAoCriarCachorroException {
		try{
			if(nome == null || nome.isEmpty()) {
				throw new FalhaAoCriarCachorroException("Nome inválido!");
			}
			else {
				this.nome = nome;			
			}			
		}
		catch(Exception e) {
			throw new FalhaAoCriarCachorroException(e.getMessage());
		}
	}
	public int getIdade() {
		return idade;
	}
	
	/*		
		Altere o método setIdade(int idade) da classe abstrata cachorro. 
		Caso a idade informada seja negativa, faça com que seja lançada uma exceção throw new Exception("Idade inválida!");
	*/
	public void setIdade(int idade) throws FalhaAoCriarCachorroException {
		try {
			if(idade > 0) {			
				this.idade = idade;
			}
			else{
				throw new FalhaAoCriarCachorroException("Idade inválida!");
			}		
		}
		catch(Exception e) {
			throw new FalhaAoCriarCachorroException(e.getMessage());
		}
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) throws FalhaAoCriarCachorroException {
		try {
			if(cor == null || cor.isEmpty()) {
				throw new FalhaAoCriarCachorroException("Cor inválida!");
			}
			else {
				this.cor = cor;			
			}			
		}
		catch(Exception e) {
			throw new FalhaAoCriarCachorroException(e.getMessage());
		}
	}
	public String[] getVacinas() {
		return vacinas;
	}
	public void setVacinas(String[] vacinas) throws FalhaAoCriarCachorroException {
		try {
			if(vacinas == null || vacinas.length == 0) {
				throw new FalhaAoCriarCachorroException("Vacina(s) inválida(s)!");
			}
			else {
				this.vacinas = vacinas;			
			}			
		}
		catch(Exception e) {
			throw new FalhaAoCriarCachorroException(e.getMessage());
		}
	}
	
	
	/*		
		Suponha que todo cachorro tenha 3 tipos de latidos e, portanto, 3 novos métodos devem ser definidos. 
		Alterem a classe abstrata cachorro e adicionem 2 novos métodos abstratos latir. 
		Um desses métodos deverá receber uma String e o outro duas Strings como parâmetro.
	*/
	public abstract void latir();
	public abstract void latir2(String latido);
	public abstract void latir3(String latidoUm, String latidoDois);
	
	public abstract void comer();
	public abstract void dormir();
}
