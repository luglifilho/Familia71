package Java03_04;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		
		System.out.println("Nota 1: ");
		float nota1 = scanner.nextFloat();
		System.out.println("Nota 2: ");
		float nota2 = scanner.nextFloat();
		System.out.println("Nota 3: ");
		float nota3 = scanner.nextFloat();
		System.out.println("Nota 4: ");
		float nota4 = scanner.nextFloat();
		
		float total = (nota1 * nota2) - (nota3 * nota4);
		
		System.out.printf("Diferença: %.1f%n" , total);
		
		
	scanner.close();	
	}

}
