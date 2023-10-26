package br.com.soften.confeitaria;

public class Torta extends Doce implements CalculoPreco {
	private String sabor;

	public Torta(String sabor, double peso, double preco) {
		this.sabor = sabor;
		this.peso = peso;
		this.preco = preco;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public double calculaPreco() {
		return peso * this.preco;
	}
}
