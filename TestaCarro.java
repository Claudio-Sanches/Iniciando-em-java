package Objetos;

import java.util.Scanner;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carros carroUm = new Carros();
		
		System.out.println("Nome do carro: " + carroUm.nome);
		System.out.println("Modelo: " + carroUm.modelo);
		System.out.println("Ano: " + carroUm.ano);
		
		System.out.println(" ");
		System.out.println("Acessórios disponíveis :");
		System.out.println(" ");
		
		for(int varFor = 0; varFor < carroUm.acessorios.length ; varFor++ ) {
			System.out.println((varFor+1) + " - " + carroUm.acessorios[varFor]);
		};
		
		System.out.println(" ");
		
		carroUm.acelerar();
		carroUm.acelerar();
		carroUm.acelerar();
		
		System.out.println(" ");
		
		Scanner varEntrada = new Scanner(System.in);
		System.out.print("Digite a kilometragem : ");
		int km = varEntrada.nextInt();
		
		System.out.print("Resulta em " + carroUm.calculaConsumo(km) +" km/l");
		
	}

}
