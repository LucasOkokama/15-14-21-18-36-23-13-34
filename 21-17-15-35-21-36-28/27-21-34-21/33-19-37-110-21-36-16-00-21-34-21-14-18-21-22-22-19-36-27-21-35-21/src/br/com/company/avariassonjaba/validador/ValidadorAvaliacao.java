package br.com.company.avariassonjaba.validador;

import br.com.company.avariassonjaba.dt.TECpfInvalidoException;
import br.com.company.avariassonjaba.dt.TECpfNaoInformadoException;
import br.com.company.gen.util.Validador;

public class ValidadorAvaliacao {
	/*
		Crie a classe ValidadorAvaliacao, que possui um método estático validaCpf(String cpf). 
		Este método deverá lançar a exceção TECpfNaoInformadoException e TECpfInvalidoException. 
		Faça as verificações necessárias.
	*/
	public static boolean validaCpf(String cpf) throws TECpfNaoInformadoException, TECpfInvalidoException {
		if(cpf == null || cpf.trim().isEmpty()) {
			throw new TECpfNaoInformadoException("CPF não informado");
		}
		
		if(Validador.ehCpfValido(cpf)) {
			return true;
		}
		
		throw new TECpfInvalidoException("CPF inválido");
	}
}
