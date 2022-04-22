package lista5;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite o numero de horas trabalhadas no mês: ");
		int hmes = entrada.nextInt();
		
		System.out.printf("Digite o salario por hora:  ");
		double shora = entrada.nextDouble();
		
		double smes;
		
		if(hmes <= 160) {
			smes = hmes * shora;
			System.out.println("O salário total é de R$" + smes);
		} else {
			smes = 160 * shora + (shora * 1.5 * (hmes - 160));
			System.out.println("O salário total é de R$" + smes);
		}

		entrada.close();
		
	}

}
