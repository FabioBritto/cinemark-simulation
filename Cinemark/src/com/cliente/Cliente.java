package com.cliente;
import javax.swing.*;

import lanchonete.salgados.Lanchonete;

public class Cliente {

	private double carteira;
	
	public Cliente(double carteira) {
		this.carteira = carteira;
	}
	
	public void comprarIngresso(double pagamento) {
		carteira -= pagamento;
		Caixa.receberPagamento(pagamento);
	}
	
	public void escolherFilme() {
		//AQUI VOU COLOCAR NUM TRY CATCH PRA CASO O USUÁRIO ESCOLHA NÃO
		try {
			double precoFilme = Caixa.escolherFilmes().getPrecoFilme();
			double precoTotal = Caixa.getPrecoTotal();
			
			if(precoFilme != 1) {
				comprarIngresso(precoTotal);
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
}
