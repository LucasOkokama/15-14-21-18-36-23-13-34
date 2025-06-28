package br.com.company.javatraining.dt;

public class FalhaAoCriarCachorroException extends Exception {
	/*		
		Crie a exception "FalhaAoCriarCachorroException".
		
		Como você faria para que esta exceção pudesse receber uma mensagem como parâmetro?
		R: Criar um construtor que receba como parâmetro uma String e que chame o construtor da superclasse (Exception), super(), passando essa mensagem.
	*/
	public FalhaAoCriarCachorroException(String msg) {
		super(msg);
	}
}
