package Java07;

import java.util.Arrays;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, num;
		int nums [] = new int [10];
		
		for (x =0; x <10; x++ ) {
			System.out.println("Digite o " +(x+1) + "º número do seu vetor:");
			nums[x] = scanner.nextInt();
		}
		
		Arrays.sort(nums);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = scanner.nextInt();
		
		
			
			int position = Arrays.binarySearch(nums, num);
			
			if(position >= 0 ) {
				
				System.out.println("O número " +num+ " está localizado na posição: " + position);
				
			}else {
				System.out.println("O número " +num+ " não foi encontrado!");
			}
			
	
		
		
		
		
		
		scanner.close();
		

	}

}
