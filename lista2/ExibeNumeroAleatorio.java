package lista2;

import java.util.Random;

public class ExibeNumeroAleatorio {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(100);
		
		System.out.println(numeroAleatorio);
		
	}

}
