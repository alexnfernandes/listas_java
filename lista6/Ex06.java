package lista6;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n;

		do {
			System.out.print("Digite um numero: ");
			n = entrada.nextInt();
		} while (n <= 0 || n > 10);

		for (int i = 1; i <= 10; i++) {
			int res = n * i;
			System.out.printf("%d x %d = %d\n", n, i, res);
		}

		entrada.close();

	}

}
