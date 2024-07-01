package com.cinema.lanchonete;

public class ProdutoLanchonete {

	private String nomeProduto;
	private double precoProduto;
	
	public ProdutoLanchonete(String nomeProduto,double precoProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public double getPrecoProduto() {
		return precoProduto;
	}
}
