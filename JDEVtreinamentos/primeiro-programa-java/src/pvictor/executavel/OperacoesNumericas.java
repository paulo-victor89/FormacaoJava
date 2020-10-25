package pvictor.executavel;

public class OperacoesNumericas {
	public static void main(String[] args) {
		
		
		double nota1 = 90;
		double nota2 = 70;
		double nota3 = 50;
		double nota4 = 88;
		
		/* somente valores inteiros basta trocar o double por int
		System.out.println("Soma das notas = " + (nota1 + nota2 + nota3 + nota4));
		System.out.println("Subtra��o das notas = "+(nota1 - nota2 - nota3 - nota4));
		System.out.println("M�dia das notas = " + (nota1 + nota2 + nota3 + nota4)/4);
		System.out.println("Multiplica��o das notas = " + (nota1 * nota2 * nota3 * nota4));
		*/
		
		/*Valores em casas decimais*/
		double mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A media das notas é "+ mediaFinal);
	}

}
