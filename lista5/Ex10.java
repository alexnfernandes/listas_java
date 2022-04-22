package lista5;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite o salario fixo mensal: R$");
		double sfixo = entrada.nextDouble();
		
		System.out.printf("Digite o valor total das vendas: R$");
		double vendas = entrada.nextDouble();
		
		double total;
		
		if(vendas <= 1500) {
			total = sfixo + vendas * 0.03;
			System.out.println("O salário total é de R$" + total);
		} else {
			total = sfixo + 1500 * 0.03 + ((vendas - 1500) * 0.05);
			System.out.println("O salário total é de R$" + total);
		}

		entrada.close();
		
	}

}
