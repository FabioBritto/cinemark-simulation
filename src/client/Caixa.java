package client;

import cinema.Filmes;
import cinema.Cinema;
import javax.swing.*;

public class Caixa {

	private static double totalCaixa;
	private static Filmes[] listaFilmes;
	private static Cinema[] salasCinema;
	private static double precoTotal;
	
	
	public static void preencherListaFilmes() {
		
		listaFilmes = new Filmes[5];
		listaFilmes[0] = new Filmes("Superman",15.80,1);
		listaFilmes[1] = new Filmes("Homem-Aranha 2",18.90,2);
		listaFilmes[2] = new Filmes("Ilha do Medo",10.20,3);
		listaFilmes[3] = new Filmes("Coringa",23.50,4);
		listaFilmes[4] = new Filmes("Interstellar",25.10,5);
		
		salasCinema = new Cinema[5];
		for(int i = 0;i < 5;i++) {
			salasCinema[i] = new Cinema(listaFilmes[i]);
		}
	}
	
	public static Filmes venderFilmes() {
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
	
	public static void receberPagamento(double pagamento,int salaFilme) {
		totalCaixa += pagamento;
		JOptionPane.showMessageDialog(null, "O Cinemark agradece a sua compra!"
										  + "\nSua sessão começará em 20 minutos na sala " + salaFilme);
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
	
}
