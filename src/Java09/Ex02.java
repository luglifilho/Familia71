/**
 * 
 */
package Java09;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da
 * Classe String, para organizar a retirada de livros em uma pilha. O programa
 * deverá ter um Menu que aceitará as opções 0, 1, 2 e 3: 1: Adicionar um novo
 * livro na pilha. Deve solicitar o nome do livro. 2: Listar todos os livros da
 * Pilha 3: Retirar um livro da pilha 0: O programa deve ser finalizado. Caso a
 * pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá
 * informar que a pilha está vazia.
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Stack<String> livros = new Stack<String>();
		int op;
		String nome;

		do {
			System.out.println("\nEscolha uma opção: ");
			System.out.println("1: Adicionar um novo livro na pilha.\r\n" + "2: Listar todos os livros da Pilha\r\n"
					+ "3: Retirar um livro da pilha \r\n" + "0: Sair da Aplicação. \r\n" + "");
			op = scanner.nextInt();
			switch (op) {
			case 1:
				scanner.nextLine();
				System.out.println("\nDigite o nome do Livro: ");
				nome = scanner.nextLine();
				livros.push(nome);
				System.out.println("\nPilha: ");
				System.out.println(livros);
				System.out.println("Livro Adicionado!!");
				break;

			case 2:
				System.out.println("\nLista de Livros na Pilha: ");
				System.out.println(livros);
				break;

			case 3:
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					livros.pop();
					System.out.println("Pilha: ");
					System.out.println(livros);
					System.out.println("Um Livro foi retirado da pilha!");
				}
				break;

			case 0:
				System.out.println("Program Finalizado!");
				break;

			default:
				System.out.println("Opção Inválida!!");
			}
		} while (op != 0);
		scanner.close();
	}

}
