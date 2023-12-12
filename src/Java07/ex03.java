package Java07;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = 0;
		int numeros[][] = new int[3][3];
		int linhas, colunas;

		for (linhas = 0; linhas < 3; linhas++) {
			for (colunas = 0; colunas < 3; colunas++) {

				System.out.println("Digite o " + (num + 1) + "º número da matriz");
				numeros[linhas][colunas] = scanner.nextInt();
				num++;

			}

		}

		System.out.println("Elementos da Diagonal Principal:");
		for (int i = 0; i < 3; i++) {
			System.out.print(numeros[i][i] + " ");
		}

		System.out.println("\nElementos da Diagonal Secundária:");
		for (int i = 0; i < 3; i++) {
			System.out.print(numeros[i][2 - i] + " ");
		}

		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;

		for (int i = 0; i < 3; i++) {
			somaDiagonalPrincipal += numeros[i][i];
			somaDiagonalSecundaria += numeros[i][2 - i];
		}

		System.out.println("\nSoma da Diagonal Principal: " + somaDiagonalPrincipal);
		System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);

		scanner.close();

	}

}
