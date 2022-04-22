package lista4;

import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main(String[] args) {
		
		Scanner entradaNum = new Scanner(System.in);
		
		int nota = entradaNum.nextInt();
		
		if(nota < 6) {
			System.out.println("REPROVADO");
		} else if (nota > 10) {
			System.out.println("VALOR INVÁLIDO");
		} else {
			System.out.println("APROVADO");
		}
		
		entradaNum.close();
		
	}

}
