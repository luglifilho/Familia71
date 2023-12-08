package Java06;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int idade = 0, jovens =0, velhos=0; 
		
		while(idade >= 0) {
			
			System.out.println("Digite uma idade: \r\n");
			idade = scanner.nextInt();
			
			if(idade < 21 && idade > 0) {
				jovens++;
			}else if (idade > 50) {
				velhos++;
			}
			
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " +jovens + "\r\n"
				+ "\r\n"
				+ "Total de pessoas maiores de 50 anos: " +velhos);
		
		scanner.close();

	}

}
