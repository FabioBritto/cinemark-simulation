package com.cinema;
import javax.swing.JOptionPane;

import com.cinema.lanchonete.Lanchonete;

public class Terminal {

	private static double totalCaixa;
	private static Filmes[] listaFilmes;
	private static double precoTotal;
	
	
	public static void preencherListaFilmes() {
		
		listaFilmes = new Filmes[5];
		listaFilmes[0] = new Filmes("Superman",15.80,1);
		listaFilmes[1] = new Filmes("Homem-Aranha 2",18.90,2);
		listaFilmes[2] = new Filmes("Ilha do Medo",10.20,3);
		listaFilmes[3] = new Filmes("Coringa",23.50,4);
		listaFilmes[4] = new Filmes("Interstellar",25.10,5);
	}
	
	public static Filmes escolherFilmes() {
		int filme = Integer.parseInt(JOptionPane.showInputDialog("Bom dia! Qual fime deseja assistir?\n"
										 + "\n[0] " + listaFilmes[0].toString()
										 + "\n[1] " + listaFilmes[1].toString()
										 + "\n[2] " + listaFilmes[2].toString()
										 + "\n[3] " + listaFilmes[3].toString()
										 + "\n[4] " + listaFilmes[4].toString()));
		
		int totalIngressos = escolherIngressos();
		if(confirmarCompra(filme,totalIngressos)) {
			return listaFilmes[filme];
		}
		else {
			return null;
		}	
	}
	
	public static void receberPagamento(double pagamento) {
		totalCaixa += pagamento;
		JOptionPane.showMessageDialog(null, "O Cinemark agradece a sua compra!"
										  + "\nSua sessão começará em 20 minutos na sala " );
	}
	
	public static boolean confirmarCompra(int filmeEscolhido,int ingressos) {
		
		double precoFilme = listaFilmes[filmeEscolhido].getPrecoFilme();
		int salaCinema = listaFilmes[filmeEscolhido].getSalaCinema();
		String nomeFilme = listaFilmes[filmeEscolhido].getNomeFilme();
		precoTotal = precoFilme * ingressos;
		
		int opcao = JOptionPane.showConfirmDialog(null, "Deseja confirmar a compra?\n" 
													   +"\nNome do Filme: " + nomeFilme
													   +"\nTotal de Ingressos: " + ingressos
													   +"\nPreço do Ingresso: " + precoFilme
													   +"\nPreço Total: " + precoTotal
													   +"\nSala: 0" + salaCinema);
		if(opcao == 0) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public static double getTotalCaixa() {
		return totalCaixa;
	}
	
	public static int escolherIngressos() {
		return Integer.parseInt(JOptionPane.showInputDialog("Quantos ingressos deseja comprar?"));
	}
	
	public static double getPrecoTotal() {
		return precoTotal;
	}
	
	public static void mostrarMenu() {
		int opcao = -1;
		do {
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Bom dia. O que deseja fazer?\n"
						+"\n[0] Lista de Filmes"
						+"\n[1] Lanchonete"
						+"\n[2] Sair\n"));

				if(opcao == 0) {
					escolherFilmes();
				}
				else if(opcao == 1) {
					Lanchonete.escolherProduto();
					
				}
				else if(opcao == 2) {
					JOptionPane.showMessageDialog(null,"Até logo!");
				}
				else {
					JOptionPane.showMessageDialog(null,"Por favor, escolha uma opção válida!");
				}
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Por favor, escolha uma opção válida!");
			}
			
		}while(opcao < 0 || opcao > 2);
		
	}
	
}