package pvictor.executavel.mdl8;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros? ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas? ");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o? ");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divis�o para pessoas deu " + divisao);
		}else {
			JOptionPane.showConfirmDialog(null, "Ok, n�o mostrarei o resultado da divis�o");
		}
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divis�o? ");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divis�o �: " + resto);
		}else {
			JOptionPane.showConfirmDialog(null, "Ok, n�o mostrarei o resto da divis�o");
		}
		

		// System.out.println("Divis�o para pessoas de " + divisao +" carros e sobrou "+
		// resto + " carros");

	}

}
