package Java06;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo:");
		int n1 = scanner.nextInt();
		System.out.println("Digite o último número do intervalo:");
		int n2 = scanner.nextInt();

		if (n1 >= n2) {
			System.out.println("Intervalo inválido!");
		} else {
			System.out.println("No intervalo entre 10 e 100:");

			for (int i = n1; i <= n2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é núltiplo de 3 e 5 ");
				}
			}
		}
		scanner.close();
	}
}
