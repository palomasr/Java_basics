import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		Usuarios usuarios = Usuarios.getInstance();
		usuario manuel = usuarios.adicionaUsuario("manuel", "99939283892", "senha1", "gerente");
		usuario bruno = usuarios.adicionaUsuario("bruno", "99939283894", "senha1", "gerente");
		usuario fernanda = usuarios.adicionaUsuario("fernando", "99939283895", "senha1", "gerente");
		
		System.out.println(manuel.getMatricula());
		System.out.println(bruno.getMatricula());
		System.out.println(fernanda.getMatricula());
		System.out.println(Arrays.toString(usuarios.getUsuarios().toArray()));
		usuarios.removeUsuario("99939283894");
		usuarios = Usuarios.getInstance();
		System.out.println(Arrays.toString(usuarios.getUsuarios().toArray()));
	}

}
