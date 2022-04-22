package lista5;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite seu ano de nascimento: ");
		int anoN = entrada.nextInt();
		
		System.out.printf("Digite o ano atual: ");
		int anoA = entrada.nextInt();
		
		int res = anoA - anoN;
		
		System.out.println("\nVOCÊ TEM: " + res + " anos\n\n");

		if (res < 16) {
			System.out.println("NÃO PODE VOTAR!");
		} else {
			System.out.println("PODE VOTAR!");
		}

		entrada.close();

	}

}