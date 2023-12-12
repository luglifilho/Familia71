/**
 * 
 */
package Java09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da
 * Classe String, para organizar a ordem de chegada dos Clientes de um Banco. O
 * programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3: 1: Adicionar
 * um novo Cliente na fila. Deve solicitar o nome do Cliente. 2: Listar todos os
 * Clientes na fila 3: Chamar (retirar) uma pessoa da fila 0: O programa deve
 * ser finalizado. Caso a fila esteja vazia, o programa deverá informar que a
 * fila está vazia ao tentar retirar (chamar) um cliente da fila..
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Queue<String> clientes = new LinkedList<String>();
		int op;

		do {

			System.out.println("1: Adicionar um novo Cliente na fila.\r\n" + "2: Listar todos os Clientes na fila\r\n"
					+ "3: Chamar (retirar) uma pessoa da fila \r\n" + "0: O programa deve ser finalizado. \r\n" + "");
			op = scanner.nextInt();

			switch (op) {
			case 1:
				scanner.nextLine();
				System.out.println("Digite o nome do clinete: ");
				String name = scanner.next();
				clientes.add(name);
				break;
			case 2:
				System.out.println("\nFila:");
				System.out.println(clientes);
				break;
			case 3:
				if (clientes.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					clientes.remove();
					System.out.println("\nFila: ");
					System.out.println(clientes);
				}
				break;
			case 0:
				System.out.println("Programa Finalizado");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (op != 0);

		scanner.close();

	}

}
