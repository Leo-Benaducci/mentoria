package br.com.soften;

import br.com.soften.confeitaria.*;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bolo bolo = new Bolo("Chocolate", SaborCobertura.CHOCOLATE, true, 1.5, 30.0);
		Doce bolo2 = new Bolo("Abacaxi", SaborCobertura.CHANTILLY, false, 0.5, 10.0);
		Doce torta = new Torta("Morango", 1.5, 30.0);

		Confeitaria confeitaria = new Confeitaria("João", "Av. Paulista", "1234");
		confeitaria.setConfeiteiro("Joaquim");
		Endereco endereco = confeitaria.getEndereco();
		System.out.println(endereco.rua());
		System.out.println(endereco.numero());

		confeitaria.addDoce(bolo);
		confeitaria.addDoce(bolo2);
		confeitaria.addDoce(torta);

		System.out.println(confeitaria);
		List<Doce> doces = confeitaria.getDoces();
		for(Doce doce: doces) {
			if(doce instanceof Bolo ibolo) {
				System.out.println("Bolo");
				switch(ibolo.getCobertura()) {
					case CHOCOLATE -> System.out.println("Chocolate");
					case DOCE_DE_LEITE -> System.out.println("Doce de leite");
					case CHANTILLY -> System.out.println("Chantilly");
				}
				if(ibolo.getCobertura().isPrecisaPreparo()) {
					System.out.println(ibolo.getCobertura().modoPreparo());
				}
				System.out.println(ibolo.calculaPreco());
			} else if(doce instanceof Torta itorta) {
				System.out.println("Torta");
				System.out.println(itorta.getSabor());
				System.out.println(itorta.calculaPreco());
			}
		}
	}
}