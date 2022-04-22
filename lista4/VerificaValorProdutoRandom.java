package lista4;

public class VerificaValorProdutoRandom {
	
	public static void main(String[] args) {
		
		int precoProduto1 = (int)(Math.random() * 1000);
		int precoProduto2 = (int)(Math.random() * 1000);
		
		System.out.printf("VALORES DOS PRODUTOS\n\nProduto 1 - $%d\nProduto 2 - $%d\n\n\n", precoProduto1, precoProduto2);
		
		if (precoProduto1 < precoProduto2) {
			System.out.println("O produto 1 é mais barato!");
		} else if (precoProduto1 > precoProduto2) {
			System.out.println("O produto 2 é mais barato!");
		} else {
			System.out.println("Os preços dos dois produtos são iguais!");
		}
		
	}

}
