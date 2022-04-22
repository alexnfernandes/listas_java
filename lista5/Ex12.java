package lista5;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double frete;
		double total;

		System.out.printf("Valor do produto: R$");
		double val = entrada.nextDouble();

		System.out.println("\nCÓDIGO DE ORIGEM\n1- Norte\n2, 5, 9- Sul\n3, 10 até 15- Leste\n7 ou 20- Oeste\nOutro- Importado");
		
		System.out.printf("\nCódigo de Origem:");
		int cod = entrada.nextInt();
		
		if (cod >=10 && cod <= 15) {
			cod = 10;
		}
		
		switch(cod) {
		case 1:
			frete = val * 0.1;
			total = frete + val;
			System.out.printf("ORIGEM: %s\nVALOR R$%.2f\nFRETE R$%.2f\nTOTAL R$%.2f", "NORTE", val, frete, total);
			break;
		case 2:
		case 5:
		case 9:
			frete = 0.03 * val;
			total = frete + val;
			System.out.printf("ORIGEM: %s\nVALOR R$%.2f\nFRETE R$%.2f\nTOTAL R$%.2f", "SUL", val, frete, total);
			break;
		case 3:
		case 10:
			frete = 0.012 * val;
			total = frete + val;
			System.out.printf("ORIGEM: %s\nVALOR R$%.2f\nFRETE R$%.2f\nTOTAL R$%.2f", "LESTE", val, frete, total);
			break;
		case 7:
		case 20:
			frete = 0.073 * val;
			total = frete + val;
			System.out.printf("ORIGEM: %s\nVALOR R$%.2f\nFRETE R$%.2f\nTOTAL R$%.2f", "OESTE", val, frete, total);
			break;
		default:
			frete = 0.222 * val;
			total = frete + val;
			System.out.printf("ORIGEM: %s\nVALOR R$%.2f\nFRETE R$%.2f\nTOTAL R$%.2f", "IMPORTADO", val, frete, total);
		}
		
		entrada.close();

	}

}
