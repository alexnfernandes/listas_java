package lista2;

public class TestaTiposPrimitivos {
	
	public static void main(String[] args) {
		
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 9223372036854775L;
		float f = 12.14289F;
		double d = 124655.353535353535;
		boolean bool = false;
		char c = 'A';
		
		System.out.printf("Byte = %d\nShort = %d\nInt = %d\nLong = %d\nFloat = %.2f\nDouble = %.15f\nBoolean = %b\nChar = %c", b, s, i, l, f, d, bool, c);

		
	}

}
