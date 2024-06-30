package com.cinema.lanchonete;

import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JOptionPane;

public class Lanchonete {
	
	private static ProdutoLanchonete[] produtos;
	private double caixa;
	private ArrayList<ProdutoLanchonete> carrinhoDeCompras = new ArrayList<>();

	
	
	public static void preencherLanchonete() {
		produtos = new ProdutoLanchonete[10];
		
		produtos[0] = new ProdutoLanchonete("Pipoca Salgada Média",10.90);
		produtos[1] = new ProdutoLanchonete("Pipoca Salgada Grande",16.90);
		produtos[2] = new ProdutoLanchonete("Pipoca Doce Média",11.90);
		produtos[3] = new ProdutoLanchonete("Pipoca Doce Grande",17.90);
		produtos[4] = new ProdutoLanchonete("Batata Ruffles",8.90);
		produtos[5] = new ProdutoLanchonete("Cebolitos",7.90);
		produtos[6] = new ProdutoLanchonete("Fini",5.90);
		produtos[7] = new ProdutoLanchonete("Refrigerante Médio",9.90);
		produtos[8] = new ProdutoLanchonete("Refrigerante Grande",12.90);
		produtos[9] = new ProdutoLanchonete("Água Com Gás/Água Sem Gás",3.90);
	}
	public static void escolherProduto() {
		
		String lanches = "O que deseja comprar?\n"
					   + "\nLista de Produtos:\n";
		
		for(int i = 0;i < 10;i++) {
			lanches += "\nProduto: " + produtos[i].getNomeProduto() +
					   "\nPreço: " + produtos[i].getPrecoProduto() + "\n";	
		}
		
		JList<ProdutoLanchonete> produtos = new JList<ProdutoLanchonete>();
	}
}
