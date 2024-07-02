package com.cinema.lanchonete;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Lanchonete {
	
	private static ProdutoLanchonete[] produtos;
	private double caixa;

	
	
	public static void preencherLanchonete() {
		produtos = new ProdutoLanchonete[7];
		
		produtos[0] = new ProdutoLanchonete("Pipoca Salgada Média",10.90);
		produtos[1] = new ProdutoLanchonete("Pipoca Salgada Grande",16.90);
		produtos[2] = new ProdutoLanchonete("Pipoca Doce Média",11.90);
		produtos[3] = new ProdutoLanchonete("Pipoca Doce Grande",17.90);
		produtos[4] = new ProdutoLanchonete("Refrigerante Médio",9.90);
		produtos[5] = new ProdutoLanchonete("Refrigerante Grande",12.90);
		produtos[6] = new ProdutoLanchonete("Água Com Gás/Água Sem Gás",3.90);
	}
	public static double escolherProduto() {
		
		String lanches = "O que deseja comprar?\n"
					   + "\nLista de Produtos:\n";
		
		for(int i = 0;i < produtos.length;i++) {
			lanches += "\n[" + i + "] Produto:     " + produtos[i].getNomeProduto() +
					   "\n      Preço:         " + produtos[i].getPrecoProduto() + "\n";	
		}
		
		int escolhaCliente = Integer.parseInt(JOptionPane.showInputDialog(lanches));
		return produtos[escolhaCliente].getPrecoProduto();
		 
	}
}
