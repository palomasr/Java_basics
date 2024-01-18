import java.util.List;
import java.util.ArrayList;

public final class Usuarios {
	
	private static Usuarios instance;
	private List<usuario> usuarios;
	
	/*instanciando a lista vazia, criando*/
	
	public Usuarios() {
		this.usuarios = new ArrayList<>();
	}
	
	/*criando metido de add*/
	
	public usuario adicionaUsuario(String nome, String matricula, String senha, String tipo) {
		usuario usuario = new usuario(nome, matricula,senha,tipo);
		usuarios.add(usuario);
		return usuario;	
	}	
	
	/*criando metido indexof para obter o indice do usuario que deve ser removido, o .remove só funciona com o indice*/
	
	public int indexOf(String matricula) {
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getMatricula().equals(matricula))
				return i;
		}
		
		
		return -1;
	}
	
	
	/*criando metido de remove*/
	
	public void removeUsuario(String matricula) {
		int indice = this.indexOf(matricula);
		if (indice != -1) {
			usuarios.remove(indice);
			System.out.println("Usuario removido com sucesso!");
		}else {
			System.out.println("Usuario não foi encontrado!");
		}
	}
	
	public List<usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public static Usuarios getInstance() {
		if (instance == null) {
			instance = new Usuarios();
		}
		return instance;
	}

} 
