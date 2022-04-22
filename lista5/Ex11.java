package lista5;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		double res = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Primeiro valor: ");
		int val1 = entrada.nextInt();

		System.out.printf("Operador (+-*/): ");
		String operador = entrada.next();

		System.out.printf("Segundo valor: ");
		int val2 = entrada.nextInt();

		char op = operador.charAt(0);

		switch (op) {
		case '+':
			res = (double) val1 + val2;
			System.out.printf("\n%d %c %d = %d", val1, op, val2, (int) res);
			break;
		case '-':
			res = (double) val1 - val2;
			System.out.printf("\n%d %c %d = %d", val1, op, val2, (int) res);
			break;
		case '*':
			res = (double) val1 * val2;
			System.out.printf("\n%d %c %d = %d", val1, op, val2, (int) res);
			break;
		case '/':
			res = (double) val1 / val2;
			System.out.printf("\n%d %c %d = %.2f", val1, op, val2, res);
			break;
		default:
			System.out.println("\nOperador inválido!");

		}

		entrada.close();

	}

}
