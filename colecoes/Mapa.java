package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "roberto");
		usuarios.put(2, "ricardo");
		usuarios.put(3, "rafaela");
		usuarios.put(4, "rebeca");
		
		System.out.println(usuarios.size());//size verifica quantos elementos contem da lista.
		System.out.println(usuarios.isEmpty());//isEmpty verifica se a lista esta vazia.
		System.out.println(usuarios.keySet());//keySet mostra os indices da lista.
		System.out.println(usuarios.values());//values informa o valor dos indices
		System.out.println(usuarios.entrySet());//entrySet infomra o indice e o valor 
		System.out.println(usuarios.containsKey(2));//containsKey verifica se o valor do indice é existente.
		System.out.println(usuarios.containsValue("rebeca"));//containsValue verifica se o indice é existente.
		System.out.println(usuarios.get(1));// retorna o valor do indice informado
		System.out.println(usuarios.remove(1));// remove o indice do valor informado.
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		for(String valor: usuarios.values()) {
			System.out.println(valor);
	}
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print("indice: "+registro.getKey()+ " ");
			System.out.println(registro.getValue());
			
		}
}
}
