package br.com.soften.confeitaria;

public abstract class Doce extends Comida{
	protected double peso;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
