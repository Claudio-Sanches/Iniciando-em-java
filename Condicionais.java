
public class Condicionais {

	public static void main(String[] args) {
		
		double notaA, notaB, media;
		notaA = 7;
		notaB = 4;
		
		int varFaltas = 10;

		media = (notaA + notaB) / 2;
		
		if(media >= 7) {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB);
			System.out.println("A média calculada é : " + media + " e está Aprovado");
		}else {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB);
			System.out.println("A média calculada é : " + media + " e está Reprovado");
		}
	
		System.out.println(" ");
		System.out.println("Incluindo o cálculo da recuperação e operador lógico &&  ");
		System.out.println(" ");
		
		if(media >7) {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB);
			System.out.println("A média calculada é : " + media + " e está Aprovado");
		}else if(media >=5 && media < 7) {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB);
			System.out.println("A média calculada é : " + media + " e está de Recuperação");
		}else {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB);
			System.out.println("A média calculada é : " + media + " e está Reprovado");
		}
		
		System.out.println(" ");
		System.out.println("Incluindo presença com a variável faltas lógico &&  ");
		System.out.println(" ");
		
		if (media >= 7 && varFaltas<= 10) {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB + " Faltas " + varFaltas);
			System.out.println("A média calculada é : " + media + " e está Aprovado");
		}else if(media < 5 || varFaltas >10) {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB + " Faltas " + varFaltas);
			System.out.println("A média calculada é : " + media + " e está Reprovado");
		}else if(media >= 5 && media <7 && varFaltas <= 10) {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB + " Faltas " + varFaltas);
			System.out.println("A média calculada é : " + media + " e está de Recuperação");
		}else {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB + " Faltas " + varFaltas);
			System.out.println("A média calculada é : " + media + " e está Reprovado");
		}
		
	}

}
