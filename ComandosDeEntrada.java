import java.util.Scanner;

public class ComandosDeEntrada {
	
	public static void main(String[] args) {

		int varInt;
		double varDouble;
		String varString;
		String varFrase;
		float varFloat;
		
		Scanner varEntrada = new Scanner(System.in);
		
		System.out.print("Informe uma frase : ");
		varFrase = varEntrada.nextLine();
		System.out.println("A frase � : " + varFrase);
		System.out.println(" ");
		
		System.out.print("Informe uma palavra : ");
		varString = varEntrada.next();
		System.out.println("A palavra � : " + varString);
		System.out.println(" ");
		
		System.out.print("Informe um numero inteiro : ");
		varInt = varEntrada.nextInt();
		System.out.println("O inteiro � : " + varInt);
		System.out.println(" ");
		
		System.out.print("Informe o Double (a entrada � com v�rgula) : ");
		varDouble = varEntrada.nextDouble();
		System.out.println("O Double � : " + varDouble);
		System.out.println(" ");
		
		System.out.print("Informe o Float (a entrada � com v�rgula) : ");
		varFloat = varEntrada.nextFloat();
		System.out.println("O Double � : " + varFloat);
		System.out.println(" ");
	}

}
