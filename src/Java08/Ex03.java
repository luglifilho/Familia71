/**
 * 
 */
package Java08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


/**
 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe
 * Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via
 * teclado 10 valores inteiros não repetidos e adicione-os individualmente na
 * Collection Set. Em seguida, faça o que se pede: Mostre na tela todos os
 * elementos da Collection Set, utilizando a Classe Iterator. Veja o exemplo
 * abaixo:
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int x =0; x < 10; x++) {
			
			System.out.println("Digite o "+(x+1)+ "º número: ");
			int number = scanner.nextInt();
			numeros.add(number);					
		}
		
		Iterator <Integer> iNumeros = numeros.iterator();
		
		System.out.println("Elementos da Collection Set:");
		
		while(iNumeros.hasNext()) {
			int numero =iNumeros.next();
			System.out.println(numero);
		}
		scanner.close();
	}

}
