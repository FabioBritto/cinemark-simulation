package cinema;

public class Cinema {	
	
	private final static int TOTAL_CADEIRAS = 120;
	private int cadeirasVagas;
	private Filmes filmeDaSala;
	
	public Cinema(Filmes filmeDaSala) {
		this.filmeDaSala = filmeDaSala;
		cadeirasVagas = TOTAL_CADEIRAS;
	}
}
