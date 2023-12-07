package Java05;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		float saldo = 1000;
		
		System.out.println("Operação: ");
		int op = scanner.nextInt();
		
		switch(op){
		case 1:
			System.out.println("\nOperação - Saldo");
			System.out.printf("\nSaldo: %.2f%n" , saldo);
			break;
		case 2: 
			System.out.println("\nValor: ");
			float valor = scanner.nextFloat();
			System.out.println("\nOperação - Saque");
			if(valor > 1000) {
				System.out.println("\nSaldo Insuficiente!");
			}else {
				saldo -= valor;
				System.out.printf("\nNovo Saldo: %.2f%n" , saldo);
			}
			break;
		case 3:
			System.out.println("\nValor: ");
			 valor = scanner.nextFloat();
			System.out.println("\nOperação - Depósito");
			saldo += valor;
			System.out.printf("\nNovo Saldo: %.2f%n" , saldo);
			break;
			
			default:
				System.out.println("Operação Inválida!");
		}
		scanner.close();
	}
}
