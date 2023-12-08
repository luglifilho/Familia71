/* 
 * Escreva um algoritmo em Java, que leia números inteiros via teclado,
 *  até que o número zero seja digitado.
 *   Ao final, mostre na tela a média de todos os números digitados,
 *  que sejam múltiplos de 3. 
 */

package Java06;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		float soma=0;
		float count=0;
		float avarage;
		
		do {
			System.out.println("Digite um número: ");
			num = scanner.nextInt();
			
			if( num % 3 == 0 && num != 0) {
				soma += num;
				count++;				
			}
			
		
			
		}while(num != 0);
		
		avarage = soma/count;
	
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f%n" ,avarage );
		
		scanner.close();

	}

}
