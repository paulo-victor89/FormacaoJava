package pvictor.executavel.mdl8;

public class OperadorTernario {

	public static void main(String[] args) {
		double nota1 = 6.9;
		double nota2 = 5.5;
		double nota3 = 9;
		double nota4 = 10;

		double soma = nota1 + nota2 + nota3 + nota4;
		double mediaFinal = soma / 4;

		/* Operadores ternarios s�o para micro valida��es, de uma linha apenas. 
		 * ? e o que e verdadeiro e o : e o que e falso
		 * */
		String saidaResultado;

		saidaResultado = mediaFinal >= 7 ? "Aluno Aprovado"	: (mediaFinal >= 4 && mediaFinal <= 6) ? "Aluno em recupera��o" : "Aluno reprovado";

		System.out.println(saidaResultado + " com a seguinte m�dia: " + mediaFinal);

	}

}
