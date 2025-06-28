package br.com.company.javatraining.testesdeclasses;

public class TestaWrapper {
	/*		
		Crie uma classe TestaWrapper. 
		
		Crie o método main e dentro deste método, crie a variável local int i = 10;
		
		A partir dessa variável:
			- Crie uma String
			- Com a String, crie um Float
			- Com o Float, crie um Double
			- Com o Double, crie um double
			- Com o double, crie novamente uma String
			- Com a String, crie um novo int
	*/
	
	public static void main(String[] args) {
		int i = 10;
		
		String iString = Integer.toString(10);
		Float iFloat = Float.valueOf(iString);
		Double iDouble = Double.valueOf(iFloat);
		double iPrimitiveDouble = iDouble.doubleValue();
		String iStringDois = String.valueOf(iPrimitiveDouble);
		int iPrimitiveInt = (int) Double.parseDouble(iStringDois);
		
		
		System.out.println("int original: " + i);
        System.out.println("String: " + iString);
        System.out.println("Float: " + iFloat);
        System.out.println("Double: " + iDouble);
        System.out.println("double: " + iPrimitiveDouble);
        System.out.println("Nova String: " + iStringDois);
        System.out.println("Novo int: " + iPrimitiveInt);
	}
}
