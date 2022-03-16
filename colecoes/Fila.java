package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("ana");//adiciona elementos na fila
		fila.offer("carlos");//adiciona elementos na fila
		fila.add("roberto");
		fila.offer("Anderson");
		
		//peek e element -> Obtem o proximo elemento da fila (sem remover)
		System.out.println(fila.peek());
		System.out.println(fila.element());
	}
}
