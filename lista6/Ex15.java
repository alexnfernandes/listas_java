package lista6;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int soma = 0;
		
		System.out.print("Primeiro valor: ");
		int val1 = entrada.nextInt();
		
		System.out.print("Segundo valor: ");
		int val2 = entrada.nextInt();
		
		if (val1 > val2) {
			int i = val1;
			val1 = val2;
			val2 = i;
		}
		
		do {
			soma += val1;
			val1++;
		} while (val1 <= val2);
			
		System.out.println("\nA soma e: " + soma);
		
		entrada.close();
		
	}

}
