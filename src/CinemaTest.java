import lanchonete.salgados.Lanchonete;

public class CinemaTest {

	public static void main(String[]args) {
		
		Cliente fabio = new Cliente(100);
		Caixa.preencherListaFilmes();
		Lanchonete.preencherLanchonete();
		fabio.escolherFilme();
		fabio.escolherLanche();
		Caixa.getTotalCaixa();
		fabio.escolherLanche();
	}
}
