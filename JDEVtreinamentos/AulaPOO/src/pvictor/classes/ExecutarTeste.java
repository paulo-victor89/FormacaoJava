package pvictor.classes;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Modulo Orienta��o a Objeto");
		produto1.setValor(BigDecimal.valueOf(100));

		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Modulo Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));

		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Modulo Angular 8");
		produto3.setValor(BigDecimal.valueOf(100));

		Produto produto4 = new Produto();
		produto4.setId(4L);
		produto4.setNome("Modulo HIBERNATE");
		produto4.setValor(BigDecimal.valueOf(300));

		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Forma��o Java");
		venda.setEnderecoEntrega("Entrega pelo e-mail");
		venda.setId(10L);
		venda.setNomeCliente("Paulo Victor");
		// venda.setValorTotal(BigDecimal.valueOf(197.00));

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);/* N�o consigo fazer valida��es */
		venda.addProduto(produto3);/* Posso fazer valida��es antes de adicionar na lista */
		venda.addProduto(produto4);

		System.out.println("Descri��o da Venda: " + venda.getDescricaoVenda() + " e o total: " + venda.getValorTotal());
		System.out.println("Foram adquiridos os seguintes produtos: " + venda.getListaProdutos());
	}

}
