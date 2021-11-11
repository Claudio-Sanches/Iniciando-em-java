
public class IncrementoDecremento {

	public static void main(String[] args) {
		
		int varA = 1;
		int varB = 1;
		int varC = 1;
		int varD = 1;
		
		
		System.out.println("Definida a variável A com valor 1 - Exemplo pós incremento");
		System.out.println("Valor da variável A : " + varA++);
		System.out.println("Valor da variável A após o incremento : " + varA);
		System.out.println(" ");
		
		System.out.println("Definida a variável B com valor 1 - Exemplo pré incremento");
		System.out.println("Valor da variável B ação do pré incremento : " + ++varB);
		System.out.println("Valor da variável B : " + varB);
		System.out.println(" ");
		
		System.out.println("Definida a variável C com valor 1 - Exemplo pós decremento");
		System.out.println("Valor da variável C : " + varC--);
		System.out.println("Valor da variável C após o incremento : " + varC);
		System.out.println(" ");
		
		System.out.println("Definida a variável D com valor 1 - Exemplo pré decremento");
		System.out.println("Valor da variável D ação do pré incremento : " + --varD);
		System.out.println("Valor da variável D : " + varD);
		System.out.println(" ");

	}

}
