package Java03_04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		
		System.out.println("Salário Bruto: ");
		float salary = scanner.nextFloat();
		System.out.println("Adicional noturno: ");
		float nigthextra = scanner.nextFloat();
		System.out.println("Horas Extras: ");
		float overTime = scanner.nextFloat();
		System.out.println("Descontos: ");
		float deduction = scanner.nextFloat();
		
		float totalSalary = salary + nigthextra + (overTime *5) - deduction; 
		
		
		System.out.printf("Sálario Líquido: %.2f%n", totalSalary);
		
		
		
		
		scanner.close();

	}

}
