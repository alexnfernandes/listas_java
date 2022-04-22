package lista5;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite a primeira nota: ");
		int nota1 = entrada.nextInt();
		
		System.out.printf("Digite a segunda nota: ");
		int nota2 = entrada.nextInt();
		
		double media = ((double) nota1 + nota2) / 2;
		
		System.out.println("MÉDIA: " + media + "\n\n");

		if (media < 6) {
			System.out.println("REPROVADO");
		} else {
			System.out.println("APROVADO");
		}

		entrada.close();

	}

}