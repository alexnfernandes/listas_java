package lista4;

import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITE OS VALORES\n\nProduto 1:");		
		int precoProduto1 = entrada.nextInt();
		
		System.out.println("Produto 2:");		
		int precoProduto2 = entrada.nextInt();
		
		System.out.println("");
		
		if (precoProduto1 > 1000 || precoProduto2 >1000) {
			System.out.println("Valor Inválido");
		}else if(precoProduto1 < precoProduto2) {
			System.out.println("O produto 1 é mais barato!");
		} else if (precoProduto1 > precoProduto2) {
			System.out.println("O produto 2 é mais barato!");
		} else {
			System.out.println("Os preços dos dois produtos são iguais!");
		}
		
		entrada.close();
		
	}

}
