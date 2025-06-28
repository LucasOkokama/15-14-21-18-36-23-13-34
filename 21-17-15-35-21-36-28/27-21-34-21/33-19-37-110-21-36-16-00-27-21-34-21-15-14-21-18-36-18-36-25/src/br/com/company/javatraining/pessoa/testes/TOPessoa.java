package br.com.company.javatraining.pessoa.testes;

import br.com.company.javatraining.pessoa.dt.ITOPessoa;
import br.com.company.javatraining.pessoa.dt.TECpfNaoInformadoException;
import br.com.company.javatraining.pessoa.dt.TEDataNascimentoNaoInformadoException;
import br.com.company.javatraining.pessoa.dt.TEEnderecoNaoInformadoException;
import br.com.company.javatraining.pessoa.dt.TEIdadeInvalidaException;
import br.com.company.javatraining.pessoa.dt.TENomeNaoInformadoException;
import br.com.company.javatraining.pessoa.impl.ATOPessoa;
import br.com.company.javatraining.pessoa.impl.Pessoa;

public class TOPessoa extends ATOPessoa implements ITOPessoa {
	/*		
		Na classe TOPessoa, implemente os construtores (default) da superclasse.
		
		Crie também neste pacote uma classe (default) TOPessoa que herde de ATOPessoa e implemente ITOPessoa.
	*/
	public TOPessoa(String nome, int idade, String cpf, String dataNascimento, String endereco)
            throws TENomeNaoInformadoException,
                   TEIdadeInvalidaException,
                   TECpfNaoInformadoException,
                   TEDataNascimentoNaoInformadoException,
                   TEEnderecoNaoInformadoException {
        super(nome, idade, cpf, dataNascimento, endereco);
    }
}
