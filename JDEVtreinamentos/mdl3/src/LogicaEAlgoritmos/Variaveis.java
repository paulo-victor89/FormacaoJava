package LogicaEAlgoritmos;

public class Variaveis {

	private static double total = 0;
	private static int produtos = 10;
	private static int quantidade = 15;

	private static String nome = "Paulo Victor";
	private static int idade = 31;

	public static void main(String[] args) {
		total = produtos * quantidade;
		System.out.println("Tem "+ total + " produtos nessa compra");

		total = (produtos * quantidade) * 5;
		System.out.println("Nessa compra tem "+ total +" produtos");

		if (idade == 31) {
			System.out.println(nome + " Tem " + idade + " anos");
		}
		// aqui está setado a idade, e caso seja verdadeira vai adicionar o nome completo e a idade setada
		idade = 33;
		
		if(idade == 33) {
			nome +=" Alves Campelo ";
			System.out.println(nome + "Tem " + idade + " anos");
					
		}

	}

}
