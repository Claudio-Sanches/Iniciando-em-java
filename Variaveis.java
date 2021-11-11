
public class Variaveis {
	public static void main(String[] args) {
		
		// Comentário de uma linha
		
		/*
		 * Comentário de mais linhas
		 */
		
		// Exemplos de variáveis as menores, são para ambientes com pouco espaço....
		
		int varInt = 1;
		
		System.out.print("Mensagem: ");
		System.out.println("Ola Mundo!!!!");
		System.out.println(" ");
		
		System.out.println("Exemplo de Integer - Tamanho 4 bytes");
		System.out.println("Valor : " + varInt);
		System.out.println("Menor valor :" + Integer.MIN_VALUE);
		System.out.println("Maior valor :" + Integer.MAX_VALUE);
		System.out.println(" ");
		
		// Utilizar para definir variáveis longa o L em seu final
		
		long varLong1 = 500;
		long varlong2 = 9123456789466L;
		
		System.out.println("Exemplo de Long, não esquecer do L no final  - Tamanho 8 bytes");
		System.out.println("Valor : " + varLong1);
		System.out.println("Valor : " + varlong2);
		System.out.println("Menor valor :" + Long.MIN_VALUE);
		System.out.println("Maior valor :" + Long.MAX_VALUE);
		System.out.println(" ");
		
		short varShort;
		varShort = 32767;
		
		System.out.println("Exemplo de Short - Tamanho 2 bytes");
		System.out.println("Valor : " + varShort);
		System.out.println("Menor valor :" + Short.MIN_VALUE);
		System.out.println("Maior valor :" + Short.MAX_VALUE);
		System.out.println(" ");
		
		byte varByte = 127;
		
		System.out.println("Exemplo de Byte  - Tamanho 1 bytes");
		System.out.println("Valor : " + varByte);
		System.out.println("Menor valor :" + Byte.MIN_VALUE);
		System.out.println("Maior valor :" + Byte.MAX_VALUE);
		System.out.println(" ");
		
		// Variaveis de pontos flutuantes

		float varFloat = 3.14F;

		System.out.println("Exemplo de Float, não esquecer do F no final  - Tamanho 4 bytes");
		System.out.println("Valor : " + varFloat);
		System.out.println("Menor valor :" + Float.MIN_VALUE);
		System.out.println("Maior valor :" + Float.MAX_VALUE);
		System.out.println(" ");
		
		double varDouble = 3.14;

		System.out.println("Exemplo de Double, não precisa definir no final - Tamanho 8 bytes");
		System.out.println("Valor : " + varDouble);
		System.out.println("Menor valor :" + Double.MIN_VALUE);
		System.out.println("Maior valor :" + Double.MAX_VALUE);
		System.out.println(" ");
		
		// Outras variaveis
		
		boolean varBoolean;
		varBoolean = true;
		
		System.out.println("Exemplo de Boolean - Lógico - Tamanho 1 byte");
		System.out.println(varBoolean);
		System.out.println(" ");
		
		char varChar = 'a';
		
		System.out.println("Exemplo de Char - Trabalha com a tabela ASC quando atribuído valor");
		System.out.println(varChar);
		
		System.out.println("Exemplo de Char - Valor atribuído de 123");
		varChar = 123;
		System.out.println(varChar);
		System.out.println(" ");
		
		System.out.println("Exemplo de String - cadeia de caracteres");
		String palavra = "Uma palavra ou uma frase ...";
		palavra = palavra + " ok";
		System.out.println(palavra);
		
				
	}
}
