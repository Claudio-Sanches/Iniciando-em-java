
public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int varA = 10;
		int varB = 20;
		boolean varCompara1 = varA == varA;
		boolean varCompara2 = varA != varA;

		
		System.out.println("Atribuido os valores para A = 10 e B = 20");
		System.out.println("Teste de igualdade A == B : " + (varA == varB));
		System.out.println("Teste de igualdade A == A : " + varCompara1);
		System.out.println(" ");
		
		System.out.println("Atribuido os valores para A = 10 e B = 20");
		System.out.println("Teste de igualdade A != B : " + (varA != varB));
		System.out.println("Teste de igualdade A != A : " + varCompara2);
		System.out.println(" ");
		
		System.out.println("Atribuido os valores para A = 10 e B = 20");
		System.out.println("Teste de igualdade A > B : " + (varA > varB));
		System.out.println("Teste de igualdade B > A : " + (varB > varA));
		System.out.println(" ");
		
		System.out.println("Atribuido os valores para A = 10 e B = 20");
		System.out.println("Teste de igualdade A < B : " + (varA < varB));
		System.out.println("Teste de igualdade A < A : " + (varA < varA));
		System.out.println(" ");
		
		System.out.println("Atribuido os valores para A = 10 e B = 20");
		System.out.println("Teste de igualdade A >= B : " + (varA >= varB));
		System.out.println("Teste de igualdade A >= A : " + (varA >= varA));
		System.out.println(" ");

		System.out.println("Atribuido os valores para A = 10 e B = 20");
		System.out.println("Teste de igualdade B <= A : " + (varB <= varA));
		System.out.println("Teste de igualdade B <= B : " + (varB <= varB));
		System.out.println(" ");

	}

}
