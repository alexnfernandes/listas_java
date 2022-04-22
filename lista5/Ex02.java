package lista5;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite um valor: ");
		int num = entrada.nextInt();

		if (num <= 0) {
			System.out.println("POSITIVO");
		} else {
			System.out.println("NEGATIVO");
		}

		entrada.close();

	}

}
