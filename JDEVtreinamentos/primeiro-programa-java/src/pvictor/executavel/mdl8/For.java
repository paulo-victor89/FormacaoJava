package pvictor.executavel.mdl8;

public class For {

	public static void main(String[] args) {

		/*
		 * for (int numero = 0; numero <= 10; numero++) {
		 * System.out.println("Ordem crescente �: " + numero); } for(int numeroDec
		 * =10;numeroDec>=0;numeroDec--) { System.out.println("Ordem decrescente �: " +
		 * numeroDec); }
		 */
		/* Estrutura de repeti��o FOR com Break */
		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Encontrei o numero: " + numero);
				// System.out.println("Estou parando de executar...");
				// break; //para a execus�o quando encotra o valor
				continue; // mesmo que encontre o valor do if, vai continuar at� finalizado o for
			}
			System.out.println("Processando la�o de repeti��o");
		}
	}

}
