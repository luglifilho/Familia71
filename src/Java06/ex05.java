/* Escreva um algoritmo em Java, que leia números inteiros via 
 * teclado, até que o número zero seja digitado. 
 * Ao final, mostre na tela a soma de todos os números digitados,
 *  que sejam positivos. Veja o exemplo abaixo:
*/ 


package Java06;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int num , soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = scanner.nextInt();
			
			if(num > 0) {
				soma += num;
			}
			
			
		}while(num != 0);
		
		System.out.println("A soma dos número positivos é: " +soma);
		
		scanner.close();
		

	}

}
