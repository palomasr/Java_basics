package desafioSessao8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class desafio_array_notas {

	public static void main(String[] args) {
		List<Double> notasAlunos = new ArrayList<>(Arrays.asList(8.0, 6.0, 5.0, 9.0, 6.7));
		resultadoFinal(notasAlunos);
	}
	
	
	public static void resultadoFinal(List<Double>notasAlunos){
		int reprovados = 0;
		int aprovados = 0;
		for (int i = 0 ; i < notasAlunos.size(); i++) {
			if (notasAlunos.get(i) < 7) {
				reprovados += 1;
			}else {
				aprovados += 1;
			};
			
		}
			System.out.println("Aprovados: " + aprovados + " | Reprovados: " + reprovados);
		};
		
		

}
