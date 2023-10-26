package br.com.soften.confeitaria;

public enum SaborCobertura implements CalculoPreco {
	CHOCOLATE(true) {
		@Override
		public String modoPreparo() {
			return "Misturar o chocolate e o leite";
		}

		@Override
		public double calculaPreco() {
			return 10;
		}
	},
	DOCE_DE_LEITE(true) {
		@Override
		public String modoPreparo() {
			return "Misturar o doce de leite e o leite";
		}

		@Override
		public double calculaPreco() {
			return 20;
		}
	},
	CHANTILLY(false) {
		@Override
		public String modoPreparo() {
			return "Misturar o chantilly e o leite";
		}

		@Override
		public double calculaPreco() {
			return 0;
		}
	};

	private final boolean precisaPreparo;

	SaborCobertura(boolean precisaPreparo) {
		this.precisaPreparo = precisaPreparo;
	}

	public boolean isPrecisaPreparo() {
		return precisaPreparo;
	}

	public abstract String modoPreparo();
}
