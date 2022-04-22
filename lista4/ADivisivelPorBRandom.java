package lista4;

public class ADivisivelPorBRandom {
	
	public static void main(String[] args) {
		
		int a = (int)(Math.random()*1000);
		int b = (int)(Math.random()*20);
		
		System.out.printf("VALORES\n\nA - %d\nB - %d", a, b);
		
		if (a % b == 0) {
			System.out.println("\n\nÉ divisível");
		} else {
			System.out.println("\n\nNão é divisível");
		}
		
		
	}

}
