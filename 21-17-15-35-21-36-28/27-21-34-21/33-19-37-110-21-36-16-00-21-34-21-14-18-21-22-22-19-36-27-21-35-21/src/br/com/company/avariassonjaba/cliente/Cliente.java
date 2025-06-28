package br.com.company.avariassonjaba.cliente;

import br.com.company.avariassonjaba.dt.ICliente;
import br.com.company.avariassonjaba.impl.ACliente;

public class Cliente extends ACliente implements ICliente {
	/*
		Crie a classe Cliente, que extenderá a classe abstrata e implementará a interface especificada. 
		Obtenha os construtures da superclasse. 
	*/
	public Cliente() {
		super();
	}
	
	public Cliente(String nome, int idade, String cpf, String rg) {
        super(nome, idade, cpf, rg);
    }
	
	/*
		Sobreescreva o getter do atributo nome na classe Cliente, retornando “Desconhecido” caso o nome seja branco ou nulo, ou o próprio nome caso contrário. 
	*/
	@Override
	public String getNome() {
        String nome = super.getNome();
        if (nome == null || nome.trim().isEmpty()) {
            return "Desconhecido";
        }
        return nome;
    }
}
