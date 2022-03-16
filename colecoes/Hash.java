package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
	HashSet<Usuario> usuarios = new HashSet<>();
	
	usuarios.add(new Usuario("Pedro"));
	usuarios.add(new Usuario("ana"));
	usuarios.add(new Usuario("ricardo"));
	
	boolean resultado = usuarios.contains(new Usuario("Pedro"));// verifica se o indice esta contido na lista.
	System.out.println(resultado);
	}
}
