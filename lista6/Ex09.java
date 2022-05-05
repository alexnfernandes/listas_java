package lista6;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int c = 0, n = 0, i = 1;
		
		do {
			System.out.print("Digite um valor: ");
			n = entrada.nextInt();
			if (n >= 10 && n <=20) {
				c++;
			}
			i++;
		} while(i != 11);
		
		System.out.printf("\n%d numeros estão entre 10 e 20", c);

		entrada.close();
		
	}

}
