package lista5;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite a hora de inicio: ");
		int h1 = entrada.nextInt();
		
		System.out.printf("Digite a hora final:  ");
		int h2 = entrada.nextInt();
		
		int hora = h2 - h1;
		
		if (hora > 0) {
			System.out.printf("O jogo durou %d hora(s)", hora);
		} else {
			hora += 24;
			System.out.printf("O jogo durou %d hora(s)", hora);
		}

		entrada.close();
		
	}

}
