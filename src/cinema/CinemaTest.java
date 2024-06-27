package cinema;

import lanchonete.Lanchonete;
import client.*;

public class CinemaTest {

	public static void main(String[]args) {
		
		Cliente fabio = new Cliente(100);
		Caixa.preencherListaFilmes();
		Lanchonete.preencherLanchonete();
		fabio.escolherFilme();
		//PRECISO ARRUMAR PORQUE TÁ CHAMANDO DUAS VEZES
		fabio.escolherLanche();
		Caixa.getTotalCaixa();
		
	}
}
