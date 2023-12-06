package Java03_04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		
		System.out.println("Digite o sálario: ");
		
		double salary = scanner.nextDouble();
		
		System.out.println("Digite o Abono: ");
		
		double abono = scanner.nextDouble();
		
		double newSalary = salary + abono; 
		System.out.printf(" Novo Salário: " + newSalary);
		

		
		scanner.close();
		// TODO Auto-generated method stub

	}

}
