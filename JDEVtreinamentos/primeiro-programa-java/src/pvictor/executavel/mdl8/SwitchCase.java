package pvictor.executavel.mdl8;

public class SwitchCase {

	public static void main(String[] args) {

		/* utilizado para operações exatas */
		int dia = 1;
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;

		default:
			System.out.println("Outro dia qualquer");
			break;
		}

	}

}
