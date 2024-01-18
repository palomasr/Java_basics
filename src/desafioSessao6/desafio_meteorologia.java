package desafioSessao6;

import java.util.Scanner;

public class desafio_meteorologia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double todasTemperaturas = 0;
		double somadorTemperaturas = 0;
		
		while(true) {
			System.out.println("Insira a temperatura:");
			double temperatura = scanner.nextDouble();
			if (temperatura == 0) {
				break;
				
			}
			todasTemperaturas += temperatura;
			somadorTemperaturas += 1;
		}
		double mediaTemperatura = todasTemperaturas / somadorTemperaturas;
		System.out.println("A média das notas é: " + mediaTemperatura);
	}

}
