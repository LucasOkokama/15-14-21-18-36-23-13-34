package br.com.company.javatraining.carro.impl;

public abstract class Carro {
	/*		
		Crie uma classe abstrata Carro. 
		Defina todas as características referentes a carros nessa classe. 
		Adicionem condições à variável kilometragem para que ela admita apenas valores maiores que 0.
	*/
	protected String nome;
    protected String cor;
    protected int ano;
    protected int potencia;
    protected double kilometragem;
    
    public Carro(String nome, String cor, int ano, int potencia, double kilometragem) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
        this.potencia = potencia;
        this.kilometragem = kilometragem > 0 ? kilometragem : 1.0;
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
}

