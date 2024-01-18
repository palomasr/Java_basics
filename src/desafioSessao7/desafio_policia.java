package desafioSessao7;

import java.util.Scanner;

public class desafio_policia {

	public static void main(String[] args) {
		int numSim = interrogatorio();
		classificaInterrogatorio(numSim);

	}
	
	public static void classificaInterrogatorio(int numSim) {
		if (numSim == 0 || numSim == 1) {
			System.out.println("Inocente");
		}else if(numSim == 2){
			System.out.println("Suspeito");
		}else if (numSim == 3) {
			System.out.println("Cúmplice");
		}else if (numSim == 5) {
			System.out.println("Assassino");
		}
	}
	
	public static int interrogatorio() {
		Scanner scanner = new Scanner(System.in);
		
		int numSim = 0;
		
		System.out.println("Telefonou para vítima?");
		int resposta1 = scanner.nextInt();
		if (resposta1 == 1 ) {
			numSim += 1;
		}
		System.out.println("Esteve no local do crime?");
		int resposta2 = scanner.nextInt();
		if (resposta2 == 1 ) {
			numSim += 1;
		}
		System.out.println("Mora perto da vítima?");
		int resposta3 = scanner.nextInt();
		if (resposta3 == 1 ) {
			numSim += 1;
		}
		System.out.println("Devia para vítima?");
		int resposta4 = scanner.nextInt();
		if (resposta4 == 1 ) {
			numSim += 1;
		}
		System.out.println("Já trabalhou com vítima?");
		int resposta5 = scanner.nextInt();
		if (resposta5 == 1 ) {
			numSim += 1;
		}
		return numSim;
		
		
	}
	

}
