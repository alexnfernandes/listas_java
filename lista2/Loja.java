package lista2;

public class Loja {
	
	public static void main(String[] args) {
		
		int numPedido = 2524226, codProd = 1874126, qtd = 2;
		double valor = 1575.58;
		
		System.out.printf("Numero do Pedido: %d, Produto: %d, Quantidade: %d, Valor Total %.2f", numPedido, codProd, qtd, valor*qtd);
		
	}

}
