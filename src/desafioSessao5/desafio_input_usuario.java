package desafioSessao5;

import java.util.Scanner;

public class desafio_input_usuario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		String sobrenome;
		String email;
		String senha;
		String senhaFinal;
		
		System.out.printf("Informe seu nome:\n");
		nome = ler.nextLine();
		System.out.printf("Informe seu sobrenome:\n");
		sobrenome = ler.nextLine();
		System.out.printf("Informe seu email:\n");
		email = ler.nextLine();
		System.out.printf("Crie uma senha:\n");
		senha = ler.nextLine();
		System.out.printf("Confirme sua senha:\n");
		senhaFinal = ler.nextLine();
		
		System.out.printf(senha + " " + senhaFinal);
		
		if(senha.equals(senhaFinal)) {
			System.out.printf("Cadastro concluído");
		}else {
			System.out.printf("As senhas não são iguais");
		}

	}

}
