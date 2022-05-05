package lista6;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int c = 0, n = 0, i = 1;
		
		do {
			System.out.print("Digite um valor: ");
			n = entrada.nextInt();
			if (n < 0) {
				c++;
			}
			i++;
		} while(i != 11);
		
		System.out.printf("\n%d numeros sao negativos", c);

		entrada.close();
		
	}

}
