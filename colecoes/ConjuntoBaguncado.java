package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1); //bollean
		conjunto.add(true); // Bollean
		conjunto.add("teste"); //String 
		conjunto.add('x'); //char 
		
		System.out.println("O tamanho é: " + conjunto.size());// size = conta varifaveis contidas na classe conjunto
		conjunto.add("Dudu");
		System.out.println("O tamanho é: " + conjunto.size());// adicionou o add
		
		System.out.println(conjunto.remove("teste"));// remove = remove varifaveis da classe. true = sucesso : false = falha
		
		System.out.println(conjunto.contains(1.2));// verifica se a classe conjunto contem a variavel escolhida. true = sucesso : false = falha
		
		Set num = new HashSet();
		num.add(1);
		num.add(2);
		num.add(3);
		
		System.out.println(num);
		System.out.println(conjunto);
		
		conjunto.retainAll(num);// compara as 2 classes e puxa os dados que elas tem em comum.
		System.out.println("Dados em comum entre as classes: " + conjunto);
		
		conjunto.clear();// remove dados da classe conjunto.
		System.out.println(conjunto);
	}
}
