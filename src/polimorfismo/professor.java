package polimorfismo;

public class professor extends pessoa {

	public String disciplina;
	public int horas;
	
	professor(String nome, String sobrenome, int idade, String cpf, String disciplina, int horas) {
		super(nome, sobrenome, idade, cpf);
		this.disciplina = disciplina;
		this.horas = horas;
	}

}
