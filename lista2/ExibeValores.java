package lista2;

public class ExibeValores {
	
	public static void main(String[] args) {
		
		byte a = 19;
		short b = 1571;
		int c = 100000;
		long d = 2147483684L;
		float e = 3.14F;
		double f = 3.141592653589793;
		boolean g = true;
		char h = 'K';
		
		System.out.printf("Byte = %d\nShort = %d\nInt = %d\nLong = %d\nFloat = %.2f\nDouble = %.15f\nBoolean = %b\nChar = %c", a, b, c, d, e, f, g, h);
	}

}
