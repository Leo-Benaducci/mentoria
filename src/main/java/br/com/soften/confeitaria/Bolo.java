package br.com.soften.confeitaria;

public class Bolo extends Doce implements CalculoPreco, Camadas {
	private String sabor;
	private SaborCobertura cobertura;
	private boolean recheio;

	public Bolo(String sabor, SaborCobertura cobertura, boolean recheio, double peso, double preco) {
		this.sabor = sabor;
		this.cobertura = cobertura;
		this.recheio = recheio;
		this.peso = peso;
		this.preco = preco;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public SaborCobertura getCobertura() {
		return cobertura;
	}

	public void setCobertura(SaborCobertura cobertura) {
		this.cobertura = cobertura;
	}

	public boolean isRecheio() {
		return recheio;
	}

	public void setRecheio(boolean recheio) {
		this.recheio = recheio;
	}

	@Override
	public String toString() {
		return "Bolo{" +
				"sabor='" + sabor + '\'' +
				", cobertura='" + cobertura + '\'' +
				", recheio=" + recheio +
				", peso=" + peso +
				", preco=" + preco +
				'}';
	}

	@Override
	public double calculaPreco() {
		double preco = 0;
		if(recheio) {
			preco += 10;
		}
		if(cobertura.isPrecisaPreparo()) {
			preco += 5.5;
		}
		preco += peso * this.preco;
		return preco;
	}

	@Override
	public int quantidadeCamadas() {
		return 3;
	}
}
