package pvictor.principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {

		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Minha conta bancaria");

		System.out.println(bancaria + "Saldo inicial");

		bancaria.diminui100();
		System.out.println(bancaria + "Diminuindo 100");

		bancaria.sacar(400);
		System.out.println(bancaria + "Saque 400");

		bancaria.depositar(400);
		System.out.println(bancaria + "Deposito 400");

		bancaria.soma100();
		System.out.println(bancaria + "Soma 100");
	}

}
