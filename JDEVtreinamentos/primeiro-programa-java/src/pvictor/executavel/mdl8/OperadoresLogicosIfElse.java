package pvictor.executavel.mdl8;


public class OperadoresLogicosIfElse {

	public static void main(String[] args) {

		/*
		 * String nome; JOptionPane.showInputDialog("Digite o nome do aluno"); double
		 * nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 "));
		 * double nota2 =
		 * Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 ")); double
		 * nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3 "));
		 * double nota4 =
		 * Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4 "));
		 * 
		 * double soma = (nota1 + nota2 +nota3 + nota4); double media = soma/4; double
		 * mediaFinal = Double.parseDouble(JOptionPane.showInputDialog(null, media));
		 */

		int mediaAluno = 50;
		String nome = "Paulo";

		if (mediaAluno >= 70 && nome.equals("Paulo")) {
			System.out.println("Aluno Aprovado");
		}
		else if (mediaAluno < 70) {
			System.out.println("Aluno Reprovado");
		}
		else {
			System.out.println("Aluno n�o encontrado!");
		}

	}

}
