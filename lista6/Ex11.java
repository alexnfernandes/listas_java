package lista6;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int c = 0;
		double nota = 0;
		
		System.out.print("Numero de alunos: ");
		int n = entrada.nextInt();
		
		do {
			System.out.print("Digite as notas: ");
			nota = nota + entrada.nextInt();
			c++;
		} while (c != n);
		
		System.out.printf("\nA media das notas dos %d alunos e de %.2f", n, (nota/n));

		entrada.close();
		
	}

}
