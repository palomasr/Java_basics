package herança;

public class pessoa {

		String nome;
		String sobrenome;
		int idade;
		private String cpf;
		
		pessoa(String nome, String sobrenome, int idade, String cpf){
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.idade=idade;
			this.cpf = cpf;
		}
		
		public String saudacao() {
			return String.format("Olá meu nome é %s %s", this.nome, this.sobrenome);
		}

		public String getCpf() {
			return this.cpf;
		}
		
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
}
