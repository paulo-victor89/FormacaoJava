package pvictor.executavel.mdl8;

public class Aninhadas {

	public static void main(String[] args) {

		int nota1 = 2;
		int nota2 = 5;
		int nota3 = 8;
		int nota4 = 9;

		int soma = nota1 + nota2 + nota3 + nota4;
		int media = soma / 4;

		/* Opera��es l�gicas aninhadas: s�o opera��es dentro de opera��es */

		if (media >= 5) {
			if (media >= 7) {
				System.out.println("Aluno aprovado direto, com media:" + media);
			} else {
				System.out.println("Aluno em recupera��o, com media: " + media);
			}

		} else {
			System.out.println("Aluno reprovado com media: " + media);
		}

	}

}
