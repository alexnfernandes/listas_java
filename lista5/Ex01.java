package lista5;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite um valor: ");
		int num = entrada.nextInt();
		
		if (num <= 10) {
			System.out.println("N�O � MAIOR QUE 10!");
		} else {
			System.out.println("� MAIOR QUE 10!");
		}
		
		entrada.close();
	}

}
