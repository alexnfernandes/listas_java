package lista6;

public class Ex16 {
	
	public static void main(String[] args) {

		int val1 = 15, soma = 0, i = 0;
		
		do {
			soma += val1;
			val1++;
			i++;
		} while (val1 <= 100);
		
		double media = (double) soma / i++;
		
		System.out.println("Média: " + media);
		
	}
	
}
