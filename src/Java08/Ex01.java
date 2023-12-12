package Java08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da
 * Classe String. O programa deverá solicitar ao usuário, que ele digite via
 * teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em
 * seguida, faça o que se pede: Mostre na tela todas as cores que foram
 * adicionadas. Mostre na tela todas as cores que foram adicionadas ordenadas em
 * ordem crescente.
 */

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<String> cores = new ArrayList<String>();
		
		for(int x=0; x < 5; x++) {
			System.out.println("Digite a "+(x+1)+ "º cor: ");
			String cor = scanner.next();
			cores.add(cor);
		}
		
		System.out.println("\nListar todas as cores: \n" + cores);
		
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores: \n" + cores);
	
		scanner.close();
		

	}

}
