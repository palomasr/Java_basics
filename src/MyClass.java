import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String nome = "Manoel";
//		String sobrenome = "Ferreira";
//		int idade = 26;
//		final String matricula = "827378282000";
//		String nomeDoPai = "João";
//		String nomeDaMae = "Maria";
//		Boolean temAutorizaçao = true;
//		
//		System.out.println(nome);
//		System.out.println(sobrenome);
//		System.out.println(idade);
//		idade = 27;
//		System.out.println(idade);
//		System.out.println(matricula);
//		System.out.println(nomeDoPai);
//		System.out.println(nomeDaMae);
//		System.out.println(temAutorizaçao);
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		double somaNotas = 0;
//		
//		for(double i = 1; i < 4; i++) {
//			System.out.println("Insira a nota:");
//			double nota = scanner.nextDouble();
//			somaNotas += nota;
//		}
//		
//		double mediaNotas = somaNotas/4;
//		
//		System.out.println("A média das notas é: " + mediaNotas);
		
	Scanner scanner = new Scanner(System.in);
		
		double somaNotas = 0;
		int somadorNumeroNotas = 0;
		
		while(true) {
			System.out.println("Insira a nota:");
			double nota = scanner.nextDouble();
			if (nota == 0) {
				break;
				
			}
			somaNotas += nota;
			somadorNumeroNotas += 1;
		}
		double mediaNotas = somaNotas / somadorNumeroNotas;
		System.out.println("A média das notas é: " + mediaNotas);
		
	}

}
