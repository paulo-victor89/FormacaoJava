package pvictor.executavel.mdl8;

public class WhileDoWhile {

	public static void main(String[] args) {

		int numero = 0;

		while (numero <= 3) {
			System.out.println("O numero atual �: " + numero);
			numero++;
		}

		int numero2 = 0;
		do {/* Primeiro executa e depois verifica */
			System.out.println("O numero 2  atual �: " + numero2);
			numero2++;
		} while (numero2 <= 5);

	}

}