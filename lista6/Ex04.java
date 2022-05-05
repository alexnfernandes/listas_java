package lista6;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}

		entrada.close();
		
		
		
	}

}
