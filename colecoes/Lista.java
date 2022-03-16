package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("joao"));
		lista.add(new Usuario("tadeu"));
		
		System.out.println(lista.get(3));//Acessar pelo indice
		
		System.out.println("removeu " + lista.remove(1));// remove o indice da lista
		
		System.out.println(lista.remove(new Usuario("manu")));// tenta remover portando o dado não existe retornando false.
		
		System.out.println("Tem? " + lista.contains(new Usuario("joao")));// verificar se o dado é existente
		
		System.out.println("Tem? " + lista.contains(u1)); // verificar se o indice u1 é existente
		
		for(Usuario u: lista){
			System.out.println(u.nome);// retorna todos os dados da lista
		}
	}

}
