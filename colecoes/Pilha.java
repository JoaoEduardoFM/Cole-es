package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");
		livros.push("Dom quixote");
		livros.push("O hobbit");
		
		for(String pilha : livros) {
			System.out.println(pilha);
		}
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());// poll remove da lista
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());// retorna null quando não tem mais indices para remover 
		
		//livros.size(); obtem o tamanho da lista
		//livros.clear(); limpa a lista
		//livros.contains("O hobbit"); verifica se contem tal indice
		//livros.isEmpty(); Esta vazia se estiver retorna true	
	}

}
