
public class ComandoDeSelecao {

	public static void main(String[] args) {
		
		int varEscolha = 2;
		
		System.out.println("Exemplo do funcionamento do Switch com a variável = " + varEscolha);
		
		switch(varEscolha) {
		case 1:
			System.out.println("Numero 1");
			break;
		case 2:
			System.out.println("Numero 2");
			break;
		case 3:
			System.out.println("Numero 3");	
			break;
		default:
			System.out.println("Outro número");	
		}

	}

}
