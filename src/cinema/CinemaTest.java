package cinema;

import lanchonete.Lanchonete;
import client.*;

import java.awt.HeadlessException;

import javax.swing.*;

public class CinemaTest {

	public static void main(String[]args) {
		
		double carteira = 0;
		try {
			carteira = Double.parseDouble(JOptionPane.showInputDialog("Bom dia! Por favor nos informe quanto dinheiro tem em sua carteira."));
			
		}catch(HeadlessException e) {
			e.getCause();
			e.getMessage();
		}catch(NullPointerException nulo) {
			System.out.println(nulo.getCause());
			System.out.println(nulo.getMessage());
		}
			 
			
		
		Cliente fabio = new Cliente(carteira);
		Caixa.preencherListaFilmes();
		Lanchonete.preencherLanchonete();
		fabio.escolherFilme();
		fabio.escolherLanche();
		Caixa.getTotalCaixa();
		
	}
}
