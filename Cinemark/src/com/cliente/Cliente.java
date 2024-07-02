package com.cliente;

import com.cinema.lanchonete.*;
import com.cinema.*;
import javax.swing.*;


public class Cliente {

	private double carteira;
	
	public Cliente(double carteira) {
		this.carteira = carteira;
	}
	
	public void comprarIngresso(double pagamento) {
		if(isSaldo(pagamento)) {
			carteira -= pagamento;
			Terminal.receberPagamento(pagamento);
		}
		else {
			JOptionPane.showMessageDialog(null, "Você não tem dinheiro suficiente para esta compra");
		}
	}
	
	public void escolherFilme() {
		//AQUI VOU COLOCAR NUM TRY CATCH PRA CASO O USUÁRIO ESCOLHA NÃO
		try {
			double precoFilme = Terminal.escolherFilmes().getPrecoFilme();
			double precoTotal = Terminal.getPrecoTotal();
			
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
	
	public void comprarLanche() {
		double preco = Lanchonete.escolherProduto();
		if(isSaldo(preco)) {
			carteira -= preco;
		}
		else {
			JOptionPane.showMessageDialog(null, "Você não tem dinheiro suficiente para esta compra");
		}
	}
	
	private boolean isSaldo(double preco) {
		if(preco > carteira) {
			return false;
		}
		else {
			return true;
		}
	}
}
