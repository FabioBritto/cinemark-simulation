package com.cinema.lanchonete;

public class Bebidas extends Alimento{

	private boolean isGelada = false;
	
	public Bebidas(String nomeBebida, double precoBebida) {
		super(nomeBebida,precoBebida);
	}
	
	public void setGelada() {
		isGelada = true;
	}
}
