package br.com.soften.confeitaria;

public record Endereco(
		String rua,
		String numero
) {
	public Endereco {
		if(rua == null) {
			throw new IllegalArgumentException("Rua não pode ser nula");
		}
		if(numero == null) {
			throw new IllegalArgumentException("Número não pode ser nulo");
		}
	}
}
