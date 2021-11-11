
public class ComandosDeRepeticao {

	public static void main(String[] args) {
	
		int varCont = 1;
		
		System.out.println("Looping utilizando While");		
		
		while (varCont <= 10) {
			System.out.print(varCont + ",");
			varCont++;
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Looping utilizando Do While com o mesmo contador");

		do {
			System.out.print(varCont + ",");
			varCont++;
		}while(varCont <=20);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Looping utilizando For");
		
		for(int varFor = 1; varFor <= 10; varFor++) {
			System.out.print(varFor + ",");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Looping utilizando For com array de frutas");
		
		String[] varFrutas = {"Maça", "Melão", "Banana", "Abacate"};
		
		for(int varFor = 0; varFor < varFrutas.length; varFor++) {
			System.out.println(varFrutas[varFor]);
		}
		
	}

}
