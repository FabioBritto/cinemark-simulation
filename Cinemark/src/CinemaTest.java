import com.cinema.lanchonete.*;
import com.cinema.*;
import com.cliente.*;
import javax.swing.*;

public class CinemaTest {

	public static void main(String[]args) {
		
		Lanchonete.preencherLanchonete();
		Lanchonete.escolherProduto();
		
		double dinheiro = 0;
		try {
			dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Para iniciar a simulação, por favor, diga com quanto dinheiro deseja começar:"));
			if(dinheiro <= 0) {
				//Preciso arrumar a questão do tratamento de exceções
				//throw new Exception("Por favor, preencha com um valor válido");
			}
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null,"Por favor, preencha com um valor váldio!");
		}
		
		
		Cliente fabio = new Cliente(dinheiro);
		Caixa.preencherListaFilmes();
		Lanchonete.preencherLanchonete();
		fabio.escolherFilme();
		fabio.escolherLanche();
		Caixa.getTotalCaixa();
		fabio.escolherLanche();
	}
}
