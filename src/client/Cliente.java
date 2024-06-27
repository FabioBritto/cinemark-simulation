package client;

import javax.swing.*;
import lanchonete.Lanchonete;
import cinema.Filmes;

public class Cliente {

	private double carteira;
	
	public Cliente(double carteira) {
		this.carteira = carteira;
	}
	
	
	
	public void comprarIngresso(double pagamento,int salaFilme) {
		carteira -= pagamento;
		Caixa.receberPagamento(pagamento,salaFilme);
	}
	
	public void escolherFilme() {
		//AQUI VOU COLOCAR NUM TRY CATCH PRA CASO O USUÁRIO ESCOLHA NÃO
		try {
			Filmes filmeEscolhido = Caixa.venderFilmes();
			double precoFilme = filmeEscolhido.getPrecoFilme();
			double precoTotal = Caixa.getPrecoTotal();
			int salaFilme = filmeEscolhido.getSalaCinema();
			
			if(precoTotal > carteira) {
				informarSaldoNegativo();
			}
			else if(precoFilme != 1) {
				comprarIngresso(precoTotal,salaFilme);
				mostrarCarteira();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void mostrarCarteira() {
		JOptionPane.showMessageDialog(null, "Carteira: R$ " + carteira);
	}
	
	public void escolherLanche() {
		Lanchonete.escolherLanches();
	}
	
	private void informarSaldoNegativo() {
		int opcao = JOptionPane.showConfirmDialog(null, "Sinto muito, você não tem dinheiro suficiente para esta compra!\n"
										               +"Deseja escolher novamente?");
		
		if(opcao == 0) {
			escolherFilme();
		}
	}
}
