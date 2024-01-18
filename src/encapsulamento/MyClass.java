package encapsulamento;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		pessoa manuel = new pessoa("Manuel", "Neto", 26, "9199199191919");
		System.out.println(manuel.nome);
		System.out.println(manuel.sobrenome);
		System.out.println(manuel.idade);
		System.out.println(manuel.saudacao());
		System.out.println(manuel.getCpf());
		manuel.setCpf("6363636636363636");
		System.out.println(manuel.getCpf());
	}

}
