package pvictor.executavel;


public class DeclaracaoVariaveis {

	/* Variavel global � acessivel a todos e o seu valor � compartilhado */
	static int maiorIdadeGlobal = 30;
	
	public static void main(String[] args) {

		/* Variavel local, pertence somente a esse metodo e o valor fica dentro do m�todo! */
		int maiorIdade = 18;
		System.out.println("Valor da variavel local é= "+ maiorIdade);
		
		/* */
		metodo2();

	}

	public static void metodo2() {
		System.out.println("Valor da variável global é = "+ maiorIdadeGlobal);
		

	}

}
