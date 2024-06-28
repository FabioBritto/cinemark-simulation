package com.cinema.lanchonete;

import javax.swing.JOptionPane;

public class Lanchonete {

	private static Salgados[] salgados;
	private static Bebidas[] bebidas;
	private static Doces[] doces;

	
	
	public static void preencherLanchonete() {
		
		Salgados[] listaSalgados = new Salgados[5];
		listaSalgados[0] = new Salgados("Coxinha",4.5);
		listaSalgados[1] = new Salgados("Pipoca Salgada P",21.8);
		listaSalgados[2] = new Salgados("Pipoca Salgada M",25.5);
		listaSalgados[3] = new Salgados("Pipoca Salgada G",31.7);
		listaSalgados[4] = new Salgados("Ruffles",9.2);
		salgados = listaSalgados;
		
		Bebidas[] listaBebidas = new Bebidas[5];
		listaBebidas[0] = new Bebidas("Coca-Cola Lata",3.75);
		listaBebidas[1] = new Bebidas("Coca-Cola 600ml",7.35);
		listaBebidas[2] = new Bebidas("Guaraná Lata",3.25);
		listaBebidas[3] = new Bebidas("Guaraná 600ml",7.25);
		listaBebidas[4] = new Bebidas("Água com Gás",1.55);
		bebidas = listaBebidas;
		
		Doces[] listaDoces = new Doces[5];
		listaDoces[0] = new Doces("Pipoca Doce P", 22.36);
		listaDoces[1] = new Doces("Pipoca Doce M", 28.36);
		listaDoces[2] = new Doces("Pipoca Doce G", 32.36);
		listaDoces[3] = new Doces("Fini", 9.36);
		listaDoces[4] = new Doces("Chocolate Barra", 10.23);
		doces = listaDoces;
	}
	
	public static void escolherProduto(Alimento produto) {
		
		String lanches = "O que deseja comprar?\n"
					   + "\nSalgados:\n";
		
		for(int i = 0;i < 5;i++) {
			lanches += "\nProduto: " + salgados[i].getNome() +
					   "\nPreço: " + salgados[i].getPreco() + "\n";	
		}
		
		JOptionPane.showInputDialog(lanches);
	}
}
