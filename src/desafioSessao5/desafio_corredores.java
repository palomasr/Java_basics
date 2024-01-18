package desafioSessao5;

public class desafio_corredores {

	public static void main(String[] args) {
		double tempo_1 = 5.6;
		double tempo_2 = 8.4;
		double tempo_3 = 3.1;
		
		if (tempo_1 < tempo_2 && tempo_1 < tempo_3) {
			System.out.printf("Corredor 1 é o vencedor!");
		}
		else if (tempo_2 < tempo_1 && tempo_2  < tempo_3) {
			System.out.printf("Corredor 2 é o vencedor!");
		}
		else {
			System.out.printf("Corredor 3 é o vencedor!");
		}
		}

}
