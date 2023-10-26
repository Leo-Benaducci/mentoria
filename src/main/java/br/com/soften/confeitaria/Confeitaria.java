package br.com.soften.confeitaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Confeitaria {
	private static final String NOME = "Confeitaria JB";
	private String confeiteiro;
	private Endereco endereco;
	private List<Doce> doces;

	public Confeitaria(String confeiteiro, String endereco, String numero) {
		this.confeiteiro = confeiteiro;
		this.endereco = new Endereco(endereco, numero);
		this.doces = new ArrayList<>();
	}

	public String getConfeiteiro() {
		return confeiteiro;
	}

	public void setConfeiteiro(String confeiteiro) {
		this.confeiteiro = confeiteiro;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void addDoce(Doce doce) {
		if(doce.getPeso() > 0.5) {
			this.doces.add(doce);
		}
	}

	public List<Doce> getDoces() {
		return Collections.unmodifiableList(doces);
	}

	public void setDoces(List<Doce> doces) {
		this.doces = doces;
	}

	@Override
	public String toString() {
		return NOME +"{" +
				"confeiteiro='" + confeiteiro + '\'' +
				", endereco='" + endereco + '\'' +
				", doces=" + doces +
				'}';
	}

}
