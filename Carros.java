package Objetos;

public class Carros {

	public String nome = "Opala";
	public String modelo = "Diplomata Coupe";
	public int ano = 1987;
	String[] acessorios = {
			"Farois de Led",
			"Suporte para celular",
			"Bagageiro de teo cromado",
			"Calota Gran Luxo"
	};
	
	public void acelerar() {
		System.out.println("Vruuumm");
	}
	
	public double calculaConsumo(double km) {
		return km / 6.61;
	}

}
