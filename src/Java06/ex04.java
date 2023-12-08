package Java06;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String continua = "S";
		int idade = 0, gen, dev;
		int count = 0;
		int McisMtransFront = 0;
		int HcisHtransMobile = 0;
		int NbinFullstack30 = 0;
		float IdadeMedia = 0;
		int Backend = 0;
		int SomaIdade = 0;

		while (!continua.equalsIgnoreCase("N")) {

			System.out.println("Idade: ");
			idade = scanner.nextInt();
			if (idade < 30) {
				int ContMenos30 = 0;
				ContMenos30++;
			}
			count++;
			System.out.println("Escolha uma opção ");
			System.out.println("1 – Mulher Cis\r\n" + "2 – Homem Cis\r\n" + "3 – Não Binário\r\n"
					+ "4 – Mulher Trans\r\n" + "5 – Homem Trans\r\n" + "6 – Outros\r\n" + " ");
			System.out.println("Identidade de Gênero: ");
			gen = scanner.nextInt();
			switch (gen) {
			case 1:
				int Mcis = 0;
				Mcis++;
				break;
			case 2:
				int Hcis = 0;
				Hcis++;
				break;
			case 3:
				int Nbin = 0;
				Nbin++;
				break;
			case 4:
				int Mtrans = 0;
				Mtrans++;
				break;
			case 5:
				int Htrans = 0;
				Htrans++;
				break;
			case 6:
				int Outros = 0;
				Outros++;

			}
			System.out.println("Escolha uma opção ");
			System.out.println("1 – Backend\r\n" + "2 – Frontend\r\n" + "3 – Mobile\r\n" + "4 – FullStack\r\n" + "");
			System.out.println("Pessoa Desenvolvedor: ");
			dev = scanner.nextInt();
			switch (gen) {
			case 1:
				Backend++;
				break;
			case 2:
				int Frontend = 0;
				Frontend++;
				break;
			case 3:
				int Mobile = 0;
				Mobile++;
				break;
			case 4:
				int FullStack = 0;
				FullStack++;

			}

			if (gen == 1 || gen == 4 && dev == 2) {
				McisMtransFront++;
			}
			if (gen == 2 || gen == 5 && dev == 3 && idade > 40) {
				HcisHtransMobile++;
			}
			if (gen == 3 && dev == 4 && idade < 30) {
				NbinFullstack30++;
			}

			SomaIdade += idade;
			IdadeMedia = SomaIdade / count;

			System.out.println("Deseja continuar (S/N): ");
			continua = scanner.next();

		}

		

		System.out.println("Total de pessoas desenvolvedoras Backend: " + Backend + "\r\n" + "\r\n"
				+ "Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + McisMtransFront + " \r\n" + "\r\n"
				+ "Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + HcisHtransMobile + "\r\n"
				+ "\r\n" + "Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "
				+ NbinFullstack30 + "\r\n" + "\r\n" + "O número total de pessoas que responderam à pesquisa: " + count
				+ "\r\n" + "\r\n" + "A média de idade das pessoas que responderam à pesquisa: %.2f%n" + IdadeMedia + "\r\n"
				+ "");

		scanner.close();

	}

}
