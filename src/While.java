
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somaNumeros = 0;
		while (somaNumeros < 100) {
			System.out.println("Digite um número:");
			somaNumeros += scanner.nextInt();
	}
		System.out.println(somaNumeros);
	}
}
