package lista6;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int n = 0, i = 1;
		double res;
		
		do {
			System.out.print("Digite um valor: ");
			n = n + entrada.nextInt();
			i++;
		} while(i != 11);
		
		res = (double) n / 10;
		
		System.out.printf("\nA media aritmetica dos numeros digitados é %.2f", res);

		entrada.close();
		
	}

}
