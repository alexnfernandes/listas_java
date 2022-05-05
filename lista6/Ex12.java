package lista6;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int c = 0, num = 0;
		
		do {
			System.out.print("Digite o valor: ");
			num = num + entrada.nextInt();
			c++;
		} while (c != 10);
		
		System.out.printf("\nA soma dos valores e de " + num);

		entrada.close();
		
	}

}
