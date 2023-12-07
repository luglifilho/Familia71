package Java05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		int n1 = ler.nextInt();
		
		if(n1 % 2 == 0) {
			if(n1 >= 0) {
				System.out.println("O número " + n1 + " é par e positivo!");
			}else {
				System.out.println("O número " + n1 + " é par e negativo!");
			}
		}else {
			if(n1 >= 0) {
				System.out.println("O número " + n1 + " é ímpar e positivo!");
			}else {
				System.out.println("O número " + n1 + " é ímpar e negativo!");
			}
			
		}
		
		ler.close();	

	}

}
