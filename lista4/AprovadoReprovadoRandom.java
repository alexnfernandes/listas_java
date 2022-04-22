package lista4;

public class AprovadoReprovadoRandom {
	
	public static void main(String[] args) {
		
		int nota = (int)(Math.random() * 10);
		
		System.out.println("Nota: " + nota + "\n\n");
		
		if(nota < 6) {
			System.out.println("REPROVADO");
		} else {
			System.out.println("APROVADO");
		}
		
	}

}
