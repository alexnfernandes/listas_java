package lista5;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite a quantidade de maçãs: ");
		int num = entrada.nextInt();

		if (num < 12) {
			System.out.println("TOTAL: R$" + num * 1.3);
		} else {
			System.out.println("TOTAL: R$" + num * 1);
		}

		entrada.close();

	}

}