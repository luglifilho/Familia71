package Java06;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int pares = 0, impares = 0;

		for (int i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + "º número");
			int num = scanner.nextInt();
			if(num % 2 == 0) {
				pares++;		
			}else {
				impares++;
			}	
		}
		System.out.println("Total de números pares: " + pares 
				+ "\r\n"
				+ "Total de números ímpares: " + impares);

		scanner.close();

	}

}
