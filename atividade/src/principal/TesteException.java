package principal;

public class TesteException {

	public static void metodo1() throws ArrayIndexOutOfBoundsException {

		System.out.println("In�cio da metodo1.");

		int[] vetor = new int[5];
		for (int i = 0; i < 10; i++) {
			vetor[i] = i;
			System.out.println(i);
		}

		System.out.println("In�cio da metodo2.");
	}

	public static void main(String[] args) {

		System.out.println("In�cio da main.");
		try {
			metodo1();	
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Excecao Capturada: "+e.getMessage());		
		}
		

		System.out.println("Fim da main.");

	}

}