package cinema;

public class Filmes {

	private String nomeFilme;
	private double precoFilme;
	private int salaCinema;
	
	public Filmes(String nomeFilme, double precoFilme, int salaCinema) {
		this.nomeFilme = nomeFilme;
		this.precoFilme = precoFilme;
		this.salaCinema = salaCinema;
	}
	
	public String toString() {
		return " Nome: " + nomeFilme
			  +" \nPreço: " + precoFilme
			  +" \nSala:  " + salaCinema + "\n";
	}
	
	public String getNomeFilme() {
		return nomeFilme;
	}
	
	public double getPrecoFilme() {
		return precoFilme;
	}
	
	public int getSalaCinema() {
		return salaCinema;
	}
}
