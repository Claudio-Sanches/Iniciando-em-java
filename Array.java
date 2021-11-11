import java.util.Random;

public class Array {

	public static void main(String[] args) {
		
		String [] varNomes = {"Claudio", "Arthur", "Filipe", "Irai"};
		
		System.out.println("Exemplo de for com array de nomes :");
		System.out.println(" ");
		
		for (int varFor = 0; varFor < varNomes.length ; varFor++) {
			System.out.print(varNomes[varFor] + ",");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Exemplo de for com array de Doubless :");
		System.out.println(" ");

		double[] varDoubles = new double[10];
		for(int varFor = 0; varFor < varDoubles.length; varFor++) {
			varDoubles[varFor] = varFor + 1;
			System.out.print(varDoubles[varFor] + " , ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Exemplo de for com array Randômicos :");
		System.out.println(" ");
		
		Random varRandom = new Random();
		int[] varIntRandom = new int[10];
		for(int varFor = 0; varFor < varIntRandom.length ; varFor++) {
			varIntRandom[varFor] = varRandom.nextInt(20);
			System.out.print(varIntRandom[varFor] + " , ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Exemplo de for com array com matriz Bidimensional :");
		System.out.println(" ");
		
		int[][] MatrizDeInteiros = {
				{1, 2, 3, 4},
				{4, 4, 7, 8, 2, 9},
				{9, 1, 6},
		};
		
		for(int forLinha = 0 ; forLinha < MatrizDeInteiros.length; forLinha++) {
			for(int forColuna = 0; forColuna < MatrizDeInteiros[forLinha].length; forColuna++) {
				System.out.print(MatrizDeInteiros[forLinha][forColuna] + ",");
			}
			System.out.println("");
		}

		System.out.println(" ");
		System.out.println("Informando dados da matriz Bidimensional :");
		System.out.println(" ");
		
		for(int varFor = 0 ; varFor < MatrizDeInteiros.length; varFor++) {
			System.out.println("A quantidade de elementos da linha " + (varFor + 1) + " da matriz é de : "+ MatrizDeInteiros[varFor].length);
		}
	}

}
