package pvictor.executavel.mdl8;

public class OperadoreRelacionais {
	public static void main(String[] args) {
		int nota1 = 91;
		int nota2 = 99;
		int nota3 = 100;
		int nota4 = 101;

		/*
		 * // Igualdade 
		 * if (nota1 == nota2) { System.out.println("A notas s�o iguais");
		 * } else { System.out.println("As notas s�o diferentes"); }
		 */
		/* // Diferente
		if (nota1 != nota2) {
			System.out.println("A notas s�o diferentes " + "\nNota 1 = " + nota1 + "\nNota 2 = " + nota2);
		} else {
			System.out.println("As notas s�o iguais" + "\nNota 1 = " + nota1 + "\nNota 2 = " + nota2);
		}
		*/
		// Menor que ou menor=
				if (nota1 <= nota2) {
					System.out.println("A nota 1 e menor que a nota 2 " + "\nNota 1 = " + nota1 + "\nNota 2 = " + nota2);
				} else {
					System.out.println("As nota 2 e maior que a nota 1" + "\nNota 1 = " + nota1 + "\nNota 2 = " + nota2);
				}
				
				// Maior ou menor=
				if (nota3 >= nota4) {
					System.out.println("A nota 3  e maior que a nota 4 " + "\nNota 3 = " + nota3 + "\nNota 2 = " + nota4);
				} else {
					System.out.println("As nota 4 e maior que a nota 3" + "\nNota 4 = " + nota3 + "\nNota 2 = " + nota4);
				}

	}

}
