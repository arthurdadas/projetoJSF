package br.com.arthur.projetoJSF.modelo;

public class QuantidadePorProduto {

	private final Produto produto;
	private final Long quantidade;

	public QuantidadePorProduto(Long quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public Long getQuantidade() {
		return quantidade;
	}
	
}
