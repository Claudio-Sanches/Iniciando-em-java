
public class Condicionais {

	public static void main(String[] args) {
		
		double notaA, notaB, media;
		notaA = 7;
		notaB = 4;
		
		int varFaltas = 10;

		media = (notaA + notaB) / 2;
		
		if(media >= 7) {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB);
			System.out.println("A m�dia calculada � : " + media + " e est� Aprovado");
		}else {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB);
			System.out.println("A m�dia calculada � : " + media + " e est� Reprovado");
		}
	
		System.out.println(" ");
		System.out.println("Incluindo o c�lculo da recupera��o e operador l�gico &&  ");
		System.out.println(" ");
		
		if(media >7) {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB);
			System.out.println("A m�dia calculada � : " + media + " e est� Aprovado");
		}else if(media >=5 && media < 7) {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB);
			System.out.println("A m�dia calculada � : " + media + " e est� de Recupera��o");
		}else {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB);
			System.out.println("A m�dia calculada � : " + media + " e est� Reprovado");
		}
		
		System.out.println(" ");
		System.out.println("Incluindo presen�a com a vari�vel faltas l�gico &&  ");
		System.out.println(" ");
		
		if (media >= 7 && varFaltas<= 10) {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB + " Faltas " + varFaltas);
			System.out.println("A m�dia calculada � : " + media + " e est� Aprovado");
		}else if(media < 5 || varFaltas >10) {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB + " Faltas " + varFaltas);
			System.out.println("A m�dia calculada � : " + media + " e est� Reprovado");
		}else if(media >= 5 && media <7 && varFaltas <= 10) {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB + " Faltas " + varFaltas);
			System.out.println("A m�dia calculada � : " + media + " e est� de Recupera��o");
		}else {
			System.out.println("Para as notas A = " + notaA +" e B = " + notaB + " Faltas " + varFaltas);
			System.out.println("A m�dia calculada � : " + media + " e est� Reprovado");
		}
		
	}

}
