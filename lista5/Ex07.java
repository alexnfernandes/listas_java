package lista5;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite 0 primeira valor: ");
		int val1 = entrada.nextInt();
		
		System.out.printf("Digite o segunda valor:  ");
		int val2 = entrada.nextInt();

		if (val1 < val2) {
			System.out.println(val1 + ", " + val2);
		} else {
			System.out.println(val2 + ", " + val1);		}

		entrada.close();

	}

}