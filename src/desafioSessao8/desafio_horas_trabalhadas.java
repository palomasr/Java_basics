package desafioSessao8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class desafio_horas_trabalhadas {

	public static void main(String[] args) {
		List<Integer> horasProletario = new ArrayList<>(Arrays.asList(8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,8,10,15,8,8,8));
		HorasTrabalhadas(horasProletario);
	}
	 public static void HorasTrabalhadas(List<Integer>horasProletario){
		 int horasTotais = 0;
		 int recebeHoraExtra = 0;
		 int horasFaltando = 0;
		 
		 for (int i = 0 ; i < horasProletario.size(); i++) {
			 horasTotais += horasProletario.get(i);
			 
		 }
		 if (horasTotais == 160) {
			 System.out.println("Salário regular");
		 }else if(horasTotais < 160){
			 horasFaltando = 160 - horasTotais;
			 System.out.println("Está devendo " + horasFaltando + " horas");
		 }else {
			 recebeHoraExtra = horasTotais - 160;
			 System.out.println("Receberá " + recebeHoraExtra + " horas extras");
		 }
		 
	 

}}
