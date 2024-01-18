package desafioSessao4;

public class notas_escolares {

	public static void main(String[] args) {
		double notaPrimeiroBi = 7.5;
		double notaSegundoBi = 0;
		double notaTerceiroBi = 0;
		double notaQuartoBi = 6.6;
		
		double mediaFinal = (notaPrimeiroBi + notaSegundoBi + notaTerceiroBi +  notaQuartoBi)/ 4;
		
		System.out.println(mediaFinal);
		
		if (mediaFinal >= 7) {
			System.out.println("O Aluno está aprovado");
		}else { 
			System.out.println("O Aluno está reprovado");
		}
		//operadores ternários 
		System.out.println(mediaFinal >= 7 ? "O Aluno está aprovado" : "O Aluno está reprovado");
	}

}
