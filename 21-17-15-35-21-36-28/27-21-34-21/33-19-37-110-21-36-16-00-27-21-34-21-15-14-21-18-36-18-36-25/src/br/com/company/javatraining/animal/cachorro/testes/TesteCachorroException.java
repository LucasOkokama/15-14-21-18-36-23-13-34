package br.com.company.javatraining.animal.cachorro.testes;

import br.com.company.javatraining.animal.cachorro.Beagle;
import br.com.company.javatraining.animal.cachorro.impl.Cachorro;

public class TesteCachorroException {
	/*		
		Crie uma classe TesteCachorroException.
		
		Crie um método main e dentro desse método crie uma nova instância de cachorro passando uma idade negativa. 
		Execute a classe. 
		O que aconteceu? 
		A instância foi criada? 
		
		A execução do programa continuou ou parou?
		R: Continuou. O bloco catch capturou a exceção e permitiu que o programa seguisse.
	*/
	
	/*		
		Altere a classe TesteCachorroException para que ela capture a exception, utilizando o bloco try/catch. 
		Caso seja capturada, imprima no console "Exception capturada".
		
		Testem o lançamento/captura de exceções criando cachorros que façam com que a Exception seja lançada.
	*/
	
	/*		
		Utilizando a classe TesteCachorroException, verifique se a Exception criada está sendo lançada. 
		
		É possível capturar a sua exceção através da instrução "catch (Exception e)" ou é necessário colocar "catch (FalhaAoCriarCachorroExceptione)?
		R: Sim, é possível. O "catch (Exception e)" captura qualquer exceção que seja filha de Exception, incluindo FalhaAoCriarCachorroException.
		   Já "catch (FalhaAoCriarCachorroException e)" é mais específico e captura somente exceções do tipo FalhaAoCriarCachorroException (ou subclasses dela).
	*/
	public static void main (String[] args){
		try {
			String[] vacinas = {"V10", "Antirrábica", "Gripe Canina"};
			Cachorro myDogIdadeNegativa = new Beagle("Keli", 1, "Branco com marrom", vacinas);
			myDogIdadeNegativa.setIdade(-1);
		}
		catch(Exception e) {
			System.out.println("Exception capturada: " + e.getMessage());
		}
		
		try {
			String[] vacinas = {"V10", "Antirrábica", "Gripe Canina"};
			Cachorro myDogNomeNull = new Beagle(null, 10, "Vermelho", vacinas);
		}
		catch(Exception e) {
			System.out.println("Exception capturada 2: " + e.getMessage());
		}
		
		try {
			String[] vacinas = {"V10", "Antirrábica", "Gripe Canina"};
			Cachorro myDogCorVazio = new Beagle("Keli", 10, "", vacinas);
		}
		catch(Exception e) {
			System.out.println("Exception capturada 3: " + e.getMessage());
		}
	}
	
}

