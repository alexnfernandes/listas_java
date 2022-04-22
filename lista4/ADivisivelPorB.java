package lista4;

import java.util.Scanner;

public class ADivisivelPorB {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("DIGITE OS VALORES\n\nValor 1:");		
		int a = entrada.nextInt();
		
		System.out.println("Valor 2:");		
		int b = entrada.nextInt();
		
		System.out.println("");

		if (a > 1000 || b > 20) {
			System.out.println("Valor excedido!");
		} else if (a < b) {
			System.out.println("Valor de A é maior que B");
		} else {
			if (a % b == 0) {
				System.out.println("É divisível");
			} else {
				System.out.println("Não é divisível");
			}
		}
		
		entrada.close();
	}

}
