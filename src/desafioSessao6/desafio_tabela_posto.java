package desafioSessao6;

import java.util.Scanner;

public class desafio_tabela_posto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o preço do litro da gasolina:");
		double valorLitro = scanner.nextDouble();
		double valorTotal = 0;
		
		for( int i= 1; i <= 50; i++) {
			valorTotal = valorLitro * i;
			System.out.println("Número de litros: "+ i +" | "+ "Valor do Litro: "+ valorLitro +" | "+ "valor total: " + valorTotal  );
			
		}

	}

}
