package pvictor.executavel.mdl8;


public class Media {
	public static void main(String[] args) {
		
		int nota1 = 2;
		int nota2 = 5;
		int nota3 = 8;
		int nota4 = 9;
	
		int soma = nota1 + nota2 +nota3 +nota4;
		int media = soma/4;
		
//		Se o aluno tive a media entre 9 e 10 mostrar aluno aprovado com exito
		if(media >= 9 & media <=10) {
			System.out.println( "O Aluno foi Aprovado Com Exito.");
			System.out.println("Resultado da Media: "+media);
			
//		Se o aluno tiver a media entre 7 e 8 mostrar aluno aprovado dentro da media
		}else if(media >=7 & media <=8) {
			System.out.println("O Aluno Aprovado, dentro da media");
			System.out.println("Resultado da Media: "+media);
			
//			Se o aluno tiver a media entre 5 e 6 mostrar aluno de recupera��o e realizar a prova novamente
		}else if(media >=5 & media <=6) {
			System.out.println("O Aluno  ficou de Recupera��o.");
			System.out.println("Resultado da Media: "+media);
			
//			Se o aluno tiver nota abaixo de 5 mostar aluno reprovado
		}else {
			System.out.println("Aluno Reprovado Dedique-se mais no proximo Semestre.");
			System.out.println("Resultado da Media: " +media);
		}
	}

}