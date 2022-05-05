package lista6;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		String resp;
		double nota1, nota2;

		Scanner entrada = new Scanner(System.in);

		do {

			do {
				System.out.print("Digite a primeira nota: ");
				nota1 = entrada.nextDouble();
			} while (nota1 > 10 || nota1 < 0);

			do {
				System.out.print("Digite a segunda nota: ");
				nota2 = entrada.nextDouble();
			} while (nota2 > 10 || nota2 < 0);
			
			double media = (nota1 + nota2) / 2;
			System.out.println("MÉDIA: " + media);
			
			System.out.print("Realizar outra operação? (S/N)");
			resp = entrada.next().toUpperCase();

		} while (resp.equals("S"));

		entrada.close();

	}
}
