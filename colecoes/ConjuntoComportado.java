package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> lista = new TreeSet<>();
		lista.add("Ana");
		lista.add("carloas");
		lista.add("João");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		Set<Integer> nums =new HashSet<>();{
		nums.add(10);
		nums.add(20);
		nums.add(30);;
		
		for(int n :nums) {
		
		System.out.println(n);
		}
	}
}
}