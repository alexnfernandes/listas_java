package lista4;

import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {

		Scanner entradaNum = new Scanner(System.in);


		int hora;

		System.out.printf("Inserir a hora manualmente?[S/N] ");
		String resp = entradaNum.nextLine();
		
		//System.out.println(resp);

		if ("S".equalsIgnoreCase(resp)) {
			System.out.println("Digite a hora: ");
			hora = entradaNum.nextInt();
		} else {
			hora = (int)(Math.random() * 23);
		}
		
		System.out.printf("Hora: %dh\n\n", hora);
		
		if (hora > 23 || hora < 0) {
			System.out.println("Valor inválido");
		} else if (hora >= 0 && hora <= 6) {
			System.out.println("Zzzzz");
		} else if (hora >= 7 && hora <= 11) {
			System.out.println("Bom dia!");
		} else if (hora >= 12 && hora <= 17) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}

		entradaNum.close();


	}

}
