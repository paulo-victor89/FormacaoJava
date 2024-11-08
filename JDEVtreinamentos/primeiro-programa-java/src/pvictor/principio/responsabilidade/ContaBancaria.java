package pvictor.principio.responsabilidade;

public class ContaBancaria {

	private String descricao;

	private double saldo = 8000;

	public void soma100() {
		saldo += 100;
	}

	public void diminui100() {
		saldo -= 100;
	}

	public void sacar(double saque) {
		saldo -= saque;
	}

	public void depositar(double deposito) {
		saldo += deposito;
	}

	// getters
	public double getSaldo() {
		return saldo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao= " + descricao + ", saldo= " + saldo + "]";
	}

}
