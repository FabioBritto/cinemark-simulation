import com.cinema.lanchonete.*;
import com.cinema.*;
import com.cliente.*;
import javax.swing.*;

public class CinemaTest {

	public static void main(String[]args) {
		
		Caixa.preencherListaFilmes();
		Lanchonete.preencherLanchonete();
		
		double dinheiro = 0;
		while(dinheiro <= 0) {
			try {
				dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Para iniciar a simulação, por favor, diga com quanto dinheiro deseja começar:"));
				if(dinheiro <= 0) {
					System.out.println("Por favor, preencha com um valor acima de R$ 0,00");
				}
			}catch(NullPointerException e) {
				JOptionPane.showMessageDialog(null,"Por favor, preencha com algum valor!");
			}
		}
		
		Cliente fabio = new Cliente(dinheiro);
		fabio.comprarLanche();
		fabio.mostrarCarteira();
		fabio.escolherFilme();
		Caixa.getTotalCaixa();
	}	
}
