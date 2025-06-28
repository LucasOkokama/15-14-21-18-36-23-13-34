package br.com.company.javatraining.pessoa.impl;

import br.com.company.javatraining.pessoa.dt.TECpfNaoInformadoException;
import br.com.company.javatraining.pessoa.dt.TEDataNascimentoNaoInformadoException;
import br.com.company.javatraining.pessoa.dt.TEEnderecoNaoInformadoException;
import br.com.company.javatraining.pessoa.dt.TEIdadeInvalidaException;
import br.com.company.javatraining.pessoa.dt.TENomeNaoInformadoException;

public abstract class ATOPessoa {
	
	/*		
		Crie exceções para TODOS os atributos da classe ATOPessoa (TENomeNaoInformadoException, TEDataDeNascimentoNaoInformadaException, …)
		Caso algum deles não seja informado na criação de uma Pessoa, lance a exceção adequada.
		
		Crie uma classe abstrata ATOPessoa. 
		Nesta classe, coloque atributos comuns a toda pessoa (nome, dataNascimento, cpf, endereco, …). 
		Crie 2 construtores protected (default e completo). 
		Adicione getters públicos para os atributos.
	*/
	protected String nome;
	protected int idade;
	protected String cpf;
	protected String dataNascimento;
	protected String endereco;
	
	public ATOPessoa() {
		super();
	}

	protected ATOPessoa(String nome, int idade, String cpf, String dataNascimento, String endereco) 
			throws TENomeNaoInformadoException, 
				   TEIdadeInvalidaException, 
				   TECpfNaoInformadoException, 
				   TEDataNascimentoNaoInformadoException,
				   TEEnderecoNaoInformadoException{
		if(nome == null || nome.trim().isEmpty()) {
			throw new TENomeNaoInformadoException("Nome não foi informado.");
		}
		
		if(idade < 0) {
			throw new TEIdadeInvalidaException("Idade não foi informado.");
		}
		
		if(cpf == null || cpf.trim().isEmpty()) {
			throw new TECpfNaoInformadoException("CPF não foi informado.");
		}
		
		if(dataNascimento == null || dataNascimento.trim().isEmpty()) {
			throw new TEDataNascimentoNaoInformadoException("Data de Nascimento não foi informado.");
		}
		
		if(endereco == null || endereco.trim().isEmpty()) {
			throw new TEEnderecoNaoInformadoException("Endereço não foi informado.");
		}
		
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
