package lista6;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int c = 0, num = 0, soma = 0;
		
		do {
			System.out.print("Digite o valor: ");
			num = entrada.nextInt();
			if (num < 40) {
				soma += num;
			}
			c++;
		} while (c != 10);
		
		System.out.printf("\nA soma dos valores e de " + soma);

		entrada.close();
		
	}

}
