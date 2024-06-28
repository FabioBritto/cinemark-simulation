package com.cinema.lanchonete;

public class Alimento {

	private String nome;
	private double preco;
	
	public Alimento(String nome,double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	protected String getNome() {
		return nome;
	}
	
	protected double getPreco() {
		return preco;
	}
}
