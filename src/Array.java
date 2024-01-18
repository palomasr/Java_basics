import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		List<String> responsavelAluno = new ArrayList<>(Arrays.asList("Bruno", "Gabriela"));
		
		
		System.out.println(Arrays.toString(responsavelAluno.toArray()));
		
		responsavelAluno = adicionaResponsavel(responsavelAluno, "Daniel");
		responsavelAluno = adicionaResponsavel(responsavelAluno, "Kilma");
		
		System.out.println(Arrays.toString(responsavelAluno.toArray()));
		
		responsavelAluno = editaResponsavel(responsavelAluno, "Loren", 1);
		
		System.out.println(Arrays.toString(responsavelAluno.toArray()));
		
		responsavelAluno = removeResponsavel(responsavelAluno);
		
		System.out.println(Arrays.toString(responsavelAluno.toArray()));
		
		exibeResponsavel(responsavelAluno);
	}

	public static List<String> adicionaResponsavel(List<String>responsavelAluno, String nomeResponsavel){
		responsavelAluno.add(nomeResponsavel);
		return responsavelAluno;
		
	};
	public static List<String> editaResponsavel(List<String>responsavelAluno, String novoNome, int index){
		responsavelAluno.set(index, novoNome);
		return responsavelAluno;
		
	};
	public static List<String> removeResponsavel(List<String>responsavelAluno){
		responsavelAluno.remove(responsavelAluno.size() -1);
		return responsavelAluno;
		
	};
	public static List<String> exibeResponsavel(List<String>responsavelAluno){
		for (int i = 0 ; i < responsavelAluno.size(); i++) {
			System.out.println((i + 1) + ")" + responsavelAluno.get(i));
		};
		
		return responsavelAluno;
		
	};
	
	
}
